package counter.service;

public class BlueHandler extends Handler{
    public BlueHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    void handle(int value) {
        if (value %2 != 0 && ( value < 15 || value == 17 || value == 19)){
            System.out.println("Blue");
        } else {
            nextHandler.handle(value);
        }
    }
}
