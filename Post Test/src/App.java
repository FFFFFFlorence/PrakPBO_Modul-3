// 
//  Nama: Florence Regis Lake
//  NIM: 105223006
//  Post Test
// 

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan tipe member (platinum/gold/silver/tidak member): ");
        String member = input.nextLine();

        System.out.print("Masukkan total belanja: Rp");
        double totalBelanja = input.nextDouble();

        double diskonUtama = 0, diskonTambahan = 0;

        if (totalBelanja > 500000) {
            diskonUtama = 20;
        } else if (totalBelanja >= 250000) {
            diskonUtama = 10;
        }

        double hargaSetelahDiskon = totalBelanja * (1 - diskonUtama / 100);

        switch (member) {
            case "platinum": 
                diskonTambahan = 5; 
                break;
            case "gold": 
                diskonTambahan = 3; 
                break;
            case "silver": 
                diskonTambahan = 2; 
                break;
            default: 
                System.out.println("Invalid input");
        }

        double hargaAkhir = hargaSetelahDiskon * (1 - diskonTambahan / 100);

        String statusDiskon = (diskonUtama > 0 || diskonTambahan > 0) ? "Ya, dapat diskon" : "Tidak dapat diskon";

        System.out.println("\nTotal Belanja: Rp " + (int) totalBelanja);
        System.out.println("Diskon Utama: " + diskonUtama + "%");
        System.out.println("Diskon Tambahan: " + diskonTambahan + "%");
        System.out.println("Harga Akhir: Rp " + (int) hargaAkhir);
        System.out.println("Status Diskon: " + statusDiskon);

        input.close();
    }
}
