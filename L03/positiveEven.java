import java.util.ArrayList;
import java.util.List;

public class positiveEven {
	public static void main(String[] args) {
        List<Integer> result = getPositiveEvens(new int[]{1, 2, -3, -4, 5, 6, 7, 8, 9, 10, -1, -2});
        List<Integer> result2 = getPositiveEvens(new int[]{});
        System.out.println(result2.toString());
}

public static List<Integer> getPositiveEvens(int[] numbers) {
    ArrayList<Integer> output_array = new ArrayList<Integer>();
    if (numbers.length == 0) {
        return output_array;
    }
    for (int j: numbers){
        if (j%2 == 0 && j>0) {
            output_array.add(j);
        }
    }
    return output_array;
}
}