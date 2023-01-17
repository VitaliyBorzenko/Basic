

public class Main {

    private static Triangle myTriangle;

    public static void main(String[] args){

        Student alisa = new Student("Алиса", "Смит", "Коктем-2", 24);
        System.out.println(alisa);
        Student azamat = new Student("Азамат", "Ибраев", "Коктем-3", 25);
        System.out.println(azamat);
        Student kristina = new Student("Кристина", "Иванова", "Коктем-4", 26);
        System.out.println(kristina);

        Triangle myTriangle = new Triangle(3,4,5);
        myTriangle.findPerimetr();
        myTriangle.findSquare();

        Rectangle myRectangle = new Rectangle(5,9);
        Rectangle mySecondRectangle = new Rectangle(10,14);
        myRectangle.returnArea();
        mySecondRectangle.returnArea();

        Average myAverage = new Average(6,8,5);
        myAverage.average();

        Movie myMovie = new Movie ("Фокус", "RatPac-Dune Entertainment", "R");
        System.out.println(myMovie);
        Movie mySecondMovie = new Movie ("Главный герой", "20th Century Studios" );
        System.out.println(mySecondMovie);
    }



}