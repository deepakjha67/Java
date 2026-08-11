class Student{
    public int id;
    public int age;
    public String name;

    // Parameterized Constructor
    public Student(int id, int age, String name){
        this.id = id;
        this.age = age;
        this.name = name;
    }

    // Copy Constructor
    public Student(Student srcObj){
        this.id = srcObj.id;     // Copying ID from source to the new object
        this.age = srcObj.age;   // Copying Age
        this.name = srcObj.name; // Copying Name
    }
}

public class CopyConstructor{
    public static void main(String[] args){
        Student a = new Student(1, 12, "Deepak ");

        // Creating Student B by copying Student A
        Student b = new Student(a);

        System.out.println("Name is: " + b.name); // Output: Deepak 
        System.out.println("Age is: " + b.age);   // Output: 12
        System.out.println("ID is: " + b.id);     // Output: 1
    }
}