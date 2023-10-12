import java.util.Scanner;
public class WhileKelipatan21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int kelipatan, jumlah= 0, counter=0, rata_rata;

        System.out.println("masukkan bilagan kelipatan (1-9:)");
        kelipatan= scan.nextInt();
        int i = 1;
        while (i <=50){
            if (i % kelipatan == 0){
                jumlah +=i;
                counter++;
        }i++;
    }
         rata_rata= jumlah/counter;
         System.out.println("Banyaknya bilangan " + kelipatan + " dari 1 sampai 50 adalah " + counter);
         System.out.println("Total bilangan kelipatan "+ kelipatan + " dari 1 sampai 50 adalah "+ jumlah);
         System.out.println("Rata-rata bilangan kelipatan " + kelipatan + " dari 1 sampai 50 adalah " + rata_rata);
    }
}
