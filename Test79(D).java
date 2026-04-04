//InnerClasses
class Student {  
    String name;  
  
    Student(String name) {  
        this.name = name;  
    }  
  
    // Inner class  
    class Address {  
        String city, state;  
  
        Address(String city, String state) {  
            this.city = city;  
            this.state = state;  
        }  
  
        void display() {  
            System.out.println("Student Name: " + name);  
            System.out.println("City: " + city);  
            System.out.println("State: " + state);  
        }  
    }  
}  
  
public class TestStudent {  
    public static void main(String[] args) {  
        // Create outer class object  
        Student student = new Student("Rahul");  
  
        // Create inner class object  
        Student.Address address = student.new Address("Delhi", "Delhi");  
        address.display();  
    }  
}  
