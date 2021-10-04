package main.java;

import java.util.Scanner;
public class applicationUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your full name: ");
        String Name = sc.nextLine();
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();
        System.out.println("Please enter your gender: ");
        String gender = sc.next();
        sc.nextLine();//avoiding to skip the next input
        System.out.println("Please enter your education: ");
        String education = sc.nextLine();
        System.out.println("Please enter your email: ");
        String email = sc.nextLine();
        System.out.println("Please enter your profession: ");
        String profession = sc.nextLine();
        System.out.println("Please enter your company: ");
        String company = sc.nextLine();

        System.out.println("I am "+Name+ ". I am "+ age+ "years old. I am a "+ gender+" and I studied "+ education+". \n If you would like to contact me, you can contact me via "+email+ " . currently I am working as "+profession +"at" +company);

    }

    public static String userName(String x) {
        return x;
    }
    public static Integer gender(int x) {
        return x;
    }
    public static String gender(String x) {
        return x;
    }
    public static String education(String x) {
        return x;
    }
    public static String email(String x) {
        return x;
    }
    public static String profession(String x) {
        return x;
    }
    public static String company(String x) {
        return x;
    }

}