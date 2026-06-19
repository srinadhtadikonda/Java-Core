package myjava;

@SuppressWarnings("serial")
class MyException extends Exception {

    public MyException() {
        super("invalid Age");
    }

    @Override
    public String toString() {
        return getMessage();
    }
}

public class Test {

    public static void checkdAge(int x) throws MyException {
        if (x < 18) {
            throw new MyException();
        } else {
            System.out.println("Eligible To Vote");
        }
    }

    public static void main(String args[]) {
        try {
            Test.checkdAge(38);
        } catch (MyException me) {
            me.printStackTrace();
        }
    }
}
