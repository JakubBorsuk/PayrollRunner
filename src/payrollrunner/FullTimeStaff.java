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
    private String title;

    public FullTimeStaff(int yearlySalary, String title, String employeeNum, String first, String last) {
        super(employeeNum, first, last);
        this.yearlySalary = yearlySalary;
        this.sickDaysLeft = yearlySickDay;
    }

    @Override
    public void deductSickDay(float f) {
        if (sickDaysLeft - f <= 0) {
            System.out.println("Not enough sick days left, only " + this.sickDaysLeft + "remaining.");
        } else {
            this.sickDaysLeft -= f;
        }
    }

    @Override
    public void resetSickDay() {
        sickDaysLeft = yearlySickDay;
    }

    @Override
    public void printPayStub() {
        System.out.println("Amount earned this month: " + this.pay());
        System.out.println("Amount of sick days left: " + this.sickDaysLeft);
    }

    @Override
    public double pay() {
        return this.yearlySalary / 12.0;
    }

    public FullTimeStaff compareToSickDay(FullTimeStaff staff) {
        return this.sickDaysLeft > staff.sickDaysLeft ? this : staff;
    }

    @Override
    public String toString() {
        return "Title: " + this.title + "\n" + super.toString();
    }

    /**
     * @return the yearlySalary
     */
    public int getYearlySalary() {
        return yearlySalary;
    }

    /**
     * @return the sickDaysLeft
     */
    public float getSickDaysLeft() {
        return sickDaysLeft;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the yearlySickDay
     */
    public static float getYearlySickDay() {
        return yearlySickDay;
    }

    /**
     * @param yearlySalary the yearlySalary to set
     */
    public void setYearlySalary(int yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    /**
     * @param sickDaysLeft the sickDaysLeft to set
     */
    public void setSickDaysLeft(float sickDaysLeft) {
        this.sickDaysLeft = sickDaysLeft;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
}
