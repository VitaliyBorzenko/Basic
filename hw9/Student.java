public class Student {
    String name;
    int id;
    int year;

    public Student() {
        this.name = "Maria";
        this.id = 0;
        this.year = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(String Year) {
        this.name = Year;
    }

    public void increment() {
        year++;
    }

    public String toString() {
        return String.format("Имя: %s id: %d,Курс: %d", name, id, year);
    }


}
