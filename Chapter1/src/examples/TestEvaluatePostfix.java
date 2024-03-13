/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples;
import java.util.Stack;

/**
 *
 * @author Tang Chun Xuan
 */
public class TestEvaluatePostfix {
    public static void main(String[] args) {
        String postfix="62+53*/";
        String expression="[(6 + {9 - 7}) / {2 * (5 + 3)}]";
        System.out.printf("%s =%.7f\n",postfix,MathUtil.evaluate(postfix));
        boolean result = isBalanced(expression);

        if (result) {
            System.out.println("The expression has balanced parentheses.");
        } else {
            System.out.println("The expression does not have balanced parentheses.");
        }
//        System.out.printf("%s =%.7f\n",postfix2,MathUtil.evaluate(postfix2));
    }
    
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        String openingBrackets = "([{";
        String closingBrackets = ")]}";

        for (char c : expression.toCharArray()) {
            if (openingBrackets.contains(String.valueOf(c))) {
                stack.push(c);
            } else if (closingBrackets.contains(String.valueOf(c))) {
                if (stack.isEmpty()) {
                    return false; // Unbalanced if no opening bracket to match
                }
                char top = stack.pop();
                if (openingBrackets.indexOf(top) != closingBrackets.indexOf(c)) {
                    return false; // Mismatched brackets
                }
            }
        }
        return stack.isEmpty(); // Expression is balanced if stack is empty
    }
}


