import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thực a:");
        double a = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập số thực b:");
        double b = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập số thực c:");
        double c = Double.parseDouble(sc.nextLine());
        QuadraticEquation quad = new QuadraticEquation(a,b,c);
        System.out.println(quad.display());

    }
}
