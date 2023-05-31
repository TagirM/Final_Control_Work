package View;

public class SetAnimalCommand implements Option{
    View view;

    public SetAnimalCommand(View view){
        this.view = view;
    }

    @Override
    public String discription() {        
        return "Set a new command to animal";
    }

    @Override
    public void execute() {
        view.setAnimalCommand();        
    }
    
    
}
