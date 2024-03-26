package tugas3;
import java.util.Scanner;

public class fightHero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Permainan adu hero");
        System.out.println("Player 1 : Silakan masukkan hero anda!");
        System.out.println("Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!");
        System.out.println("===============================================");

        Hero hero1 = new Hero();
        System.out.print("Nama hero: ");
        hero1.setNama(input.nextLine());
        System.out.print("Health Point: ");
        hero1.setHp(input.nextDouble());
        System.out.print("Attack: ");
        hero1.setAttackPower(input.nextDouble());
        System.out.print("Defense: ");  
        hero1.setDefensePower(input.nextDouble());
        
        System.out.println();
        System.out.println("Permainan adu hero");
        System.out.println("Player 2 : Silakan masukkan hero anda!");
        System.out.println("Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!");
        System.out.println("===============================================");

        Hero hero2 = new Hero(null, 0, 0, 0);
        hero2.setNama(input.nextLine());
        System.out.print("Nama hero: " );
        hero2.setNama(input.nextLine());
        System.out.print("Health Point: ");
        hero2.setHp(input.nextInt());
        System.out.print("Attack: ");
        hero2.setAttackPower(input.nextInt());
        System.out.print("Defense: ");
        hero2.setDefensePower(input.nextInt());

        System.out.println("===============================================");
        System.out.println("===============================================");

        int round = 0;
        while (hero1.getHp() > 0 && hero2.getHp() > 0) {
            round ++;
            System.out.println("Ronde " + round);
            System.out.println(hero1.getNama() + " menyerang " + hero2.getNama());
            System.out.println();

            hero1.attackPower(hero2);
            System.out.println(hero1.getNama() + " menyerang sebesar " + hero1.getAttackPower());
            System.out.println(hero2.getNama() + " memiliki pertahanan sebesar " + hero2.getDefensePower());
            System.out.println("Health " + hero2.getNama() + " saat ini " + hero2.getHp());
            System.out.println();

            System.out.println(hero2.getNama() + " menyerang " + hero1.getNama());
            System.out.println();

            hero2.attackPower(hero1);
            System.out.println(hero2.getNama() + " menyerang sebesar " + hero2.getAttackPower());
            System.out.println(hero1.getNama() + " memiliki pertahanan sebesar " + hero1.getDefensePower());
            System.out.println("Health " + hero1.getNama() + " saat ini " + hero1.getHp());
            System.out.println();
        }

        if (hero1.getHp() <= 0) {
            System.out.println("Pertarungan telah usai!");
            System.out.println(hero1.getNama() + " te;ah kalah!");
            System.out.println(hero2.getNama() + " adalah pemenangnya!");
        } else {
            System.out.println("Pertarungan telah usai!");
            System.out.println(hero2.getNama() + " telah kalah!");
            System.out.println(hero1.getNama() + " adalah pemenangnya!");
        }

        input.close();
    }
}
