import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Vize Notunuzu giriniz:");

        int vize = input.nextInt();

        System.out.println("Final notunuzu giriniz:");

        int finall = input.nextInt(); // final anahrar kelimesini değişken ismi verirken kullanma.

        double ortalama = vize*(0.4) + finall*(0.6);

        System.out.println("Ders Ortalamanız: " + ortalama);


        if (ortalama<50){
            System.out.println("Dersten kaldınız.");
        }
        else{
            System.out.println("Dersi Geçtiniz.");
        }

    }


}
