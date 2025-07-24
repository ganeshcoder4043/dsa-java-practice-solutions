package dsa.coreJavaConcepts.arrays;

public class RightRotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int temp = arr[arr.length - 1]; // last element ko store karo
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1]; // shift right
        }
        arr[0] = temp; // first me last wala

        // print rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

// output:= 5 1 2 3 4 