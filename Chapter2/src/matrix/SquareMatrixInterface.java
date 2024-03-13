/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package matrix;

/**
 *
 * @author Tang Chun Xuan
 */
public interface SquareMatrixInterface {
    SquareMatrixInterface makeEmpty(int m);
    SquareMatrixInterface storeValue(int i,int j,int value);
    SquareMatrixInterface add(SquareMatrixInterface s);
    void copy(SquareMatrixInterface otherMatrix);
}
