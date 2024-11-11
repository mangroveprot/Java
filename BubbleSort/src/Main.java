public class Main {
    static void bubbleSort(int[] arr, int size, Runnable callback) {
        int i, j, temp;
        for (i = 0; i < (size - 1); i++) {
            boolean isSwapped = false;
            for (j = 0; j < (size - i - 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
        new Thread(callback).start();
    }

    public static void main(String[] args) {

        int[] arr = {23, 33, 4, 11, 45, 89, 44};
        int size = arr.length;

        bubbleSort(arr, size, () -> {
            for (int sortedNum : arr) {
                System.out.print(sortedNum + ", ");
            }
        });
    }
}