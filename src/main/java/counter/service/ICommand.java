package counter.service;

public interface ICommand {
   public void execute();
   public void unExecute();
}
