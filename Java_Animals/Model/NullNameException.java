package Model;
public class NullNameException extends Exception{

    public NullNameException() {
        super("Поле объекта имя пустое");        
    }
    
}
