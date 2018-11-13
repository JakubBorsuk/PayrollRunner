/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollrunner;

/**
 *
 * @author 342720539
 */
public abstract class Employee {
    //holds the number of the employee
    private String employeeNumber;
    //holds the first name of the employee
    private String firstName;
    //holds the last name of the employee
    private String lastName;
    
    //first constructor
    public Employee(String employeeNum, String first, String last){
        this.employeeNumber = employeeNum;
        this.firstName = first;
        this.lastName = last;
    }
    
    //second constructor
    public Employee(){}
    
    //returns the employees pay
    public abstract double pay();
    
    //updates information about sick days of the employee
    public abstract void deductSickDay();
    
    //resets sick day information of an employee
    public abstract void resetSickDay();
    
    //prints the monthly pay stub of the employee
    public abstract void printPayStub();
    
    //prints out the employee number and name
    @Override
    public String toString(){
        return "Employee Number: "+this.employeeNumber+
                "\nEmployee Name: "+this.firstName+" "+this.lastName;
    }
}
