import discord4j.core.event.domain.interaction.ChatInputInteractionEvent;
import discord4j.core.object.command.ApplicationCommandInteractionOption;
import discord4j.core.object.command.ApplicationCommandInteractionOptionValue;
import discord4j.core.spec.MessageCreateFields;
import io.nayuki.qrcodegen.QrCode;
import reactor.core.publisher.Mono;

import java.util.Optional;

public class SlashCommandHandler {
    private static final int QR_SCALE = 4;
    private static final int QR_BORDER = 1;
    private final QrData qrData = new QrData();
    private final QrImageEncoder converter;

    public SlashCommandHandler(QrImageEncoder converter) {
        this.converter = converter;
    }
    //kode diata adalah untuk mengconvert data dari object-to-string dan sebaliknya

    public Mono<Void> handle(ChatInputInteractionEvent event) {
        if (!event.getCommandName()
                .startsWith("qr")) return Mono.empty();

        return switch (event.getCommandName()) {
            case "qr" -> handleEncode(event);
            case "qrsave" -> handleSave(event);
            case "qrload" -> handleLoad(event);
            default -> Mono.empty();
        };
    }

    private Mono<Void> handleEncode(ChatInputInteractionEvent event) {
        return event.getOption("text")
                .flatMap(ApplicationCommandInteractionOption::getValue)
                .map(ApplicationCommandInteractionOptionValue::asString)
                .map(content -> QrCode.encodeText(content, QrCode.Ecc.LOW)) 
                // .flatMap(qr -> new QrToByteArrayInputStream().convert(qr, QR_SCALE, QR_BORDER, "png")) --> diganti dengan kode dibawah untuk pemastian possibility missing data
                .flatMap(qr -> {
                    try {
                        // return (Optional.of(new QrToByteArrayInputStream().convert(qr, QR_SCALE, QR_BORDER, QrImgFormat.png))); --> new QrToByteArrayInputStream diganti dengan converter untuk data converting nya
                        return (Optional.of(converter.convert(qr, QR_SCALE, QR_BORDER, QrImgFormat.png)));
                    } catch (Exception e) {
                        return Optional.empty();
                    }
                })
                .map(inputStream -> event.reply()
                        .withFiles(MessageCreateFields.File.of("QR.png", inputStream))
                        .then())
                .orElse(Mono.empty());
    }

    private Mono<Void> handleSave(ChatInputInteractionEvent event) {
        event.getOption("text")
                .flatMap(ApplicationCommandInteractionOption::getValue)
                .map(ApplicationCommandInteractionOptionValue::asString)
                .ifPresent(c -> event.getOption("name")
                        .flatMap(ApplicationCommandInteractionOption::getValue)
                        .map(ApplicationCommandInteractionOptionValue::asString)
                        .ifPresent(n -> qrData.store(n, c)));
        return event.reply()
                .withContent("OK")
                .then();
    }

    private Mono<Void> handleLoad(ChatInputInteractionEvent event) {
        return event.getOption("name")
                .flatMap(ApplicationCommandInteractionOption::getValue)
                .map(ApplicationCommandInteractionOptionValue::asString)
                // .flatMap(name -> Optional.ofNullable(qrData.savedData.getOrDefault(name, null))) --> diganti dengan menggunakan methode retrieve yang merupakan persamaan dengan optional.ofNullable
                .flatMap(qrData::retrieve)
                .map(content -> QrCode.encodeText(content, QrCode.Ecc.LOW))
                //  --> diganti dengan kode dibawah untuk pemastian possibility missing data
                 .flatMap(qr -> {
                    try {
                        // return Optional.of(new QrToByteArrayInputStream().convert(qr, QR_SCALE, QR_BORDER, QrImgFormat.png)); --> new QrToByteArrayInputStream diganti dengan converter untuk data converting nya
                        return Optional.of(converter.convert(qr, QR_SCALE, QR_BORDER, QrImgFormat.png));
                    } catch (Exception e) {
                        return Optional.empty();
                    }
                })
                .map(inputStream -> event.reply()
                        .withFiles(MessageCreateFields.File.of("QR.png", inputStream))
                        .then())
                .orElse(Mono.empty());
    }
}
