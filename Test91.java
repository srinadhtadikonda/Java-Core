package corejavaprograms;

class Person 			//parent class or superclass
{ 
    Person() 			//constructor of superclass
    { 
        System.out.println("Person class Constructor"); 
    } 
} 

class Student extends Person
 { 
    Student() 
    { 
         super(); 					// invoke or call parent class constructor 

        System.out.println("Student class Constructor"); 
    } 
} 

class Test { 
    public static void main(String[] args) 
    { 
        Student s = new Student(); 
    } 
}
