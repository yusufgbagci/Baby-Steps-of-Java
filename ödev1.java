import  java.util.Scanner;

public class ödev1 {
    public static void main(String[] args) {
        int mat, fiz, kim, tur, tar, muz;

        System.out.println("Matematik Notunuzu Giriniz: ");
        Scanner input = new Scanner(System.in);
        mat = input.nextInt();
        System.out.println("Fizik Notunuzu Giriniz: ");

        fiz = input.nextInt();
        System.out.println("Kimya Notunuzu Giriniz: ");

        kim = input.nextInt();
        System.out.println("Turkce Notunuzu Giriniz: ");

        tur = input.nextInt();
        System.out.println("Tarih Notunuzu Giriniz: ");

        tar = input.nextInt();
        System.out.println("Music Notunuzu Giriniz: ");

        muz = input.nextInt();
        double ortalama;
        ortalama = (mat+fiz+kim+muz+tar+tur)/6;
                      
        System.out.println("Ortalamanız: "+(mat+fiz+kim+muz+tar+tur)/6);

    }
}
