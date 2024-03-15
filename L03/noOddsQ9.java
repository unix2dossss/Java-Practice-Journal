import java.util.ArrayList;
import java.util.Collections;

public class noOddsQ9 {
	public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Collections.addAll(arrayList, 2, 3, 4, 5, 6);
        System.out.println(noOdds(arrayList));
}

public static boolean noOdds(ArrayList<Integer> numbers) {
    for (int number: numbers) {
        if (number%2 == 1) {
            return false;
        }
    }
    return true;
}
}