import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        System.out.println("Enter an account number.");
        int value = scanner.nextInt();
        AccountValidation account = new AccountValidation(value);
        account.sortList();
        isValid = account.isValid();
        if (isValid) {
            System.out.println("The account number is valid.");
        } else {
            System.out.println("The account number is not valid.");
        }
    }
}


