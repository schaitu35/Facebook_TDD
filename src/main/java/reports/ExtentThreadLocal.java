package reports;

import com.aventstack.extentreports.ExtentTest;

public class ExtentThreadLocal {


    public static ExtentTest getExtentTest() {
        return extentTestThreadLocal.get();
    }

    public static void setExtentTest(ExtentTest extentTest) {
        extentTestThreadLocal.set(extentTest);
    }

   private static ThreadLocal<ExtentTest> extentTestThreadLocal = new ThreadLocal<>();







}
