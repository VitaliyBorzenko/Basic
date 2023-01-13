import Birds.Crown;

import java.util.*;

public class Main {
    public static void main(String[] args) {


//Задание №14
        HashMap<Integer,String> list = new HashMap<>();
        list.put(1, "Blue");
        list.put(2, "Green");
        list.put(3, "Red");
        list.put(4, "Yellow");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение: ");
        String value = scan.nextLine();
        for (String x : list.values())
        if (x.equals(value)) {
            System.out.println(list.keySet());
        }


//Задание №13
        HashMap<Integer, String> list1 = new HashMap<>();
        list1.put(1, "Blue");
        list1.put(2, "Green");
        HashMap<Integer, String> list2 = new HashMap<>();
        list1.put(3, "Red");
        list1.put(4, "Yellow");
        list2.putAll(list1);
        System.out.println(list1);



    //Задание №12
        HashMap<String, String> list = new HashMap<>();
        list.put("Виталий", "8(777)777-77-77");
        if (list.isEmpty())
        System.out.println("Список пуст");
        for (Map.Entry<String, String> entry : list.entrySet()) {
            System.out.printf("Имя: %s, номер телефона: %s %n", entry.getKey(), entry.getValue());
        }



        //Задание №11
        HashSet<String> list1 = new HashSet<>();
        list1.add("Blue");
        list1.add("Green");
        list1.add("Red");
        list1.add("Yellow");
        HashSet<String> list2 = new HashSet<>();
        list2.add("Blue");
        list2.add("Orange");
        list2.add("Pink");
        list2.add("Red");
        System.out.println("Первый список: " + list1);
        System.out.println("Второй список: " + list2);
        list1.retainAll(list2);
        System.out.println("Повторяющиеся элементы: ");
        System.out.println(list1);



        //Задание №10
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        System.out.println(colors);
        colors.set(0, "Gray");
        colors.set(1, "Pink");
        System.out.println(colors);

        //Задание №9
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        System.out.println("Первый элемент: "+ colors.getFirst() + "\n" + "Последний элемент: " +  colors.getLast());



        //Задание №8
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        System.out.println(colors);
        colors.set(1, "Brown");
        System.out.println(colors);

        //Задание №7
        ArrayList<Integer> firstList = new ArrayList<>();
        firstList.add(1);
        firstList.add(2);
        firstList.add(3);

        ArrayList<Integer> secondList = new ArrayList<>();
        secondList.add(1);
        secondList.add(2);
        secondList.add(3);

        boolean isEqual = Objects.equals(firstList, secondList);
        if(isEqual) {
            System.out.println("Списки одинаковы");
        } else {
            System.out.println("Списки разные");
        }

        //Задание №6
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        System.out.println(colors);

              //Задание №5
        PhoneBook phoneBook = new PhoneBook();
        Scanner scan = new Scanner(System.in);
        phoneBook.addToPhoneBook("Андрей" , "87777777777");
        boolean exit = false;

        while (!exit) {
            System.out.println("""
                    Введите 1, чтобы добавить номер телефона
                    Введите 2, чтобы найти контакт
                    Введите 3, чтобы изменить номер контакта
                    Введите 4, чтобы вывести номера телефонов
                    Введите 5, чтобы выйти""");
            int choice = scan.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Введите имя");
                    String name = scan.next();
                    System.out.println("Введите номер телефона");
                    String phone = scan.next();
                    phoneBook.addToPhoneBook(name, phone);
                }
                case 2 -> {
                    System.out.println("Введите имя");
                    String name = scan.next();
                    phoneBook.seachContact(name);
                    }
                case 3 -> {
                    System.out.println("Введите имя");
                    String name = scan.next();
                    phoneBook.changeContact(name);
                }
                case 4 -> {
                    phoneBook.printPhoneInfo();
                }
                case 5 -> {
                    exit = true;
                }
                default -> {
                    System.out.println("Введите значение от 1 до 5");
                }

            }
        }


//Задание №4
 Student st = new Student();
 st.addAndPrintGrades();


//Задание №3
    Crown myCrown = new Crown();
    myCrown.birdSound();
    myCrown.birdFly(10);




//Задание №2
        for (Weekdays weekday : Weekdays.values()) {
            isHoliday(weekday);
        }
    }

    static void isHoliday(Weekdays day) {
        if (day == Weekdays.SATURDAY) {
            System.out.println("Суббота: выходной");
        } else if
            (day == Weekdays.SUNDAY)
            System.out.println("Воскресенье: выходной");
        else if
        (day == Weekdays.MONDAY)
            System.out.println("Понедельник: Будний день");
        else if
        (day == Weekdays.TUESDAY)
            System.out.println("Вторник: Будний день");
        else if
        (day == Weekdays.WEDNESDAY)
            System.out.println("Среда: Будний день");
        else if
        (day == Weekdays.THURSDAY)
            System.out.println("Четверг: Будний день");
        else if
        (day == Weekdays.FRIDAY)
            System.out.println("Пятница: Будний день");
         else{
            System.out.println("Будний день");
        }
// Задание №1
        for (Colors colors : Colors.values()) {
            System.out.print(colors + " ");


    }
}

