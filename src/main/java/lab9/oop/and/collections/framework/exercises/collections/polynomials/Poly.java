package lab9.oop.and.collections.framework.exercises.collections.polynomials;

public interface Poly {
    double[] coefficients();
    double coefficient(int degree);
    int degree();
    Poly derivative();
}
