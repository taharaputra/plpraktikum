package tugas3;

public class Hero {
    private String nama;
    private double hp;
    private double attackPower;
    private double defensePower;

    public Hero() {
        // this.nama = "";
        // this.hp = 0;
        // this.attackPower = 0;
        // this.defensePower = 0;
    }

    public Hero(String nama, double hp, double attackPower, double defensePower) {
        this.nama = nama;
        this.hp = hp;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getHp() {
        return hp;
    }

    public void setAttackPower(double attackPower) {
        this.attackPower = attackPower;
    }

    public double getAttackPower() {
        return attackPower;
    }

    public void setDefensePower(double defensePower) {
        this.defensePower = defensePower;
    }

    public double getDefensePower() {
        return defensePower;
    }
    
    public void attackPower(Hero hero) {
        double damage = attackPower - hero.defensePower;
        hero.hp -= damage;
    }
}
