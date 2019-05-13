public class Personnage {
    String name;
    String image = "http://www.la-caverne-du-mage.com/images/Image/Image/storm_mage_by_devburmakd39ax1h.jpg?1483815050422";
    int health;
    int power;
    String protection;
    Arme arme;
    Sort sort;

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

    public void setArme(Arme arme) {
        this.arme = arme;
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public String toString() {
        return "Nom du joueur : " + name + "\n" +
                "PV : " + health + "\n" +
                "Power : " + power + "\n" +
                "Protection : " + protection + "\n";
    }
}
