import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ages = new ArrayList<>();

        System.out.println("Enter the ages that you want to check, please type 'stop' to finish:");

        while (true) {
            String input = scanner.next();

            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            try {
                int age = Integer.parseInt(input);
                ages.add(age);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid age or 'stop' to finish.");
            }
        }

        ArrayList<Integer> underageAges = new ArrayList<>();
        for (int age : ages) {
            if (age >= 13 && age <= 19) {
                underageAges.add(age);
            }
        }

        if (underageAges.size() > 0) {
            System.out.println("The following ages are considered underage: " + underageAges);
        } else {
            System.out.println("None of the ages are considered underage.");
        }
    }
}
