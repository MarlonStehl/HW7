public class App {
    public static void main(String[] args) throws Exception {

        CompositeTeam ChinaWomensTeam = new CompositeTeam(new Teakwondo("Teakwondo-Women", 5, 2), new Waterpolo("Waterpolo-Women", 3, 4), new ArtisticGymnastics("ArtisticGymnastics-Women", 10, 2));
        CompositeTeam ChinaMensTeam = new CompositeTeam();

        CompositeTeam ChinaTeam = new CompositeTeam(ChinaWomensTeam, ChinaMensTeam);

        CompositeTeam AfghanistanTeam = new CompositeTeam();

        CompositeTeam GermanyWomensTeam = new CompositeTeam();
        CompositeTeam GermanyMensTeam = new CompositeTeam();

        CompositeTeam GermanyTeam = new CompositeTeam();

        CompositeTeam ItalyWomensTeam = new CompositeTeam();
        CompositeTeam ItalyMensTeam = new CompositeTeam();

        CompositeTeam ItalyTeam = new CompositeTeam();

        CompositeTeam AsiaTeam = new CompositeTeam(ChinaTeam, AfghanistanTeam);
        CompositeTeam AfricaTeam = new CompositeTeam();
        CompositeTeam EuropeTeam = new CompositeTeam();
        CompositeTeam SouthAmericaTeam = new CompositeTeam();

        DisplayTeams dTeams = new DisplayTeams();

        ChinaWomensTeam.setName("China-Womens-Team");
        ChinaMensTeam.setName("China-Mens-Team");

        ChinaTeam.setName("China-Team");

        AfghanistanTeam.setName("Afghanistan-Team");

        AsiaTeam.setName("Asia-Team");

        AfricaTeam.setName("Africa-Team");

        GermanyWomensTeam.setName("Germany-Womens-Team");
        GermanyMensTeam.setName("Germany-Mens-Team");

        GermanyTeam.setName("Germany-Team");

        ItalyWomensTeam.setName("Italy-Womens-Team");
        ItalyMensTeam.setName("Italy-Mens-Team");

        ItalyTeam.setName("Italy-Team");

        EuropeTeam.setName("Europe-Team");
        
        SouthAmericaTeam.setName("SouthAmerica-Team");

        dTeams.setupTeam(AsiaTeam, AfricaTeam, EuropeTeam, SouthAmericaTeam);

        dTeams.printInfo();

    }
}
