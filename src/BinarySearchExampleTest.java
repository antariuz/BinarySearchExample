import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchExampleTest {

    @org.junit.jupiter.api.Test
    void binarySearch() {
        int[] sortedArray = {0, 0, 0, 0, 0, 1};
        assertEquals(BinarySearchExample.binarySearch(sortedArray, 1), 5);
    }
}