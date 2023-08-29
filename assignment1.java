package assignment1;

public class assignment1 {
    public static void main(String[] args) {
        // Create and initialize the array
        int[] numbers = { 10, 20, 30, 40 };
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        double average = (double) sum / numbers.length;
        
        System.out.println("Array elements: " + java.util.Arrays.toString(numbers));
        System.out.println("Average: " + average);
    }
}
