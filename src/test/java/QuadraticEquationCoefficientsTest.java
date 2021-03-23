import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationCoefficientsTest {
    @org.junit.jupiter.api.Test
    void quadraticEquation_validCoefficients_TwoRoots() {
        double[] expected = new double[]{-5, -1};
        double[] actual = QuadraticEquationCoefficients.quadraticQequation(1, 6, 5);
        assertArrayEquals(expected, actual, 0);
    }

    @org.junit.jupiter.api.Test
    void quadraticEquation_validCoefficients_OneRoots() {
        double[] expected = new double[]{0};
        double[] actual = QuadraticEquationCoefficients.quadraticQequation(1, 0, 0);
        assertArrayEquals(expected, actual, 0);
    }

    @org.junit.jupiter.api.Test
    void quadraticEquation_validCoefficients_NoRoots() {
        double[] expected = new double[]{};
        double[] actual = QuadraticEquationCoefficients.quadraticQequation(5, 1, 1);
        assertArrayEquals(expected, actual, 0);
    }
}