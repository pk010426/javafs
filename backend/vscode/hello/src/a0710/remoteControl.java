package a0710;

public interface remoteControl {
    int max_volume= 10;
    int min_volume = 10;

    void turnOn();
    void turnOff();
    void setVolume(int volume);
}
