import java.util.Scanner;

public class kalkulator_pbo {
    public static void main(String[] args) {
        String pilih_operasi;
        int nilai_a = 0;
        int nilai_b = 0;
        int hasil;

        Scanner input_pilihan = new Scanner(System.in);
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        pilih_operasi = input_pilihan.next();

        // Logika
        if (pilih_operasi.equals("1")) {
            nilai_a = input_pilihan.nextInt();
            nilai_b = input_pilihan.nextInt();

            hasil = nilai_a + nilai_b;

            System.out.println("Hasil penjumlahan adalah: " + hasil);
        } else if (pilih_operasi.equals("2")) {
            nilai_a = input_pilihan.nextInt();
            nilai_b = input_pilihan.nextInt();

            hasil = nilai_a - nilai_b;

            System.out.println("Hasil penjumlahan adalah: " + hasil);
        } else if (pilih_operasi.equals("3")) {
            nilai_a = input_pilihan.nextInt();
            nilai_b = input_pilihan.nextInt();

            hasil = nilai_a * nilai_b;

            System.out.println("Hasil penjumlahan adalah: " + hasil);
        } else if (pilih_operasi.equals("4")) {
            nilai_a = input_pilihan.nextInt();
            nilai_b = input_pilihan.nextInt();

            hasil = nilai_a / nilai_b;

            System.out.println("Hasil penjumlahan adalah: " + hasil);
        } else {
            System.out.println("Pilihan tidak ada!");
        }
        // Akhir Logika

    }
}