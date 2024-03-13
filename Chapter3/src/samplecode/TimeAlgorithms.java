/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package samplecode;

/**
 *
 * @author Tang Chun Xuan
 */
public class TimeAlgorithms {

    public static int algorithmA(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int algorithmB(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sum += 1;
            }

        }
        return sum;
    }

    public static int algorithmC(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        String outputStr = String.format("%10s %12s %12s %12s\n", "n", "Algorithm A", "Algorithm B", "Algorithm C");
        for (int n = 10; n <= 1000000; n *= 10) {
            //algorithm A
            int resultA = 0;
            long totalTimeA = 0;
            for (int i = 0; i < 10; i++) {
                long start = System.nanoTime();
                resultA = algorithmA(n);
                totalTimeA += System.nanoTime() - start;
            }
            long avgTimeA = totalTimeA / 10;

            //algorithm B
            int resultB = 0;
            long totalTimeB = 0;
            for (int i = 0; i < 10; i++) {
                long start = System.nanoTime();
                resultB = algorithmB(n);
                totalTimeB += System.nanoTime() - start;
            }
            long avgTimeB = totalTimeB / 10;

            //algorithm C
            int resultC = 0;
            long totalTimeC = 0;
            for (int i = 0; i < 10; i++) {
                long start = System.nanoTime();
                resultC = algorithmC(n);
                totalTimeC += System.nanoTime() - start;
            }
            long avgTimeC = totalTimeC / 10;

            outputStr += String.format("%10d %12d %12d %12d\n", n, avgTimeA, avgTimeB, avgTimeC);
            System.out.printf("algorithmA(%d)=%d\n", n, algorithmA(n));
            System.out.printf("algorithmB(%d)=%d\n", n, algorithmB(n));
            System.out.printf("algorithmC(%d)=%d\n", n, algorithmC(n));

        }
        System.out.println(outputStr);
    }
}
