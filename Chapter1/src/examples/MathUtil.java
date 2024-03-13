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
public class MathUtil {
    public static double evaluate(String expr){
        Stack<Double> stack=new Stack<>();
        for (int i = 0; i < expr.length(); i++) {
            char operator=expr.charAt(i);
            if(isOperator(operator)){
                double rightOp=stack.pop();
                double leftOp=stack.pop();
                double result=performOperation(operator, leftOp, rightOp);
                stack.push(result);
            }else if(Character.isDigit(operator)){//operand
                stack.push(Double.parseDouble(operator+""));
            }
        }
        return stack.pop();
        
    }

    public static double performOperation(char operator, double leftOp, double rightOp) {
        double result=0;
        switch(operator){
            case '+':
                result=leftOp+rightOp;
                break;
            case '-':
                result=leftOp-rightOp;
                break;
            case '*':
                result=leftOp*rightOp;
                break;
            case '/':
                result=leftOp/rightOp;
                break;
                
        }
        return result;
    }

    public static boolean isOperator(char operator) {
        return operator=='+'||operator=='-'||operator=='*'||operator=='/';
    }
}
