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
public class FullTimeStaff extends Employee {
    private final static float yearlySickDay = 20;
    private int yearlySalary;
    private float sickDaysLeft;
    
    public FullTimeStaff(int yearlySalary,String employeeNum, String first, String last){
        super(employeeNum,first,last);
        this.yearlySalary = yearlySalary;
        this.sickDaysLeft = yearlySickDay;
    }
    
    @Override
    public void deductSickDay() {
        
    }

    @Override
    public void resetSickDay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printPayStub() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double pay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
