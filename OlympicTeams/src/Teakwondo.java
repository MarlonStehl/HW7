public class Teakwondo extends Discipline {

    private String name;
    private int numAthletes, numGoldMedals;

    public Teakwondo(String name, int numAthletes, int numGoldMedals) {
        this.name = name;
        this.numAthletes = numAthletes;
        this.numGoldMedals = numGoldMedals;
    }

    @Override
    public void printInfo() {
        System.out.println("Team: " + name + ", Number of Athletes: " + numAthletes + ", Number of Gold Medals: " + numGoldMedals);
    }

}
