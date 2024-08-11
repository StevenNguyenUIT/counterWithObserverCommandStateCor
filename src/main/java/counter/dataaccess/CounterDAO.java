package counter.dataaccess;

import counter.domain.Observer;

public class CounterDAO implements Observer {
    @Override
    public void update(int countervalue) {

    }

    private void saveToDB(int counterValue){
        System.out.println("Data " + counterValue + " saved to Database");
    }
}
