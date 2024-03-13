/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrix;

/**
 *
 * @author Tang Chun Xuan
 */
public class SquareMatrix implements SquareMatrixInterface{

    private final static int DEFAULT_DIMENSION=2;
    private int n;//dimension of the matrix
    private int [][] array;

    public SquareMatrix() {
        this(DEFAULT_DIMENSION);
    }
    

    public SquareMatrix(int n) {
        this.n = n;
        this.array=new int[n][n];
    }
    
    
    
    @Override
    public SquareMatrixInterface makeEmpty(int m) {
        if(m>=1&&m<=n){
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    array[i][j]=0;
                }
            }
        }
        return this;
    }

    @Override
    public SquareMatrixInterface storeValue(int i, int j, int value) {
        if(i>=1&&i<=n&&j>=1&&j<=n){
            array[i-1][j-1]=value;
            return this;
        }
        return this;
    }

    @Override
    public SquareMatrixInterface add(SquareMatrixInterface s) {
        SquareMatrix givenMatrix=(SquareMatrix)s;
        if(this.n==givenMatrix.n){
            SquareMatrix resultMatrix=new SquareMatrix(n);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    resultMatrix.array[i][j]=array[i][j]+givenMatrix.array[i][j];
                }
            }
            return resultMatrix;
        }
        return null;
    }

    @Override
    public void copy(SquareMatrixInterface otherMatrix) {
        SquareMatrix other=(SquareMatrix)otherMatrix;
        if(this.n==other.n){
            for (int q = 0; q < n; q++) {
                for (int i = 0; i < n; i++) {
                    array[q][i]=other.array[q][i];
                }
            }
        }
    }

    @Override
    public String toString() {
        String outputStr="";
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                outputStr+=String.format("%5d",array[i][j]);
            }
            outputStr+="\n";
        }
        return outputStr;
    }
    
    
}
