class Student{
    public int id;
    public int age;
    public String name;

    // Parameterized Constructor
    public Student(int id, int age, String name){
        this.id = id;       // this.id refers to the object's attribute
        this.age = age;     // age refers to the parameter passed
        this.name = name;
    }
}

public class ParameterizedConstructor{
    public static void main(String[] args){
        // Object created and initialized in one line
        Student a = new Student(1, 12, "Deepak");

        System.out.println("Name is : " + a.name); // Output: Deepak
        System.out.println("Age is : " + a.age);   // Output: 12
        System.out.println("ID is : " + a.id);     // Output: 1
    }
}