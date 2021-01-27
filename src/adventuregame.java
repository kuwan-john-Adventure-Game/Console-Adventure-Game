import java.util.Scanner;

public class adventuregame {
    public static void main(String[] args) {
        int enemyHealth = 100;
        int heroHealth = 100;
        int attk = (int) (Math.random() * 25);
        int drinkPotion = 10;
        int enemyAttk = (int) (Math.random() * 50);

        Scanner scan = new Scanner(System.in);
        System.out.println("what is your Name?");
        String userInput = scan.nextLine();
        System.out.println();
        do {
            System.out.println("what would you like to do "+userInput+" ? attack, revive or run");
             String response = scan.nextLine().trim();
            System.out.println("your health is "+heroHealth);
            System.out.println("enemy's health is "+enemyHealth);
             if (response.equals("attack")) {
                enemyHealth = enemyHealth - attk;

                System.out.println("Enemy's New health level is : " + enemyHealth);
                 System.out.println("Enemy turn");
                 heroHealth= heroHealth-enemyAttk;
                 System.out.println("enemy attacked your new health is : "+ heroHealth);
            } else if (response.equals("revive")) {
                 heroHealth =heroHealth + drinkPotion;

                System.out.println("Your new health level is : " + heroHealth);
heroHealth= heroHealth-enemyAttk;
                 System.out.println("enemy attacked your new health is : "+ heroHealth);
            } else if (response.equalsIgnoreCase("run"))  {
                System.out.println("little B@#$3!!");
                break;
            } else {
                System.out.println("Whatever.");
            }
        }while(enemyHealth>0 && heroHealth>0);
    }
}
// need to figure out how to make it so that after a certain amount of tries the enemy attacks
//fix the health for enemy