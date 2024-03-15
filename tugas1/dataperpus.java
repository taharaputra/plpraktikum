package tugas1;

public class dataperpus {

    private String [][] Teknologi = {
        {"Teknologi Informasi dan Komunikasi", "Dr. Ir. Rahmat Hidayat", "300", "2018", "PT. Gramedia Pustaka Utama"},
        {"Teknologi dan Pengembangan", "Prof. Dr. Ir. Bambang Dwi Cahyo", "250", "2019", "PT. Gramedia Pustaka Utama"},
        {"Teknologi dan Kesehatan", "Dr. Ir. Sri Rahayu", "200", "2020", "PT. Gramedia Pustaka Utama"},
        {"Teknologi dan Pembelajaran", "Dr. Ir. Arief Budiman", "225", "2021", "PT. Gramedia Pustaka Utama"},
        {"Teknologi dan Pengembangan Sosial", "Dr. Ir. Rizki Firman", "275", "2022", "PT. Gramedia Pustaka Utama"}
    };

    public String[][] Teknologi() {
        return Teknologi;
    }
      
    private String[][] Filsafat = {
        {"Dunia Sophie", "Jostein Gaarder", "300", "2000", "Penguin Books" },
        {"Filosofi Teras", "Eckhart Tolle", "250", "2004", "Hay House"},
        {"The Passions of The Soul {Hasrat Jiwa)", "René Descartes", "200", "2006", "Penguin Classics"},
        {"Filsafat Ilmu: Perspektif Barat & Islam", "Abdulaziz Sachedina", "250", "2009", "Oxford University Press"},
        {"Introduction of Philosophy {Pengantar Filsafat)", "George Stuart Fullerton", "300", "2015", "McGraw-Hill"}
      };

      public String[][] Filsafat() {
        return Filsafat;
    }
    
    private String [][] Sejarah = {
        {"Cantik Itu Luka", "Laksmi Pamuntjak", "300", "2000", "Gramedia Pustaka Utama"},
        {"Laut Bercerita", "Leila S.", "250", "2004",  "Gramedia Pustaka Utama"},
        {"Ronggeng Dukuh Paruk", "Ratih Kumala", "200", "2006", "Gramedia Pustaka Utama"},
        {"A History of Modern Indonesia", "Dr. Ir. Rahmat Hidayat", "300", "2009",  "PT. Gramedia Pustaka Utama"},
        {"Di Bawah Bendera Revolusi", "Dr. Ir. Arief Budiman", "225", "2011", "PT. Gramedia Pustaka Utama"}
    };

    public String[][] Sejarah() {
        return Sejarah;
    }

    private String [][] Agama = {
        {"Pendidikan Agama Islam dan Budi Pekerti", "Kemdikbud", "307", "2015", "Kemdikbud"},
        {"Adab Guru dan Murid", "Imam Nawawi", "150", "2010", "PQS Sumber Ilmu"},
        {"Pendidikan Agama Islam", "Pusat Kurikulum dan Perbukuan, Balitbang", "130" , "2014", "Kemendikbud", "Kemdikbud"},
        {"Buku Guru Pendidikan Agama Islam Kelas XII Kurikulum 2013", "Kemdikbud", "220", "2015", "Kemdikbud"},
        {"Buku Agama Arsip - LDK Jama'ah Shalahuddin UGM", "Imam Nawawi", "100", "2010", "PQS Sumber Ilmu"}
    };

    public String[][] Agama() {
        return Agama;
    }
    
    private String [][] Psikologi = {
        {"Dunia Sophie", "Jostein Gaarder", "300", "2000", "Penguin Books"},
        {"Filosofi Teras", "Eckhart Tolle", "250", "2004", "Hay House"},
        {"The Passions of The Soul (Hasrat Jiwa)", "René Descartes", "200", "2006", "Penguin Classics"},
        {"Filsafat Ilmu: Perspektif Barat & Islam", "Abdulaziz Sachedina", "250", "2009", "Oxford University Press"},
        {"Introduction of Philosophy (Pengantar Filsafat)", "George Stuart Fullerton", "300", "2015", "McGraw-Hill"},
    };

    public String[][] Psikologi() {
        return Psikologi;
    }
    
    private String [][] Politik = {
        {"The Prince", "Niccolò Machiavelli", "104", "1532", "Dover Publications" },
        {"Leviathan", "Thomas Hobbes", "448", "1651", "Oxford University Press" },
        {"Two Treatises of Government", "John Locke", "448", "1689", "Cambridge University Press" },
        {"The Spirit of the Laws", "Montesquieu", "608", "1748", "Cambridge University Press" },
        {"On Liberty", "John Stuart Mill", "208", "1859", "Penguin Classics" },
    };

    public String[][] Politik() {
        return Politik;
    }
    
    private String [][] Fiksi = {
        {"Dunia Sophie", "Jostein Gaarder", "300", "2000", "Penguin Books"},
        {"Filosofi Teras", "Eckhart Tolle", "250", "2004", "Hay House"},
        {"The 5 AM Club", "Robin Sharma", "300", "2000", "Penguin Books"},
        {"The Things You Can See Only When You Slow Down", "Haemin Sunim", "250", "2004", "Penguin Books"},
        {"The Power of Habit", "Charles Duhigg", "300", "2008", "Random House"},
    };

    public String[][] Fiksi() {
        return Fiksi;
    }

    public static void hasilbuku(String [][] databuku) {
        for (int i = 0 ; i < databuku.length ; i++) {
            System.out.println("Buku ke- " + (i+1));
            System.out.println("Judul Buku: " + databuku[i][0]);
            System.out.println("Penulis: " + databuku[i][1]);
            System.out.println("Jumlah Halaman: " + databuku[i][2]);
            System.out.println("Tahun Terbit: " + databuku[i][3]);
            System.out.println("Penerbit: " + databuku[i][4]);
            System.out.println();
        }
    }

    public static int jumlahbuku (String [][] databuku) {
        return databuku.length;
    }
    
}




