import java.util.Scanner;
public class ForKelipatan21{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int kelipatan,jumlah= 0,counter= 0,rata_rata;

        System.out.println("masukkan bilagan kelipatan (1-9:)");
        kelipatan= scan.nextInt();

        for(int i =1; i<=50; i++){
            if (i % kelipatan == 0){
                jumlah +=i;
                counter++;
            }
        }
        rata_rata= jumlah/counter;
        System.out.println("Banyaknya bilangan " + kelipatan + " dari 1 sampai 50 adalah " + counter);
        System.out.println("Total bilangan kelipatan "+ kelipatan + " dari 1 sampai 50 adalah "+ jumlah);
        System.out.println("Rata-rata bilangan kelipatan " + kelipatan + " dari 1 sampai 50 adalah " + rata_rata);
    }
}