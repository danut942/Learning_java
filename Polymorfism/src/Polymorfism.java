class Bird{
    public void sing() {
        System.out.println("Tweet tweet tweet");
    }
}
class Robin extends Bird{
    public void sing() {
        System.out.println("Tweet Robin");
    }
}

class Pelican extends Bird{
    public void sing() {
        System.out.println("Tweet Pelican");
    }
}
public class Polymorfism {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.sing();

        Robin r = new Robin();
        r.sing();
    }
}
