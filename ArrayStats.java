public class ArrayStats {
    public static void main(String[] args) {

        int[] numbers = {15, 23, 8, 42, 16};

        int max = numbers[0];
        int min = numbers[0];
        int sum = 0;
        double average = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
            sum += numbers[i];
        }

        average = (double) sum / numbers.length;

        System.out.print("Original Array: [");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
