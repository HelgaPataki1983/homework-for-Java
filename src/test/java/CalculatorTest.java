import Calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CalculatorTest {

    Calculator calculator;
    @BeforeClass
            public void initCalculator(){
        System.out.println("I run before test");
        Calculator calculator = new Calculator();
    }

    @DataProvider(name = "sumTestDataProvider")
    public Object[][] sumTests(){
        return new Object[][]{
                {3,5,8},
                {0,5,5},
                {-1,5,4}
        };
    }
    @Test(dataProvider = "sumTestDataProvider")
    public void testsumTestDataProvider(int firstNum, int secondNum, int thirdNum){
        System.out.println("All sum test cases");

        Assert.assertEquals(actResult, expResult, "Actual result didnt mach expected");
    }
    @Test
    public  void  testSum(){
        System.out.println("First sum test case");
        Calculator calculator = new Calculator();
        int expResult = 8;
        int actResult = calculator.sum(3,5);
        Assert.assertEquals(actResult, expResult, "Actual result didnt mach expected");
    }
    @Test
    public  void  testSum1(){
        System.out.println("Second sum test case");
        Calculator calculator = new Calculator();
        int expResult = 5;
        int actResult = calculator.sum(0,5);

        Assert.assertEquals(actResult, expResult, "Actual result didnt mach expected");
    }
    @Test
    public  void  testSum2(){
        System.out.println("Thisd sum test case");
        Calculator calculator = new Calculator();
        int expResult = 4;
        int actResult = calculator.sum(-1,5);
        Assert.assertEquals(actResult, expResult, "Actual result didnt mach expected");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("I run after class");
    }
}
