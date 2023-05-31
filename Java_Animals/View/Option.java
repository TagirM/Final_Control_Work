package View;


import Model.NullBirthException;
import Model.NullNameException;
import Model.NullWeightException;
public interface Option {
    String discription();    
    void execute() throws NullWeightException, NullNameException, NullBirthException;
    
} 
