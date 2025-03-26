class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        super.sound(); // Calls the sound() method of Animal class
        System.out.println("Dog barks");
    }
}

public class TestSuper {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(); // Output: Animal makes a sound
                   //         Dog barks
    }
}
