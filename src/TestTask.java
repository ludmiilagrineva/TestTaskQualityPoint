import java.util.Scanner;

public class TestTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxSumNumber = 0;
        int maxSum = 0;

        while (true) {
            System.out.print("Введите целое число (введите 0 для завершения): ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            int sum = getSumOfDigits(number);
            if (sum > maxSum) {
                maxSum = sum;
                maxSumNumber = number;
            }
        }

        System.out.println("Число с максимальной суммой цифр: " + maxSumNumber);
    }

    public static int getSumOfDigits(int number) {
        int sum = 0;
        number = Math.abs(number);
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}

