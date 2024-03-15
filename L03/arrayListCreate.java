import java.util.ArrayList;

public class arrayListCreate {
	public static void main(String[] args) {
        ArrayList<Integer> result = createArrayList(10);
        System.out.println(result);
}

public static ArrayList<Integer> createArrayList(int maxValue) {
    ArrayList<Integer> out = new ArrayList<Integer>();
    for (int i = 1; i<=maxValue; i++) {
        if (i%2==1) {
            out.add(i);
        }
    }
    return out;
}
}