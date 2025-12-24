package com.ui.listener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    ExtentSparkReporter extentSparkReporter;
    ExtentReports extentReports;
    ExtentTest extentTest;

    public void onTestStart(ITestResult result) {
        extentTest = extentReports.createTest(result.getMethod().getMethodName());
    }

    public void onStart(ITestContext context) {
        extentSparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"//report.html");
        extentReports =new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);
    }

    public void onTestSuccess(ITestResult result) {
        extentTest.log(Status.PASS,result.getMethod().getMethodName()+" "+"PASSED");
    }

    public void onTestFailure(ITestResult result) {
        extentTest.log(Status.FAIL,result.getMethod().getMethodName()+" "+"FAILED");
    }

    public void onTestSkipped(ITestResult result) {
        extentTest.log(Status.SKIP,result.getMethod().getMethodName()+" "+"SKIPPED");
    }

    public void onFinish(ITestContext context) {
        extentReports.flush();
    }
}
