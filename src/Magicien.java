public class Magicien extends Personnage {

    String phyltre = "philtre snapchat du magicien perdu de l'ombre mortel noir";

    public Magicien() {
        super.protection=phyltre;
        this.sort = new Sort();
    }

    @Override                                             // methode toString surchargée
    public String toString() {
        return "Nom du joueur : " + name + "\n" +
                "PV : " + health + "\n" +
                "Power : " + power + "\n" +
                "Dégat sort : " + sort.getSort() + "\n" +
//                "Sort : " + sort + "\n" +
                "protection : " + phyltre + "\n";
    }
}

