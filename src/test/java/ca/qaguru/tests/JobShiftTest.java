package ca.qaguru.tests;

import ca.qaguru.lib.TestBase;
import ca.qaguru.pages.JobShiftPage;
import ca.qaguru.pages.LoginPage;
import org.testng.annotations.Test;

public class JobShiftTest extends TestBase {
    @Test
    public void addJobShift() {    // Adding job shift
        new LoginPage(driver).login("Admin", "admin123").selectMenu("Admin|Job|Work Shifts");
        JobShiftPage JSPage = new JobShiftPage(driver);
        JSPage.addBtnClick("ShiftAW3");
        JSPage.selectDropdown("09:15", "16:00");
        JSPage.SelectEmployee("Lisa Andrews");
        JSPage.clickAddEmp();
        JSPage.clickSave("Successfully Saved");
    }

    @Test
    public void addJobShiftCancel() {    // Cancelling job shift Add
        new LoginPage(driver).login("Admin", "admin123").selectMenu("Admin|Job|Work Shifts");
        JobShiftPage JSPage = new JobShiftPage(driver);
        JSPage.addBtnClick("ShiftAW3");
        JSPage.selectDropdown("09:15", "16:00");
        JSPage.SelectEmployee("Alice Duval");
        JSPage.clickCancel();
    }



    @Test
    public void cancelDeleteShifts() {    // Cancel Delete job shift
        new LoginPage(driver).login("Admin", "admin123").selectMenu("Admin|Job|Work Shifts");
        JobShiftPage JSPage = new JobShiftPage(driver);
        JSPage.selCheckBox("4");
        JSPage.clickCancelDeleteBtn("Delete records?");
    }

    @Test
    public void deleteShifts() {    // Delete job shift
        new LoginPage(driver).login("Admin", "admin123").selectMenu("Admin|Job|Work Shifts");
        JobShiftPage JSPage = new JobShiftPage(driver);
        JSPage.selCheckBox("3");
        JSPage.clickDeleteBtn("Successfully Deleted");
    }
}
