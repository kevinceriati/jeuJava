import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Interface {
    private ArrayList<Cases> plateau = new ArrayList();
    private ArrayList<Personnage> listeOfGuerrier = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private int startChoice;
    private int guerrierCourant = 0;
    private int navChoice;
    private Personnage combattant = null;
    private String[] typeCase = {"Bonus", "Ennemis", "Neutre"};

    public void launchGame() {
        while (navChoice != 5) {
            menuStart();
            if (navChoice == 1) {
                creatPerso();
            } else if (navChoice == 2) {
                afficher();
            } else if (navChoice == 3) {
                modify();
            } else if (navChoice == 4) {
                delete();
            } else if (navChoice == 6) {
                plateau();
            }
        }
    }

    public void menuStart() {

        System.out.println("Jouez au JEUX DE ROLE DE CES MORTS: une aventure épique en ligne de commade : " + "\n" + 1 + " Créer un peronnage" + '\n' + 2 + " Afficher/Choisir un peronnage" + "\n" +
                3 + " modifier personnage" + '\n' + 4 + " supprimer un personnage" + " \n" + 5 + " Quitter" + "\n" + 6 + " Start new game");

        navChoice = scanner.nextInt();
        scanner.nextLine();
    }

    public void creatPerso() {

        int health = 0;
        int power = 0;

        System.out.println("Créer votre personnage: Guerrier / Magicien");
        String perso = scanner.nextLine();
        System.out.println("Vous avez choisit un " + perso);

        if (perso.equalsIgnoreCase("Guerrier")) {
            combattant = new Guerrier();
            combattant.setType("Guerrier");
            System.out.println("En tant que guerrier, vous aurez un bouclier pour vous défendre: l'écusson en cuire de marmotte malgache.");
            combattant.protection = "écusson en cuire de marmotte";
        } else if (perso.equalsIgnoreCase("Magicien")) {
            combattant = new Magicien();
            combattant.setType("Magicien");
            System.out.println("En tant que magicien, vous aurez un philtre pour vous défendre: le philtre snapchat du magicien perdu de l'ombre mortel noir.");
            combattant.protection = "écusson en cuire de marmotte";
        }
        creatName();

        System.out.println("Choisissez une image de profil");
        String image = scanner.nextLine();
        System.out.println("Vous avez choisit une nouvelle image");
        combattant.setImage(image);

        if (combattant.getType() == "Guerrier") {

            while (health < 5 || health > 10) {
                System.out.println("Choisissez votre niveau de vie");
                health = scanner.nextInt();
            }

            while (power < 5 || power > 10) {
                System.out.println("Choisissez votre niveau de force");
                power = scanner.nextInt();
            }

        } else if (combattant.getType() == "Magicien") {

            while (health <= 3 || health >= 6) {
                System.out.println("Choisissez votre niveau de vie");
                health = scanner.nextInt();
            }

            while (power < 8 || power > 15) {
                System.out.println("Choisissez votre niveau de force");
                power = scanner.nextInt();
            }
        }
        combattant.setHealth(health);
        combattant.setPower(power);
        degat(combattant.getType(), combattant.getHealth(), combattant.getPower());

        System.out.println(combattant);
        listeOfGuerrier.add(combattant);
        combattant.setId(guerrierCourant);
        guerrierCourant++;
    }

    public void afficher() {
        if (guerrierCourant > 0 || startChoice == 2) {
            for (int i = 0; i < listeOfGuerrier.size(); i++) {

                System.out.println(listeOfGuerrier.get(i));

            }
        }
    }

    public void modify() {

        System.out.println("Choissiez un perso à modifier");
        int idToModif = scanner.nextInt();
        Personnage perso = listeOfGuerrier.get(idToModif);
        scanner.nextLine();
        System.out.println("Vous avez choisie de modifier Le Player n° : " + perso.getId());
        System.out.println("Que souhaitez vous modifier" + "\n" + 1 + " Nom" + '\n' + 2 + " Image" + "\n" +
                3 + " Les stats" + " \n" + 4 + " Quitter");

        int modifChoice = scanner.nextInt();
        scanner.nextLine();

        if (modifChoice == 1) {
            System.out.println("Entré un nouyveau nom de joueur : ");
            String name = scanner.nextLine();
            System.out.println("Votre nom est :" + name);
            perso.setName(name);
        } else if (modifChoice == 2) {
            System.out.println("Choisissez une nouvelle image de profil");
            String image = scanner.nextLine();
            System.out.println("Vous avez choisit une nouvelle image");
            perso.setImage(image);


        } else if (modifChoice == 3) {
            if (perso.getType().equals("guerrier")) {

                System.out.println("Choisissez entre 5 et 10 de vie");
                perso.health = scanner.nextInt();

                while (perso.health < 5 || perso.health > 10) {
                    System.out.println("Choisissez votre niveau de vie");
                    perso.health = scanner.nextInt();
                }
                perso.setHealth(perso.health);

                System.out.println("Choisissez entre 5 et 10 de force");
                perso.power = scanner.nextInt();

                while (perso.power < 5 || perso.power > 10) {
                    System.out.println("Choisissez votre niveau de force");
                    perso.power = scanner.nextInt();
                }
                perso.setPower(perso.power);

                int degArme;

                if (perso.health <= 7 || perso.power <= 8) {

                    degArme = 8;
                    perso.getArme().setDegat(degArme);
                    System.out.println("La puissance de votre arme est fixée à " + degArme + "/10");

                } else {
                    degArme = 5;
                    perso.getArme().setDegat(degArme);
                    System.out.println("La puissance de votre arme est fixée à " + degArme + "/10");
                    perso.setArme(perso.arme);
                }
                System.out.println(perso);
                listeOfGuerrier.add(perso);
                perso.setId(guerrierCourant);
                guerrierCourant++;
            }

            if (perso.getType().equals("magicien")) {

                System.out.println("Choisissez entre 3 et 6 de vie");
                perso.health = scanner.nextInt();

                while (perso.health < 3 || perso.health > 6) {
                    System.out.println("Choisissez votre niveau de vie");
                    perso.health = scanner.nextInt();
                }
                perso.setHealth(perso.health);

                System.out.println("Choisissez entre 8 et 15 de force");
                perso.power = scanner.nextInt();

                while (perso.power < 8 || perso.power > 15) {
                    System.out.println("Choisissez votre niveau de force");
                    perso.power = scanner.nextInt();
                }
                perso.setPower(perso.power);

                int degatMagic;

                if (perso.health < 4 || perso.power < 10) {
                    degatMagic = 9;
                    System.out.println("La puissance de votre arme est fixée à " + degatMagic + "/10");
                } else {
                    degatMagic = 5;
                    System.out.println("La puissance de votre arme est fixée à " + degatMagic + "/10");
                }
                perso.getArme().setDegat(degatMagic);

                System.out.println(perso);
                listeOfGuerrier.add(perso);
                perso.setId(guerrierCourant);
                guerrierCourant++;
            }
        }
    }

    public void creatName() {
        System.out.println("Choisissez un nom");
        combattant.setName(scanner.nextLine());
        System.out.println("Votre nom est :" + combattant.getName());
    }

    public void delete() {
        System.out.println("Quel player voulez vous supprimer");
        int resultat = scanner.nextInt();
        listeOfGuerrier.remove(resultat);
        afficher();
    }

    public void degat(String type, int health, int power) {
        Arme arme = new Arme();
        int degArme = 0;
        if (type == "Guerrier") {
            arme.setNom("Fourre manan");
            if (health < 8 || power < 8) {
                degArme = 8;
                System.out.println("La puissance de votre arme est fixée à " + degArme + "/10");
            } else {
                degArme = 5;
                System.out.println("La puissance de votre arme est fixée à " + degArme + "/10");
            }
        } else if (type == "Magicien") {
            arme.setNom("philtre snapchat du magicien perdu de l'ombre mortel noir");
            if (health < 5 || power < 10) {
                degArme = 9;
                System.out.println("La puissance de votre arme est fixée à " + degArme + "/10");
            } else {
                degArme = 5;
                System.out.println("La puissance de votre arme est fixée à " + degArme + "/10");
            }
        }
        combattant.setArme(arme);
        combattant.getArme().setDegat(degArme);
    }

    public void plateau() {
        System.out.println("Combien de cases voulez-vous sur le plateau : ");
        int nbCases = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < nbCases; i++) {
            Random r = new Random();
            String type = typeCase[r.nextInt(typeCase.length)];
            Cases cas = new Cases(type, i + 1);
            plateau.add(cas);
            System.out.println(plateau.get(i));
        }
    }
}