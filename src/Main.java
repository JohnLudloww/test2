import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        //testing random array stuff.
        int[] arr;
        int arr2[];

        arr = new int[10];
        System.out.println(arr.length);
        System.out.println(arr[0]);


        double[] arr3 = new double [10];
        System.out.println(arr3[0]);

        boolean[] arr4 = new boolean[10];
        System.out.println(arr4[0]);

        //array of arrays
        int[][] hello = new int [10][0];
        int[] arr5 = {1,2,3};
        System.out.println(hello[0]);
        System.out.println(Arrays.toString(arr5));




    }
}
