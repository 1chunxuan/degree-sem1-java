/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datastructureassgn;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Tang Chun Xuan
 */
public class DataStructureAssgn {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack<Character> stack = new Stack<>();
        
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
        Scanner scanner = new Scanner(System.in);
    String inputString = scanner.nextLine();
    
    for (int i = 0; i < inputString.length(); ++i) {
      stack.push(inputString.charAt(i));
    }
        
    StringBuilder reversedString = new StringBuilder();
    while (!stack.empty()) {
      reversedString.append(stack.pop());
    }
    
        System.out.println("reversed string is "+reversedString);
    }
    
}
