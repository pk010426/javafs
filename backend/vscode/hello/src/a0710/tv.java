package a0710;

public class tv implements remoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("티비켜짐");
    }

    @Override
    public void turnOff() {
        System.out.println("티비켜짐");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > remoteControl.max_volume) {
            this.volume = remoteControl.max_volume;
        } else if (volume < remoteControl.min_volume) {
            this.volume = remoteControl.min_volume;
        } else {
            this.volume =volume;
        }
        System.out.println("현재 tv 볼륨 : " + volume);
    }
}
