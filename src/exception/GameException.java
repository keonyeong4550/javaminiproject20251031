package exception;


public class GameException extends DalBitException {
    public GameException(String message) {
        super("게임 오류: " + message);
    }
}