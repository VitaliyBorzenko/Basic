package Birds;

public class  Crown extends Bird implements Fly {

    @Override
    public void birdSound() {
        System.out.println("Ворона говорит Кар-Кар..");;
    }

    public void birdFly(int speed) {

        System.out.println("Ворона летает " + speed + " км в час");
    }

}
