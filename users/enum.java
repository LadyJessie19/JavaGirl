public class enum {
    public enum DocumentEmissionStatus {
    WAITING(1),
    CONCLUDED(2),
    CANCELED(3),
    FAILED(4),
    PROCESSING(5),

    private Integer code;
    DocumentEmissionStatus(Integer code){
        this.code = code;
    }
}
}
