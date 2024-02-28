import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int maxdeger= 0, mindeger = 0, sayi;

        Scanner input = new Scanner(System.in);

        System.out.println("Kaç tane sayı yazdırmak istiyorsunuz: ");
        int r = input.nextInt();

        for (int i=1; i<=r; i++){
            System.out.println("Sayi: ");
            sayi = input.nextInt();


            if (sayi < mindeger || mindeger == 0){
                mindeger = sayi;
            }
        }if (r> maxdeger){
            maxdeger = r;
        }
        System.out.println(maxdeger);
    }

}