public class Average {
   double x;
    double y;
   double z;

    public Average(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double average(){
        double sum = (x+y+z)/3;
        System.out.println("Среднее значение трех чисел равно: " + sum);
        return sum;
    }
}
