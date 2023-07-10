package a0710;

public class audio implements remoteControl {
    private int volume;
    public void turnOn() {
        System.out.println("오디오 켜짐");
    }

    public void turnOff() {
        System.out.println("오디오 꺼짐");
    }

    public void setVolume(int volume) {
        if (volume > remoteControl.max_volume) {
            this.volume = remoteControl.max_volume;
        } else if (volume < remoteControl.min_volume) {
            this.volume = remoteControl.min_volume;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 오디오 볼륨");
    }
}