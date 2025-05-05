public class FinalVarCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.setSpeed(300);
        System.out.println("Current Speed of Buggati: " + car.currentSpeed);
        // car.MAX_SPEED = 300;
    }
}

class Car {
    final int MAX_SPEED = 200;
    int currentSpeed;

    public void setSpeed(int speed){
        if (speed > MAX_SPEED) {
            currentSpeed = MAX_SPEED;
        }
    }
}