public class Square {
    int a;
    double sqrt;

    int result;

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }


    public int perimetr(){
        result = a*4;
        return result;
    }

    public double sqrtSquare(){
        sqrt = Math.sqrt(2)*a;
        return sqrt;
    }
}
