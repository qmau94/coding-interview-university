package shuffling;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Shuffling {

    public static void shuffle(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int r = StdRandom.uniform(a.length - 1);
            exch(a, i, r);
        }
    }

    private static void exch(int[] a, int i, int r) {
        int temp = a[i];
        a[i] = a[r];
        a[r] = temp;
    }

    private static void printOut(int[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + ",");
        }
    }

    public static void main(String args[]) {
        int[] a = new int[100000];
        for (int i = 0; i < a.length; i++) {
            a[i] = StdRandom.uniform(0, 100000);
        }
        shuffle(a);
        printOut(a);
    }

}
