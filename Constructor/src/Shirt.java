public class Shirt {

    private String color;
    private char size;

    Shirt(String color,char size){
        this.color = color;
        this.size = size;
        System.out.println("This is the constructor");
    }

    public static void putOn() {
        System.out.println("Shirt is on");
    }

    public static void putOff() {
        System.out.println("Shirt is off");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
