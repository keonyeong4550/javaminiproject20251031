package exception;


public class InputException extends DalBitException {
    public InputException(String message) {
        super("입력 오류: " + message);
    }
}