package Giris;

import java.util.Scanner;

public class kdv_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kdv = 1.18;
        System.out.print("Lütfen Fiyat Giriniz:");
        double fiyat;
        fiyat = input.nextDouble();
        double total;
        total = (fiyat*kdv);
        System.out.println(total+ " tl yeni fiyanıtındız.");
    }
}
