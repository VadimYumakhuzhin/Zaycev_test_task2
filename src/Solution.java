import org.jetbrains.annotations.Nullable;

import static org.junit.Assert.assertEquals;

public class Solution {
    public static void main(String[] args) {
        new Solution().testTask();

    }

    public void testTask() {
        int[] price = {5, 100, 20, 66, 16};
        int discount = 50;
        int offset = 1;
        int readLength = 3;

        assertEquals(decryptData(price, discount, offset, readLength), new int[]{50, 10, 33});
    }

    public @Nullable int[] decryptData(@NonNull int[] price,
                      @IntRange (from = 1) int discount,
                      @IntRange (from = 0) int offset,
                      @IntRange (from = 1) int readLength) {
        //TODO реализовать метод
        return null;
    }
}
