/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Tang Chun Xuan
 */
public class Clerk extends Employee {

    private double overtimeRate;
    private int overtimeHours;

    public Clerk() {
    }

    public Clerk(int id) {
        super(id);
    }

    

    public Clerk(double overtimeRate, int overtimeHours, int id, String name, double basicSalary) {
        super(id, name, basicSalary);
        this.overtimeRate = overtimeRate;
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("%8.2f %8d", overtimeRate,overtimeHours);
    }

    private double computeOvertimePay(){
        return overtimeRate*overtimeHours;
    }
    
    @Override
    public double computeMonthlyPay() {
        return this.getBasicSalary()+computeOvertimePay();
    }
}
