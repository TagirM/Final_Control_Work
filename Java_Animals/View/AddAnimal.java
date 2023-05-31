package View;

import Model.NullBirthException;
import Model.NullNameException;
import Model.NullWeightException;

public class AddAnimal implements Option{
    View view;

    public AddAnimal(View view){
        this.view = view;
    }

    @Override
    public String discription() {        
        return "Get a new animal";
    }

    @Override
    public void execute() throws NullWeightException, NullNameException, NullBirthException {
        view.addAnimal();        
    }
    
}
