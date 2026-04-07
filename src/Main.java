public class Main {

    // Linear Search
    public static int linearSearch(String[] arr, String target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
            if (arr[i].equals(target)) {
                System.out.println("Comparisons: " + count);
                return i;
            }
        }
        return -1;
    }

    // Binary Search
    public static int binarySearch(String[] arr, String target) {
        int low = 0, high = arr.length - 1, count = 0;

        while (low <= high) {
            count++;
            int mid = (low + high) / 2;
            if (arr[mid].equals(target)) {
                System.out.println("Comparisons: " + count);
                return mid;
            }
            else if (arr[mid].compareTo(target) < 0)
                low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] arr = {"accA", "accB", "accB", "accC"};

        System.out.println("Linear: " + linearSearch(arr, "accB"));
        System.out.println("Binary: " + binarySearch(arr, "accB"));
    }
}