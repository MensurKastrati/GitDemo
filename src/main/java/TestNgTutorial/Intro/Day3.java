package TestNgTutorial.Intro;

import org.testng.annotations.*;

public class Day3 {

    @BeforeClass
    public void BeforeClass(){
        System.out.println("-- Before Class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("-- After Class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("----------------- Before Method");
    }
    @Test
    public void WebLoginCarLoan(){
        //selenium
        System.out.println("webLoginCar");
    }

    @AfterSuite
    public void AftereSuite(){
        System.out.println("@AfterSuite - I'm the Last");
    }

    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("@BeforeSuite - I'm the first hehe");
    }

    @Test(groups = {"Smoke"})
    public void MobileLoginCarLoan(){
        //appium
        System.out.println("mobileLoginCar");
    }

    @Test
    public void MobileSiginCarLoan(){
        //appium
        System.out.println("mobileSigninCar");
    }

    @Test
    public void MobileSignoutCarLoan(){
        //appium
        System.out.println("mobileSignOutCar");
    }

    @Test
    public void APILoginCarLoan(){
        //Rest API automation
        System.out.println("*******************APILoginCarLoan");
    }
}
