package week4.homework;

/**
 * 6. Write a Java program to remove a specific element from an array.
 */
public class RemoveArrayElement {
    public static void main(String[] args) {
        String arrayCar [] = {"BMW", "HONDA", "TOYOTA", "KIA", "HYUNDAI", "AUDI"};
        removeElement1(arrayCar, "KIA");

    }

    public static void removeElement1(String arr[], String removeElement){
        // Solution 1.
        for(String str : arr){ // New variable str keeps the element from array. We assign for each loop to check every element of the loop.
            int counter = 0;

            if(str.equals(removeElement)){ //
                // Solution 1.
                int indexNum = index(arr,removeElement); // Call index method.
                arr[indexNum] = "free-2";
                System.out.println(arr[indexNum] + " -->index number: "+indexNum);

                // Solution 2.
//                arr[counter] = "free-1";
//                System.out.println(arr[counter]+" -->index number: "+counter);
            }
            counter++;
        }
    }

    // Solution 3.
    public static  void removeElement3(String arr[], String removeElement){
        for(int j = 0; j<arr.length; j++){
            if(arr[j].equals(removeElement)){
                arr[j] = "free-3";
                System.out.println(arr[j] + " -->index number: " + j);
                break; // EXIT FROM FOR LOOP IMMEDIATELY.
            }else if(j == arr.length-1) System.out.println("There is no such element in the array.");
        }
    }


    public static int index(String[] arr, String specificElement){
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(specificElement)) index = i;
        }
        return index;
    }
}
