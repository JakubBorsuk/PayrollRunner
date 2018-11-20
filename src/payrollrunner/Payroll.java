/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollrunner;

import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author 342720539
 */
public class Payroll {

    private ArrayList<Employee> staffList = new ArrayList<>();
    
    public Payroll() {
    }
    
    public void addPartTimeStaff(String title, float numHoursAssigned, double hourlyRate, String employeeNum, String first, String last) {
        staffList.add(new PartTimeStaff(title, numHoursAssigned, hourlyRate, employeeNum, first, last));
    }
    
    public void addFullTimeStaff(int yearlySalary, String title, String employeeNum, String first, String last) {
        staffList.add(new FullTimeStaff(yearlySalary, title, employeeNum, first, last));
    }
    
    public void listAllEmployee() {
        for (Employee e : staffList) {
            System.out.println(e.toString());
        }
    }
    
    public void enterSickDay(float f, String s) {
        for(int i = 0; i<staffList.size(); i++){
            if(staffList.get(i).getEmployeeNumber().equals(s)){
                staffList.get(i).deductSickDay(f);
            }
        }
    }
    
    public void printAllPayStubs(){
        for(int i = 0; i<staffList.size(); i++){
            staffList.get(i).printPayStub();
        }
    }
    
    public void saveStaffList(String s) throws IOException{
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(s))){
            for(Employee e : staffList){
                
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
