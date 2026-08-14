/*
Link : https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=false
Input Format

Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

Output Format

For each line, print the line number, followed by a single space, and then the line content received as input.

Sample Input

Hello world
I am a file
Read me until end-of-file.
Sample Output

1 Hello world
2 I am a file
3 Read me until end-of-file.


*/
import java.io.*;
import java.util.*;

public class String {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int lineNumber = 1;
        
        while (sc.hasNextLine()) {
            String Line = sc.nextLine();
            System.out.println(lineNumber + " " + Line);
            lineNumber++;           
        }
    }
}
