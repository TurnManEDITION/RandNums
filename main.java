import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String guess = scanner.next();
//        System.out.print(guess);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter    surname: ");
        String surname = scanner.next();
        System.out.print("Enter       name: ");
        String name = scanner.next();
        System.out.print("Enter patronymic: ");
        String patronymic = scanner.next();

        int birth_day = 0;
        int birth_month = 0;
        int birth_year = 0;

        while (true) {
            try {
                System.out.print("Enter birth day: ");
                int input_day = scanner.nextInt();
                if (0 < input_day && input_day <= 31) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }
}