/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;
import adt.BinaryTree;
import java.util.Stack;
/**
 *
 * @author Tang Chun Xuan
 */
public class TestExprTree {
    public BinaryTree<String> buildTree(String postfixExpr){
        Stack<BinaryTree<String>>stack=new Stack<>();
        for (int i = 0; i < postfixExpr.length(); i++) {
            char ch=postfixExpr.charAt(i);
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                BinaryTree<String> rightTree=stack.pop();
                BinaryTree<String> leftTree=stack.pop();
                BinaryTree<String> subTree=new BinaryTree<String>(ch+"",leftTree,rightTree);
                stack.push(subTree);
            }else if(ch!=' '){
                stack.push(new BinaryTree<>(ch+""));
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String postfix="abc+*";
        TestExprTree testTree=new TestExprTree();
        BinaryTree<String> exprTree=testTree.buildTree(postfix);
        System.out.println("Postfix: ");
        exprTree.postorderTraverse();
    }
}
