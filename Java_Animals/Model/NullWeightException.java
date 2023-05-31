package Model;

public class NullWeightException extends Exception{

    public NullWeightException() {
        super("Поле объекта поднимаемый вес пустое");
    }    
}
