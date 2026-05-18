import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Placement Management System =====");
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();
        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();
        System.out.println("\nStudent Details");
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("CGPA: " + cgpa);

        if(cgpa >= 7.5) {
            System.out.println("Eligible for Placement");
        } else {
            System.out.println("Not Eligible for Placement");
        }
        sc.close();
    }
}
