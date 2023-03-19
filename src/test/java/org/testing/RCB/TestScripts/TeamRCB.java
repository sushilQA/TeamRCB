package org.testing.RCB.TestScripts;

import java.io.File;
import java.io.IOException;

import org.testing.RCB.TestCases.ValidateForeignPlayers;
import org.testing.RCB.TestCases.ValidateWicketKeeper;
import org.testing.RCB.utilities.GenerateExtentReports;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import jxl.read.biff.BiffException;
public class TeamRCB{

	@Test(enabled = true, priority = 1)
	public void validatePlayers() throws IOException, BiffException {
		File file = new File("../TeamRCB/src/test/java/org/testing/RCB/Resources/TeamRCB.json");
		ValidateForeignPlayers vp = new ValidateForeignPlayers();
		ExtentReports extentReports = GenerateExtentReports.generateExtentReport();
		ExtentTest extentTest = extentReports.startTest("Test Name = TeamRCB");
		vp.validateForeignPlayers(file);
		extentReports.endTest(extentTest);
		extentReports.flush();
	}
	@Test(enabled = true, priority = 1)
	public void validateWicketKeeper() throws IOException, BiffException {
		File file = new File("../TeamRCB/src/test/java/org/testing/RCB/Resources/TeamRCB.json");
		ValidateWicketKeeper vk = new ValidateWicketKeeper();
		ExtentReports extentReports = GenerateExtentReports.generateExtentReport();
		ExtentTest extentTest = extentReports.startTest("Test Name = TeamRCB");
		vk.validateWicketKeeper(file);
		extentReports.endTest(extentTest);
		extentReports.flush();
	}

	@AfterClass
	public void afterClass() {
		System.out.println("TC1 Executed Successfully");
	}

}
