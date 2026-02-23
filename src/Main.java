import java.util.Scanner;

public class Lab1MadLibs {
    public static void main(String[] args) {
        System.out.println("MadLibs Lab1 For Fun");
        System.out.println();

        //Read in 7 Nouns from user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me a noun: ");
        String noun1 = scanner.nextLine();
        System.out.println("noun1 value: " + noun1);

        System.out.println("Please give me another noun: ");
        String noun2 = scanner.nextLine();
        System.out.println("noun2 value: " + noun2);

        System.out.println("Please give me another noun: ");
        String noun3 = scanner.nextLine();
        System.out.println("noun3 value: " + noun3);

        System.out.println("Please give me another noun: ");
        String noun4 = scanner.nextLine();
        System.out.println("noun4 value: " + noun4);

        System.out.println("Please give me another noun: ");
        String noun5 = scanner.nextLine();
        System.out.println("noun5 value: " + noun5);

        System.out.println("Please give me another noun: ");
        String noun6 = scanner.nextLine();
        System.out.println("noun6 value: " + noun6);

        System.out.println("Please give me another noun: ");
        String noun7 = scanner.nextLine();
        System.out.println("noun7 value: " + noun7);

        // Get 7 Verbs
        System.out.println("Please give me another verb: ");
        String verb1 = scanner.nextLine();
        System.out.println("verb1 is: " + verb1);

        System.out.println("Please give me another verb: ");
        String verb2 = scanner.nextLine();
        System.out.println("verb2 is: " + verb2);

        System.out.println("Please give me another verb: ");
        String verb3 = scanner.nextLine();
        System.out.println("verb3 is: " + verb3);

        System.out.println("Please give me another verb: ");
        String verb4 = scanner.nextLine();
        System.out.println("verb4 is: " + verb4);

        System.out.println("Please give me another verb: ");
        String verb5 = scanner.nextLine();
        System.out.println("verb5 is: " + verb5);

        System.out.println("Please give me another verb: ");
        String verb6 = scanner.nextLine();
        System.out.println("verb6 is: " + verb6);

        System.out.println("Please give me another verb: ");
        String verb7 = scanner.nextLine();
        System.out.println("verb7 is: " + verb7);

        // Get 7 Adjectives
        System.out.println("Please give me an adjective:" );
        String adjective1 = scanner.nextLine();
        System.out.println("adjective 1 is: " + adjective1);

        System.out.println("Please give me another adjective:" );
        String adjective2 = scanner.nextLine();
        System.out.println("adjective 2 is: " + adjective2);

        System.out.println("Please give me another adjective:" );
        String adjective3 = scanner.nextLine();
        System.out.println("adjective 3 is: " + adjective3);

        System.out.println("Please give me another adjective:" );
        String adjective4 = scanner.nextLine();
        System.out.println("adjective 4 is: " + adjective4);

        System.out.println("Please give me another adjective:" );
        String adjective5 = scanner.nextLine();
        System.out.println("adjective 5 is: " + adjective5);

        System.out.println("Please give me another adjective:" );
        String adjective6 = scanner.nextLine();
        System.out.println("adjective 6 is: " + adjective6);

        System.out.println("Please give me another adjective:" );
        String adjective7 = scanner.nextLine();
        System.out.println("adjective 7 is: " + adjective7);

        // Create The MadLib now
        System.out.println("One evening, a(n) " + adjective1 + " mage wandered into the ancient " + noun1 + ", unaware");
        System.out.println("of the power hidden within him. He began to " + verb1 + " through the " + adjective2 + " halls,");
        System.out.println("holding a glowing " + noun2 + ". Suddenly, the air began to " + verb2 + " as a(n)");
        System.out.println(adjective3 + "spirit emerged from a floating " + noun3 + ". The mage felt " + adjective4 + " and");
        System.out.println("tried to " + verb3 + ", but his " + noun4 + " pulsed with energy. He raised a(n) " + adjective5 + " hand");
        System.out.println("and began to " + verb4 + ", causing a swirl of light to form around a nearby " + noun5 + ". A(n)");
        System.out.println(adjective6 + " voice echoed as the spirit began to " + verb5 + " through the chamber.");
        System.out.println("The mage grabbed his " + noun6 + " and chose to " + verb6 + " forward instead of running. ");
        System.out.println("With a final " + adjective7 + " surge of power, he " + verb7 + " toward the ancient " + noun7 + ", unlocking");
        System.out.println(" the magic that had always lived inside him.");


    }
}
