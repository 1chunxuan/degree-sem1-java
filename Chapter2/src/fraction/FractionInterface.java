/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package fraction;

/**
 *
 * @author Tang Chun Xuan
 */
public interface FractionInterface {
    void setDenominator(int number);
    void setNumerator(int number);
    int getNumerator();
    int getDenominator();
    FractionInterface add(FractionInterface f);
    FractionInterface subtract(FractionInterface f);
    FractionInterface multiply(FractionInterface f);
    FractionInterface divide(FractionInterface f);
}
