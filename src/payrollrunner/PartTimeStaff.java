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
    private String title;
    
    public PartTimeStaff(String title, float numHoursAssigned, double hourlyRate, String employeeNum, String first, String last){
        super(employeeNum, first, last);
        this.numHoursAssigned = numHoursAssigned;
        this.hourlyRate = hourlyRate;
        this.title = title;
    }

    @Override
    public double pay() {
        return hourlyRate * (numHoursAssigned - (sickDaysTaken * 8.0));
        }

    @Override
    public void deductSickDay(float f) {
        this.sickDaysTaken += f;
        }

    @Override
    public void resetSickDay() {
        this.sickDaysTaken = 0;
        }

    @Override
    public void printPayStub() {
        System.out.println("Amount earned this month: "+this.pay());
        System.out.println("Amount of hours worked: "+(numHoursAssigned - (sickDaysTaken * 8.0)));
        }
    
    public PartTimeStaff compareToSickDay(PartTimeStaff c){
        return this.sickDaysTaken > c.sickDaysTaken ? this : c;
    }
    
    @Override
    public String  toString(){
        return "Title: "+this.title+"\n"+super.toString();
    }

    /**
     * @return the numHoursAssigned
     */
    public float getNumHoursAssigned() {
        return numHoursAssigned;
    }

    /**
     * @return the hourlyRate
     */
    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * @return the sickDaysTaken
     */
    public float getSickDaysTaken() {
        return sickDaysTaken;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param numHoursAssigned the numHoursAssigned to set
     */
    public void setNumHoursAssigned(float numHoursAssigned) {
        this.numHoursAssigned = numHoursAssigned;
    }

    /**
     * @param hourlyRate the hourlyRate to set
     */
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    /**
     * @param sickDaysTaken the sickDaysTaken to set
     */
    public void setSickDaysTaken(float sickDaysTaken) {
        this.sickDaysTaken = sickDaysTaken;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
}
