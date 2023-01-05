package com.blackflower.lastlabforfirstsemester;

import java.util.ArrayList;

/**
 *
 * @author emirs
 */
public class Employee {
    String name;
    String surname;
    
    ArrayList<IPayment> payments = new ArrayList<>();
    ArrayList<IPayment> advances = new ArrayList<>();
    
    class Salary implements IPayment{
        int net;
        int tax;
        
        @Override
        public void paymentSalary(int net, int tax) {
            this.net = net;
            this.tax = tax;
            payments.add(this);
        }

        @Override
        public int getTotalPayment() {
            return tax + net;
        }
    }
    
    Salary getSalary(){
        Salary salary = new Salary();
        return salary;
    }
    
    int getToatalSalary(){
        int totalSalary = 0;
        for (IPayment payment : payments) {
//            Salary salary = (Salary)payment;
//            totalSalary += salary.net + salary.tax;
            totalSalary += payment.getTotalPayment();
        }
        return totalSalary;
    }
    
    int getTotalAdvances(){
        int totalAdvances = 0;
        for (IPayment advance : advances) {
            totalAdvances += advance.getTotalPayment();
        }
        return totalAdvances;
    }
}
