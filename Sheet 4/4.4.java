package org.example;

public class Launcher {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("please enter a: ");
        double a = s.nextDouble();
        System.out.print("please enter b: ");
        double b = s.nextDouble();
        System.out.print("please enter c: ");
        double c = s.nextDouble();
        QuadraticEquation eq = new QuadraticEquation(a,b,c);
        if (eq.getDescriminant() >0){
            System.out.println("root1 = " + eq.getRoot1());
            System.out.println("root2 = " + eq.getRoot2());
        }
        else if (eq.getDescriminant() ==0){
            System.out.println("root = " + eq.getRoot1());
        }
        else{
            System.out.println("there are no real roots");
        }
    }
}


public class QuadraticEquation {

    private double a,b,c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public QuadraticEquation(double a, double b, double c) {
        setA(a);
        setB(b);
        setC(c);
    }
    public double getDiscriminant(){
        return b*b-4*a*c;
    }
    public MyComplex[] getRoots(){
        MyComplex r1,r2;
        if (getDiscriminant()>0){
            r1 = new MyComplex((-b+Math.sqrt(getDiscriminant()))/(2*a),0 );
            r2 = new MyComplex((-b-Math.sqrt(getDiscriminant()))/(2*a),0 );
            return new MyComplex[] {r1,r2};
        }
        else if (getDiscriminant() == 0){
            r1 = new MyComplex(-b/(2*a),0 );
            r2 = r1;
            return new MyComplex[] {r1,r2};
        }
        else{
            r1 = new MyComplex(-b/(2*a),Math.sqrt(-getDiscriminant())/(2*a) );
            r2 = r1.conjugate();
            return new MyComplex[] {r1,r2};
        }
    }

}
package org.example;

public class MyComplex {
    private double imag;
    private double real;

    public MyComplex(double real, double imag) {
        setValue(real,imag);
    }

    public double getImag() {
        return imag;
    }


    public double getReal() {
        return real;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag= imag;
    }

    @Override
    public String toString() {
        if (real==0 && imag==0){
            return "0";
        }
        return (real!=0?real:"") + (real!=0 &&imag!=0?(imag>0?"+":""):"") + (imag!=0?imag + "i":"");
    }

    public MyComplex conjugate() {
        return new MyComplex(real, -1*imag);
    }
    public double arguementInDegrees(){
        return Math.atan(imag/real)*180/Math.PI;
    }
    public double magnitue(){
        return Math.sqrt(Math.pow(real,2)+Math.pow(imag,2));
    }
    public MyComplex add(MyComplex another){
        return new MyComplex(another.real+this.real, another.imag+this.imag);
    }
    public MyComplex subtract(MyComplex another){
        return new MyComplex(another.real-this.real, another.imag-this.imag);
    }
    public MyComplex multiply(MyComplex another){
        return new MyComplex(another.real*this.real-another.imag*this.imag, another.imag*this.real+another.real*this.imag);
    }
    public MyComplex divideBy(MyComplex another){

        MyComplex den = new MyComplex(1/(another.real*another.real + another.imag*another.imag), 0);
        MyComplex num = this.multiply(another.conjugate());
        return  num.multiply(den);
    }

}
package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationTest {
    private final double DELTA = 1e-9;
    @Test
    void getRoots() {
    }
    void assertComplex(double expectedReal, double expectedImag, MyComplex actual) {
        assertEquals(expectedReal, actual.getReal(), DELTA, "Real part mismatch");
        assertEquals(expectedImag, actual.getImag(), DELTA, "Imaginary part mismatch");
    }
    @ParameterizedTest(name = "{0}x^2 + {1}x + {2} = 0")
    @CsvSource({
            // a,   b,   c,   root1Real, root1Imag, root2Real, root2Imag
            "1.0,  0.0,  1.0,  0.0,       1.0,       0.0,      -1.0",  // x^2 + 1 = 0
            "1.0, -4.0, 13.0,  2.0,       3.0,       2.0,      -3.0",  // x^2 - 4x + 13 = 0
            "1.0,  2.0,  5.0, -1.0,       2.0,      -1.0,      -2.0",  // x^2 + 2x + 5 = 0
            "2.0,  2.0,  1.0, -0.5,       0.5,      -0.5,      -0.5"   // 2x^2 + 2x + 1 = 0
    })
    @DisplayName("Test Negative Discriminant (Complex Roots)")
    void testComplexRoots(double a, double b, double c,
                          double r1R, double r1I, double r2R, double r2I) {
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        MyComplex[] roots = qe.getRoots();

        assertComplex(r1R, r1I, roots[0]);
        assertComplex(r2R, r2I, roots[1]);
    }
    @Test
    @DisplayName("Test Zero Discriminant (Repeated Real Root)")
    void testRepeatedRoot() {
        QuadraticEquation qe = new QuadraticEquation(1, -2, 1); // (x-1)^2
        MyComplex[] roots = qe.getRoots();

        assertComplex(1.0, 0.0, roots[0]);
        assertComplex(1.0, 0.0, roots[1]);
    }

    @Test
    @DisplayName("Test Positive Discriminant (Distinct Real Roots)")
    void testRealRoots() {
        QuadraticEquation qe = new QuadraticEquation(1, -5, 6); // (x-3)(x-2)
        MyComplex[] roots = qe.getRoots();

        // Standard quadratic formula usually returns higher value first depending on implementation
        assertComplex(3.0, 0.0, roots[0]);
        assertComplex(2.0, 0.0, roots[1]);
    }

    @Test
    @DisplayName("Test High Precision Irrational Roots")
    void testIrrationalComplexRoots() {
        QuadraticEquation qe = new QuadraticEquation(1, 1, 1); // x^2 + x + 1
        MyComplex[] roots = qe.getRoots();

        // Roots are -0.5 +/- (sqrt(3)/2)i
        double expectedImag = Math.sqrt(3) / 2.0;

        assertComplex(-0.5, expectedImag, roots[0]);
        assertComplex(-0.5, -expectedImag, roots[1]);
    }
}