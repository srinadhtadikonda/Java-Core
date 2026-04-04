//Aggregation
class Address {    
 String city,state,country;    
    
 public Address(String city, String state, String country) {    
    this.city = city;    
    this.state = state;    
    this.country = country;    
 }    
}    
//Employee class that has Address  
class Emp {    
    int id;    
    String name;    
    Address address;  //Emp Has-A Address  
    
 public Emp(int id, String name,Address address) {    
    this.id = id;    
    this.name = name;    
    this.address=address;    
 }    
    
 void display(){    
  System.out.println(id+" "+name);    
  System.out.println(address.city+" "+address.state+" "+address.country);    
 }    
}  
//Main class   
public class Main{  
 public static void main(String[] args) {    
  Address address1=new Address("gzb","UP","india");    
  Address address2=new Address("gno","UP","india");    
  Emp e=new Emp(111,"varun",address1);    
  Emp e2=new Emp(112,"arun",address2);    
        
  e.display();    
  e2.display();      
 }    
}    
