package tugas1;
import java.util.*;

public class perpustakaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        dataperpus perpustakaan = new dataperpus();
        
        int pilihBuku;
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
                    dataperpus.hasilbuku(perpustakaan.Teknologi());
                    break;
                case "2":
                    System.out.println("Buku dalam kategori Filsafat : ");
                    dataperpus.hasilbuku(perpustakaan.Filsafat());
                    break;
                case "3":
                    System.out.println("Buku dalam kategori Sejarah : ");
                    dataperpus.hasilbuku(perpustakaan.Sejarah());
                    break;
                case "4":
                    System.out.println("Buku dalam kategori Agama : ");
                    dataperpus.hasilbuku(perpustakaan.Agama());
                    break;
                case "5":
                    System.out.println("Buku dalam kategori Psikologi : ");
                    dataperpus.hasilbuku(perpustakaan.Psikologi());
                    break;
                case "6":
                    System.out.println("Buku dalam kategori Politik : ");
                    dataperpus.hasilbuku(perpustakaan.Politik());
                    break;
                case "7":
                    System.out.println("Buku dalam kategori Fiksi : ");
                    dataperpus.hasilbuku(perpustakaan.Fiksi());
                    break;
                case "8":
                    int totalBuku = 0;
                    totalBuku += dataperpus.jumlahbuku(perpustakaan.Teknologi());
                    totalBuku += dataperpus.jumlahbuku(perpustakaan.Filsafat());
                    totalBuku += dataperpus.jumlahbuku(perpustakaan.Sejarah());
                    totalBuku += dataperpus.jumlahbuku(perpustakaan.Agama());
                    totalBuku += dataperpus.jumlahbuku(perpustakaan.Psikologi());
                    totalBuku += dataperpus.jumlahbuku(perpustakaan.Politik());
                    totalBuku += dataperpus.jumlahbuku(perpustakaan.Fiksi());
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
