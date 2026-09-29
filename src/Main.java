public static int binarySearchInteractive(int[] a, int target) {
    int low = 0;
    int high = a.length - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (a[mid] == target) {
            return mid;
        }else if (target < a[mid]) {
            high = mid - 1;
        }else{
            low = mid + 1;
        }
    }
    return -1;
}

void main() {

    int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16, 18};

    // Example 1
    int result1 = binarySearchInteractive(numbers, 12);
    System.out.println("Example 1: " + result1);

    // Example 2
    int result2 = binarySearchInteractive(numbers, 4);
    System.out.println("Example 2: " + result2);

    // Example 3
    int result3 = binarySearchInteractive(numbers, 20);
    System.out.println("Example 3: " + result3);
}