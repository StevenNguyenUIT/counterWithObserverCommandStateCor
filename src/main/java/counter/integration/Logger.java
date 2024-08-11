package counter.integration;

import counter.domain.Observer;

public class Logger implements Observer {
    @Override
    public void update(int countervalue) {
        log(countervalue);
    }

    private void log(int counterValue){
        System.out.println("The value now is " + counterValue);
    }
}
