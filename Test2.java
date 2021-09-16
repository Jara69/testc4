import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej certiky bro ");
        int a = sc.nextInt();
        int cislo2 = 0;
        for (int i = 0; i <= a; i++) {
            cislo2 = cislo2 + i * i;
            for (int x = 0; x < cislo2; x++) {
                System.out.print("😍");
            }
            System.out.println(" ");
        }
        System.out.println("pocet certu" + cislo2);
    }
}