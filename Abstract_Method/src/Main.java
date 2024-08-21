/*
/*Abstract Methods Should have abstract class
/*Abstract Method Should not have a Body
/*Abstract Method Should Be Overridden in All Child Classes */
abstract class Animals {
    // Abstract method - to be implemented by subclasses
    abstract void MakesSound();
    void Sound() {
        System.out.println("Animals Makes Sound");
    }
}
class Dog extends Animals {
    @Override
    void MakesSound() {
        System.out.println("Dog Barks");
    }
}
class Cat extends Animals {
    @Override
    void MakesSound() {
        System.out.println("Cat Meow");
    }
}
public class Main {
    public static void main(String[] args) {
        Animals Cat = new Dog();
        Animals Dog = new Cat();

        Cat.MakesSound();
        Cat.Sound();

        Dog.MakesSound();
        Dog.Sound();
    }
}
