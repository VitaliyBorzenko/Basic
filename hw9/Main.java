import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Temperature myTemperature = new Temperature("C", 10);
        myTemperature.transformationToF();
        System.out.println(myTemperature.toString());


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение стороны квадрата a: ");
        int a = scanner.nextInt();

        Square perimetr = new Square();
        perimetr.setA(a);
        System.out.println("Периметр квадрата равен: " + perimetr.perimetr());
        System.out.println("Длина диоганали квадрата равна:" + perimetr.sqrtSquare());


        StarTriangle small = new StarTriangle(3);
        System.out.println(small.toString());



        Student myStudent = new Student();
        myStudent.increment();
        System.out.println(myStudent.toString());
    }
}



