class Student{
    // ... attributes ...
    public int id;
    public int age;
    public String name;
    public int nos;
    
    // Default Constructor
    public Student(){
        System.out.println("Default Constructor Called!");
    }
}

public class DefaultConstructor{
    public static void main(String[] args){
        // Creating an object using Default Constructor
        Student a = new Student();

        // Setting values manually (Two-step process)
        a.id = 1;
        a.age = 14;
        a.name = "Deepak";

        System.out.println("Name is : " + a.name); // Output: Deepak
        System.out.println("Age is : " + a.age);   // Output: 14
        System.out.println("ID is : " + a.id);     // Output: 1
    }
}

// Output : Default Constructor Called!