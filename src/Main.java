import java.util.Scanner;


public class Main {
    public static void main(String[] args)throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пример: ");
        String input = scanner.nextLine();

        System.out.println(calc(input));

    }


    public static String calc(String input) throws Exception {
        String[] elements = input.split(" ");

        if (elements.length != 3) {
            throw new Exception("Не является математической операцией");
        }

        int a = Integer.parseInt(elements[0]);
        int b = Integer.parseInt(elements[2]);

        if (a > 10 || b > 10) {
            throw new Exception("Вы ввели число более 10");
        }

        if (a < 1 || b < 1) {
            throw new Exception("Вы ввели число менее 1");
        }

        int result;

        if (elements[1].equals("+")) {
            result = a + b;
        } else if (elements[1].equals("-")) {
            result = a - b;
        } else if (elements[1].equals("/")) {
            result = a / b;
        } else if (elements[1].equals("*")) {
            result = a * b;
        } else {
            throw new Exception("Неверная операция");
        }

        return String.valueOf(result);
    }

}
