public class Triangle {
    int x;
    int y;
    int z;

    public Triangle(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int findPerimetr(){
        int sum = x+y+z;
        System.out.println("Периметр треугольника равен: " + sum);
        return sum;
    }

    public int findSquare(){
        int p = (x+y+z)/2;
        int sum = (p*(p-3)*(p-4)*(p-5))/6;
        System.out.println("Площадь треугольника равена: " + sum);
        return sum;
    }
}
