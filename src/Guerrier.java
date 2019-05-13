import javax.lang.model.element.NestingKind;

public class Guerrier {
    private String name;
    String image = "https://www.google.com/url?sa=i&source=images&cd=&ved=2ahUKEwi62J3Y_5DiAhVL0uAKHV9oBYAQjRx6BAgBEAU&url=http%3A%2F%2Fwww.pathfinder-fr.org%2FWiki%2FPathfinder-RPG.Guerrier.ashx&psig=AOvVaw3kVaEAl-vkF0RasfFCdaSl&ust=1557578896209390";
    int health;
    int power;
    String shield;
    Arme arme;

    public String getName() {
        return name;
    }

    public void setName(String nom) {
        this.name = nom;
    }


    public String getImage() {
        return image;
    }

    public void setImage(String picture) {
        this.image = picture;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int vie) {
        this.health = vie;
    }


    public int getPower() {
        return power;
    }

    public void setPower(int force) {
        this.power = force;
    }

    public Arme getArme() {
        return arme;
    }

    public void setArme(Arme arme) { this.arme = arme; }

    public String getShield() {
        return shield;
    }

    public void setShield(String bouclier) {
        this.shield = bouclier;
    }


    public String toString() {
        return "Nom du joueur : " + name + '\n' +
                  "PV : " + health + '\n' +
                  "Power : " + power + '\n' +
                 "Dégat arme : " + arme.getDegat();
    }
}



