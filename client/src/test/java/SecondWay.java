import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;

/**
 * Created by svetlana on 13.12.15.
 */


@RunWith(Parameterized.class)
public class SecondWay {

    public static int slog1;
    public static int slog2;
    public static int sum;

    @Parameterized.Parameters()
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {{1, 2, 3}, {3, 5, 8}, {6, 7, 13}});

    }

    public SecondWay(int slog1, int slog2, int sum) {
        this.slog1 = slog1;
        this.slog2 = slog2;
        this.sum = sum;
    }
    @Test
    public void plusTest() {
        Assert.assertEquals(sum, CountOne.CountOne(slog1, slog2));
    }
}