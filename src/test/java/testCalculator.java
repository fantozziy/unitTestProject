import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by softinstall on 13.03.2017.
 */
@RunWith(Parameterized.class)
public class testCalculator {
    @Parameterized.Parameters
    public static Collection dataSum() {
        //Создаём массив массивов
        Object[][] data = new Object[][]{
                {5, 4, 9},
                {3, 3, 6},
                {7, 8, 15}
        };
        return Arrays.asList(data);
    }
    int x1, x2, result;

    public testCalculator(int x1, int x2, int result) {
        this.x1 = x1;
        this.x2 = x2;
        this.result = result;
    }

    @Test(timeout = 5000)
    public void getSumTest() {
        Calculator calculator = new Calculator();
        int actualSum = calculator.getSum(x1, x2);
        int expectedSum = result;

        Assert.assertEquals("Method getSum is not valid", expectedSum, actualSum);

    }

    @After
    public void printMessage() {
        System.out.println("Test passed"); // Выводится информация о количестве тестов и их прохождении
    }

    /* Оптимизированный код, по сравнению с предидущим тестом.
    @Test(timeout = 5000)
    public void getMinusTest() {
        Calculator calculator = new Calculator();
        Assert.assertEquals("Method getMinus is not valid", 15, calculator.getMinus(20, 5)); //должно быть 15
    }
    */
}

