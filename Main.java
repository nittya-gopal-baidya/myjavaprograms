class Person {
    public String name;
    private Address address;
    public Person(String name) {
        this.name = name;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public void display() {
        System.out.println("Name: " + name);
        if (address != null) {
            address.display();
        } else {
            System.out.println("Address not set");
        }
    }
}
class Address {
    private String city;
    // Constructor to initialize Address with a city and the associated Person
    public Address(String city) {
        this.city = city;  
    }
    // Method to display address details
    public void display() {
        System.out.println("City: " + city); 
    }
}
public class Main {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("John");
        // Create an Address object and pass 'this' (person instance) to the constructor
        Address address = new Address("New York");
        // Set the address for the person
        person.setAddress(address);
        // Display person details
        person.display();
    }
}
