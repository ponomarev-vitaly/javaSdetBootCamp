package week2;
/*
* Nested Loops
* It is also possible to place a loop inside another loop. This is called a nested loop.
* The "inner loop" will be executed one time for eac iteration of the "outer loop":
 */
public class NestedFor {

    public static void main(String[] args) {

        // Outer Loop
        for(int i = 0; i <= 3; i++){
            System.out.println("Outer loop : " + i); // Execute 3 times

            // Inner loop
            for(int j = 1; j <= 5; j++){
                System.out.println("Inner loop : " + j); // Execute 5 times.
            }
            System.out.println("Here is an outer loop.");
        }

    }


}
