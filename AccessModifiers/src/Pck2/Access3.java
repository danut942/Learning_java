package Pck2;

import Pck1.Access1;

public class Access3 extends Access1{
    public static void main(String[] args) {
        Access3 a = new Access3(); // must be accessed through the subclass
        System.out.println(a.hours);
        System.out.println(a.minutes);
    }
}
