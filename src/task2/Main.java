package task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static String text;
    static String fileName;

    public static void main(String[] args) {
        System.out.println("what to do with the file?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - create and write\n2 - read");
        System.out.print("Your choice: ");
        try {
            userChoice(scanner.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("Error! enter the number.");
        }
    }

    private static void userChoice(int num) {
        if (num == 1) {
            getData();
            handleData();
        } else if (num == 2) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.print("Enter file name: ");
            fileName = scanner2.nextLine();
            readData();
        } else System.out.println("Error, please enter number 1 or 2");
    }

    private static void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name: ");
        fileName = scanner.nextLine();
        System.out.print("Enter you text: ");
        text = scanner.nextLine();
    }

    private static void handleData() {
        new FileWriteService().createFile(fileName, text);
    }

    private static void readData() {
        new FileReadService().readFile(fileName);
    }


}
