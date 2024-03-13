/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Tang Chun Xuan
 */
public class Manager extends Employee{
    private double allowance;

    public Manager() {
    }

    public Manager(int id) {
        super(id);
    }

    public Manager(double allowance, int id, String name, double basicSalary) {
        super(id, name, basicSalary);
        this.allowance = allowance;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("%8.2f", allowance);
    }

    @Override
    public double computeMonthlyPay() {
        return super.getBasicSalary()+allowance;
    }
    
    
    
}
