package exception;


public class FileLoadException extends DalBitException {
    public FileLoadException(String message) {
        super("파일 불러오기 오류: " + message);
    }
}