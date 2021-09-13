package Assignment_1;
import java.util.*;
import java.lang.Math;
class Complex
{
    double real;
    double complex;
    Complex()
    {
        this.real = 0;
        this.complex=0;
    }

    Complex(double real,double complex)
    {
        this.real = real;
        this.complex = complex;
    }
    Complex addComplex(Complex c1)
    {
        double newreal = this.real + c1.real;
        double newcomplex = this.complex + c1.complex;
        Complex cnew = new Complex(newreal,newcomplex);
        return cnew;
    }
    Complex subComplex(Complex c1)
    {
        double newreal = this.real - c1.real;
        double newcomplex = this.complex - c1.complex;
        Complex cnew = new Complex(newreal,newcomplex);
        return cnew;
    }
    Complex mulComplex(Complex c1)
    {
        double newreal = ((this.real*c1.real) + (this.complex*c1.complex*-1));
        double newcomplex =((this.complex * c1.real) + (c1.complex*this.real));
        Complex cnew = new Complex(newreal,newcomplex);
        return cnew;
    }
    Complex conjComplex(Complex c1)
    {
        double newreal = c1.real;
        double newcomplex = (-1) *c1.complex;
        Complex cnew = new Complex(newreal,newcomplex);
        return cnew;
    }
    Complex divComplex(Complex c1)
    {
        Complex aux = this.mulComplex(conjComplex(c1));
        double deno = (Math.pow(c1.real,2) + Math.pow(c1.complex,2));
        double newreal = (aux.real)/deno;
        double newcomplex = (aux.complex)/deno;
        Complex cnew = new Complex(newreal,newcomplex);
        return cnew;
    }

    void displayComplex()
    {
        System.out.println("The Complex Number is --> " +"("+ real+")"+ " + " + "("+complex +"i"+")");
    }
}

public class AssignmentOne {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter real part of first complex number : ");
        double r1 = s.nextDouble();
        System.out.println("Enter imaginary part of first complex number : ");
        double i1 = s.nextDouble();
        System.out.println("Enter real part of second complex number : ");
        double r2 = s.nextDouble();
        System.out.println("Enter imaginary part of second complex number : ");
        double i2 = s.nextDouble();
        Complex c1 = new Complex(r1,i1);
        Complex c2 = new Complex(r2,i2);
        Complex mulResult = c1.mulComplex(c2);
        System.out.println("After Multiplication ..");
        mulResult.displayComplex();
        Complex addResult = c1.addComplex(c2);
        System.out.println("After Addition...");
        addResult.displayComplex();
        Complex subResult = c1.subComplex(c2);
        System.out.println("After Subtraction...");
        subResult.displayComplex();
        Complex divResult = c1.divComplex(c2);
        System.out.println("After Division...");
        divResult.displayComplex();



    }
}
