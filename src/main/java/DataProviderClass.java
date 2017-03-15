import org.testng.annotations.DataProvider;

/**
 * Created by pst on 15.03.2017.
 */
public class DataProviderClass {
    @DataProvider(name = "getSumData")
    public static Object[][] getSumData() {
        return new Object[][]{
                {4, 3, 7},
                {5, 5, 10},
                {1, 7, 8}
        };
    }

    @DataProvider(name = "getMinusData")
    public static Object[][] getMinusData() {
        return new Object[][]{
                {7, 3, 4},
                {10, 5, 5},
                {8, 7, 2}
        };
    }

    @DataProvider(name = "getQuotientData")
    public static Object[][] getQuotientData() {
        return new Object[][]{
                {12, 3, 4},
                {5, 5, 1},
                {8, 2, 4}
        };
    }
}
