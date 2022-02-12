public class Main {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(15,8,15,8,17);
        Triangle triangle2 = new Triangle(3,2.598,3,3,3);

        double triangle1Area = triangle1.findArea();
        System.out.println(triangle1Area);

        double triangle2Area = triangle2.findArea();
        System.out.println(triangle2Area);

        System.out.println(triangle1.sideLenThree);
        System.out.println(triangle2.base);

        System.out.println(Triangle.numOfSides);
    }
}
