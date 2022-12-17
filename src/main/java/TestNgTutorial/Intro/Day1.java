package TestNgTutorial.Intro;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {

    @AfterTest
    public void lastExecution(){
        System.out.println("I will be executed at the end - @AfterTest");

    }

    @Test(groups = {"Smoke"})
    public void Demo(){
        System.out.println("Demo");
        Assert.assertTrue(false);
    }

    @Test
    public void SecondTest(){
        System.out.println("SecondTest");
    }

}
