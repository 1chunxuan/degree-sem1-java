/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;


import java.io.*;
import java.util.*;

/**
 *
 * @author Tang Chun Xuan
 */
//Comparable<Tutor>
public class Tutor implements Serializable,Comparable<Tutor> {
    
    public static int nextTutor = 1;
    private int id = 0;
    private String name;
    private int age;
    private String subject;

    public Tutor() {
    }

    public Tutor(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tutor other = (Tutor) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.subject, other.subject);
    }

    public Tutor(String name) {
        this.name = name;
    }

    public Tutor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Tutor(String name, int age, String subject) {

        this.id = nextTutor++;
        this.name = name;
        this.age = age;
        this.subject = subject;
       
    }

    public static int getNextTutor() {
        return nextTutor;
    }

    @Override
    public String toString() {
        return "tutor id :" + id + " tutor name:" + name + " ,tutor age:" + age + " ,teaching subject:" + subject;
    }

    public static void setNextTutor(int nextTutor) {
        Tutor.nextTutor = nextTutor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public int compareTo(Tutor o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    


}
