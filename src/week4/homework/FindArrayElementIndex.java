package week4.homework;

/**
 * 5. Write a Java program to find the index of an array element.
 */
public class FindArrayElementIndex {
    public static void main(String[] args) {
        int numberArr[] = {344, 555, 66, 88, 999, 66, 55};
        int number = 88;
        System.out.println(index(numberArr, number));
        int j = index(numberArr, number);
        System.out.println(j);
    }

    public static int index(int arr[], int specificNumber){
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == specificNumber) index = i;
        }
        return index;
    }

}
