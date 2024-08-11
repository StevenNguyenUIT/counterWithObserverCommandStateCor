package counter.service;

public class GreenHandler extends Handler {
    public GreenHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    void handle(int value) {
        if (value%2==0 && value >=10 && value != 12){
            System.out.println("Green");
        } else {
            nextHandler.handle(value);
        }
    }
}
