import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
// tambahkan libray optional untu membantu menggunakan nullable

public class QrData {
    // public Map<String, String> savedData = new HashMap<>(); --> class di set menjadi private final agar data tidak dabat diubah2 kembali
    private final Map<String, String> savedData = new HashMap<>();
    
    public void store(String name, String content) {
        savedData.put(name, content);
    }
    public Optional<String> retrieve(String name) {
        return Optional.ofNullable(savedData.getOrDefault(name, null));
    }
    //public optional retrieve ditambhkan pada kode untuk mengambil data secara spesifik apabila data memiliki isi atau null
}
