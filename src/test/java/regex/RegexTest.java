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
}
