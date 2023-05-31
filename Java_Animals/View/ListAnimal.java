package View;
public class ListAnimal implements Option{
    View view;

    public ListAnimal(View view){
        this.view = view;
    }

    @Override
    public String discription() {
        return "Show list of exist animals";
    }

    @Override
    public void execute() {
        view.listAnimal();        
    }
    
}
