public class Cases {
    private String cas;
    private int nbCases;

    public Cases(String cas, int nbCases) {
        this.cas = cas;
        this.nbCases = nbCases;
    }

    public String getTypeCase() {
        return cas;
    }

    public void setTypeCase(String typeCase) {
        this.cas = typeCase;
    }

    public String toString() {
        return "type : " + cas + "\n" + "case n° : " + nbCases + "\n";
    }
}
