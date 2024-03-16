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
        this.coefficients = new double[]{1, 1, 1};
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

    // Method to calculate the discriminant
    public double getDiscriminant() {
        double a = coefficients[0];
        double b = coefficients[1];
        double c = coefficients[2];
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return 0;
        } else {
            double a = coefficients[0];
            double b = coefficients[1];
            return (-b + Math.sqrt(discriminant)) / (2 * a);
        }
    }

    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return 0;
        } else {
            double a = coefficients[0];
            double b = coefficients[1];
            return (-b - Math.sqrt(discriminant)) / (2 * a);
        }
    }

    public boolean hasSolution() {
        return getDiscriminant() >= 0;
    }

    @Override
    public String toString() {
        double root1 = getRoot1();
        double root2 = getRoot2();
        if (!hasSolution()) {
            return "No real solutions.";
        } else if (root1 == root2) {
            return String.format("root1=%.2f, root2=%.2f", root2, root1);
        } else {
            return String.format("root1=%.2f, root2=%.2f", Math.max(root2, root1), Math.min(root1, root2));
        }
    }

}
