// untuk membaca isi data pada parameter yang di input dan mengecheck bila ada null/error pada data
import io.nayuki.qrcodegen.QrCode;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public interface QrImageEncoder {
    ByteArrayInputStream convert(QrCode qr, int scale, int border, QrImgFormat ImgFormat) throws NullPointerException, IllegalArgumentException, IOException;
}