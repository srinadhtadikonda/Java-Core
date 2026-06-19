package corejavaprograms;

class InvalidAgeException extends Exception {
    InvalidAgeException() {
        super("You Are Not Eligible To Vote");
    }
}

class Test {
    void ageCheck(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException();
        } else {
            System.out.println("You Are Eligible To Vote");
        }
    }
}

public class CheckAge {
    public static void main(String[] args) {
        Test t = new Test();

        try {
            t.ageCheck(5);
        } catch (InvalidAgeException ie) {
            System.out.println(ie.getMessage());
        }
    }
}
