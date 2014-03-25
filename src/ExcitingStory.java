import java.util.Scanner;

/**
 * A class to print a story that will be developed collaboratively.
 * Extend test this test class by adding your literary input near the end of
 * the main method.  For more marks, you can extend the
 * <a href="#sentence">sentence</a> method.
 */
public class ExcitingStory {

    /**
     * Prints a sentence on the program's standard output.
     * For additional marks this method can be improved to
     * wrap the printed words, instead of printing each sentence
     * on a separate line.
     * A further extension can pause after printing each word,
     * in order to make the appear at a speed they can be read aloud.
     *
     * @param s		the sentence to print
     */
    static void sentence(String s) {
		System.out.println(s);
    }

	/**
	 * Function that is used to create a science fiction story.
	 */
    static void tellScienceFictionStory(String newLine) {
		sentence("And suddenly, a biiiiiig light appears in the sky.");
		sentence("Throught this light, two very big eyes were seeing everything!");
		sentence("They were come closer and closer and then...Oh my god...I'm in the universe!");
	}

	/**
	 * Function that is used to create a real story.
	 */
	static void telldifferentStory(String newLine) {
		sentence("the rain fell in torrents ,except at occasional intervals,");
		sentence("when it was checked by a violent gust of wind which ");
		sentence("swept up the streets (for it is in London that our scene lies),");
		sentence("rattling along the housetops,");
		sentence("and fiercely agitating the scanty flame of the lamps ");
		sentence("that struggled against the darkness...\n");
		sentence("And of course... You are in front of your firplace,");
		sentence("safe and sound reading this book again! \n'Paul Clifford'");
	}

	/**
	 * Function that is used to create a horryfying story.
	 */
	static void tellHorrifyingStory(String newLine) {
		sentence("Good for you, cause weather forecast shows that tonight we'll have an equal experience :) .");
	}

	/**
	 * Function that is used to create a happy story.
	 *
	 * @param newLine The line separator String.
	 *
	 */
	static void tellHappyStory(String newLine) {
		Scanner input = new Scanner(System.in);
		String answer;

		sentence("Our proposal is to take a day-off and relax, everything is ok!!!");
		sentence("It doesn't matter if there is a storm outside , you can still sit next to the fireplace and enjoy your hot chocolate.");
		sentence("Suddenly you hear the door bell. Who can it be outside in such a stormy night?");
		sentence("What do you do?" + newLine + "-o.\tYou are curious and you open the door" + newLine + "-i.\tIgnore the bell. Relax and enjoy your chocolate.");

		answer = input.nextLine();

		while (! ( answer.equals("-o") || answer.equals("-i") ) ) {
			sentence("Wrong choice. Your choices are -o or -i. Please try again." + newLine);
			sentence("What do you do?" + newLine + "-o.\tYou are curious and you open the door" + newLine + "-i.\tIgnore the bell. Relax and enjoy your chocolate.");
		}

		reactionToDoorBell(answer , newLine);
	}

	/**
	 * This function is used to inform the reader about the outcome of his reaction to the door bell.
	 *
	 * @param answer The reader's answer.
	 * @param newLine The line separator String.

	 */
	static void reactionToDoorBell(String answer , String newLine) {

		if (answer.equals("-o"))
			sentence("It's a courier." + newLine + "-Congratulations Sir , you have just won 5.000.000$ in the lottery" + newLine + "You can just not believe your luck and you faint...");
		else if (answer.equals("-i"))
			sentence("Great choice! It was your annoying neighboor. He would probably wanted some sugar... for the 25th time this week.");
	}

	/**
	 * Function that is used to create an Adventure story.
	 *
	 * @param newLine The line separator String.
     *
	 */
	static void tellAdventureStory(String newLine) {
		sentence("Suddenly a wolf comes out of the wood" + newLine + "How do you react??" + newLine + "-d.\tRun"+ newLine +"-f.\tFight"+ newLine +"-g.\tCall your mum(mummas little boy) ");

		Scanner scanner = new Scanner(System.in);
		String wolf = scanner.nextLine();

		while (!(wolf.equals("-d") || wolf.equals("-f") || wolf.equals("-g")) ) {
			sentence("You can only Type -d or -f or -g"+newLine+ "Please Try Again");
			wolf = scanner.nextLine();
		}

		reactionToWolfAppearance(wolf);
	}

	/**
	 *	This function is used to inform the reader about the outcome of his choice to the wolf appearance.
	 *
	 *	@param answer The answer of the reader.
	 */
	static void reactionToWolfAppearance(String answer) {

    	String newLine2 = System.getProperty("line.separator");

		if (answer.equals("-d")) {
			String mergeContinuationOfStory="The wolf is faster you die";
		    mergeContinuationOfStory+="\n You wake up and realise it was just a dream ,within a dream ,within a dream...\n so you decide to call DiCaprio to figure out what's going on.";
		    sentence(mergeContinuationOfStory);
		    sentence("  You call DiCaprio but he is on vacation.. So you go hunting ");
	    } else if (answer.equals("-f")) {
		  	Scanner scan = new Scanner(System.in);
			sentence("Choose a weapon from your Bag:"+ newLine2 + "For AK47, choose -h" + newLine2 + "For beretta 92fs, choose -i" + newLine2 + "For Magnum 357, choose -j");

			String weapon = scan.nextLine();

			/* A loop which force the user to insert the correct character ("-h" or "-i" or "-j") */
			while (!(weapon.equals("-h") || weapon.equals("-i") || weapon.equals("-j")) ) {
				sentence("You can only Type -h or -i or -j"+newLine2+ "Please Try Again");
				weapon = scan.nextLine();
			}
			if (weapon.equals("-h"))
				sentence("You kill the wolf by shooting on his head!! Congratulations!! You will survive!! ");
			else if (weapon.equals("-i"))
				 sentence("Oh Noooo!! You just run out of bullets!! But lucky you, the wolf get feared and leave running! ");
			else if (weapon.equals("-j"))
				sentence("You can't shoot the wolf due to a gun engagement.......");
		} else if ( answer.equals("-g")) {
			sentence("Your mum comes out of the woods kicks the wolf and saves you!! You lucky scum.");
			sentence("But, although you survived, a big brown bear is approaching you on your way home!You have to do something!");
			sentence("What are your options? "+newLine2+ "-k.\tGive the bear some honey " +newLine2+ "-l.\tCall Mum, again!!" );

			Scanner scanner = new Scanner(System.in);
			String bear = scanner.nextLine();

			while (!(bear.equals("-k") || bear.equals("-l") )) {
				sentence("You can only type -k or -l "+newLine2+ "Please Try Again");
				bear = scanner.nextLine();
			}
			reactionToBearAppearance(bear);
		}
	}

   /**
	 *	This function is used to inform the reader about the outcome of his choice to the bear appearance.
	 *
	 *	@param answer The answer of the reader.
	 */
	public static void reactionToBearAppearance(String answer) {

		String newLine = System.getProperty("line.separator");

		if (answer.equals("-k")) {
			String continuationOfStory = "The bear seems to like the honey. This could be a good moment to try running away slowly... ";
		    sentence(continuationOfStory);
		} else if (answer.equals("-l")) {
		  	String continuationOfStory = "It's mum's Tee time. You are on your own!! ";
		    sentence(continuationOfStory);
		}
	}

        /**
	 * Function that is used to create a scary story.
	 *
	 * @param newLine The line separator String.
	 *
 	 */
        public static void tellScaryStory(String newLine) {

                sentence("i am home with blackout. darkness is everywhere. ");
        	sentence("Suddenly, i noticed a light from the apartment across the street.");
		sentence("for no reason i started watching this window and something make me feel alone and unprotected.");
	       	sentence("a man appeared behind this window. he was watching the storm. he make me feel scared. it was like he was looking into my eyes. but it is not possibly. he cannot see me. i am in the darkness.");
		sentence("but i can see his look... ");
		sentence("he is talking to someone, who i cannot see.");
		sentence("now he has a spiteful laugh...");
		sentence("a woman appears behind him and makes him a hug.");
	        sentence("she is beautiful. she has long red hair.");
	        sentence("he turns  and put his hands around her neck.");
	        sentence("he strangles her.");
		sentence("she is screaming but nothing sounds.");
		sentence("she falls at the floor. she is dead.");
		sentence("he turns to look at the window and he is happy...");

        }

    public static void main(String[] args) {

		String newLine = System.getProperty("line.separator");
		Scanner scanner = new Scanner(System.in);
		sentence("It was a dark and stormy night.");
                sentence( newLine +"If you were terrified choose -a" + newLine + "If you enjoyed it, choose -b" + newLine + "If you want adventure, choose -c" + newLine + "If you want science fiction, choose -d" + newLine + "If you want a different story, choose -e" + newLine + "If you want a scary story, choose -f");


		/* Initial choice of the reader among Happy, Horryfying, Adventure and Science Fiction Story */

		String m=scanner.nextLine();

		/* A loop which force the user to insert the correct character (-a or -b or -c or -d) */
		while (!(m.equals("-a") || m.equals("-b") || m.equals("-c") || m.equals("-d") || m.equals("-e") || m.equals("-f")) ) {
	        	sentence("You can only Type -a or -b or -c or -d or -e or -f" +newLine+ "Please Try Again");
			m = scanner.nextLine();

                }

	  /* A statement that shows to the user the story depending the choice he made */
		if (m.equals("-a"))
			tellHorrifyingStory(newLine);
		else if (m.equals("-b"))
			tellHappyStory(newLine);
		else if (m.equals("-c"))
			tellAdventureStory(newLine);
		else if (m.equals("-d"))
			tellScienceFictionStory(newLine);
		else if (m.equals("-e"))
		        telldifferentStory(newLine);
		else if (m.equals("-f"))
			tellScaryStory(newLine);
	}
}
