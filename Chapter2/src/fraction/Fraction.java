/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fraction;

import utility.MathUtil;

/**
 *
 * @author Tang Chun Xuan
 */
public class Fraction implements FractionInterface{
    private int numerator,denominator;

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    

    @Override
    public void setDenominator(int denominator) {
        if(denominator!=0){
            this.denominator=denominator;
        }
        
    }

    @Override
    public void setNumerator(int numerator) {
        this.numerator=numerator;
    }

    @Override
    public int getNumerator() {
        return numerator;
    }

    @Override
    public int getDenominator() {
        return denominator;
    }

    @Override
    public FractionInterface add(FractionInterface f) {
        int a=this.getNumerator();
        int b=this.getDenominator();
        int c=f.getNumerator();
        int d=f.getDenominator();
        int resultNumerator=a*d+b*c;
        int resultDenominator=b*d;
        return simplify(resultNumerator, resultDenominator);
    }

    public FractionInterface simplify(int resultNumerator, int resultDenominator) {
        int factor=MathUtil.gcd(resultNumerator, resultDenominator);
        resultNumerator/=factor;
        resultDenominator/=factor;
        return new Fraction(resultNumerator,resultDenominator);
    }

    @Override
    public FractionInterface subtract(FractionInterface f) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return  numerator + " / " + denominator ;
    }

    @Override
    public FractionInterface multiply(FractionInterface f) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public FractionInterface divide(FractionInterface f) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
