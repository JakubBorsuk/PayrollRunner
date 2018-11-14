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
public class PartTimeStaff extends Employee {
    private float numHoursAssigned;
    private double hourlyRate;
    private float sickDaysTaken = 0;
    
    public PartTimeStaff(float numHoursAssigned, double hourlyRate, String employeeNum, String first, String last){
        super(employeeNum, first, last);
        this.numHoursAssigned = numHoursAssigned;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double pay() {
        return hourlyRate * (numHoursAssigned - (sickDaysTaken * 8.0));
        }

    @Override
    public void deductSickDay(float f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void resetSickDay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printPayStub() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
