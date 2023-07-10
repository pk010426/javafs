package a0710;

public class remoteExam {
    public static void main(String[] args) {
        remoteControl rc;
        rc = new tv();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        rc = new audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
    }
}
