import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------");
        System.out.println("Choose your own Adventure!");
        System.out.println("    Create your Hero");
        System.out.println("--------------------------");

        String Warrior = "                           ___\n" +
                "                          ( ((\n" +
                "                           ) ))\n" +
                "  .::.                    / /(\n" +
                " 'M .-;-.-.-.-.-.-.-.-.-/| ((::::::::::::::::::::::::::::::::::::::::::::::.._\n" +
                "(J ( ( ( ( ( ( ( ( ( ( ( |  ))   -====================================-      _.>\n" +
                " `P `-;-`-`-`-`-`-`-`-`-\\| ((::::::::::::::::::::::::::::::::::::::::::::::''\n" +
                "  `::'                    \\ \\(\n" +
                "                           ) ))\n" +
                "                          (_((";
        String Archer = ".-'` |___________________________//////\n" +
                "`'-._|                           \\\\\\\\\\\\";
        String Mage = "         |\n" +
                "          |   .\n" +
                "   `.  *  |     .'\n" +
                "     `. ._|_* .'  .\n" +
                "   . * .'   `.  *\n" +
                "-------|     |-------\n" +
                "   .  *`.___.' *  .\n" +
                "      .'  |* `.  *\n" +
                "    .' *  |  . `.\n" +
                "        . |\n" +
                "          | ";
        String Castle = "  / \\               / \\\n" +
                " /   \\             /   \\\n" +
                "(_____)           (_____)\n" +
                " |   |  _   _   _  |   |\n" +
                " | O |_| |_| |_| |_| O |\n" +
                " |-  |          _  | - |\n" +
                " |   |   - _^_     |   |\n" +
                " |  _|    //|\\\\  - |   |\n" +
                " |   |   ///|\\\\\\   |  -|\n" +
                " |-  |_  |||||||   |   |\n" +
                " |   |   |||||||   |-  |\n" +
                " |___|___|||||||___|___|\n" +
                "         (      (\n" +
                "          \\      \\\n" +
                "           )      )\n" +
                "           |      |\n" +
                "           (      (\n" +
                "            \\      \\";
        String Swords = "   .\n" +
                "  / \\\n" +
                "  | |\n" +
                "  | |\n" +
                "  |.|\n" +
                "  |.|\n" +
                "  |:|\n" +
                "  |:|\n" +
                "`--8--'\n" +
                "   8\n" +
                "   O";
        String Axes = "  ,:\\      /:.\n" +
                " //  \\_()_/  \\\\\n" +
                "||   |    |   ||\n" +
                "||   |    |   ||\n" +
                "||   |____|   ||\n" +
                " \\\\  / || \\  //\n" +
                "  `:/  ||  \\;'\n" +
                "       ||\n" +
                "       ||\n" +
                "       XX\n" +
                "       XX\n" +
                "       XX\n" +
                "       XX\n" +
                "       OO\n" +
                "       `'";

        String Fire = "   .(\n" +
                "  /%/\\\n" +
                " (%(%))\n" +
                ".-'..`-.\n" +
                "`-'.'`-'";
        String Ice = "                     *  .  *\n" +
                "                   . _\\/ \\/_ .\n" +
                "                    \\  \\ /  /             .      .\n" +
                "      ..    ..    -==>: X :<==-           _\\/  \\/_\n" +
                "      '\\    /'      / _/ \\_ \\              _\\/\\/_\n" +
                "        \\\\//       '  /\\ /\\  '         _\\_\\_\\/\\/_/_/_\n" +
                "   _.__\\\\\\///__._    *  '  *            / /_/\\/\\_\\ \\\n" +
                "    '  ///\\\\\\  '                           _/\\/\\_\n" +
                "        //\\\\                               /\\  /\\\n" +
                "      ./    \\.             ._    _.       '      '\n" +
                "      ''    ''             (_)  (_)                  <> \\  / <>\n" +
                "                            .\\::/.                   \\_\\/  \\/_/\n" +
                "           .:.          _.=._\\\\//_.=._                  \\\\//\n" +
                "      ..   \\o/   ..      '=' //\\\\ '='             _<>_\\_\\<>/_/_<>_\n" +
                "      :o|   |   |o:         '/::\\'                 <> / /<>\\ \\ <>\n" +
                "       ~ '. ' .' ~         (_)  (_)      _    _       _ //\\\\ _\n" +
                "           >O<             '      '     /_/  \\_\\     / /\\  /\\ \\\n" +
                "       _ .' . '. _                        \\\\//       <> /  \\ <>\n" +
                "      :o|   |   |o:                   /\\_\\\\><//_/\\\n" +
                "      ''   /o\\   ''     '.|  |.'      \\/ //><\\\\ \\/\n" +
                "           ':'        . ~~\\  /~~ .       _//\\\\_\n" +
                "jgs                   _\\_._\\/_._/_      \\_\\  /_/\n" +
                "                       / ' /\\ ' \\                   \\o/\n" +
                "       o              ' __/  \\__ '              _o/.:|:.\\o_\n" +
                "  o    :    o         ' .'|  |'.                  .\\:|:/.\n" +
                "    '.\\'/.'                 .                 -=>>::>o<::<<=-\n" +
                "    :->@<-:                 :                   _ '/:|:\\' _\n" +
                "    .'/.\\'.           '.___/*\\___.'              o\\':|:'/o\n" +
                "  o    :    o           \\* \\ / */                   /o\\\n" +
                "       o                 >--X--<\n" +
                "                        /*_/ \\_*\\\n" +
                "                      .'   \\*/   '.\n" +
                "                            :\n" +
                "                            '";
        String Longbow = "\n" +
                "\n" +
                "                                                       |\n" +
                "                                                        \\.\n" +
                "                                                        /|.\n" +
                "                                                      /  `|.\n" +
                "                                                    /     |.\n" +
                "                                                  /       |.\n" +
                "                                                /         `|.\n" +
                "                                              /            |.\n" +
                "                                            /              |.\n" +
                "                                          /                |.\n" +
                "     __                                 /                  `|.\n" +
                "      -\\                              /                     |.\n" +
                "        \\\\                          /                       |.\n" +
                "          \\\\                      /                         |.\n" +
                "           \\|                   /                           |\\\n" +
                "             \\#####\\          /                             ||\n" +
                "         ==###########>     /                               ||\n" +
                "          \\##==      \\    /                                 ||\n" +
                "     ______ =       =|__/___                                ||\n" +
                " ,--' ,----`-,__ ___/'  --,-`-==============================##==========>\n" +
                "\\               '        ##_______ ______   ______,--,____,=##,__\n" +
                " `,    __==    ___,-,__,--'#'  ==='      `-'              | ##,-/\n" +
                "   `-,____,---'       \\####\\              |        ____,--\\_##,/\n" +
                "       #_              |##   \\  _____,---==,__,---'         ##\n" +
                "        #              ]===--==\\                            ||\n" +
                "        #,             ]         \\                          ||\n" +
                "         #_            |           \\                        ||\n" +
                "          ##_       __/'             \\                      ||\n" +
                "           ####='     |                \\                    |/\n" +
                "            ###       |                  \\                  |.\n" +
                "            ##       _'                    \\                |.\n" +
                "           ###=======]                       \\              |.\n" +
                "          ///        |                         \\           ,|.\n" +
                "          //         |                           \\         |.\n" +
                "                                                   \\      ,|.\n" +
                "                                                     \\    |.\n" +
                "                                                       \\  |.\n" +
                "                                                         \\|.\n" +
                "                                                         /.\n" +
                "                                                        |";
        String Crossbow = "   (\n" +
                "    \\\n" +
                "     )\n" +
                "##-------->        b'ger\n" +
                "     )\n" +
                "    /\n" +
                "   (";

        System.out.println(Castle);



        // Read user input to navigate the story
        Scanner scanner = new Scanner(System.in);

        // Start the story, enter path selection

        System.out.println("What path will you choose? (Choose 1,2, or 3");
        System.out.println("1. Path of the Warrior");
        System.out.println("2. Path of the Mage");
        System.out.println("3. Path of the Archer");
        int answer = scanner.nextInt();
        System.out.println("Your path is: " + answer);

        // start the story, choose path
        if(answer == 1) {
            System.out.println("You have chosen the path of the Warrior");
            System.out.println(Warrior);
            System.out.println("What style of combat would you like to master?");
            System.out.println("1. Swords");
            System.out.println("2. Axes");
            answer = scanner.nextInt();
            System.out.println("You have chosen to master: " + answer);

            //Sword
            if(answer == 1) {
                System.out.println("Training: Sword Mastery");
                System.out.println(Swords);
                System.out.println("You train vigorously, during harsh winters and brutal summers. ");
                System.out.println("You learn to master Swords. You are now a Sword-Master");
                System.out.println("Congratulations! You Have successfully completed your training! ");
                System.exit(0);



            //Axes
            } else if(answer == 2) {
                System.out.println("Training: Axe Master");
                System.out.println(Axes);
                System.out.println("You travel far North to learn from the Viking Warriors");
                System.out.println("After many harsh winters and intense training, you master the Axes.");
                System.out.println("You are now a Great warrior in wielding Battleaxes");
                System.out.println("You Go off into the sunset, a Warrior Legend");
                System.out.println("Congratulations! You Have successfully completed your training! ");
                System.exit(0);

            }
        //Mage
        } else if(answer == 2) {
            System.out.println("You have chosen the path of the Mage");
            System.out.println(Mage);
            System.out.println("What style of combat would you like to master?");
            System.out.println("1. Fire Magic");
            System.out.println("2. Ice Magic");
            answer = scanner.nextInt();
            System.out.println("You have chosen to master: " + answer);

            //Fire mage
            if(answer == 1) {
                System.out.println("Art of Fire");
                System.out.println(Fire);
                System.out.println("You study under a great battle mage to learn the art of Fire.");
                System.out.println("After enduring extreme heat and becoming one with the flame...");
                System.out.println("You are now Trained as a Fire-Mage");
                System.out.println("You use your wisdom and power to protect the people.");
                System.out.println("Congratulations! You Have successfully completed your training! ");
                System.exit(0);
            //Frost Mage
            } else if(answer == 2) {
                System.out.println("Art of Frost");
                System.out.println(Ice);
                System.out.println("You choose the pathy of Ice, therefore live in the highest mountains with Monks.");
                System.out.println("Your teacher is a master of Frost and you learn to endure the extreme cold");
                System.out.println("After learning yourself to conjure Blizzards in battle... ");
                System.out.println("You are now a Frost-Mage");
                System.out.println("You stop enemies in their tracks, freezing them for thousands of years.");
                System.out.println("Congratulations! You Have successfully completed your training! ");
                System.exit(0);



            }
        //Archer
        } else if(answer == 3) {
            System.out.println("You have chosen the path of the Archer");
            System.out.println(Archer);
            System.out.println("What style of combat would you like to master?");
            System.out.println("1. Longbow");
            System.out.println("2. Crossbow");
            answer = scanner.nextInt();
            System.out.println("You have chosen to master: " + answer);
            System.exit(0);

            //Longbow
            if(answer == 1) {
                System.out.println("You have chosen to master the Longbow");
                System.out.println(Longbow);
                System.out.println("You meet a master bowman, who takes you under his wing");
                System.out.println("After snapping yourself with your bowstring, many scars on your forearms..");
                System.out.println("You are able to split an arrow in half at the center of a target");
                System.out.println("You have mastered the bow and arrow.");
                System.out.println("Congratulations! You Have successfully completed your training! ");
                System.exit(0);


            //Crossbow
            } else if(answer == 2) {
                System.out.println("You have chosen to learn the new tech of crossbows");
                System.out.println(Crossbow);
                System.out.println("You meet a great Ranged-Tank warrior who takes you as his disciple");
                System.out.println("They teach you how to wear heavy armor, tanking the heaviest blows...");
                System.out.println("your mastery is in close combat and medium combat styles");
                System.out.println("Your aim is flawless and your defense unbreakable!");
                System.out.println("Congratulations! You Have successfully completed your training! ");
                System.exit(0);
            }
        }
    }
}
