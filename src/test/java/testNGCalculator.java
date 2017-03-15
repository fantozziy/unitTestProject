import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by pst on 15.03.2017.
 */
public class testNGCalculator {
    @Test(dataProvider = "getSumData", dataProviderClass = DataProviderClass.class)
    public void getSumTest(int x1, int x2, int result) {
        Calculator calculator = new Calculator();

        Assert.assertEquals(calculator.getSum(x1, x2), result, "getSum method is not correct");
    }

    @Test(dataProvider = "getMinusData", dataProviderClass = DataProviderClass.class)
    public void getMinus(int x1, int x2, int result) {
        Calculator calculator = new Calculator();

        Assert.assertEquals(calculator.getMinus(x1, x2), result, "getMinus method is not correct");
    }

    @Test(dataProvider = "getQuotientData", dataProviderClass = DataProviderClass.class)
    public void getQuotient(int x1, int x2, int result) {
        Calculator calculator = new Calculator();

        Assert.assertEquals(calculator.getQuotient(x1, x2), result, "getQuotient method is not correct");
    }
}
