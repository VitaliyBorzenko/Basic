public class Rectangle {
    int a;
    int b;

    public Rectangle(int a,int b){
        this.a = a;
        this.b = b;
    }

    public int returnArea(){
        int sum = a*b;
        System.out.println("Площадь прямоугольника равна: " + sum);
        return sum;
    }

}
