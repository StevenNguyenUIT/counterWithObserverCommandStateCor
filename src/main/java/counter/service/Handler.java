package counter.service;

public abstract class Handler {
    protected Handler nextHandler;

    public Handler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public Handler getNextHandler() {
        return nextHandler;
    }

    abstract void handle(int value);
}
