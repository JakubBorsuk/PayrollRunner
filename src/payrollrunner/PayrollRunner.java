/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollrunner;

import java.io.IOException;

/**
 *
 * @author 342720539
 */
public class PayrollRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Payroll payroll = new Payroll();
        payroll.addFullTimeStaff(120000, "Boss", "123123123", "Hello", "How are you?");
        payroll.addPartTimeStaff("Clerk", 40f, 100, "987987897", "Will", "Brown");
        
        payroll.saveStaffList("StaffList.txt");
    }
    
}
