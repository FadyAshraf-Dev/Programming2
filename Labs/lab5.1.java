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
        return (real!=0?real:"") + (real!=0 &&imag!=0?(imag>0?" + ":" - "):"") + (imag!=0?(imag>0?imag:-imag) + "i":"");
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
