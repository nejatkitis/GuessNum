import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        Scanner input = new Scanner(System.in);
        int count =0;
        int select;
        System.out.println("Sayı tahmin etme oyununa hoşgeldiniz.");

        while (count<6){
            System.out.print("Lütlen bir 0-100 aralığında bir sayı tahmin edin : ");
            select = input.nextInt();
            if (select<0 || select>100){
                System.out.println("Hatalı sayı girdiniz tekrar deneyin");
                continue;
            }
            if (select!=number){
                count++;
                if (select>number){
                    System.out.println("Tahmininiz büyük");
                } else if (select<number){
                    System.out.println("Tahmininiz küçük");
                }
                System.out.println("Kalan hakkınız : "+(6-count));
            } else if (select==number){
                System.out.println("Tebrikler doğru tahmin :)");
                break;
            }
        }
        if (count==6) {
            System.out.println("Hakkınız Bitti");
            System.out.println("<<<Game Over>>>");
        }
    }
}
