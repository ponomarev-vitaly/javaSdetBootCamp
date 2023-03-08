package week5.homework;

import java.io.IOException;

// Question 6. Given the code fragment. Which two modifications should you make so that the code compiles successfully?
// The answer is A, E. We had observed this question during the class.
// Review the code with the mentor.
class X{
    // E option. Replace line 5 with:
    public void printFileContent() throws IOException{
    // public void printFileContent() {
        /* code goes here */
        throw new IOException();
    }
}
public class Test {
    public static void main(String[] args) {
        X xobj = new X();
        // xobj.printFileContent();
        // A option. Replace line 13 with the code:
        try {
            xobj.printFileContent();
        }
        catch(Exception e) {}
        // catch(IOException) {}

    }
}
