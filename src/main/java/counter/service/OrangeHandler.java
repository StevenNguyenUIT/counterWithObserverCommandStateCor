package counter.service;

public class OrangeHandler extends Handler {
    public OrangeHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    void handle(int value) {
        if (value % 2 != 0 && value >= 15 && value != 17 && value != 19){
            System.out.println("Orange");
        } else {
            nextHandler.handle(value);
        }
    }
}
