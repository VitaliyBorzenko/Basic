public class Temperature {
    private String c;
    private String f;
    private double degreesC;
    private double degreesF;

    //конструкторы
    public Temperature() {
        degreesC = 0;
        c = "C";
    }
    public Temperature(double degreesC) {
        this.degreesC = degreesC;
    }

    public Temperature(String c) {
        this.c = c;
    }

    public Temperature(String c, double degreesC) {
        this.c = c;
        this.degreesC = degreesC;
    }

    //методы возврата
    public void transformationToC() {
        degreesC = 5 * (degreesF - 32) / 9;
    }

    public void transformationToF() {
        degreesF = (9 * (degreesC / 5) + 32);
    }

    //get/set
    public String getC() {
        return c;
    }

    public void setC() {
        this.c = c;
    }

    public double getDegreesF() {
        return degreesF;
    }
    public void setDegreesF(){
        this.degreesF = degreesF;
    }
    public double getDegreesC() {
        return degreesC;
    }
    public void setDegreesC(){
        this.degreesC = degreesC;
    }

    //toString
    public String toString() {
        return String.format("Введенное число в градусах Целься: %f %s\nВ градусах Фаренгейта это: %s", degreesC, c, degreesF);
    }
}
