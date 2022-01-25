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

        int[] result = decryptData(price, discount, offset, readLength);

        assertEquals(result[0], 50);
        assertEquals(result[1], 10);
        assertEquals(result[2], 33);
    }

    public @Nullable int[] decryptData(@NonNull int[] price,
                      @IntRange (from = 1) int discount,
                      @IntRange (from = 0) int offset,
                      @IntRange (from = 1) int readLength) {
        //TODO реализовать метод
        int[] result = new int[readLength];
        int count = 0;
        for (int i = offset; i < (offset + readLength); i++) {
            price[i] -= price[i] * ((double) discount / 100);
            result[count] = price[i];
            count++;
        }
        return result;
    }
}
