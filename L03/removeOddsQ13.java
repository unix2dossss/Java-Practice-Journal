// import stuff

import java.util.ArrayList;
import java.util.Collections;

public class removeOddsQ13 {
	public static void main(String[] args) {
        // Test Cases Go Here
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Collections.addAll(arrayList, 3, 5, 6, 24, 7, 9, 1, 8, 28, 11);
        removeAllOdds(arrayList);
        System.out.println(arrayList);
}

public static void removeAllOdds(ArrayList<Integer> numbers) {
    for (int i=numbers.size()-1; i >= 0; i--) {
        if (numbers.get(i)%2==1) {
            numbers.remove(i);
        }
    }   
}
}