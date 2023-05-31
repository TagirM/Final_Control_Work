package Model;

public class PackAnimal extends Animal {

    public PackAnimal(String name, String birthDate, int weight) {
        super(name, birthDate);
        super.weight = weight;       
        animalClass = "pack_animal";                
    }    
      
    @Override
    public String toString() {
        return "Animal [name = " + name + ", birthDate = " + birthDate + ", command = " + command + ", class = "
                + animalClass + ", under class = " + animalUnderClass  + ", lifting weight = " + weight + " ]";
    }
}
