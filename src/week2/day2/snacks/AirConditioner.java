package week2.day2.snacks;

public class AirConditioner {

    private boolean isOn;
    private int temperature = 16;

    public void togglePower() {
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void increaseTemperature() {
        if (!isOn) return;
        if (temperature < 30) temperature++;
    }

    public void decreaseTemperature() {
        if (!isOn) return;
        if (temperature > 16) temperature--;
    }
}
