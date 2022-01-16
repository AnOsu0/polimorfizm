package lesson;

import lesson.Animal;
import lesson.Cat;
import lesson.Dog;

public class Zoo {
    public static void main(String[] args) {

        Animal[] animals = new Animal[3];
        animals[0]= new Animal("Kotopies");
        animals[1]= new Cat("Mruczek");
        animals[2]= new Dog("Burek");

        changeAnimalName(animals[1], "Piesokot");

        for (Animal animal: animals){
            animal.giveSound();
        }


    }

    private static void changeAnimalName(Animal animal, String newName){
        animal.setName(newName);
    }
}
