// import stuff

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class get1DUniqueQ12 {
	public static void main(String[] args) {
        // Test Cases Go Here
        int[][] array = {{1}, {1, 2, 3}, {2, 4}};
        List<Integer> numbers = getOneDimensionalUnique(array);
        System.out.println(numbers);
}

public static List<Integer> getOneDimensionalUnique(int[][] array) {
    List<Integer> out = new ArrayList<>(Arrays.asList());

    for (int arrays[]: array) {
        for (int num: arrays) {
            if (!out.contains(num)) {
                out.add(num);
            }
        }
    }
    return out;
}
}