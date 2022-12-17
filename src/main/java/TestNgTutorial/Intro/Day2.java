package TestNgTutorial.Intro;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {



    @Test
    public void hej(){
        System.out.println("Hej");

    }

    @Test(groups = {"Smoke"})
    public void methodInDay2(){
        System.out.println("Method in Day2  (Smoke)");
    }

    @BeforeTest
    public void preRequistes(){
        System.out.println("I will execute first - @BeforeTest");
    }

    @Test(dependsOnMethods = {"t4","t5"})
    public void t1(){System.out.println("t1");}

    @Test
    public void t2(){System.out.println("t2");}

    @Test
    public void t3(){System.out.println("t3");}

    @Test
    public void t4(){System.out.println("t4");}

    @Test
    public void t5(){System.out.println("t5");}

}
