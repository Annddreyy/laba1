import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorityElementTests {
    @Test
    public void testMajorityElementAlg1_Test1() {
        int size = 7;
        int power = 2;
        int k = (int)Math.ceil((double) size / power);

        int[] arr = new int[] {1, 2, 1, 1, 3, 4, 1};
        List<Integer> answer = Main.majorityElementAlg1(arr, k);

        assertEquals(answer, new ArrayList<>(List.of(1)));
    }

    @Test
    public void testMajorityElementAlg1_Test2() {
        int size = 20;
        int power = 10;
        int k = (int)Math.ceil((double) size / power);

        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 8, 8, 10, 11, 12, 13, 13, 14, 15, 16};
        List<Integer> answer = Main.majorityElementAlg1(arr, k);

        assertEquals(answer, new ArrayList<>(List.of(7, 8, 13)));
    }

    @Test
    public void testMajorityElementAlg2_Test1() {
        int size = 7;
        int power = 2;
        int k = (int)Math.ceil((double) size / power);

        int[] arr = new int[] {1, 2, 1, 1, 3, 8, 1};
        List<Integer> answer = Main.majorityElementAlg2(arr, k);

        assertEquals(answer, new ArrayList<>(List.of(1)));
    }

    @Test
    public void testMajorityElementAlg2_Test2() {
        int size = 20;
        int power = 10;
        int k = (int)Math.ceil((double) size / power);

        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 8, 8, 10, 11, 12, 40, 40, 14, 15, 16};
        List<Integer> answer = Main.majorityElementAlg2(arr, k);

        assertEquals(answer, new ArrayList<>(List.of(7, 8, 40)));
    }
}
