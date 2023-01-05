package com.blackflower.lastlabforfirstsemester;

import java.util.ArrayList;

/**
 *
 * @author emirs
 */
public class Department {
    String deptName;
    static ArrayList<Employee> employees = new ArrayList<>();
    
    static class EmployeeAdder{
        void addEmployee(Employee emp, IPayment payment){
            
        }
    }
    
    ArrayList<Employee> getEmployeeExeedingAdvance(){
        ArrayList<Employee> employeeseExeedingAdvance = new ArrayList<>();
        
        for (Employee employee : employees) {
            if (employee.getToatalSalary() < employee.getTotalAdvances()) {
                employeeseExeedingAdvance.add(employee);
            }
        }
        
//        // Stream Solution
//        employees.forEach((employee) -> {
//            if (employee.getToatalSalary() < employee.getTotalAdvances()) {
//                employeeseExeedingAdvance.add(employee);
//            }
//        });

        return employeeseExeedingAdvance;
    }
    
    void addPaymentToEmployee(IPayment payment, String firstName, String lastName){
        for (Employee employee : employees) {
            if (employee.name.equals(firstName) && employee.surname.equals(lastName)) {
                employee.advances.add(payment);
            }
        }
    }
  
}
