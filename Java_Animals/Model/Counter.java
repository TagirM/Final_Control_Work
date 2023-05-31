package Model;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Counter {
    List<Animal> counterAnimals;
    int registration = 2;
    Scanner scanner;
    Animal animal;

    public Counter() {
        counterAnimals = new ArrayList<Animal>();
        Animal animal1 = new Dog("Sharik", "2022-05-27");
        Animal animal2 = new Horse("Sivka-Burka", "2021-03-20", 100);
        counterAnimals.add(animal1);
        counterAnimals.add(animal2);        
    }

    public void add() throws NullWeightException, NullNameException, NullBirthException {
        scanner = new Scanner(System.in);
        System.out.println("Insert class animal (pet or pack animal):");
        String cls = scanner.nextLine();
        if (cls.equals("pet")) {
            System.out.println("Insert class pets (cat or dog or humster):");
            String pets = scanner.nextLine();
            if (pets.equals("cat")) {
                animal = new Cat(null, null);
            } else if (pets.equals("dog")) {
                animal = new Dog(null, null);
            } else if (pets.equals("humster")) {
                animal = new Humster(null, null);
            } else {
                System.out.println("Error");
                return;
            }
        } else if (cls.equals("pack animal")) {
            System.out.println("Insert class pack animal (camel or horse or donkey):");
            String pets = scanner.nextLine();
            if (pets.equals("camel")) {
                animal = new Camel(null, null, 0);
            } else if (pets.equals("horse")) {
                animal = new Horse(null, null, 0);
            } else if (pets.equals("donkey")) {
                animal = new Donkey(null, null, 0);
            } else {
                System.out.println("Error");
                return;
            }
        } else {
            System.out.println("Error");
            return;
        }
        System.out.println("Insert name animal:");
        String name = scanner.nextLine();        
        if (name == "") {
            throw new NullNameException();
        }
        animal.setName(name);

        System.out.println("Insert birth date animal in format yyyy-mm-dd:");
        String birth = scanner.nextLine();
        if (birth == "") {
            throw new NullBirthException();
        }
        animal.setBirthDate(birth);

        if (cls.equals("pack animal")) {
            System.out.println("Insert lifting weight animal:");
            String weight = scanner.nextLine();
            if ( weight == "") {
                throw new NullWeightException();
            }
            animal.setWeight(Integer.parseInt(weight));    
        }

        counterAnimals.add(animal);        
        try (FileWriter fileWriter = new FileWriter("Registry_animal.txt")) {            
            fileWriter.write(toString());
            System.out.println("Succesfully write!");
        } catch (Exception e) {
            System.out.println("" + e.getClass().getSimpleName());
        }
        registration++;
        }

    public List<Animal> getCounterAnimals() {
        return counterAnimals;
    }

    public void setCounterAnimals(List<Animal> counterAnimals) {
        this.counterAnimals = counterAnimals;
    }

    public int getRegistration() {
        return registration;
    }

    public void setAnimalCommand() {
        scanner = new Scanner(System.in);
        System.out.println("Insert name of animal to add command:");
        String nameAnimal = scanner.nextLine();
        System.out.println("Insert command:");
        String addCommand = scanner.nextLine();
        for (Animal animal : counterAnimals) {
            if (animal.getName().equals(nameAnimal)) {
                animal.setCommand(addCommand);
            }
        }
    }

    @Override
    public String toString() {
        String list = "";
        for (Animal animal : counterAnimals) {
            list = list + animal.toString() + "\n";
        }
        return list;
    }

    public void printListAnimal() {
        System.out.println("Count of animals is " + getRegistration());
        for (Animal animal : counterAnimals) {
            animal.printAnimal();
        }
    }
}
