
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

class PhoneBook {
    private HashMap<String, String> phones = new HashMap<>();

    public void addToPhoneBook(String name, String phone) {
        phones.put(name, phone);
    }

    public void printPhoneInfo() {
        if (phones.isEmpty()) System.out.println("В телефонной книге пока нет номеров");
        for (Map.Entry<String, String> entry : phones.entrySet()) {
            System.out.printf("Имя: %s, номер телефона: %s %n", entry.getKey(), entry.getValue());
        }
    }
    public void seachContact(String name) {
        for (String x : phones.keySet())
        if ( x.equals(name)) {
            System.out.println("Номер телефона: " + phones.values());
        } else {
            System.out.println("Контакт не найден");
        }
    }
    public void changeContact(String name) {
        for (String x : phones.keySet())
            if (phones.containsKey(name)){
                Scanner scan = new Scanner(System.in);
                System.out.println("Введите новый номер");
                String phone = scan.next();
                phones.put(name, phone);
                System.out.println(name + " Номер изменен на: " + phone);
            } else {
                System.out.println("Контакт не найден");
            }
    }

}






