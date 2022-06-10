import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Parking p = new Parking("Lumbi", 0.20);
        p.addPlateToWhiteList("AZ000VA");
        p.addPlateToWhiteList("AB000BB");
        p.addPlateToWhiteList("AB000BB");
        p.addPlateToWhiteList("AB001BB");

        p.addBreak("AZ000VA");
        Scanner s = new Scanner(System.in);
        s.next();
        p.stopBreak("AZ000VA");

        System.out.println(p);
    }
}