import java.util.*;

public class AutoboxingExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers separated by spaces:");
        String input = scanner.nextLine();
        scanner.close();

        String[] tokens = input.split("\\s+");
        for (String token : tokens) {
            numbers.add(Integer.parseInt(token)); // Autoboxing
        }

        int sum = calculateSum(numbers);
        System.out.println("Sum of numbers: " + sum);
    }

    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num; // Unboxing
        }
        return sum;
    }
}
