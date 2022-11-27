public class DisplayTeams {

    private Team team;

    public void setupTeam(Team... teams) {
        CompositeTeam OlympicsTeam = new CompositeTeam(teams);
        OlympicsTeam.setName("OLYMPICS 2024");
        this.team = OlympicsTeam;
    }

    public void printInfo() {
        team.printInfo();
    }

}
