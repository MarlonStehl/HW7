public class Client {
    public static void main(String[] args) throws Exception {

        CompositeTeam ChinaWomensTeam = new CompositeTeam(
            new Teakwondo("Teakwondo-Women", 5, 2), 
            new Waterpolo("Waterpolo-Women", 3, 4), 
            new ArtisticGymnastics("ArtisticGymnastics-Women", 10, 2));
        CompositeTeam ChinaMensTeam = new CompositeTeam(
            new Shooting("Men Shooting", 6, 10)
        );

        CompositeTeam ChinaTeam = new CompositeTeam(ChinaWomensTeam, ChinaMensTeam);

        CompositeTeam AfghanistanTeam = new CompositeTeam();

        CompositeTeam GermanyWomensTeam = new CompositeTeam(
            new Cycling("Women Cycling", 4, 4), 
            new Tennis("Women Tennis", 2, 2)
        );
        CompositeTeam GermanyMensTeam = new CompositeTeam(
            new TableTennis("Men Tabletennis", 1, 5), 
            new Football("Men Football", 20, 4));

        CompositeTeam GermanyTeam = new CompositeTeam(GermanyWomensTeam, GermanyMensTeam);

        CompositeTeam ItalyWomensTeam = new CompositeTeam(
            new AlpineSky("Women Alpine Sky", 2, 5)
        );
        CompositeTeam ItalyMensTeam = new CompositeTeam(
            new Football("Men Football", 20, 2), 
            new SwimmingTeam("Men Swinning", 3, 0)
        );

        CompositeTeam ItalyTeam = new CompositeTeam(ItalyWomensTeam, ItalyMensTeam);

        CompositeTeam AsiaTeam = new CompositeTeam(ChinaTeam, AfghanistanTeam);
        CompositeTeam AfricaTeam = new CompositeTeam();
        CompositeTeam EuropeTeam = new CompositeTeam(GermanyTeam, ItalyTeam);
        CompositeTeam SouthAmericaTeam = new CompositeTeam();

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

        /**
         * Germany Mens Team
         */
        //printNameAndAthlets(GermanyMensTeam);


        /**
         * Germany Name + Number of Gold Medals
         */
        //printNameAndMedals(GermanyTeam);

        /**
         * Asia Name + Number of Gold Medals
         */
        printNameAndMedals(AsiaTeam);

        /**
         * All
         */
        //printNameAndAthlets(AsiaTeam, AfricaTeam, EuropeTeam, SouthAmericaTeam);

    }

    public static void printNameAndAthlets(Team... teams) {
        CompositeTeam OlympicsTeam = new CompositeTeam(teams);
        OlympicsTeam.setName("OLYMPICS 2024");
        OlympicsTeam.printNameAndAthlets();
    }

    public static void printNameAndMedals(Team... teams) {
        CompositeTeam OlympicsTeam = new CompositeTeam(teams);
        OlympicsTeam.setName("OLYMPICS 2024");
        OlympicsTeam.printNameAndMedals();
    }
}
