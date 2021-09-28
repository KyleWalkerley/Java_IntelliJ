import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your year of birth:");
//        int yearOfBirth = scanner.nextInt();
//        scanner.nextLine(); // handle next line character (enter key)
//
//        System.out.println("Enter your name: ");
//        String name = scanner.nextLine();
//        int age = 2018 - yearOfBirth;
//
//        System.out.println("Your name is " + name + ", and you are " + age + " years old.");
//
//        scanner.close();

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

//        while(true) {
        while(counter < 10) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
//               if(counter == 10) {
//                   break;
//               }
            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine(); // handle end of line (enter key)
        }

        System.out.println("sum = " + sum);
        scanner.close();
    }
}
