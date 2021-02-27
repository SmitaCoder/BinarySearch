public class RecursiveBinarySearch {

    public static void main(String args[]) {
        int[] intArray = {-22, -15, 1, 7, 20, 35, 55};
        System.out.println("Key found at position : " + BinarySearch(intArray, 8888));
        System.out.println("Key found at position : " + BinarySearch(intArray, 55));
    }

    public static int BinarySearch(int[] input, int key) {
        int pos = RecursiveBinarySearch(input, 0, input.length, key);
        return pos;
    }

    public static int RecursiveBinarySearch(int[] input, int start, int end, int key) {
        if (start >= end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (input[mid] == key) {
            return mid;
        } else if (input[mid] > key) {
            end = mid;
            return RecursiveBinarySearch(input, start, end, key);
        } else {
            start = mid + 1;
            return RecursiveBinarySearch(input, start, end, key);
        }
    }
}


