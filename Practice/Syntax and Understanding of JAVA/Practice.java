public class Practice {
    public static void main (String[] args) {

// Unary Operators
        int activeUser = 100;
        int postfix = activeUser++;
        int prefix = ++activeUser;

        System.out.println(postfix); // 100
        System.out.println(prefix); // 102

// BitWise Operator

        int a = 6;
        int b = 3;

        System.out.println(a<<b);

// Ternary Operator

        int SolvedProblems = 290;

        String level = (SolvedProblems >=300) ? "Advance" : "Intermediate"; // ? True : False
        System.out.println(level);

    }
}