public class RecursiveBinarySearch {

    public static int binarySearch(int[] arr, int target) {
        return binarySearchRecursive(arr, target, 0, arr.length - 1);
    }


    private static int binarySearchRecursive(int[] arr, int target, int left, int right) {

        if (left > right) {
            return -1;
        }


        int mid = left + (right - left) / 2;


        if (arr[mid] == target) {
            return mid;
        }


        if (target < arr[mid]) {
            return binarySearchRecursive(arr, target, left, mid - 1);
        }

        return binarySearchRecursive(arr, target, mid + 1, right);
    }

    public static void main(String[] args) {
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;

        int result = binarySearch(sortedArray, target);

        if (result != -1) {
            System.out.println("Target " + target + " found at index: " + result);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }
}
