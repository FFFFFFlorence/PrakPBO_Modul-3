import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        //if else
        boolean x = true;
        if (x) {
            System.out.println("ini adalah blok if");
        } else {
            System.out.println("ini adalah blok if");
        }

        int a = 10;
        if (a > 5) {
            System.out.println("a lebih besar dari 5");
        } else {
            System.out.println("a lebih kecil dari 5");
        }

        //input
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");       
        int nilai = input.nextInt();

        //if else
        if (nilai >= 80){
            System.out.println("Nilai anda A");
        } else if (nilai >= 70){
            System.out.println("Nilai anda B");
        } else if (nilai >= 60){
            System.out.println("Nilai anda C");
        } else if (nilai >= 50){
            System.out.println("Nilai anda D");
        } else {
            System.out.println("Nilai anda E");
        }

        //switch
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;            
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jumat");            
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Minggu");
                break;
            default:
                System.out.println("Hari tidak valid");
                break;
        }

        String hari = "Senin";
        switch (hari) { 
            case "Senin":
                System.out.println("Senin");
                break;
            case "Selasa":
                System.out.println("Selasa");
                break;
            case "Rabu":
                System.out.println("Rabu");
                break;
            case "Kamis":
                System.out.println("Kamis");
                break;
            case "Jumat":
                System.out.println("Jumat");
                break;
            case "Sabtu":
                System.out.println("Sabtu");
                break;
            case "Minggu":
                System.out.println("Minggu");
                break;
            default:
                System.out.println("Hari tidak valid");
                break;
        }

        //ternary operator
        int angka = 10;
        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println(hasil);

        //for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        //while loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        //do while loop
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 5);
        
        //for each loop
        int[] numbers = {1, 2, 3, 4, 5};
        for (int k : numbers) {
            System.out.println(k);
        }
        
        //break and continue
        for (int m = 0; m < 5; m++){
            if (m < 5){
                continue;
            }
        }

        // while (true){
        //     System.out.println("Pilihan menu: ");
        //     System.out.println("1. menu 1: ");
        //     System.out.println("2. menu 2: ");
        //     System.out.println("0. Keluar: ");
        
        //     System.out.print("Masukan pilihan anda: ");

        // }
        
        int[] numbered = {1, 2, 3, 4, 5};
        numbered = new int[5];
        numbered[0] = 1;
        numbered[1] = 2;
        numbered[2] = 3;
        numbered[3] = 4;
        numbered[4] = 5;

        System.out.print(numbered.length);
    }
}
