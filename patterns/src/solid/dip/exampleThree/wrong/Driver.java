package solid.dip.exampleThree.wrong;

/**
 * Novamente, dependendo de implementações ao invés de abstrações aqui.
 * Vamos fazer o Driver saber usar o seu construtor da maneira correta!
 */
public class Driver {

    private RacingCar car;

    public Driver(){
        this.car = new RacingCar(100);
    }

    public void increaseSpeed() {
        car.accelerate();
    }

}

class RacingCar {

    int fuel;

    public RacingCar(int fuel) {
        this.fuel = fuel;
    }

    public void accelerate() {
        --fuel;
        System.out.println("Car is accelrating!");
    }


}
