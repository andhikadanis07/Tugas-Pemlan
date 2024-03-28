package ChampionBattles;

import java.util.Scanner;

public class battles {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Selamat Datang di Champion Battles!\n");

        data champion1 = createChampion(scn, "Player 1");
        data champion2 = createChampion(scn, "Player 2");

        System.out.print("\n===================================================================================\n");
        
        System.out.println("Bersiaplah!\n" 
                        + "Pertarungan antara " + champion1.getName() + " VS  " + champion2.getName() + " akan dimulai!\n"
                        + "1\n"
                        + "2\n" 
                        + "3\n");
        
        int round = 1;
        double damage = 0;
        while(champion1.getHp() > 0 && champion2.getHp() > 0){

            System.out.println("Round " + round + "\nFight!\n");

            System.out.println(champion1.getName() + " menyerang " + champion2.getName());
            System.out.println("Health " + champion2.getName() + " saat ini " + champion2.getHp() + "\n");
            System.out.println(champion1.getName() + " menyerang sebesar " + champion1.getAttack());
            System.out.println(champion2.getName() + " memiliki pertahanan sebesar " + champion2.getDefense());
            damage = champion1.getAttack() - champion2.getDefense();
            if(damage < 0){
                damage = 0;
            }
            champion2.setHp(Math.max(champion2.getHp() - damage, 0));
            System.out.println("Damage yang diterima " + champion2.getName() + " sebesar " + damage);
            System.out.println("Health " + champion2.getName() + " saat ini menjadi " + champion2.getHp() + "\n");

            if (champion2.getHp() == 0) {
                break;
            }

            System.out.println(champion2.getName() + " menyerang " + champion1.getName());
            System.out.println("Health " + champion1.getName() + " saat ini " + champion1.getHp());
            System.out.println(champion2.getName() + " menyerang sebesar " + champion2.getAttack());
            System.out.println(champion1.getName() + " memiliki pertahanan sebesar " + champion1.getDefense());
            damage = champion2.getAttack() - champion1.getDefense();
            if (damage < 0) {
                damage = 0;
            }
            champion1.setHp(Math.max(champion1.getHp() - damage, 0));
            System.out.println("Damage yang diterima " + champion1.getName() + " sebesar " + damage);
            System.out.println("Health " + champion1.getName() + " saat ini menjadi " + champion1.getHp());

            champion1.setDefense(Math.max(champion1.getDefense() - 10, 0));
            champion2.setDefense(Math.max(champion2.getDefense() - 10, 0));

            System.out.println("\n===================================================================================\n");
            round++;
            
        }
        
        if(champion1.getHp() == 0){
            System.out.printf("Pertarungan telah usai!\n"
                            + "%s telah kalah!\n"
                            + "%s adalah pemenangnya!\n", champion1.getName(), champion2.getName());            
        }
        else if(champion2.getHp() == 0){
            System.out.println("===================================================================================\n");
            System.out.printf("Pertarungan telah usai!\n"
                            + "%s telah kalah!\n"
                            + "%s adalah pemenangnya!\n", champion2.getName(), champion1.getName());
        }
        System.out.println("\n===================================================================================\n");
        scn.close();
    }

    private static data createChampion(Scanner scn, String player) {
        System.out.println(player + " \t: Silahkan masukkan Champion!");
        System.out.print("Masukkan nama Champion: ");
        String name = scn.nextLine();
        double hp;
        do {
            System.out.print("Masukkan HP (antara 50 dan 1000): ");
            hp = scn.nextDouble();
            if (hp < 50 || hp > 1000) {
                System.out.println("Invalid input! HP harus di antara 50 dan 1000.");
            }
        } while (hp < 50 || hp > 1000);

        double attack;
        do {
            System.out.print("Masukkan Attack (antara 50 dan 1000): ");
            attack = scn.nextDouble();
            if (attack < 50 || attack > 1000) {
                System.out.println("Invalid input! Attack harus di antara 50 dan 1000.");
            }
        } while (attack < 50 || attack > 1000);

        double defense;
        do {
            System.out.print("Masukkan Defense (antara 50 dan 1000): ");
            defense = scn.nextDouble();
            if (defense < 50 || defense > 1000) {
                System.out.println("Invalid input! Defense harus di antara 50 dan 1000.");
            }
        } while (defense < 50 || defense > 1000);

        scn.nextLine();

        return new data(name, hp, attack, defense);
    }
}
