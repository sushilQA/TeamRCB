package org.testing.RCB.utilities;

import com.relevantcodes.extentreports.ExtentReports;

public class GenerateExtentReports {
	
		public static ExtentReports generateExtentReport()
		{
			ExtentReports extentReports = new ExtentReports("../NopaperformsDP/test-output/NopaperformsDP.html", false);
			return extentReports;
		}

}
