package counter.service;

public class RedHandler extends Handler {

    public RedHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    void handle(int value) {
        if ((value % 2 == 0 && (value < 10 || value == 12) || value == 13)) {
            System.out.println("RED");
        } else{
            nextHandler.handle(value);
        }
    }
}
