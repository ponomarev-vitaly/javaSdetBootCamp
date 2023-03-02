package week4.homework;
/**
 * 4. Write a Java program to test if an array contains a specific value.
 */
public class TestSpecificValueInArray {
    public static void main(String[] args) {
        int numberArr[] = {344, 555, 66, 88, 999, 66, 55};
        int number = 100;
        System.out.println(contains(numberArr, number));
        boolean check = contains(numberArr, number);
        System.out.println(check);
        // contains(numberArr, 99); // Call for the contains method.
    }
    // Create a method contains.
    public static boolean contains(int arr[], int specificNumber){
        boolean result = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == specificNumber) result = true;
        }
        return result;
    }
}
