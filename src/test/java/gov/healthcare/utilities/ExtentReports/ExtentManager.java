package gov.healthcare.utilities.ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

        public final ExtentReports extentReports = new ExtentReports();

        public static synchronized ExtentReports createExtentReports() {
            ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");
            reporter.config().setReportName("Sample Extent Report");
            extentReports.attachReporter(reporter);
            extentReports.setSystemInfo("Blog Name", "SW Test Academy");
            extentReports.setSystemInfo("Author", "Onur Baskirt");
            return extentReports;
        }
    }

