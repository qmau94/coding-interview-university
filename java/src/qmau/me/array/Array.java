package qmau.me.array;

public class Array {

    public static void main(String[] args) {

        // declare an int array
        int[] arr;
        // create an array with 5 elements
        arr = new int[5];
        // shorter way
        // int[] arr = new int[5];

        // set elements
        for (int i = 0; i < 5; i++) // elements are indexed from 0 to n-1
            arr[i] = i + 1; // initialize all elements to i + 1

        // Print out the array
        System.out.println("This array element: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
        // size
        System.out.println("Array leght: " + arr.length);
        // capacity

    }

}
