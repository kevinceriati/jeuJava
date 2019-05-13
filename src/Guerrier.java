import javax.lang.model.element.NestingKind;

public class Guerrier extends Personnage{

    String image = "https://www.google.com/url?sa=i&source=images&cd=&ved=2ahUKEwi62J3Y_5DiAhVL0uAKHV9oBYAQjRx6BAgBEAU&url=http%3A%2F%2Fwww.pathfinder-fr.org%2FWiki%2FPathfinder-RPG.Guerrier.ashx&psig=AOvVaw3kVaEAl-vkF0RasfFCdaSl&ust=1557578896209390";
    String shield;


    public Guerrier(){
        super.protection=shield;
        super.setArme(new Arme());
    }

    @Override
    public String toString() {
        return "Nom du joueur : " + name + "\n" +
                "PV : " + health + "\n" +
                "Power : " + power + "\n" +
                "Dégat arme : " + arme.getDegat() + "\n";
    }
}



