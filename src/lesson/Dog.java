package lesson;

import lesson.Animal;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void giveSound() {
        System.out.println("Jestem psem i nazywam się " + getName());
    }

    public void bark(){
        System.out.println("Hau Hau");
    }
}
