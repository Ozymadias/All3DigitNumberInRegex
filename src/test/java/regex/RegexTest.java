package regex;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RegexTest {
    @DataProvider
    private static final Object[][] inputsWithNonOutput() {
        return new Object[][]{
                {"abc 12"},
                {"abc12"},
                {"1abc12"},
                {"11abc12"},
                {"abc1 12"}
        };
    }

    @Test(dataProvider = "inputsWithNonOutput")
    public void name(String input) {
        assertEquals(Regex.allAtLeast3Digit(input), "");
    }

    @DataProvider
    private static final Object[][] inputs() {
        return new Object[][]{
                {"cdefg 345 12bb23", "345"},
                {"cdefg 345 12bb23 678tt", "345, 678"},
                {"cdefg 345 12bb236784tt", "345, 236784"},
                {"cdefg 345 1223 6784tt", "345, 1223, 6784"}
        };
    }

    @Test(dataProvider = "inputs")
    public void name2(String input, String output) {
        assertEquals(Regex.allAtLeast3Digit(input), output);
    }
}
