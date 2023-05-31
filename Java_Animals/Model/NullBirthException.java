package Model;

public class NullBirthException extends Exception{

    public NullBirthException() {
        super("Поле объекта дата рождения пустое");        
    }
    
}
