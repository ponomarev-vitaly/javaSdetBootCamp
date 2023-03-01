package week4;

public class myArray {
    public static void main(String[] args) {
        int myArray[] = new int[3]; //-->{0,0,0} initial value
        myArray[0] = 7;
        myArray[1] = 15;
        myArray[2] = 42;
//        myArray[3] = 78; --> ArrayIndexOutOfBoundsException
//        myArray[4] = 99;
        System.out.println("myArray length is: " + myArray.length); // We use the method to define the length of the Array.

        int myArray1[] = {8,15,36};
        int element1 = myArray[0]; // I assigned the values to the elements.
        int element2 = myArray[1];
        int element3 = myArray[2];
        System.out.println("element1 value is: " + element1);
        System.out.println("element1 value is: " + element2);
        System.out.println("element1 value is: " + element3);

        element1 = myArray1[0];
        element2 = myArray1[1];
        element3 = myArray1[2];

        System.out.println(element1);
        System.out.println(element2);
        System.out.println(element3);

        for(int i = 0; i < myArray.length; i++){ // Start the scope block. Our biggest index number is 2, not 3.
            System.out.println(myArray[i]); // output --> 7, 15, 42
        }

        String fruits[] = {"Apple", "Banana", "Orange", "Avocado", "Strawberry"}; // We created string array.
        System.out.print("Fruits name: ");
        for(int i = 0; i < fruits.length; i++){
            System.out.print(fruits[i] + ", ");
        }


    }
}
