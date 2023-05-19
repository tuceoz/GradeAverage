import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();
        if (mat < 0 || mat > 100) {
            System.out.println("Geçersiz matematik notu girdiniz. Notunuz ortalamaya katılmayacak.");
            mat = 0;
        }

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();
        if (fizik < 0 || fizik > 100) {
            System.out.println("Geçersiz fizik notu girdiniz. Ortalamaya katılmayacak.");
            fizik = 0;
        }

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();
        if (turkce < 0 || turkce > 100) {
            System.out.println("Geçersiz türkçe notu girdiniz. Notunuz ortalamaya katılmayacak.");
            turkce = 0;
        }

        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();
        if (kimya < 0 || kimya > 100) {
            System.out.println("Geçersiz kimya notu girdiniz. Notunuz ortalamaya katılmayacak.");
            kimya = 0;
        }

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();
        if (muzik < 0 || muzik > 100) {
            System.out.println("Geçersiz müzik notu girdiniz. Notunuz ortalamaya katılmayacak.");
            muzik = 0;
        }

        double average = (mat + fizik + turkce + kimya + muzik) / 5;

        System.out.println("Ortalamanız " + average);

        if (average <= 55) {
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
        } else {
            System.out.println("Tebrikler, sınıfı geçtiniz!");
        }

    }
}