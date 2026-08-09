public class App {
    public static void main(String [] args ) throws Exception{

        // // Systemm.out.println("Hello, World");
        // // Default ctor

        // Student A = new Student ();
        // A.id = 1;
        // A.age = 14;
        // A.name = "Ranu";
        // A.nos = 5;
        // System.out.println(A.name);
        // System.out.println(A.age);
        // System.out.println(A.id);
        // System.out.println(A.id);
        // System.out.println(A.nos);

        // A.bunk();
        // A.study();
        // A.sleep();

        

        // Parameterised ctor

        Student A = new Student(1, 12, "Rahul", 3);
        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.id);
        System.out.println(A.id);
        System.out.println(A.nos);
        A.bunk();
        A.study();
        A.sleep();

        
        // Copy ctor

        // Student B = new Student(A);
        // System.out.println(B.name);
        // System.out.println(B.age);
        // System.out.println(B.id);
        // System.out.println(B.id);
        // System.out.println(B.nos);
        // B.bunk();
        // B.study();
        // B.sleep();

    }
}

/*
        Output: 
        SYstem Default ctor called
        Ranu
        14
        1
        1
        5
        Ranu Bunking
        Ranu Studying
        Ranu Sleeping
        */