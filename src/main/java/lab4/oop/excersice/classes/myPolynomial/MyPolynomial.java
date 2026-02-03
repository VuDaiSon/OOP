package lab4.oop.excersice.classes.myPolynomial;

public class MyPolynomial {
    private double[] coeffs;
    public MyPolynomial(double... coeffs){
        this.coeffs = coeffs;
    }
    public int getDegree(){
        return coeffs.length-1;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = coeffs.length-1; i >=0; i--){
            double c = coeffs[i];
            if(c==0)continue;
            if(!sb.isEmpty()) {
                sb.append("+");

            }if(i==0){
                sb.append("c");
            } else if (i==1) {
                sb.append(c).append("x");
            } else if (i>1) {
                sb.append(c).append("x^").append(i);
            }
        }
        return sb.toString();
    }
    public double evaluate(double x){
        double sum = 0.0;
        for(int i = 0; i<coeffs.length; i++){
            sum += coeffs[i]*Math.pow(x, i);
        }
        return sum;
    }
    public MyPolynomial add(MyPolynomial right){
        int maxLen = Math.max(this.coeffs.length, right.coeffs.length);
        double[] result = new double[maxLen];
        for(int i = 0; i <maxLen; i++){
            double a = (i< this.coeffs.length) ? this.coeffs[i] : 0;
            double b = (i < right.coeffs.length) ? right.coeffs[i] : 0;
            result[i] = a + b;
        }
        this.coeffs = result;
        return this;
    }
    public MyPolynomial multiply(MyPolynomial right){
        int newLen = this.coeffs.length + right.coeffs.length -1;
        double[] result = new double[newLen];
        for(int i = 0; i<this.coeffs.length; i++){
            for(int j = 0; j<right.coeffs.length; j++){
                result[i+j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        this.coeffs = result;
        return this;
    }
}
