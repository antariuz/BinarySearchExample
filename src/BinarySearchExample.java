public class BinarySearchExample {

    public static Integer binarySearch(int[] array, int num) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (num == array[middle]) {
                return middle;
            } else {
                if (num < array[middle]) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 4, 6, 7, 8, 10, 13, 14};
        System.out.println(binarySearch(sortedArray,1));
    }
}
