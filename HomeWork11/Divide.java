public class Divide {
    public int divide(int x, int y) {

        if (y == 0) {
            throw new RuntimeException("На ноль делить нельзя");
        } else {
            int z = x / y;
            return z;
        }
    }
}