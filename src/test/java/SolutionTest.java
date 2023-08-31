import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void minTapsTest1() {
        int n = 5;
        int[] ranges = {3, 4, 1, 1, 0, 0};
        int expected = 1;
        int actual = new Solution().minTaps(n, ranges);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minTapsTest2() {
        int n = 3;
        int[] ranges = {0, 0, 0, 0};
        int expected = -1;
        int actual = new Solution().minTaps(n, ranges);

        Assert.assertEquals(expected, actual);
    }
}
