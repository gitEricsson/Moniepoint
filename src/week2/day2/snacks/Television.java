package week2.day2.snacks;

public class Television {

    private boolean isOn;
    private int volume;
    private int channel = 1;

    public void togglePower() {
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void increaseVolume() {
        if (!isOn) return;
        if (volume < 100) volume++;
    }

    public void decreaseVolume() {
        if (!isOn) return;
        if (volume > 0) volume--;
    }

    public void changeChannelForward() {
        if (!isOn) return;
        channel++;
    }

    public void changeChannelBackward() {
        if (!isOn) return;
        if (channel > 1) channel--;
    }
}