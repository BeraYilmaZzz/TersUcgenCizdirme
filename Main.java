import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int basamakSayisi = inp.nextInt();

        for (int i = basamakSayisi; i >= 1; i--) {
            for (int j = basamakSayisi; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}