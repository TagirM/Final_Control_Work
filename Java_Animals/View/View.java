package View;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Conroller.Controller;
import Model.NullBirthException;
import Model.NullNameException;
import Model.NullWeightException;

public class View {
    Scanner scanner;
    Controller controller;

    public View() {        
        scanner = new Scanner(System.in); 
    }
    
    public void action(List<Option> commandList) throws NullWeightException, NullNameException, NullBirthException {
        System.out.println("Choose number of action:");
        
        for (int index = 0; index < commandList.size(); index++) {
            System.out.println((index + 1) + ". " + commandList.get(index).discription());
        }
        int chooseCommand = scanner.nextInt();

        if (chooseCommand <= commandList.size()) {
            commandList.get(chooseCommand - 1).execute();
        }   
        else{
            System.out.println("Select uncorrect number of action.");
            action(commandList);
        }
        System.out.println();        
        restart();  
        scanner.close();          
    }

    public void restart() throws NullWeightException, NullNameException, NullBirthException {
        System.out.println("Do you want to continue working in the application (yes/no)?");
        String work = scanner.next();
        if (work.equals("yes")) {            
            start();
        } else if (work.equals("no")) {
            System.out.println("Goodbay!");            
            return;
        }
        else{
            System.out.println("Insert uncorrect choice, try again");
            restart();
        }
    }

    public void start() throws NullWeightException, NullNameException, NullBirthException {
        List<Option> commandList = new ArrayList<Option>();
        commandList.add(new AddAnimal(this));
        commandList.add(new ListAnimal(this)); 
        commandList.add(new SetAnimalCommand(this));  
        action(commandList);
    }

    public void listAnimal() {
        controller.listAnimal();
    }

    public void addAnimal() throws NullWeightException, NullNameException, NullBirthException {
        controller.addAnimal();
    }

    public void setAnimalCommand() {
        controller.setAnimalCommand();
    }    

    public void setController(Controller controller) {
        this.controller = controller;
    }    
}


