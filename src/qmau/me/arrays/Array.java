package qmau.me.arrays;


public class Array {

    public static void main(String[] args) {
        // declare an int array
        int[] arr;

        // create an array with 5 elements
        arr = new int[5];
        // shorter way
        // int[] arr = new int[5];

        for (int i = 0; i < 5; i++) // elements are indexed from 0 to n-1
            arr[i] = i + 1; // initialize all elements to i + 1

        System.out.println("These are array elements: ");
        printOut(arr);

        System.out.println("Array leght: " + arr.length);

        System.out.println("Element at index 3: " + arr[3]);

        arr = push(arr, 6);
        System.out.println("Added array: ");
        printOut(arr);

        arr = insert(arr, 10, 3);
        System.out.println("Inserted array: ");
        printOut(arr);

        arr = prepend(arr, 0);
        System.out.println("Prepended array: ");
        printOut(arr);

        arr = pop(arr);
        System.out.println("Popped array: ");
        printOut(arr);

        arr = delete(arr, 4);
        System.out.println("Deleted array: ");
        printOut(arr);

        arr = remove(arr, 2);
        System.out.println("Removed 2 from array: ");
        printOut(arr);

        System.out.println("Find first index of value 5: " + find(arr, 5));
    }

    // Print out array
    static void printOut(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // Add element to array
    static int[] push(int[] arr, int e) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++)
            newArr[i] = arr[i];
        newArr[arr.length] = e;
        return newArr;
    }

    // Insert an element
    static int[] insert(int[] arr, int e, int index) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < index)
                newArr[i] = arr[i];
            if (i == index)
                newArr[i] = e;
            if (i > index)
                newArr[i] = arr[i - 1];
        }
        return newArr;
    }

    // insert above at index 0
    static int[] prepend(int[] arr, int e) {
        int[] newArr = new int[arr.length + 1];
        newArr[0] = e;
        for (int i = 1; i < newArr.length; i++)
            newArr[i] = arr[i - 1];
        return newArr;
    }

    // remove from end
    static int[] pop(int[] arr) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 1; i < arr.length - 1; i++)
            newArr[i] = arr[i];
        return newArr;
    }

    // delete item at index, shifting all trailing elements left
    static int[] delete(int[] arr, int index) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < index)
                newArr[i] = arr[i];
            if (i >= index)
                newArr[i] = arr[i + 1];
        }
        return newArr;
    }

    // looks for value and removes index holding it (even if in multiple places)
    static int[] remove(int[] arr, int e) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == e)
                arr = delete(arr, i);
        }
        return arr;
    }

    // looks for value and returns first index with that value, -1 if not found
    static int find(int[] arr, int e) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == e)
                return i;
        }
        return -1;
    }

}
