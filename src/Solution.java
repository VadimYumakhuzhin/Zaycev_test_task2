
import static org.junit.Assert.*;

public class Solution {
    public static void main(String[] args) {
        new Solution().testTask();

    }

    public void testTask() {
        int[] result = decryptData(price, discount, offset, readLength);
        assertEquals(result, new int[]{50, 10, 33});
    }
}
