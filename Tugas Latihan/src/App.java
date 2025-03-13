import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        String kalimat;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        kalimat = input.nextLine();
        
        //menghitung huruf fokal dalam kalimat menggunakan if else
        int fokal = 0;
        for (int i = 0; i < kalimat.length(); i++) {
            char huruf = kalimat.charAt(i);
            if (huruf == 'a' || huruf == 'i' || huruf == 'u' || huruf == 'e' || huruf == 'o') {
                fokal++;
            }
        }

        System.out.println("Jumlah Fokal : " + fokal);

        int ganjilGenap;

        if (fokal % 2 == 0) {
            ganjilGenap = 0;
        } else {
            ganjilGenap = 1;
        }

        switch (ganjilGenap){
            case 0:
                System.out.println("Jumlah Fokal Genap");
                break;
            case 1:
                System.out.println("Jumlah Fokal Ganjil");
                break;
            default:
                System.out.println("Tidak ada");
                break;
        }

        String reversed;
        reversed = "";
        for (int i = kalimat.length() - 1; i >= 0; i--) {
            reversed += kalimat.charAt(i);
        }
        System.out.println(reversed);

        input.close();
    }
}
