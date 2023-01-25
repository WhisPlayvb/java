import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionPrint {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(3);
        intList.add(5);
        intList.add(18);
        intList.add(4);
        intList.add(6);

        System.out.println("Input : List = " + intList);
        int min = Collections.min(intList);
        int max = Collections.max(intList);
        System.out.println("Min value of our list : " + min);
        System.out.println("Max value of our list : " + max);

        // for String
        List<String> strList = new ArrayList<String>();
        strList.add("a");
        strList.add("a");
        strList.add("a");

        System.out.println("Input : List = " + strList);
        String minStr = Collections.min(strList);
        String maxStr = Collections.max(strList);
        if (minStr.equals(maxStr)) {
            System.out.println("All elements are equal");
        } else {
            System.out.println("Min value of our list : " + minStr);
            System.out.println("Max value of our list : " + maxStr);
        }
    }
}
