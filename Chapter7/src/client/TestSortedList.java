/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;
import adt.*;
import entity.*;
import java.util.Iterator;
/**
 *
 * @author Tang Chun Xuan
 */
public class TestSortedList {
    
    public static void main(String[] args) {
        SortedListInterface<Employee> eList=new SortedLinkedList<>();
        eList.add(new Manager(2000.00,3333,"Roy",5000.00));
        eList.add(new Manager(3000.00,9999,"Pam",7000.00));
        eList.add(new Clerk(7.50,10,5555,"Ben",1200.00));
        eList.add(new Clerk(6.50,20,2222,"Zoe",1500.00));
        eList.add(new Clerk(8.50,15,8888,"Dan",2000.00));
        eList.add(new Clerk(4.50,15,4444,"Meg",1700.00));
        eList.add(new Clerk(8.00,12,7777,"Ann",1800.00));
        System.out.println("\nEmployee List:\n"+eList);
        
        int id=5555;
        Employee emp=new Manager(id);
        System.out.println("\nRemove id "+id+" "+eList.remove(emp));
        System.out.println("\nEmployee list:\n"+eList);
        
        double totalPayroll=0.0;
        Iterator<Employee> it=eList.getIterator();
        System.out.println("EmpID Employee Name  Salary (RM)");
        while(it.hasNext()){
            Employee e=it.next();
            totalPayroll+=e.computeMonthlyPay();
            System.out.printf("%6d %-8s %10.2f\n",e.getId(),e.getName(),e.computeMonthlyPay());
        }
        System.out.println("Total Employee:"+eList.getNumberOfEntries());
        System.out.printf("Total monthly payroll:RM %,.2f\n",totalPayroll);
    }
}
