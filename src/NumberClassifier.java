import java.util.Scanner;

public class NumberClassifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize counters
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        // Prompt the user to enter five numbers
        System.out.println("Enter five numbers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = input.nextInt();

            if (number < 0){
                negativeCount++;
            } else if (number > 0) {
                positiveCount++;

            }else {
                zeroCount++;
            }
        }

        System.out.println("number of negative numbers: " + negativeCount );
        System.out.println("number of positive numbers: " + positiveCount );
        System.out.println("number of zeros: " + zeroCount );
    }
}
