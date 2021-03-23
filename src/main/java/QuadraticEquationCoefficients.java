public class QuadraticEquationCoefficients {
    public static double[] quadraticQequation(int a, int b, int c) {
        if (a == 0) {
            return new double[]{(double) -c / b};
        } else {
            double discriminant = Math.pow(b, 2) - (4 * a * c);

            if (discriminant == 0) {
                return new double[]{(double) -b / 2 * a};
            } else if (discriminant > 0) {
                return new double[]{
                        (-b - Math.sqrt(discriminant)) / (2 * a),
                        (-b + Math.sqrt(discriminant)) / (2 * a)};
            } else {
                return new double[]{};
            }
        }
    }
}
