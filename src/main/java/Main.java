
public class Main {

    public static void main(String[] args) {
        // write your code here
        Dog dog = new Dog();

        dog.eat();    // -> 'Rax eats'
        dog.sounds(); // -> 'Dog barks'

        Cat cat = new Cat();

        cat.eat();    // -> 'Stormy eats'
        cat.sounds(); // -> 'Cat meows



        home home = new home();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        home.makeAllSounds(); // this doesn't do anything
        home.adoptPet(dog1);
        home.makeAllSounds();
// this prints:
// Dog barks

        home.adoptPet(cat);
        home.makeAllSounds();
//// this prints:
//// Dog barks
//// Cat meows
//
        home.adoptPet(dog2);
        home.makeAllSounds();
    }
}
