import java.util.Scanner;

public class main {
    public static void main (String[] args){


//        for(int i=0; i < listOfGuerrier.length; i++){
//            if(listOfGuerrier[i] == null){
//                listOfGuerrier[i] = a;
//            }
//        }

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

            Arme arme = new Arme();
            int degArme;


            System.out.println("En tant que guerrier, vous aurez un bouclier pour vous défendre: l'écusson en cuire de marmotte malgache.");
            String shield = "écusson en cuire de marmotte";
            arme.setShield(shield);

            while (health < 5 || health > 10){
                System.out.println("Choisissez votre niveau de vie");
                health = scanner.nextInt();
            }
            guerrier.setHealth(health);


            while (power < 5 || power > 10){
                System.out.println("Choisissez votre niveau de force");
                power = scanner.nextInt();
            }
            guerrier.setPower(power);

            if (health < 7 || power < 8) {
                degArme = 8;
                arme.setDegat(degArme);
                System.out.println("La puissance de votre arme est fixée à " + degArme + "/10");
            }else{
                degArme = 5;
                arme.setDegat(degArme);
                System.out.println("La puissance de votre arme est fixée à " + degArme + "/10");
            }
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

            Sort sort = new Sort();
            int degatMagic;

            System.out.println("En tant que magicien, vous aurez un philtre pour vous défendre: le philtre snapchat du magicien perdu de l'ombre mortel noir.");
            String philtre = "écusson en cuire de marmotte";
            sort.setPhiltre(philtre);

            while (health < 3 || health > 6){
                System.out.println("Choisissez votre niveau de vie");
                health = scanner.nextInt();
            }
            magicien.setHealth(health);

            while (power < 8 || power > 15) {
                System.out.println("Choisissez votre niveau de force");
                power = scanner.nextInt();
            }
            magicien.setPower(power);

            if (health < 4 || power < 10) {
                degatMagic = 9;
                sort.setSort(degatMagic);
                System.out.println("La puissance de votre arme est fixée à " + degatMagic + "/10");
            }else{
                degatMagic = 5;
                sort.setSort(degatMagic);
                System.out.println("La puissance de votre arme est fixée à " + degatMagic + "/10");
            }
        }
    }
}
