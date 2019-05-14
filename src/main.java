import java.util.Scanner;

public class main {
    static Personnage listeOfGuerrier[] = new Personnage[100];

    static Scanner scanner = new Scanner(System.in);
    static int startChoice = 1;
    static int guerrierCourant = 0;

    public static void main(String[] args) {


        while (startChoice != 5) {

            System.out.println("Jouez au JEUX DE ROLE DE CES MORTS: une aventure épique en ligne de commade : " + "\n" + 1 + " Créer un peronnage" + '\n' + 2 + " Afficher/Choisir un peronnage" + "\n" +
                    3 + " modifier personnage" + '\n' + 4 + " supprimer un personnage" + " \n" + 5 + " Quitter");

            startChoice = scanner.nextInt();
            scanner.nextLine();

            if (startChoice == 1) {

                int health = 0;
                int power = 0;

                System.out.println("Créer votre personnage: Guerrier / Magicien");
                String perso = scanner.nextLine();
                System.out.println("Vous avez choisit un " + perso);


                if (perso.equalsIgnoreCase("Guerrier")) {
                    Personnage guerrier = new Guerrier();
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
                    guerrier.protection = "écusson en cuire de marmotte";

                    while (health <= 5 || health >= 10) {
                        System.out.println("Choisissez votre niveau de vie");
                        health = scanner.nextInt();
                    }
                    guerrier.setHealth(health);


                    while (power <= 5 || power >= 10) {
                        System.out.println("Choisissez votre niveau de force");
                        power = scanner.nextInt();
                    }
                    guerrier.setPower(power);

                    if (health <= 7 || power <= 8) {
                        degArme = 8;
                        guerrier.getArme().setDegat(degArme);
                        System.out.println("La puissance de votre arme est fixée à " + degArme + "/10");

                    } else {
                        degArme = 5;
                        guerrier.getArme().setDegat(degArme);
                        System.out.println("La puissance de votre arme est fixée à " + degArme + "/10");
                        guerrier.setArme(arme);
                    }
                    System.out.println(guerrier);
                    listeOfGuerrier[guerrierCourant] = guerrier;
                    guerrier.setId(guerrierCourant);
                    guerrierCourant++;

                } else if (perso.equalsIgnoreCase("Magicien")) {
                    Personnage magicien = new Magicien();
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

                    while (health <= 3 || health >= 6) {
                        System.out.println("Choisissez votre niveau de vie");
                        health = scanner.nextInt();
                    }
                    magicien.setHealth(health);

                    while (power <= 8 || power >= 15) {
                        System.out.println("Choisissez votre niveau de force");
                        power = scanner.nextInt();
                    }
                    magicien.setPower(power);

                    if (health <= 4 || power <= 10) {
                        degatMagic = 9;
                        magicien.getSort().setSort(degatMagic);
                        System.out.println("La puissance de votre arme est fixée à " + degatMagic + "/10");
                    } else {
                        degatMagic = 5;
                        magicien.getSort().setSort(degatMagic);
                        System.out.println("La puissance de votre arme est fixée à " + degatMagic + "/10");
                    }
                    System.out.println(magicien);
                    listeOfGuerrier[guerrierCourant] = magicien;
                    magicien.setId(guerrierCourant);
                    guerrierCourant++;
                }
            } else if (startChoice == 2) {
                afficher();

            } else if (startChoice == 3) {

                System.out.println("Choissiez un perso à modifier");
                int idToModif = scanner.nextInt();
                Personnage perso = listeOfGuerrier[idToModif];
                scanner.nextLine();
                System.out.println("Vous avez choisie de modifier ne Player n° : " + perso);
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

                        if (perso.health < 7 || perso.power < 8) {

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
                        listeOfGuerrier[guerrierCourant] = perso;
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
                            perso.getSort().setSort(degatMagic);
                            System.out.println("La puissance de votre arme est fixée à " + degatMagic + "/10");
                        } else {
                            degatMagic = 5;
                            perso.getSort().setSort(degatMagic);
                            System.out.println("La puissance de votre arme est fixée à " + degatMagic + "/10");
                        }

                        System.out.println(perso);
                        listeOfGuerrier[guerrierCourant] = perso;
                        perso.setId(guerrierCourant);
                        guerrierCourant++;
                    }
                }


            } else if (startChoice == 4) {
                System.out.println("Quel player voulez vous supprimer");
                int resultat = scanner.nextInt();
                listeOfGuerrier[resultat] = null;
                afficher();
            }
        }
    }

    public static void afficher() {
        if (guerrierCourant > 0) {
            for (int i = 0; i < listeOfGuerrier.length; i++) {
                if (listeOfGuerrier[i] != null) {
                    System.out.println(listeOfGuerrier[i]);

                }
            }
        }
    }
}
