package lab9.oop.and.collections.framework.exercises.collections.polynomials;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a polynomial with coefficients stored as list
 */
public class ListPoly extends AbstractPoly {

    private List<Double> coefficients;

    public ListPoly(double[] coeffs) {
        /* TODO */
        this.coefficients= new ArrayList<>();
        for(double c : coeffs){
            this.coefficients.add(c);
        }
    }

    @Override
    public int degree() {
        /* TODO */
        return coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        /* TODO */
        if(coefficients.size() == 1){
            return new ListPoly(new double[]{0});
        }
        double[] result = new double[coefficients.size() -1];
        for(int i = 1; i<coefficients.size(); i++){
            result[i-1] = coefficients.get(i) * i;
        }
        return new ListPoly(result);
    }

    @Override
    public double coefficient(int degree) {
        /* TODO */
        return coefficients.get(degree);
    }

    @Override
    public double[] coefficients() {
        /* TODO */
        double[] result = new double[coefficients.size()];
        for(int i = 0; i < coefficients.size(); i ++){
            result[i] = coefficients.get(i);
        }
        return result;
    }
}