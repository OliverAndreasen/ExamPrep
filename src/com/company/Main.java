package com.company;

public class Main {

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String CYAN_BOLD = "\033[1;36m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        // write your code here

        // Opgave 1
        System.out.println(ANSI_BLACK_BACKGROUND + CYAN_BOLD + "Opgave 1" + ANSI_RESET);
        System.out.println();

        Keyword keyword = new Keyword("Apple", "An eatable object");
        System.out.println(keyword.matches("Apple"));
        keyword.addRelatedKeyword("Pear");
        keyword.addRelatedKeyword("Orange");
        System.out.println(keyword);
        keyword.removeRelatedKeyword("Pear");
        System.out.println(keyword);

        // Opgave 2
        System.out.println();
        System.out.println(ANSI_BLACK_BACKGROUND + CYAN_BOLD + "Opgave 2" + ANSI_RESET);
        System.out.println();

        RaffleCup raffleCup = new RaffleCup(4);
        System.out.println(raffleCup.shake());
        System.out.println(raffleCup.lastShake());

        //Opgave 3
        System.out.println(ANSI_BLACK_BACKGROUND + CYAN_BOLD + "Opgave 3" + ANSI_RESET);
        System.out.println();

        Card card1 = new Card("Hearts", 1);
        Card card2 = new Card("Diamonds", 12);

        System.out.println(card1.beatsToString(card2));

        // Opgave 4
        System.out.println();
        System.out.println(ANSI_BLACK_BACKGROUND + CYAN_BOLD + "Opgave 4" + ANSI_RESET);
        System.out.println();

        Names name = new Names("FeliciaAliyaMcfadden");
        System.out.println(name);

        // Opgave 5
        System.out.println();
        System.out.println(ANSI_BLACK_BACKGROUND + CYAN_BOLD + "Opgave 5" + ANSI_RESET);
        System.out.println();

        DateAgeCalculator dateAgeCalculator = new DateAgeCalculator(27,21);
        System.out.println("Lowest age: " + dateAgeCalculator.lowestAge());
        System.out.println("Is your date old enough: " + dateAgeCalculator.dateIsOldEnough());
        System.out.println(dateAgeCalculator);

        // Opgave 6
        System.out.println();
        System.out.println(ANSI_BLACK_BACKGROUND + CYAN_BOLD + "Opgave 6" + ANSI_RESET);
        System.out.println();

        MotherBoard motherboard = new MotherBoard();
        System.out.println(motherboard);
        SataDrive drive1 = new SataDrive("Barracuda");
        SataDrive drive2 = new SataDrive("Western Digital");
        SataDrive drive3 = new SataDrive("Toshiba");
        SataDrive drive4 = new SataDrive("Hitachi");
        SataDrive drive5 = new SataDrive("Max Digital Data");

        System.out.println(motherboard.addSataDrive(drive1));
        System.out.println(motherboard.addSataDrive(drive2));
        System.out.println(motherboard.addSataDrive(drive3));
        System.out.println(motherboard.addSataDrive(drive4));
        System.out.println(motherboard);
        System.out.println(motherboard.addSataDrive(drive5));

        System.out.println(motherboard.removeSataDrive(drive4));
        System.out.println(motherboard);

        System.out.println(motherboard.addSataDrive(drive5));
        System.out.println(motherboard);

    }
}
