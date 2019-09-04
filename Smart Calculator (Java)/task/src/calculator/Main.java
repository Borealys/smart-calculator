package calculator;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        String s = "";

        do {
            s = scanner.nextLine();
            switch(s) {
                case "":
                case "/exit":
                    break;
                case "/help":
                    System.out.println("The program calculates the sum of numbers");
                    break;
                default:
                    String[] splitInput = s.split(" ");
                    printResult(calculateSum(checkIfInt(splitInput)));
            }
        } while (!s.equals("/exit"));
        System.out.println("Bye!");
    }

    private static List<Integer> checkIfInt(String[] input) {
        List<Integer> values = new ArrayList<>();
        for (String val : input) {
            if (val.matches("-?\\d+")) {
                values.add(Integer.parseInt(val));
            }
        }
        return values;
    }

    private static int calculateSum(List<Integer> values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    private static void printResult(int result) {
        System.out.println(result);
    }
}
