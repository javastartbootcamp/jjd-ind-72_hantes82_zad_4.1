package pl.javastart.task;

public class Televisor {
    boolean state;

    void turnOn() {
        state = true;
    }

    void turnOff() {
        state = false;
    }

    void showStatus() {
        System.out.printf("Telewizor jest włączony: %b\n", state);
    }

    public Televisor(boolean state) {
        this.state = state;
    }
}
