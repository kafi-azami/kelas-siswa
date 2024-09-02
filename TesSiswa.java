import java.util.Scanner;

//Driver Class
public class TesSiswa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ID : "); 
        int id = in.nextInt();
        System.out.println("Nama : ");
        String nama = in.nextLine();
        System.out.println("IPK : ");
        double ipk = in.nextDouble();

        Siswa azami = new Siswa(id,nama,ipk);
        //Nilai diatas 75 lulus
        if (azami.getIpk() >=75) {
            System.out.println(azami.getNama() + " LULUS ");
        }else {
            System.out.println(azami.getNama() + "TIDAK LULUS ");
        }
       
        //Nilai Huruf 
        if (azami.getIpk() < 60) {
            System.out.println("E");
        }else if (azami.getIpk() > 60 && azami.getIpk() <= 70) {
            System.out.println("D");
        }else if (azami.getIpk() > 70 && azami.getIpk() <= 80) {
            System.out.println("C");
        }else if (azami.getIpk() > 80 && azami.getIpk() <= 90) {
            System.out.println("B");
        }else if (azami.getIpk() > 90 && azami.getIpk() <= 100) {
            System.out.println("A");
        }
    }   
}
