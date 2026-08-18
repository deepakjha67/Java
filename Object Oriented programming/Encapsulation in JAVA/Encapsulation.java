class Student {
    // Private data members (Perfect Encapsulation / Data Hiding)
    private String name; 
    private int age;
    private String gf; 

    // Constructor
    public Student(String name, int age, String gf) {
        this.name = name;
        this.age = age;
        this.gf = gf;
    }

    // Private method (Internal behavior hidden from the outside world)
    private void gfChatting() {
        System.out.println("Chatting...");
    }

    // Public Getter for Name (Controlled Access)
    public String getName() {
        return this.name;
    }

    // Public Getter for Age
    public int getAge() {
        return this.age;
    }

    // Public Setter for Age with an authentication check
    public void setAge(int age) {
        // Extra layer of validation before modifying data
        if (age < 100) {
            this.age = age;
        } else {
            System.out.println("Invalid Age! Update rejected.");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student a = new Student("Rahul", 20, "Tina");

        // a.gf; // ERROR: has private access in Student 
        // a.gfChatting(); // ERROR: not visible/accessible 

        // Accessing data through a controlled layer (Getters)
        System.out.println("Student Name: " + a.getName()); 

        // Modifying data through a controlled layer (Setters)
        a.setAge(67); 
        System.out.println("Updated Age: " + a.getAge()); 
    }
}
/*
Output:
Student Name: Rahul
Updated Age: 67
*/
