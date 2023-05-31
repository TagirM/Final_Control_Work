package Conroller;
import Model.Counter;
import Model.NullBirthException;
import Model.NullNameException;
import Model.NullWeightException;
import View.View;

public class Controller {
    Counter counter;   
    View view; 
    

    public Controller(View view, Counter counter){
        this.counter = counter;
        this.view = view;        
    }
    
    public void addAnimal() throws NullWeightException, NullNameException, NullBirthException { 
        counter.add();
    }

    public void listAnimal() {
        counter.printListAnimal();
    }

    public void setAnimalCommand() {
        counter.setAnimalCommand();
    }    
}
