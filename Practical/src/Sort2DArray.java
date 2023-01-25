import java.util.Arrays;
import java.util.Comparator;

public class Sort2DArray {
    public static void main(String[] args) {
        int[][] arr = { { 4, 2, 9 }, 
                        { 3, 5, 7 }, 
                        { 8, 1, 6 } };
        
        int column = 0; // column to sort by
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(final int[] entry1, final int[] entry2) {
                if (entry1[column] > entry2[column])
                    return 1;
                else
                    return -1;
            }
        });
        System.out.println("Sorted 2D Array according to values in column " + column + ":");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
