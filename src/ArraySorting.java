import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArraySorting {
    public static void main(String[] args) {
        ArrayList<Integer>number=new ArrayList<>();
        number.add(20);
        number.add(-2);
        number.add(18);
        number.add(92);
        number.add(0);
        number.add(2);
        System.out.println("before sorting: "+number);
        Collections.sort(number);
        System.out.println("before assending number: "+number);
        Collections.sort(number,Collections.reverseOrder());
        System.out.println("after assending number: "+number);
    }
}
