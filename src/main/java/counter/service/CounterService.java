package counter.service;

import counter.dataaccess.CounterDAO;
import counter.domain.Counter;
import counter.domain.Observer;
import counter.domain.SingleDigit;
import counter.integration.Logger;

public class CounterService {
    public Counter counter;
    public Handler handler;

    public CounterService() {
        counter = new Counter();
        SingleDigit singleDigit = new SingleDigit(counter);
        counter.setState(singleDigit);
        Logger logger = new Logger();
        CounterDAO counterDAO = new CounterDAO();
        counter.addObserver(logger);
        counter.addObserver(counterDAO);

        RedHandler redHandler = new RedHandler(null);
        GreenHandler greenHandler = new GreenHandler(redHandler);
        BlueHandler blueHandler = new BlueHandler(greenHandler);
        handler = new OrangeHandler(blueHandler);
    }

    public void increment(){
        counter.increment();
        handler.handle(counter.getCount());
    }

    public void decrement(){
        counter.decrement();
        handler.handle(counter.getCount());
    }

    public void addObserver(Observer observer){
        counter.addObserver(observer);
    }
}
