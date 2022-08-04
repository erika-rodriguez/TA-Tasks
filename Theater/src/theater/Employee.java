/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theater;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Erika92
 */
public class Employee extends Person {
    private String employeeId;
    private double salary;

    //constructor
    public Employee(String employeeId, double salary, int id, String name, Date dateOfBirth) {
        super(id, name, dateOfBirth);
        this.employeeId = employeeId;
        this.salary = salary;
    }
    
   //getters and setters
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    

    }

    