// import stuff

import java.util.Arrays;
import java.util.List;

public class runSumQ11 {
	public static void main(String[] args) {
        // Test Cases Go Here
        List<Integer> a_list = Arrays.asList(3, 2, 4, 7);
        runningSum(a_list);
        for (int num: a_list) System.out.printf("%d ", num);
        System.out.println();
}

public static void runningSum(List<Integer> numbers) {
    if (numbers.size() <= 1) {
        return;
    }
    for (int i = 1; i<numbers.size(); i++) {
        numbers.set(i, numbers.get(i) + numbers.get(i-1)); 
    }
}
}