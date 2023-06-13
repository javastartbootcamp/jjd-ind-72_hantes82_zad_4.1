package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Televisor tv = new Televisor(false);
        tv.showStatus();
        tv.turnOn();
        tv.showStatus();
        tv.turnOff();
        tv.showStatus();
    }
}
