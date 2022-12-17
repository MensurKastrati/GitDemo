package TestNgTutorial.Intro;

import org.testng.annotations.Test;

public class Day4 {

    @Test
    public void WebLoginHomeLoan(){
        //selenium
        System.out.println("webLoginHome");
    }

    @Test
    public void MobileLoginHomeLoan(){
        //appium
        System.out.println("mobileLoginHome");
    }

    @Test(groups = {"Smoke"})
    public void LoginAPIHomeLoan(){
        //Rest API automation
        System.out.println("APILoginHome");
    }
}
