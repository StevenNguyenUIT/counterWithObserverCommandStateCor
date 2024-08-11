package counter.service;


import counter.domain.Counter;

public class DecrementCommand implements ICommand{
	private CounterService counterService;
	
	
	public DecrementCommand(CounterService counterService) {
		this.counterService = counterService;
	}

	public void execute() {
		counterService.decrement();
	}

	public void unExecute() {
		counterService.increment();
	}

}
