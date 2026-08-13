class Students {

    private String name;
    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }
}

public class Encapsulation2 {
    public static void main(String [] args) {

        Students a = new Students() ;
        a.setName("Deepak");
        System.out.println("Name: " + a.getName());
    } 
}
// Output:
// Name: Deepak
/*
Explanation: 
In the above example, we use the encapsulation and use getter 
(getName) and setter (setName) method which are used to show and
modify the private data. This encapsulation mechanism protects 
the internal state of the Programmer object and allows for better
control and flexibility in how the name attribute is accessed and
modified.
*/