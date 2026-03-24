package week2.day2.snacks;

public class Bike {
    private boolean bikeIsOn;
    public void turnBikeOn() {
        bikeIsOn = true;
    }

    public void turnBikeOff() {
        bikeIsOn = false;
    }

    public boolean isBikeOn() {
        return bikeIsOn;
    }

    public int accelerateBike(int speed){
         int newSpeed = speed + speedFactor(speed);
         return newSpeed;
    }

    public int deccelerateBike(int speed){
         int newSpeed = speed - speedFactor(speed);
         return newSpeed;
    }

    static int speedFactor(int speed){
        if(speed >= 0 && speed <= 20){
            return 1;
        }

        if(speed >= 21 && speed <= 30){
            return 2;
        }

        if(speed >= 31 && speed <= 40){
            return 3;
        }

        if(speed >= 41 ){
            return 4;
        }

        return 0;
    }

}
