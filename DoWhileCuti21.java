import java.util.Scanner;
public class DoWhileCuti21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;
        
        System.out.print("Jatah cuti: ");
        jatahCuti = sc.nextInt();

        do{
            System.out.print("Apakah Anda Ingin mengambil cuti (y/t)? ");
            konfirmasi= sc.next();
            
            if(konfirmasi.equalsIgnoreCase("y")){
                System.out.print("Jumlah Hari: ");
                jumlahHari=sc.nextInt();

                if (jumlahHari <= jatahCuti){
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                }else{
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                    System.out.println("Masukkan ulang jumlah hari cuti: ");
                    jumlahHari = sc.nextInt();
                    System.out.println("Sisa jatah cuti habis");
                }
        }else{
            //Prgram akan berhenti jika input = t
            break;
        }
    }while (jatahCuti > 0);
} 
}
