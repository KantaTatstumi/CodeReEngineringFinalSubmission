import io.nayuki.qrcodegen.QrCode;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
// import java.util.Optional; --> tidak dibutuhkan lagi untuk null/empty exception

// public class QrToByteArrayInputStream { --> ditambahkan implement kepada QrImageEncoder untuk pembacaan data object
    public class QrToByteArrayInputStream implements QrImageEncoder {
    public QrToByteArrayInputStream() {
        
    }
    
    // public Optional<ByteArrayInputStream> convert(QrCode qr, int scale, int border, String format) { --> dirubah menjadi dibawah
        public ByteArrayInputStream convert(QrCode qr, int scale, int border, QrImgFormat ImgFormat) throws NullPointerException, IllegalArgumentException, IOException {
        if (qr == null) 
            throw new NullPointerException();
        if (scale <= 0 || border < 0) 
            throw new IllegalArgumentException("Value out of range");
        if (border > Integer.MAX_VALUE / 2 || qr.size + border * 2L > Integer.MAX_VALUE / scale)
            throw new IllegalArgumentException("Scale or border too large");
        // if (!format.equals("png"))
        //     throw new IllegalArgumentException();
        BufferedImage img = new BufferedImage((qr.size + border * 2) * scale, (qr.size + border * 2) * scale, BufferedImage.TYPE_INT_RGB);
        for (int y = 0; y < img.getHeight(); y++) {
            for (int x = 0; x < img.getWidth(); x++) {
                boolean color = qr.getModule(x / scale - border, y / scale - border);
                img.setRGB(x, y, color ? 0x000000 : 0xFFFFFF);
            }
        }
        final var os = new ByteArrayOutputStream();
        // try {
        //     ImageIO.write(img, format, os);
        // } catch (IOException e) {
        //     return Optional.empty();
        // }
        // var result = new ByteArrayInputStream(os.toByteArray());
        // return Optional.of(result);
        // kode diatas diganti dengan dibawah dan format kode diatas akan di alokasikan ke file slashcommand untuk catch empty
        ImageIO.write(img, ImgFormat.toString(), os);
        return new ByteArrayInputStream(os.toByteArray());

    }
}
