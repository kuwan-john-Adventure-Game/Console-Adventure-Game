import java.awt.*;
import java.util.Scanner;

public class AdventureGame {

    public static void main(String[] args) throws InterruptedException {


        int heroHP = 100;
        int enemyHP = 80;
        int potion = 15;
        boolean escaped = false;

        // Introduction & permission to enter the Battler
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name, adventurer?");
        String name = scan.next();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        Thread.sleep(800);
        System.out.println("Hello, " + name + ".");
        Thread.sleep(1000);
        System.out.println("Are you willing to step into the Java Battler?");
        String answer = scan.next().toLowerCase();

        // Into the Java Battler
        if (answer.startsWith("y")) {
            Thread.sleep(500);
            System.out.println("Welcome to the Java Battler.");
            Thread.sleep(1200);
            System.out.println("Oh, no..");
            Thread.sleep(800);
            System.out.print("An enemy approaches! ");
            Thread.sleep(1500);
            System.out.println("..quick, confront your enemy!");
            Thread.sleep(1200);
            System.out.printf("{%s's HP: \033[0;32m%s\u001B[0m <===||===> \033[0;32m%d\u001B[0m :Enemy's HP}%n", name, heroHP, enemyHP);

            // Battling sequence
            do {
                int ATK = (int) (Math.random() * 35);
                int enemyATK = (int) (Math.random() * 20);
                Thread.sleep(500);
                System.out.format("\033[0;33m[A]ttack\n\033[0;34m[P]otion\n\033[0;35m[E]scape\u001B[0m%n");
                String response = scan.next().trim();
                // Attacking sequence
                if (response.toLowerCase().startsWith("a")) {
                    enemyHP -= ATK;

                    Thread.sleep(500);
                    System.out.println("You attack for: " + ATK + "!");
                    Thread.sleep(1000);
                    System.out.println("The enemy attacks for: " + enemyATK + "!");
                    Thread.sleep(1200);
                    heroHP = heroHP - enemyATK;

                    if (enemyHP < 30) {
                        String senemyHP = "\033[1;91m" + enemyHP;

                        System.out.printf("{%s's HP: \033[0;32m%s\u001B[0m <===||===> \033[0;32m%s\u001B[0m :Enemy's HP}%n", name, heroHP, senemyHP);
                    } else if (enemyHP > 30)
                        System.out.printf("{%s's HP: \033[0;32m%s\u001B[0m <===||===> \033[0;32m%s\u001B[0m :Enemy's HP}%n", name, heroHP, enemyHP);

                    // Potion sequence
                } else if (response.toLowerCase().startsWith("p")) {
                    Thread.sleep(500);
                    System.out.println("You drink a potion and gain " + potion + " health.");
                    Thread.sleep(1000);


                    // Method to !exceed maximum HP
                    if (heroHP + potion >= 100) {
                        heroHP = 100;
                    } else {
                        heroHP += potion;
                    }
                    heroHP -= enemyATK;
                    System.out.println("The enemy attacks for: " + enemyATK + "!");
                    Thread.sleep(1200);
                    if (enemyHP < 30) {
                        String senemyHP = "\033[1;91m" + enemyHP;

                        System.out.printf("{%s's HP: \033[0;32m%s\u001B[0m <===||===> \033[0;32m%s\u001B[0m :Enemy's HP}%n", name, heroHP, senemyHP);
                    } else if (enemyHP > 30)
                        System.out.printf("{%s's HP: \033[0;32m%s\u001B[0m <===||===> \033[0;32m%s\u001B[0m :Enemy's HP}%n", name, heroHP, enemyHP);
//                    System.out.printf("{%s's HP: \033[0;32m%s\u001B[0m <===||===> \033[0;32m%d\u001B[0m :Enemy's HP}%n", name, heroHP, enemyHP);

                    // Escape sequence
                } else if (response.toLowerCase().startsWith("e")) {
                    Thread.sleep(500);
                    System.out.println("You're running?");
                    Thread.sleep(1000);
                    System.out.println("Go then..");
                    Thread.sleep(1200);
                    System.out.println("You're no Hero of mine!");
                    Thread.sleep(1500);
                    escaped = true;
                    break;

                    // Catch invalid response
                } else {
                    System.out.println("Please enter a valid response.");
                }
            } while (enemyHP >= 0 && heroHP >= 0);

            // Enemy defeated sequence
            if (!escaped) {
                System.out.println();
                Thread.sleep(1500);
                System.out.print(".");
                Thread.sleep(300);
                System.out.print(".");
                Thread.sleep(300);
                System.out.print(".");
                Thread.sleep(500);
                System.out.println("Enemy defeated.");
                Thread.sleep(1500);
                System.out.printf("Nice work, \033[0;32m%s\u001B[0m!%n", name);
                Thread.sleep(2000);
            }

        }
    }
}



