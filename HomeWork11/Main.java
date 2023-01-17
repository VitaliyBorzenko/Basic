import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // Задание №3
        Addition addition = new Addition();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите четыре значения через пробел");
        try {
            String line = scan.nextLine();
            String[] array = line.split(" ");
            int a = Integer.parseInt(array[0]);
            int b = Integer.parseInt(array[1]);
            int c = Integer.parseInt(array[2]);
            int d = Integer.parseInt(array[3]);
            addition.addition(a, b, c, d);
        } catch (Exception e) {
            System.out.println("Произошла ошибка, введите четыре целых числа через пробел ");
        } finally {
            System.out.println("Программа завершена");
        }


        //Задание №2
        Divide divide = new Divide();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        int x = scan.nextInt();
        System.out.println("Введите второе число");
        int y = scan.nextInt();
        divide.divide(x, y);
        System.out.println(divide.divide(x, y));


        //задание №1
        Scanner scan = new Scanner(System.in);
        Square square = new Square();
        System.out.println("Введите любое вещественное число");
        try {
            double num = scan.nextDouble();
            square.getSquare(num);
        } catch (Exception e) {
            System.out.println("Возникла ошибка, введите целое или дробное число");
        } finally {
            System.out.println("Программа завершена");
        }
    }
}