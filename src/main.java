import java.util.Scanner;

public class main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisissez un personnage: Guerrier / Magicien");
        String perso = scanner.nextLine();
        System.out.println("Vous avez choisit un " + perso);
        int health = 0;
        int power = 0;
        if (perso.equalsIgnoreCase("Guerrier")){
            Guerrier guerrier = new Guerrier();
            System.out.println("Choisissez un nom");

            String name = scanner.nextLine();
            System.out.println("Votre nom est :" + name);
            guerrier.setName(name);

            System.out.println("Choisissez une image de profil");
            String image = scanner.nextLine();
            System.out.println("Vous avez choisit une nouvelle image");
            guerrier.setImage(image);

            System.out.println("Choisissez un bouclier");
            String shield = scanner.nextLine();
            System.out.println("Vous avez choisit: " + shield);
            guerrier.setShield(shield);

            while (health < 5 || health > 10){
                System.out.println("Choisissez votre niveau de vie");
                health = scanner.nextInt();
            }
            health = scanner.nextInt();
            guerrier.setHealth(health);


            while (power < 5 || power > 10){
                System.out.println("Choisissez votre niveau de force");
                power = scanner.nextInt();
            }
            power = scanner.nextInt();
            guerrier.setPower(power);
        }

        else if (perso.equalsIgnoreCase("Magicien")){
            Magicien magicien = new Magicien();
            System.out.println("Choisissez un nom");

            String name = scanner.nextLine();
            System.out.println("Votre nom est :" + name);
            magicien.setName(name);

            System.out.println("Vous avez choisit une nouvelle image");
            String image = scanner.nextLine();
            magicien.setImage(image);

            while (health < 5 || health > 10){
                System.out.println("Choisissez votre niveau de vie");
                health = scanner.nextInt();
            }
            magicien.setHealth(health);

            System.out.println("Choisissez votre niveau de force");
            power = scanner.nextInt();
            magicien.setPower(power);
        }
    }
}
