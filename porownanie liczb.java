import java.util.Scanner;

class nowy {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("podaj liczbe 1");
    int a = scanner.nextInt();

    System.out.println("podaj liczbe 2");
    int b = scanner.nextInt();

    if (a == b) {
        System.out.println("podane liczby są rowne");
        }
    else if (a > b) {
        System.out.println("pierwsza liczba jest wieksza");
        }
    else {
        System.out.println("druga liczba jest mniejsza");
    }
     }

}
