package lab9.oop.and.collections.framework.exercises.collections.polynomials;

/**
 * Class representing a polynomial with coefficients stored as array
 */
public class ArrayPoly extends AbstractPoly {

    private final double[] coefficients;

    public ArrayPoly(double[] coefficients) {
        /* TODO */
        this.coefficients = coefficients;
    }

    @Override
    public int degree() {
        /* TODO */
        return coefficients.length-1;
    }

    @Override
    public Poly derivative() {
        /* TODO */
        if(coefficients.length == 1){
            return new ArrayPoly(new double[]{0});
        }
        double[] result = new double[coefficients.length-1];
        for(int i = 1; i<coefficients.length; i++){
            result[i-1] = coefficients[i] * i;
        }
        return new ArrayPoly(result);
    }

    @Override
    public double coefficient(int degree) {
        /* TODO */
        return coefficients[degree];
    }

    @Override
    public double[] coefficients() {
        /* TODO */

        return coefficients.clone();
    }
}