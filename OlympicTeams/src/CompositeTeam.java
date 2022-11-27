import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeTeam implements Team {

    private String name;

    private List<Team> children = new ArrayList<>();

    public CompositeTeam(Team... teams) {
        children.addAll(Arrays.asList(teams));
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printNameAndAthlets() {
        System.out.println(name);
        for (Team t : children) {
            t.printNameAndAthlets();
        }
    }

    @Override
    public void printNameAndMedals() {
        System.out.println(name);
        for (Team t : children) {
            t.printNameAndMedals();
        }
    }

}
