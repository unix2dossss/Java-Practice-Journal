// import stuff

public class quadraticEqQ3 {
	public static void main(String[] args) {
        // Test Cases Go Here
        QuadraticEquation quad = new QuadraticEquation(1, -4, 4);
        System.out.println(quad.getCoefficient(0));
        System.out.println(quad.getCoefficient(1));
        System.out.println(quad.getCoefficient(2));
}
// other functions
}

class QuadraticEquation {
    private double[] coefficients;

    // Default constructor with default coefficients {1, 1, 1}
    public QuadraticEquation() {
        this(1, 1, 1);
    }

    // Overloaded constructor with specified coefficients
    public QuadraticEquation(double a, double b, double c) {
        this.coefficients = new double[]{a, b, c};
    }

    // Method to get coefficient at a specific index
    public double getCoefficient(int index) {
        if (index >= 0 && index < coefficients.length) {
            return coefficients[index];
        } else {
            throw new IllegalArgumentException("Invalid index: " + index);
        }
    }

    // Method to set coefficient at a specific index
    public void setCoefficient(int index, double value) {
        if (index >= 0 && index < coefficients.length) {
            coefficients[index] = value;
        } else {
            throw new IllegalArgumentException("Invalid index: " + index);
        }
    }
}
