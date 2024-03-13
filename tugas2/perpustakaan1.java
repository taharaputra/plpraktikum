package tugas2;

import java.util.Scanner;


public class perpustakaan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        dataperpus1 perpustakaan = new dataperpus1();
        
        System.out.println("=====[Perpustakaan]=====");
        System.out.println("Masukkan pilihan untuk melihat buku berdasarkan kategori");
        System.out.print("1. Teknologi\n" + "2. Filsafat\n" + "3. Sejarah\n" + "4. Agama\n" + "5. Psikologi\n" + "6. Politik\n" + "7. Fiksi\n");
        System.out.println("8. Tampilkan total buku yang tersedia");
        System.out.println("9. Keluar dari program");

        
        while (true) {
            System.out.print("Pilihan anda: ");
            String pilihan = input.next();

            switch (pilihan) {
                case "1":
                    System.out.println("Buku dalam kategori Teknologi : ");
                    dataperpus1.hasilbuku(perpustakaan.getTeknologi());
                    break;
                case "2":
                    System.out.println("Buku dalam kategori Filsafat : ");
                    dataperpus1.hasilbuku(perpustakaan.getFilsafat());
                    break;
                case "3":
                    System.out.println("Buku dalam kategori Sejarah : ");
                    dataperpus1.hasilbuku(perpustakaan.getSejarah());
                    break;
                case "4":
                    System.out.println("Buku dalam kategori Agama : ");
                    dataperpus1.hasilbuku(perpustakaan.getAgama());
                    break;
                case "5":
                    System.out.println("Buku dalam kategori Psikologi : ");
                    dataperpus1.hasilbuku(perpustakaan.getPsikologi());
                    break;
                case "6":
                    System.out.println("Buku dalam kategori Politik : ");
                    dataperpus1.hasilbuku(perpustakaan.getPolitik());
                    break;
                case "7":
                    System.out.println("Buku dalam kategori Fiksi :");
                    dataperpus1.hasilbuku(perpustakaan.getFiksi());
                    break;
                case "8":
                    int totalBuku = 0;
                    totalBuku += dataperpus1.jumlahbuku(perpustakaan.getTeknologi());
                    totalBuku += dataperpus1.jumlahbuku(perpustakaan.getFilsafat());
                    totalBuku += dataperpus1.jumlahbuku(perpustakaan.getSejarah());
                    totalBuku += dataperpus1.jumlahbuku(perpustakaan.getAgama());
                    totalBuku += dataperpus1.jumlahbuku(perpustakaan.getPsikologi());
                    totalBuku += dataperpus1.jumlahbuku(perpustakaan.getPolitik());
                    totalBuku += dataperpus1.jumlahbuku(perpustakaan.getFiksi());
                    System.out.println("Jumlah total buku : " + totalBuku);
                    break;
                case "9":
                    System.out.println("Keluar dari program. Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan masukkan pilihan yang benar.");
            }
        }
    }
}
