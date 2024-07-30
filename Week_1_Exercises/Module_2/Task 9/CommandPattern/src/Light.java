public class Light {
    private final String location;

    public Light(String location) {
        this.location = location;
    }
    public void turnOn() {
        System.out.println(location + " light is ON.");
    }
    public void turnOff() {
        System.out.println(location + " light is OFF.");
    }
}
