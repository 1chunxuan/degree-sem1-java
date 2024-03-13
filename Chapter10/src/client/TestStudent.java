/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import entity.Student;

/**
 *
 * @author Tang Chun Xuan
 */
public class TestStudent {

    public static void main(String[] args) {
        //put 1 Big L behind the long value to prevent error
        Student s1 = new Student(1324325100002211L, "Kermit", 3.7);
        System.out.println("s1:\n"+s1);
        System.out.println("HashCode: "+s1.hashCode());
    }
}
