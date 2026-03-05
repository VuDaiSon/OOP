package lab9.oop.and.collections.framework.exercises.collections.polynomials;

import java.util.Objects;

/**
 * An abstract class providing an implementation for shared parts
 * of ArrayPoly and ListPoly
 */
public abstract class AbstractPoly implements Poly {

    double[] derive() {
        /* TODO */
        double[] c = coefficients();
        if(c.length == 1){
            return new double[]{0};
        }
        double[] result = new double[c.length-1];
        for(int i = 1; i<c.length; i++){
            result[i-1] = c[i] * i;
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        /* TODO */
        if(this==o){
            return true;
        }
        if(!(o instanceof Poly)){
            return false;
        }
        Poly other = (Poly) o;
        double[] a = this.coefficients();
        double[] b = other.coefficients();
        if(a.length != b.length){
            return false;
        }
        for(int i = 0; i<a.length;i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(coefficients());
    }

    @Override
    public String toString() {

        double[] c = coefficients();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < c.length; i++) {

            if (i > 0) sb.append(" + ");

            if (i == 0) {
                sb.append(c[i]);
            } else if (i == 1) {
                sb.append(c[i]).append("x");
            } else {
                sb.append(c[i]).append("x^").append(i);
            }
        }

        return sb.toString();
    }
}