public class SumOfArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Example array

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        System.out.println("Sum of array elements: " + sum);
    }
}