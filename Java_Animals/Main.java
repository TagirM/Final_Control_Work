import Conroller.Controller;
import Model.Counter;
import Model.NullBirthException;
import Model.NullNameException;
import Model.NullWeightException;
import View.View;

public class Main {
    
    public static void main(String[] args) throws NullWeightException, NullNameException, NullBirthException {
        View view = new View();
        Counter counter = new Counter();
        Controller controller = new Controller(view, counter);
        view.setController(controller);
        view.start();        
    }    
}