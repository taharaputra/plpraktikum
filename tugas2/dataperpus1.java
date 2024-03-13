package tugas2;

public class dataperpus1 {
    private String[][] teknologi;
    private String[][] filsafat;
    private String[][] sejarah;
    private String[][] agama;
    private String[][] psikologi;
    private String[][] politik;
    private String[][] fiksi;

    public dataperpus1() {
        this.teknologi = new String[][]{
            {"Teknologi Informasi dan Komunikasi", "Dr. Ir. Rahmat Hidayat", "300", "2018", "PT. Gramedia Pustaka Utama", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa."},
            {"Teknologi dan Pengembangan", "Prof. Dr. Ir. Bambang Dwi Cahyo", "250", "2019", "PT. Gramedia Pustaka Utama", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa."},
            {"Teknologi dan Kesehatan", "Dr. Ir. Sri Rahayu", "200", "2020", "PT. Gramedia Pustaka Utama", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa."},
            {"Teknologi dan Pembelajaran", "Dr. Ir. Arief Budiman", "225", "2021", "PT. Gramedia Pustaka Utama", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa."},
            {"Teknologi dan Pengembangan Sosial", "Dr. Ir. Rizki Firman", "275", "2022", "PT. Gramedia Pustaka Utama", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa."}
        };
        this.filsafat = new String[][]{
            {"Dunia Sophie", "Jostein Gaarder", "300", "2000", "Penguin Books", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa."},
            {"Filosofi Teras", "Eckhart Tolle", "250", "2004", "Hay House", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa."},
            {"The Passions of The Soul {Hasrat Jiwa)", "René Descartes", "200", "2006", "Penguin Classics", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa."},
            {"Filsafat Ilmu: Perspektif Barat & Islam", "Abdulaziz Sachedina", "250", "2009", "Oxford University Press", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa."},
            {"Introduction of Philosophy {Pengantar Filsafat)", "George Stuart Fullerton", "300", "2015", "McGraw-Hill", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa."}
        };
        this.sejarah = new String[][]{
            {"Cantik Itu Luka", "Laksmi Pamuntjak", "300", "2000", "Gramedia Pustaka Utama", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa."},
            {"Laut Bercerita", "Leila S.", "250", "2004", "Gramedia Pustaka Utama", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa."},
            {"Ronggeng Dukuh Paruk", "Ratih Kumala", "200", "2006", "Gramedia Pustaka Utama", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa."},
            {"A History of Modern Indonesia", "Dr. Ir. Rahmat Hidayat", "300", "2009", "PT. Gramedia Pustaka Utama", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa."},
            {"Di Bawah Bendera Revolusi", "Dr. Ir. Arief Budiman", "225", "2011", "PT. Gramedia Pustaka Utama", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa."}
        };
        this.agama = new String[][]{
            {"Pendidikan Agama Islam dan Budi Pekerti", "Kemdikbud", "307", "2015", "Kemdikbud", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa."},
            {"Adab Guru dan Murid", "Imam Nawawi", "150", "2010", "PQS Sumber Ilmu", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa."},
            {"Pendidikan Agama Islam", "Pusat Kurikulum dan Perbukuan, Balitbang", "130", "2014", "Kemendikbud", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa."},
            {"Buku Guru Pendidikan Agama Islam Kelas XII Kurikulum 2013", "Kemdikbud", "220", "2015", "Kemdikbud", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa."},
            {"Buku Agama Arsip - LDK Jama'ah Shalahuddin UGM", "Imam Nawawi", "100", "2010", "PQS Sumber Ilmu", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa."}
        };
        
        this.politik = new String[][]{
            {"The Prince", "Niccolò Machiavelli", "104", "1532", "Dover Publications", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa." },
            {"Leviathan", "Thomas Hobbes", "448", "1651", "Oxford University Press", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa." },
            {"Two Treatises of Government", "John Locke", "448", "1689", "Cambridge University Press", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa." },
            {"The Spirit of the Laws", "Montesquieu", "608", "1748", "Cambridge University Press", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa." },
            {"On Liberty", "John Stuart Mill", "208", "1859", "Penguin Classics", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa." },
        };

        this.fiksi = new String[][]{
            {"Dunia Sophie", "Jostein Gaarder", "300", "2000", "Penguin Books", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa."},
            {"Filosofi Teras", "Eckhart Tolle", "250", "2004", "Hay House", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa."},
            {"The 5 AM Club", "Robin Sharma", "300", "2000", "Penguin Books", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa."},
            {"The Things You Can See Only When You Slow Down", "Haemin Sunim", "250", "2004", "Penguin Books", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa."},
            {"The Power of Habit", "Charles Duhigg", "300", "2008", "Random House", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa."},
            {"The Power of Habit", "Charles Duhigg", "300", "2008", "Random House", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa."},
        };

        this.psikologi = new String[][]{
            {"Dunia Sophie", "Jostein Gaarder", "300", "2000", "Penguin Books", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa."},
            {"Filosofi Teras", "Eckhart Tolle", "250", "2004", "Hay House", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa."},
            {"The Passions of The Soul (Hasrat Jiwa)", "René Descartes", "200", "2006", "Penguin Classics", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa."},
            {"Filsafat Ilmu: Perspektif Barat & Islam", "Abdulaziz Sachedina", "250", "2009", "Oxford University Press", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa."},
            {"Introduction of Philosophy (Pengantar Filsafat)", "George Stuart Fullerton", "300", "2015", "McGraw-Hill", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi at iaculis ex, eu lacinia massa."},
        };
    }

    public String[][] getAgama() {
        return agama;
    }

    public String[][] getFiksi() {
        return fiksi;
    }
    
    public String[][] getFilsafat() {
        return filsafat;
    }

    public String[][] getPolitik() {
        return politik;
    }

    public String[][] getPsikologi() {
        return psikologi;
    }

    public String[][] getSejarah() {
        return sejarah;
    }
    
    public String[][] getTeknologi() {
        return teknologi;
    }
    
    // public void sinopsis(String[][] listBuku) {
    //     for (int i = 0; i < 5; i++) {
    //         String sinopsis = listBuku[i][5];
    //         int jumlahKata = Sinopsis(sinopsis);
    //         // System.out.println("\nJudul        : " + listBuku[i][0]+"\nHalaman      : " + listBuku[i][1]+"\nPenulis      : " + listBuku[i][2]+"\nPenerbit     : " + listBuku[i][3]+"\nTahun Terbit : " + listBuku[i][4]+"\nSinopsis     : " + listBuku[i][5]+"\nJumlah Kata  : "+ jumlahKata);
    //     }
    // }
    // public int sinopsis(String[][] sinopsis2) {
    //     for (int i = 0; i < 5; i++) {
    //         String sinopsis = sinopsis2[i][5];
    //         int jumlahKata = Sinopsis(sinopsis);
    //         // System.out.println("\nJudul        : " + listBuku[i][0]+"\nHalaman      : " + listBuku[i][1]+"\nPenulis      : " + listBuku[i][2]+"\nPenerbit     : " + listBuku[i][3]+"\nTahun Terbit : " + listBuku[i][4]+"\nSinopsis     : " + listBuku[i][5]+"\nJumlah Kata  : "+ jumlahKata);
    //     }
    // }
    // public int Sinopsis(String sinopsis) {
    //     String[] kata = sinopsis.split(" ");
    //     return kata.length;
    // }

    public static void hasilbuku(String [][] databuku) {
        for (int i = 0 ; i < databuku.length ; i++) {
            System.out.println("Buku ke- " + (i+1));
            System.out.println("Judul Buku: " + databuku[i][0]);
            System.out.println("Penulis: " + databuku[i][1]);
            System.out.println("Jumlah Halaman: " + databuku[i][2]);
            System.out.println("Tahun Terbit: " + databuku[i][3]);
            System.out.println("Penerbit: " + databuku[i][4]);
            System.out.println("Sinopsis: " + databuku[i][5] + "\n" Sinopsis);
            System.out.println();
        }
    }

    public static int jumlahbuku (String [][] databuku) {
        return databuku.length;
    }
    
}
