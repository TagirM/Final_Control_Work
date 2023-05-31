package Model;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Animal {
    String name; 
    String birthDate;
    Date simpleBirthDate;
    List<String> command = new ArrayList<>();
    String animalClass;
    String animalUnderClass;
    int weight;
    
    public Animal(String name, String birthDate){
        this.name = name;                
        this.birthDate = birthDate;        
        command.add("Sleep");
        command.add("Eat");
        command.add("Voice");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            simpleBirthDate = formatter.parse(birthDate);            
          }
          catch (ParseException e) {
            e.printStackTrace();
          }
        return simpleBirthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public List<String> getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command.add(command);
    }

    public int getWeight() {
        return weight;
    }    

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAnimalClass(){
        return animalClass;
    }
    
    @Override
    public String toString() {
        return "Animal [name = " + name + ", birthDate = " + birthDate + ", command = " + command + ", class = "
                + animalClass + ", under class = " + animalUnderClass + " ]";
    }

    public void printAnimal() {
        System.out.println(this.toString());
    }
}
