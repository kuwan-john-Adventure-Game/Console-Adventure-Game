import java.util.Scanner;

public class adventuregame {
    public static void main(String[] args) throws InterruptedException {
        int heroHP = 100;
        int enemyHP = 75;
//        int ATK = (int) (Math.random() * 35);
        int potion = 15;
//        int enemyATK = (int) (Math.random() * 20);

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name, adventurer?");
        String name = scan.next();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
//        System.out.println("This is a battling game, " + name + ". Are you willing to step into the Java Battler?");
        String answer = scan.nextLine().toLowerCase();
        System.out.println(answer);
//        if (answer.startsWith("y")) {
                System.out.print("Welcome to the Java Battler, ");
                Thread.sleep(1000);
                System.out.println(name + ".");
                Thread.sleep(1500);
                System.out.println("Oh, no..");
                Thread.sleep(800);
                System.out.print("An enemy approaches! ");
                Thread.sleep(1500);
                System.out.println("..quick, do something!");
                Thread.sleep(1200);
                System.out.println(name + "'s HP: " + heroHP + " <---||---> Enemy HP: " + enemyHP);
            do {
                int ATK = (int) (Math.random() * 35);
                int enemyATK = (int) (Math.random() * 20);
                Thread.sleep(500);
                System.out.println("[A]ttack\n[P]otion\n[E]scape");
                String response = scan.nextLine().trim();

                if (response.toLowerCase().startsWith("a")) {
                    enemyHP -= ATK;

                    Thread.sleep(500);
                    System.out.println("You attack for: " + ATK + "!");
                    Thread.sleep(1000);
                    System.out.println("The enemy attacks for: " + enemyATK + "!");
                    Thread.sleep(1200);
                    heroHP = heroHP - enemyATK;
                    System.out.println(name + "'s HP: " + heroHP + " <--||--> Enemy HP: " + enemyHP);
                } else if (response.toLowerCase().startsWith("p")) {
                    Thread.sleep(500);
                    System.out.println("You drink a potion and gain " + potion + " health.");
                    heroHP += potion;

                    Thread.sleep(1000);
                    heroHP = heroHP - enemyATK;
                    System.out.println("The enemy attacks for: " + enemyATK + "!");
                    Thread.sleep(1200);
                    System.out.println(name + "'s HP: " + heroHP + " <--||--> Enemy HP: " + enemyHP);
                } else if (response.toLowerCase().startsWith("e")) {
                    Thread.sleep(500);
                    System.out.println("You're running?");
                    Thread.sleep(1000);
                    System.out.println("Go then..");
                    Thread.sleep(1200);
                    System.out.println("You're no Hero of mine!");
                    Thread.sleep(1500);
                    break;
                } else {
                    System.out.println("Please enter a valid response.");
                }
            } while (enemyHP >= 0 && heroHP >= 0);
                Thread.sleep(1500);
                System.out.println("Enemy defeated.");
                Thread.sleep(1500);
                System.out.print("You are the true Java Hero! ");
                Thread.sleep(1500);
                System.out.println("All hail " + name + "!!");
                Thread.sleep(1500);
        }
    }
//}
// need to figure out how to make it so that after a certain amount of tries the enemy attacks
//fix the health for enemy