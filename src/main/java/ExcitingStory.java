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
     * @param s the sentence to print
     */
    static void sentence(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
            try {
                Thread.currentThread().sleep(65);
            } catch (InterruptedException e) {
                //Do nothing.
            }
        }
        System.out.print(System.getProperty("line.separator"));
    }

    /**
     * Function that is used to create a science fiction story.
     */
    static void tellScienceFictionStory(String newLine) {
        sentence("And suddenly, a biiiiiig light appears in the sky." +
        		newLine + "It was very bright" + newLine + "Throught this light," + 
        		"two very big eyes were seeing everything!" + newLine + "They" + 
        		"were coming closer and closer and then...Oh my god.." +
        		newLine + ".I'm in the universe!" + newLine + "I can see lots" + 
        		"of stars and i am a little overwelmed." + newLine + "I was" +
        		"shocked, in fact" + newLine + "The sounds of creation, were" +
        		"bashing my ears, while an unrecognisable species, started talking to me!");
    }


    /**
	     * Function that is used to create an interesting story.
	     */
	    static void tellInterestingStory(String newLine) {
	        sentence("Suddenly the door opened and John entered his house " +
	        	     "only to find out that the detective was searching his stuff" + newLine +
	        	     "-John I was..How are you..hmm..the detective managed to say" + newLine +
	        	     "-So detective i guess i am one of the suspects now..John laughed" + newLine +
	        	     "-You know John i have to examine all possibilities, the detective replied" + newLine +
	        	     "As i told you, he continued, i want to confirm my final conclusion" + newLine +
	        	     "-So you found out who the murderer is, John asked nervously" + newLine +
	        	     "-I am sure you knew long before i did, John! You won't be surprised.." + newLine +
	        	     "-Why don't you stay for a glass of wine,detective? Since your job here" +
	                 " is done, it's our last chance to have a talk" + newLine +
	                 "The detective was really akward. He just implied that John was the murder" +
			         "and he offered him some wine? \"John has to be the murder,i know it.Don't let him" +
			         "change your mind\" ,he kept telling to himself" + newLine +
			         "You seem to think too much for a simple drink detective,said John as he was" +
			         "serving his glass" + newLine +
			         "Well,i guess i can have a stay a bit." + newLine + "The detective sat comfortably in the sofa," +
	                 "felt a hit on his head and several minutes later woke up tied into a chair" + newLine +
	                 "I knew it was you ,John, I knew it!!Let me go,he screamed" + newLine +
	                 "It was your choice to stay. You where next to my open door, free to leave" + newLine +
	                 "But..but..you offered..Jesus...i knew it was a trap" + newLine +
	                 "Let me ask you something detective? Why don't people trust their instincts?" +
	                 "They sense something is wrong, someone is walking too close behind them..." +
	                 "You knew something was wrong but you came back into the house." + newLine +
	                 "Did I force you, did I drag you in? No. All I had to do was offer you a drink." + newLine +
	                 "You knew how dangerous I am, but you risk your life so you don't offend me" + newLine +
	                 "It's hard to believe that the fear of offending can be stronger than" +
	                 "the fear of pain." + newLine +
	                 "But you know what? It is. And they always come willingly." + newLine +
	                 "And then they sit there. They know it's all over just like you do");

        }


    /**
     * Function that is used to create a real story.
     */
    static void tellDifferentStory(String newLine) {
        sentence("the rain fell in torrents ,except at occasional intervals," +
        		newLine + "when it was checked by a violent gust of wind which " +
        		newLine + "swept up the streets (for it is in London)that our scene " +
        		"lies)," + newLine + "rattling along the housetops," + newLine +
        		"and fiercely agitating the scanty flame of the lamps " + newLine +
        		"that struggled against the darkness..." + newLine + "And of course... " +
        		"You are in front of your firplace," + newLine + "safe and sound reading " +
        		"this book again!" + newLine + "'Paul Clifford'" + newLine + "Yet, you feel " +
        		"it is time, you should close your book and " + newLine + "start playing some Minecraft.");
    }

    /**
     * Function that is used to create a horryfying story.
     */
    static void tellHorrifyingStory(String newLine) {
        sentence("Good for you, cause weather forecast shows that tonight " +
                "we'll have an equal experience :) ." + newLine + "So the " +
        		"horrifing adventure begins. You walk down an isle and you " +
                "see blood running off the walls." + newLine + "Where zombies " +
        		"and vampires collaborate to cease lifeforms that bllom in daylight.");

    }

    /**
     * Function that is used to create a happy story.
     *
     * @param newLine The line separator String.
     */
    static void tellHappyStory(String newLine) {

        sentence("Our proposal is to take a day-off and relax, everything is " +
                "ok!!!" + newLine + "It doesn't matter if there is a storm outside " +
        		", you can still sit next to the fireplace and enjoy your hot " +
                "chocolate." + newLine + "Suddenly you hear the door bell. Who " +
        		"can it be outside in such a stormy night?" + newLine + 
        		"What do you do?" + newLine + "-o.\tYou are curious and you " +
                "open the door" + newLine + "-i.\tIgnore the bell. Relax and " +
                "enjoy your chocolate.");


        Scanner input = new Scanner(System.in); //initializing the scanner class
        String answer = input.nextLine(); //taking input from the keyboard
        // and puttimg it in the variable answer

		/*allowing the user to put as input only '-o' or '-i'*/
        while (!(answer.equals("-o") || answer.equals("-i"))) {
            sentence("You can only Type -o or -i " + newLine + "Please Try " +
                    "Again");
            answer = input.nextLine();
        }


        reactionToDoorBell(answer, newLine);
    }

	/**
	 * Function that is used to create the "Lost in thoughts" story.
	 */
    static void tellLostInThoughtsStory(String newLine) {
        sentence("and you could only hear the rain and the wind." + newLine + 
        		"I couldn't stop thinking about what had just happened. " +
                "Jolene will probably never speak to me again." + newLine + 
                "Of course I deserve it. Yes, yes I certainly deserve it. I " +
                "ruined everything." + newLine + "And then, all these " +
                "rhinoceros around me. Maybe they were " +
                "happier than me, after all they were just animals." + newLine +
                "Maybe I should become a rhinoceros too. Of course then, I " +
                "would lose Jolene forever. Oh God, I don't know what to do." +
                newLine + "I will go home and think about it. Anyway, now I don't have" +
                " much left to keep me happy as a human. Yes definately as a " +
                "rhinoceros I would be happier." + newLine + "Who cares about rhinos???");
    }

	/**
	 * Function that is used to create the Lottery story.
	 */
    static void tellTheLotteryStory(String newLine) {
        sentence("Eric was alone at his home, watching tv." + newLine +
        		"He was very nervous because in less than five minutes the " +
                "results of lottery will be announced." + newLine +
                "Finally the first number was announced. Eric looks at his " +
                "ticket." + newLine + "3! The first number was the same!" + newLine +
                "Suddenly the power went off..." + newLine + "Not now!!!!, " +
                newLine + "Eric screamed. Which are the next numbers?" + newLine +
                "As Eric started to believe that the power will go off all " +
                "night, the tv opened and he saw all the numbers." + newLine +
                "He looked at his ticket and then...I WIN!!! I WIN!!!");

    }

	/**
	 * Function that is used to create the "Eyes wide shut" story.
	 */
    static void tellEyesWideShutStory(String newLine) {
        sentence("I was alone in my bedroom and I closed my eyes. Just for an" +
                " instance.." + newLine + "Suddenly my bedroom disappeared and " +
        		"I was now standing in " + "the middle of a dance hall" + newLine +
        		"Daft Punk was playing in the background and two dozens of " +
                "people were dancing." + newLine + "It wasn't a normal dance, " +
        		"it was more like a ritual. " + "Everyone was loosing his self" +
                "to dance, but only I was about" + " to get lucky." + newLine +
                "Masked men and women all dressed in black exchanged glances" +
                "." + newLine + "No one paid attention to me, it was like I wasn't there, " +
                "when out of the blue a woman's voice echoes in my mind." + newLine +
                "George! The voice screemed again and again." + newLine +
                "And then it hit me! It litterarly hit me. A car went " +
                "through my bedroom window and hit me." + newLine +
                "My girlfriend was sitting right beside me screaming and " +
                "crying. I never oppened my eyes again, I died with a smile " +
                "on my lips");
    }
	/**
	 * Function that is used to create a short story.
	 */
    static void tellShortStory(String newLine) {
        sentence("and that was pretty much it.");

    }

    /**
     * This function is used to inform the reader about the outcome of his
     * reaction to the door bell.
     *
     * @param answer  The reader's answer.
     * @param newLine The line separator String.
     */
    static void reactionToDoorBell(String answer, String newLine) {

        if (answer.equals("-o")) {
            sentence("It's a courier." + newLine + "-Congratulations Sir , " +
                    "you have just won 5.000.000$ in the lottery" + newLine +
                    "You can just not believe your luck and you faint..." + newLine +
                    "You wake up, on the couch, covered with a blanket. The " +
                    "courier sits in a chair next to the fire. What are you " +
                    "going to do?" + newLine + "-y.\t Become friends." +
                    newLine + "-z.\t Say thanks and send him away.");

            Scanner input_x = new Scanner(System.in);//initializing the
            // scanner class
            String your_answer = input_x.nextLine();//taking input from the
            // keyboard and puttimg it in the variable your_answer
            /*allowing the user to put as input only '-y' or '-z'*/
            while (!(answer.equals("-y") || your_answer.equals("-z"))) {
                sentence("You can only Type -y or -z " + newLine + "Please " +
                        "Try Again");
                your_answer = input_x.nextLine();
            }
            reactionToCourier(answer, newLine);
        } else if (answer.equals("-i"))
            sentence("Great choice! It was your annoying neighboor. He would " +
                    "probably wanted some sugar... for the 25th time this " +
                    "week.");
    }

    /**
     * A function that is used to print the outcome of the reaction to the
     * courier
     */
    static void reactionToCourier(String answer, String newLine) {
        if (answer.equals("-y"))
            sentence("You become best friend and travel to Vegas and get " +
                    "married");

        else if (answer.equals("-z"))
            sentence("He is a little disaponted but leaves without causing " +
                    "any problem.");
    }

    /**
     * Function that is used to create a Creepy story.
     */
    static void tellCreepyStory(String newLine) {
        sentence("You are sleeping after a hard day when suddenly you wake up."
                + newLine + "The storm is raging out of your window and the " +
                "room is dark and silent.\nEverything seems normal but you " +
                "feel that something is odd."
                + newLine + "With a small move you open your lamp and you get" +
                " out of your bed.\nAfter scanning the room carefully you " +
                "decide to drink some water to calm down."
                + newLine + "You walk towards the door when suddenly it " +
                "closes with a shrieking sound.\nThe light flickers and goes " +
                "off."
                + newLine + "Ok,now you're scared!How do you react?"
                + newLine + "-a \tGo back to sleep.\nYou are tired enough to " +
                "get worried about some noises and a little breeze!"
                + newLine + "-b \tYou can't just ignore everything,\nyou try " +
                "to open the door so you can investigate further."
                + newLine + "-c \tYou stay still,frozen with fear hoping that" +
                " it was nothing.");

        Scanner scanner = new Scanner(System.in);//initializing the scanner
        // class
        String Reaction1 = scanner.nextLine();//taking input from the
        // keyboard and puttimg it in the variable Reaction1
        /*allowing the user to put as input only '-a' or '-b' or '-c' */
        while (!(Reaction1.equals("-a") || Reaction1.equals("-b") ||
                Reaction1.equals("-c"))) {
            sentence("You can only Type -a or -b or -c" + newLine + "Please " +
                    "Try Again");
            Reaction1 = scanner.nextLine();
        }
        reactionToDoorClosing(Reaction1);
    }


    /**
     * This function is used to inform the reader about the outcome of his
     * choice to the door closing.
     *
     * @param answer The answer of the reader.
     */
    static void reactionToDoorClosing(String answer) {
        String newLineC = System.getProperty("line.separator");//initializing
        // a variable that can be used to get to a new line

        if (answer.equals("-a")) {//checking which answer the user has typed
        // and promting the proper message
            sentence("You close your eyes and open them again after a second" +
                    ".'What's happening?...'"
                    + newLineC + "but before you manage to complete your " +
                    "thoughts you see her.\nAn old woman in a black dress is " +
                    "standing right in front of you!"
                    + newLineC + "when you focus you can see her bloody " +
                    "deformed face\njust a breath away from yours and her " +
                    "pale white eyes staring into yours!"
                    + newLineC + "You try to scream but it's like there is no" +
                    " air in your lungs...\nThe last thing you can feel is " +
                    "your body going numb "
                    + newLineC + "and the last thing you hear is her " +
                    "terrifying voice...I HAVE FOUND YOU!"
                    + newLineC + "After a couple of days a relative visited " +
                    "your house\nbut he didn't find you there."
                    + newLineC + "No one ever found out what happened to that" +
                    " young,kind person\nliving in the house on the cliff...");
        } else if (answer.equals("-b")) {//checking which answer the user has
        // typed and promting the proper message
            sentence("The door opens after a little push.You light a candle " +
                    "and you head downstairs."
                    + newLineC + "You walk down the stairs and into the " +
                    "living room.\nAs you approach the kitchen you notice a " +
                    "movement on your right!"
                    + newLineC + "You turn quickly and your heart loses a " +
                    "beat only to realise you are looking at your mirror."
                    + newLineC + "'I am so stupid' you think.You turn around " +
                    "and open the door to the kitchen when suddenly you hear " +
                    "a cracking sound!"
                    + newLineC + "You turn around slowly and you see the " +
                    "mirror,but this time it is cracked...How did this happen?"
                    + newLineC + "How do you continue?"
                    + newLineC + "-a \tYou approach the mirror to see what " +
                    "caused the crack."
                    + newLineC + "-b \tOk thats it,you are getting out of " +
                    "this place!");

            Scanner scan = new Scanner(System.in);//initializing the scanner
            // class
            String Reaction2 = scan.nextLine();//taking input from the
            // keyboard and puttimg it in the variable Reaction2
                                                                 /*allowing
                                                                 the user to
                                                                 put as input
                                                                  only '-a'
                                                                  or '-b' */
            while (!(Reaction2.equals("-a") || Reaction2.equals("-b"))) {
                sentence("You can only Type -a or -b" + newLineC + "Please " +
                        "Try Again");
                Reaction2 = scan.nextLine();
            }
            reactionToCrackedMirror(Reaction2);
        } else {
            sentence("You don't know how much time passed since the door " +
                    "closed.\nA minute?Two minutes?A year?"
                    + newLineC + "The only thing you know for sure is you " +
                    "have to do something.\nThe moment you decide to move you" +
                    " hear an echoing whisper..."
                    + newLineC + "'I AM COMING FOR YOU...' a moment of " +
                    "silence and then footsteps behind the door!"
                    + newLineC + "-a \tScared like hell you jump out of the " +
                    "window."
                    + newLineC + "-b \tYou remain still,you close your eyes " +
                    "and think 'It's not real...its not real...'");
            Scanner scan = new Scanner(System.in);//initializing the scanner
            // class
            String Reaction2 = scan.nextLine();//taking input from the
            // keyboard and puttimg it in the variable Reaction2
			/*allowing the user to put as input only '-a' or '-b' */
            while (!(Reaction2.equals("-a") || Reaction2.equals("-b"))) {
                sentence("You can only Type -a or -b" + newLineC + "Please " +
                        "Try Again");
                Reaction2 = scan.nextLine();
            }
            reactionToFootsteps(Reaction2, newLineC);
        }

    }


    /**
     * This function continues the creepy story
     *
     * @param answer The answer of the reader.
     */
    static void reactionToFootsteps(String answer, String newline4) {
        if (answer.equals("-a")) {
            sentence("The window breaks with a loud noise\nand you find " +
                    "yourself lying on the wet ground of your garden"
                    + newline4 + "You try to stand up but you feel a sharp " +
                    "pain from your leg."
                    + newline4 + "After gathering all your remaining strength" +
                    " you stand up and start running!"
                    + newline4 + "You run as fast as you can,trying to ignore" +
                    " your pain."
                    + newline4 + "As you run away from your house through the" +
                    " heavy rain\nyou could swear that you heard an old woman" +
                    " screaming but you won't stop."
                    + newline4 + "After some time you reach the nearby village."
                    + newline4 + "You stop,take a deep breath and relax.There" +
                    " are other people there,you are safe..."
                    + newline4 + ".\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\nOr are " +
                    "you?");
        } else {
            sentence("Unfortunately it is real...\nthe door opens and you " +
                    "stand there staring at the terrifying"
                    + newline4 + "figure of an old woman in a black " +
                    "dress floating above the floor."
                    + newline4 + "As you are paralyzed with fear she " +
                    "gets close and touches your chest with her cold " +
                    "hand."
                    + newline4 + "You try to talk but the words " +
                    "refuse to come out."
                    + newline4 + "As you fall into the void you can " +
                    "hear her voice saying 'Your time has come.." +
                    ".emprace the darkness'"
            );
        }
    }


    /**
     * This function continues the creepy story
     *
     * @param answer The answer of the reader.
     */
    static void reactionToCrackedMirror(String answer) {
        String newLineD = System.getProperty("line.separator");//initializing
        // a variable that can be used to get to a new line

        if (answer.equals("-a")) {
            sentence("As you walk towards the mirror,you notice something " +
                    "very strange."
                    + newLineD + "Your reflection on the cracked mirror won't" +
                    " mimic your movement.\nActually it won't move at all!"
                    + newLineD + "It's just standing there...looking at a " +
                    "spot right over your left shoulder..."
                    + newLineD + "You slowly turn your head when you feel a " +
                    "cold hand grasping your neck."
                    + newLineD + "How do you react?"
                    + newLineD + "-a I run as fast as i can and  try to get " +
                    "out."
                    + newLineD + "-b I close my eyes and try to convince " +
                    "myself that everything is in my head");
            Scanner scan1 = new Scanner(System.in);//initializing the scanner
            // class
            String Reaction3 = scan1.nextLine();//taking input from the
            // keyboard and puttimg it in the variable Reaction3

			/*allowing the user to put as input only '-a' or '-b' */
            while (!(Reaction3.equals("-a") || Reaction3.equals("-b"))) {
                sentence("You can only Type -a or -b" + newLineD + "Please " +
                        "Try Again");
                Reaction3 = scan1.nextLine();
            }
            reactionToUnsettlingEvent(Reaction3, newLineD);
        } else {
            happyEnd(newLineD);
        }

    }

    /**
     * This function continues the creepy story
     *
     * @param answer The answer of the reader.
     */
    static void reactionToUnsettlingEvent(String answer, String newlineS) {
        if (answer.equals("-a"))
            happyEnd(newlineS);
        else {
            sentence("You close your eyes but nothing changes."
                    + newlineS + "You understand now that everything is real." +
                    "..but its too late."
                    + newlineS + "You try to move but your body won't react " +
                    "to your will."
                    + newlineS + "The last thing you manage to do is utter a " +
                    "question...'Who are you?'"
                    + newlineS + "\n\n\nI am the fourth horseman...\n\n\n");
        }
    }

	/**
	 * This function continues the creepy story
	 */
    static void happyEnd(String newlineS) {
        sentence("You run as fast as you can,practically breaking the " +
                "entrance door."
                + newlineS + "As you run away from your house through the " +
                "heavy rain\nyou could swear that you heard an old woman " +
                "screaming but you won't stop."
                + newlineS + "After some time you reach the nearby village."
                + newlineS + "You stop,take a deep breath and relax.There are" +
                " other people there,you are safe..."
                + newlineS + ".\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\nOr are you?");
    }


    /**
     * Function that is used to create an Adventure story.
     *
     * @param newLine The line separator String.
     */
    static void tellAdventureStory(String newLine) {
        sentence("Suddenly a wolf comes out of the wood" + newLine + "How do " +
                "you react??" + newLine + "-d.\tRun" + newLine + "-f.\tFight"
                + newLine + "-g.\tCall your mum(mummas little boy) ");

        Scanner scanner = new Scanner(System.in);
        String wolf = scanner.nextLine();
		/* allowing the user to put as input only '-d' or '-f' or '-g'*/
        while (!(wolf.equals("-d") || wolf.equals("-f") || wolf.equals("-g"))) {

            sentence("You can only Type -d or -f or -g" + newLine + "Please " +
                    "Try Again");
            wolf = scanner.nextLine();
        }

        reactionToWolfAppearance(wolf);
    }

    /**
     * This function is used to inform the reader about the outcome of his
     * choice to the wolf appearance.
     *
     * @param answer The answer of the reader.
     */
    static void reactionToWolfAppearance(String answer) {

        String newLine2 = System.getProperty("line.separator");//initializing
        // a variable that can be used to get to a new line

        if (answer.equals("-d")) {
            sentence("The wolf is faster you die" + newLine2 +
            		"You wake up and realise it was just a dream ,within a " +
                    "dream ,within a dream..." + newLine2 +
                    "so you decide to call DiCaprio to figure out what's " +
                    "going on." + newLine2 +
                    "You call DiCaprio but he is on vacation.. So you go " +
                    "hunting " + newLine2 +
                    "But while you are haunting, THE EXACT same wolf attacks" +
                    " you, and chops your FREAKING EAR OFF! ");
        } else if (answer.equals("-f")) {
            Scanner scan = new Scanner(System.in);
            sentence("Choose a weapon from your Bag:" + newLine2 + "-h.\tFor " +
                    "AK47, choose " + newLine2 + "-i.\tFor beretta 92fs, " +
                    "choose " + newLine2 + "-j.\tFor Magnum 357, choose -j");

            String weapon = scan.nextLine();

			/* A loop which force the user to insert the correct character
			("-h" or "-i" or "-j") */
            while (!(weapon.equals("-h") || weapon.equals("-i") || weapon
                    .equals("-j"))) {
                sentence("You can only Type -h or -i or -j" + newLine2 +
                        "Please Try Again");
                weapon = scan.nextLine();
            }
            if (weapon.equals("-h"))
                sentence("You kill the wolf by shooting on his head!! " +
                        "Congratulations!! You will survive!! ");
            else if (weapon.equals("-i"))
                sentence("Oh Noooo!! You just run out of bullets!! But lucky " +
                        "you, the wolf get feared and leave running! ");
            else if (weapon.equals("-j"))
                sentence("You can't shoot the wolf due to a gun engagement..." +
                        "....");
        } else if (answer.equals("-g")) {
            sentence("Your mum comes out of the woods kicks the wolf and " +
                    "saves you!! You lucky scum." + newLine2 +
                    "But, even though you survived, a big brown bear is " +
                    "approaching you on your way home!You have to do " +
                    "something!" + newLine2 +
                    "What are your options? " + newLine2 + "-k.\tGive the " +
                    "bear some honey " + newLine2 + "-d.\tPlay dead " +
                    newLine2 + "-l.\tCall Mum, again!!");

            Scanner scanner = new Scanner(System.in);
            String bear = scanner.nextLine();

            while (!(bear.equals("-k") || bear.equals("-l") || bear.equals
                    ("-d"))) {
                sentence("You can only type -k or -d or -l " + newLine2 +
                        "Please Try Again");
                bear = scanner.nextLine();
            }
            reactionToBearAppearance(bear);
        }

    }

    /**
     * This function is used to inform the reader about the outcome of his
     * choice to the bear appearance.
     *
     * @param answer The answer of the reader.
     */
    public static void reactionToBearAppearance(String answer) {

        String newLine = System.getProperty("line.separator");

        if (answer.equals("-k")) {
            String continuationOfStory = "The bear seems to like the honey. " +
                    "This could be a good moment to try running away slowly.." +
                    ". ";
            sentence(continuationOfStory);
        } else if (answer.equals("-l")) {
            String continuationOfStory = "It's mum's Tee time. You are on " +
                    "your own!! ";
            sentence(continuationOfStory);
        } else if (answer.equals("-d")) {
            String continuationOfStory = "The bear comes near you and smells " +
                    "you. You don't move at all...the bear is stupid and " +
                    "leaves. You survive lucky smartass...";
            sentence(continuationOfStory);
        }


    }

    /**
     * Function that is used to create a scary story.
     *
     * @param newLine The line separator String.
     */
    public static void tellScaryStory(String newLine) {

        sentence("I am home with blackout. darkness is everywhere. " + newLine +
        		"Suddenly, i noticed a light from the apartment across the " +
                "street." + newLine +
                "For no reason i started watching this window and something " +
                "make me feel alone and unprotected." + newLine +
                "A man appeared behind this window." + newLine +
                "he was watching the storm. he make me feel scared. it was " +
                "like he was looking into my eyes." + newLine +
                "But it is not possibly. He cannot see me. I am in the " +
                "darkness." + newLine +
                "But i can see his look... " + newLine +
                "he is talking to someone, who i cannot see." + newLine +
                "Now he has a spiteful laugh..." + newLine +
                "A woman appears behind him and makes him a hug." + newLine +
                "She is beautiful. she has long red hair." + newLine +
                "He turns  and put his hands around her neck." + newLine +
                "He strangles her." + newLine +
                "She is screaming but nothing sounds." + newLine +
                "She falls at the floor. she is dead." + newLine +
                "He turns to look at the window and he is happy..." + newLine +
                "He is happy and high listening to the legend Bob Marley" + newLine +
                "He suddnely starts laughing hysterically, and looks at me " +
                "again!" + newLine +
                "I feel more scared now and I run to the phone to call the " +
                "police!" + newLine +
                "The phone doesn't work..." + newLine +
                "Suddenly I heard a voice behind me." + newLine +
                "The man was at my back with a bloody knife...");
    }


    /**
     * This function is used to inform the reader about a worthtelling story
     *
     * @param newLine The line separator String.
     */
    public static void tellWorthTellingStory(String newLine) {

        sentence("A blind boy sat on the steps of a building with a hat by " +
                "his feet." + newLine +
                "He held up a sign which said: 'I am blind, please help'. " +
                "There were only a few coins in the hat." + newLine +
                "A man was walking by. He took a few coins from his pocket " +
                "and dropped them into the hat. He then took the sign," + newLine +
                "turned it around, and wrote some words." + newLine +
                "He put the sign back so that everyone who walked by would " +
                "see the new words." + newLine +
                "Soon the hat began to fill up. A lot more people were " +
                "giving money to the blind boy." + newLine +
                "That afternoon the man who had changed the sign came to see" +
                " how things were." + newLine +
                "The boy recognized his footsteps and asked, 'Were u the one" +
                " who changed my sign this morning? What did u write?'" + newLine +
                "The man said, 'I only wrote the truth. I said what u said " +
                "but in a different way'." + newLine +
                "What he had written was: 'Today is a beautiful day & I " +
                "cannot see it.' " + newLine +
                "Moral of the Story: " + newLine +
                "Be thankful for what you have." + newLine +
                "Be creative. Be innovative. Think differently and " +
                "positively" +
                ".");

    }


    /**
     * This function is used for readers who get bored easily.
     *
     * @param answer The answer of the reader.
     */
    public static void bored(String newLine) {
        sentence("The end. ");
    }

    /**
     * This function is used to ask the user about his or her reaction after
     * a mysterious event .
     */
    public static void tellScaryNigntStory() {

        Scanner scanner = new Scanner(System.in);//iniiallizing scanner class

        sentence("While you were bicycling suddenly you met an alone, " +
                "exhausted, \nlittle girl in the middle of the road." + newLine +
                "So would you stop to help her?" + newLine +
                "-If you would, press Y" + newLine +
                "-If you would not, press N");

        String m = scanner.nextLine();//taking input from the keyboard
		/*allowing the user to put as input only 'Y' or 'N'*/
        while (!(m.equals("Y") || m.equals("N"))) {
            sentence("You can only type Y or N \n Please Try Again");
            m = scanner.nextLine();
        }
        if (m.equals("Y")) {
            sentence("You are such a kind person!" + newLine +
            		"So you decide to offer her help and put up her to your " +
                    "home for the rest of the" + newLine +
                    "night. You arrive at home and you offer her a warm " +
                    "blanket and a glass of milk." + newLine +
                    "She looks so cute and gentle. After a moment you try to" +
                    " ask her what did" + newLine +
                    "happen and where was her family! But girl's expression " +
                    "suddenly changed " + newLine +
                    "and bursted into tears without telling a world. " +
                    "Concurrently a strong thunder" + newLine +
                    "bursts and the light goes off! After few seconds the " +
                    "light goes on but the girl" + newLine +
                    "disappeared!!" + newLine +
                    "How would you explain this?" + newLine +
                    "1.Did you search into the rooms?" + newLine +
                    "2.Did you pass out? " + newLine +
                    "Please select 1 or 2.");

            m = scanner.nextLine();//taking input from the keyboard
            while (!(m.equals("1") || m.equals("2"))) {
                sentence("You can only type 1 or 2 \n Please Try Again");
                m = scanner.nextLine();
            }
            if (m.equals("1"))
                sentence("It's so point less! You just been hunted by an evil" +
                        " ghost! \nxa xa xa xa xa xa xa xa!!");
            else
                sentence("Lucky for you it was just a dream!");
        } else
            sentence("Bad for you because this girl was the ghost of a witch " +
                    "and she cursed you!");
    }

    /**
     * Function that is used to tell a western story.
     *
     * @param newLine The line separator String.
     */
    public static void tellWesternStory(String newLine) {
        sentence("\"Ahgonagedoo, oosdiggingsuine!!!\" screamed Jake Calhoun;"
                + newLine + "but Doc Holliday, the legendary " +
                "gunfighter/dentist, replied simply," + newLine + "\"Smile " +
                "when you say that, pardner, then swirl and spit out.\"");
    }

    /**
     * Function that is used to tell a twisted story.
     *
     * @param newLine The line separator String.
     */
    public static void tellTwistedStory(String newLine) {
        sentence("Betty had eyes that said come here, lips that said kiss me," +
                " arms and torso that said hold me all night"
                + newLine + "long, but the rest of her body said, \"Fillet " +
                "me, cover me in cornmeal, and fry me in peanut oil\""
                + newLine + "romance wasn't easy for a mermaid.");
    }

    /**
     * Function that is used to create a funny story.
     */
    static void tellFunnyStory(String newLine) {
        sentence("A young student has financial problems and decides to " +
                "prostitute himself in order to address his problem." + newLine +
                "He puts a poster at his entrance, writing:'Young man at " +
                "your service. In bed 50$, on the couch 30$, on the floor " +
                "10$'" + newLine +
                "He waits too nervous and then the bell rings" + newLine +
                "He opens the door and with 'great joy' sees a very old lady" + newLine +
                "'Good morning madam! How could i help you?' he asked, " +
                "hoping that she is not a customer..." + newLine +
                "'I saw your poster' she said and gives him directly 50$" + newLine +
                "'Oh, i see you are very determined! So, do you want to go " +
                "straight to the bedroom?' he asked, not having many options." +
                ".. " + newLine +
                "'Oh, my boy! You misunderstood! I want five times on the " +
                "floor!!! :):):) ");
    }

    /**
     * Function that is used to tell a not so funny story.
     *
     * @param newLine The line separator String.
     */
    public static void tellShortFunnyStory(String newLine) {
        sentence("A nervous old lady on a bus was made even more nervous by " +
                "the fact that the driver periodically took his arm out of " +
                "the window. When she couldn't stand it any longer, she " +
                "tapped him on the shoulder and whispered on his ear: \"" +
                "Young man...you keep both hands on the wheel...I'll tell " +
                "you when it's raining!\" :P ");
    }

    /**
	 * Function that is used to create a cooking story.
	 */
    public static void tellACookingStory(String newLine) {
    	
		sentence("A new day has began, a new cooking adventure!" + newLine +
				"Let's make Easy Nutella Cookies!" + newLine +
				"A very easy recipe with very few ingredients!" + newLine +
				"You will need half a cup nutella, a big egg, a cup of " +
				"self-raising flour and just a pinch of salt." + newLine +
				"You preheat the oven at 190 Celsius." + newLine +
				"In a bowl we gradually mix all ingredients." + newLine +
				"We put non stick baking paper on a pan and with flour " +
				"on our hands we make small cookies." + newLine +
				"We bake for exactly 12 minutes and they are ready!" + newLine +
				"Bon appÃ©tit!" + newLine +
				"Would you like another easy recipe?" + newLine +
				"Press -YES or -NO");

		Scanner typeIn = new Scanner(System.in); //initializing the scanner class
		String answer = typeIn.nextLine(); //taking the keyboard input and assigning it to answer

		/*allowing the user to put as input only '-o' or '-i'*/
	    while (!(answer.equals("-YES") || answer.equals("-NO")))  {
			sentence("Please only type -YES or -NO" +newLine+
					"Try Again!");
			answer = typeIn.nextLine();
		}

		cookOrNot(answer, newLine);
	}

	/**
	 * Function that is used to create a myth story about The Gift of Fire Zeus and Prometheus.
	 */
	static void tellPrometheusMyth(String newLine) {
		sentence("A child was terrified by the storm and because of " +
				"that it could not sleep." + newLine +
				"To make the kid to sleep grandmother start telling" +
				" a story about Prometheus." + newLine +
				"The story begins ..." + newLine +
				"From the very first, humans had trouble with the gods." +
				"Most gods thought of humans as toys." + newLine +
				"But some gods found themselves interested in the human race." +
				"Some gods even made friends with the humans." + newLine +
				"One of those gods was named Prometheus." + newLine +
				"The first people created by the gods lived happily together." +
				"They thought the gods were wonderful." + newLine +
				"But their children were not as grateful or as content." +
				"The children argued among themselves," + newLine +
				"and sometimes even argued with the gods." + newLine +
				"Zeus was very disappointed at mankind." +
				"He decided he was not going to give mankind a most " +
				"important tool - fire!" + newLine +
				"Without fire, humans were not going to last very long." + newLine +
				"Prometheus felt sorry for his human friends." +
				"Fire was important for many things - like heat and cooking, " +
				"and hundreds of others." + newLine +
				"Prometheus stole a lightning bolt from Zeus and gave" +
				"it to mankind. That's when man discovered fire." + newLine +
				"Zeus was furious!!!!" + newLine +
				"He ordered Prometheus chained to a rock as punishment" +
				"for stealing his lightning bolt, and for going behind" +
				"his back to help the humans." + newLine +
				"To make Prometheus even more miserable, Zeus sent storms" +
				"to beat angry waves against Prometheus, helplessly chained to his rock." + newLine +
				"Zeus made the sun shine really brightly now and then to burn his skin." +
				"Zeus even sent an eagle to nibble at poor Prometheus' body." + newLine +
				"It was quite a punishment for a god who had only tried to help mankind." +
				"But he had defied Zeus, and that was what made Zeus so angry." + newLine +
				"It was Hercules who finally released the helpless god from his chains." + newLine +
				"By the time Hercules saved him, nearly a thousand years had passed." +
				"That's probably not a lot of time if you happen to be immortal." + newLine +
				"But humans had changed a great deal over 1000 years." +
				"By then, Zeus found humans quite entertaining." + newLine +
				"Zeus no longer cared if anyone rescued Prometheus or not." + newLine +
				"After the end of the story the kid was closed its eyes and slept");
    }

    /**
     * Function that is used to create Java song.
     */
		static void tellJavaSong(String newLine){
				sentence( "This is a song called 'The Java Life'"
				+ newLine + "In the cubicles representin’ for my JAVA homies…"
				+ newLine + "In by nine, out when the deadlines are met, check it."
				+ newLine + "We code hard in these cubicles"
				+ newLine + "My style’s nerd-chic, I’m a programmin’ freak"
				+ newLine + "We code hard in these cubicles"
				+ newLine + "Only two hours to your deadline? Don’t sweat my technique."
				+ newLine + "Sippin’ morning coffee with that JAVA swirl."
				+ newLine + "Born to code; my first words were “Hello World"
				+ newLine + "Since 95, been JAVA codin’ stayin’ proud"
				+ newLine + "Started on floppy disks, now we take it to the cloud."
				+ newLine + "On my desktop, JAVA’s what’s bobbin’ and weavin’"
				+ newLine + "We got another winning app before I get to OddEven."
				+ newLine + "Blazin’ code like a forest fire, climbin’ a tree"
				+ newLine + "Setting standards like I Triple E…."
				+ newLine + "Boot it on up, I use the force like Luke,"
				+ newLine + "Got so much love for my homeboy Duke."
				+ newLine + "GNU Public Licensed, it’s open source,"
				+ newLine + "Stop by my desk when you need a crash course"
				+ newLine + "Written once and my script runs anywhere,"
				+ newLine + "Straight thuggin’, mean muggin’ in my Aeron chair."
				+ newLine + "All the best lines of code, you know I wrote ‘em"
				+ newLine + "I’ll run you out of town on your dial-up modem."
				+ newLine + "‘Cause…"
				+ newLine + "We code hard in these cubicles"
				+ newLine + "Me and my crew code hyphy hardcore"
				+ newLine + "We code hard in these cubicles"
				+ newLine + "It’s been more than 10 years since I’ve seen the 404."
				+ newLine +	"Inheriting a project can make me go beeee-serk"
				+ newLine + "Ain’t got four hours to transfer their Framework."
				+ newLine + "The cleaners killed the lights, Man, that ain’t nice,"
				+ newLine + "Gonna knock this program out, just like Kimbo Slice"
				+ newLine + "I program all night, just like a champ,"
				+ newLine + "Look alive under this IKEA lamp."
				+ newLine + "I code HARDER in the midnight hour,"
				+ newLine + "E7 on the vending machine fuels my power."
				+ newLine + "Ps3 to Smartphones, our code use never ends,"
				+ newLine + "JAVA’s there when I beat you in “Words with Friends”."
				+ newLine + "My developing skills are so fresh please discuss,"
				+ newLine + "You better step your game up on that C++.   "
				+ newLine +	"We know better than to use Dot N-E-T,"
				+ newLine + "Even Dan Brown can’t code as hard as me."
				+ newLine + "You know JAVA’s gettin’ bigger, that’s a promise not a threat,"
				+ newLine + "Let me code it on your brain"
				+ newLine + "so you’ll never forget."
				+ newLine + "We code hard in these cubicles,"
				+ newLine + "it’s the core component…of what we implement."
				+ newLine + "We code hard in these cubicles,"
				+ newLine + "Straight to your JAVA Runtime Environment."
				+ newLine + "We code hard in these cubicles,"
				+ newLine + "Keep the syntax light and the algorithm tight."
				+ newLine + "We code hard in these cubicles,"
				+ newLine + "Gotta use JAVA if it’s gonna run right."
				+ newLine + "We code hard in these cubicles"
				+ newLine + "JAVA keeps adapting, you know it’s built to last."
				+ newLine + "We code hard in these cubicles,"
				+ newLine + "Robust and secure, so our swag’s on blast"
				+ newLine + "CODE HARD");
	}



	/**
	 * This function is used to inform the reader about the outcome of his reaction to cook again or not.
	 *
	 * @param answer The reader's answer.
	 * @param newLine The line separator String.
	 *
	 */
	static void cookOrNot(String answer , String newLine) {

	    if (answer.equals("-YES")) {
	    	
		    sentence("Let's make delicious pancakes!" + newLine +
		    		"You will need 3/4 cup of milk, 2 tablespoons of " +
		    		"olive oil, 1 egg, 1 cup of flour," + newLine +  
					"2 tablespoons baking powder, 2 tablespoons of " +
		    		"sugar and a pinch of salt." + newLine +
		    		"We gradually mix the ingredients in a bowl." + newLine +
		    		"We apply some butter on a frying pan and pour two " +
		    		"tablespoons of our mix." + newLine +
		    		"We let it bake for 1-2 minutes until the surface has " +
		    		"little holes. We turn down the heat" + newLine +
					"so that out next pancakes will not burn." + newLine +
					"We turn the pancake on the other side, to bake for " +
					"1 minute, as well." + newLine +
					"In the end we can serve our fresh, hot pancakes with " +
					"maple syrup or ingredient of our choice!" + newLine +
					"Enjoy!");
		    
		}
		else if (answer.equals("-NO"))
			sentence("Have a nice day and enjoy your nutella cookies!");
	}


    /**
     * main method
     */
    public static void main(String[] args) {

        String newLine = System.getProperty("line.separator");
        Scanner scanner = new Scanner(System.in);
        String b = "-yes";
        while (b.equals("-yes")) {

            sentence("It was a dark and stormy night." + newLine +
            		"How was your stormy night?" + newLine + "If you were " +
                    "terrified choose -a" + newLine + "If you enjoyed it, " +
                    "choose -b" + newLine + "If you want adventure, choose -c"
                    + newLine + "If you want science fiction, choose -d" +
                    newLine + "If you want a different story, choose -e" +
                    newLine + "If you want a scary story, choose -f"
                    
                    + newLine + "If you want a creepy story, choose -g" + newLine + 
                    "If you want to know what I think about this night, choose -h"
                    + newLine + "If you don't care that is a dark night and just want " +
                    "to read the worthTellingStory, choose -i" + newLine + "if you are bored to read a story, choose -j"
                    + newLine + "if you want to read a breathtaking story, choose -k" + newLine + 
                    "if you want to read a short story, choose -l"
                    + newLine + "If you decided to go for a commonly walk by your bike, choose -m" + newLine + 
                    "If you want a lottery story, choose -n"
                    + newLine + "If you want to read a western story , choose -o" + newLine + 
                    "If you want to read a twisted story , choose -p" + newLine + 
                    "If you want to read a funny story , choose -q"
					+ newLine + "If you want to cook delicious treats then, choose -s");

			/* Initial choice of the reader among Happy, Horryfying, Adventure and Science Fiction Story */

            String m = scanner.nextLine();

			/* A loop which force the user to insert the correct character (-a or -b or -c or -d) */
            while (!(m.equals("-a") || m.equals("-b") || m.equals("-c") || m.equals("-d") || m.equals("-e")
                    || m.equals("-f") || m.equals("-g") || m.equals("-h") || m.equals("-i") || m.equals("-j")
                    || m.equals("-k") || m.equals("-l") || m.equals("-m") || m.equals("-n") || m.equals("-o")
                    || m.equals("-p") || m.equals("-q") || m.equals("-s") || m.equals("-t") || m.equals("-u") || m.equals("-v"))) {
                sentence("You can only Type -a or -b or -c or -d or -e or -f or -g or -h or -i or -j or -k or -l or -m or -n or -o or -p or -q or -s or -t or -u or -v" + newLine + "Please Try Again");


                m = scanner.nextLine();

            }

	 		/* A statement that shows to the user the story depending the choice he made */
            if (m.equals("-a"))
                tellHappyStory(newLine);
            else if (m.equals("-b"))
                tellHorrifyingStory(newLine);
            else if (m.equals("-c"))
                tellAdventureStory(newLine);
            else if (m.equals("-d"))
                tellScienceFictionStory(newLine);
            else if (m.equals("-e"))
                tellDifferentStory(newLine);
            else if (m.equals("-f"))
                tellScaryStory(newLine);
            else if (m.equals("-g"))
                tellCreepyStory(newLine);
            else if (m.equals("-h"))
                tellLostInThoughtsStory(newLine);
            else if (m.equals("-i"))
                tellWorthTellingStory(newLine);
            else if (m.equals("-j"))
                bored(newLine);
            else if (m.equals("-k"))
                tellEyesWideShutStory(newLine);
            else if (m.equals("-l"))
                tellShortStory(newLine);
            else if (m.equals("-m"))
                tellScaryNigntStory();
            else if (m.equals("-n"))
                tellTheLotteryStory(newLine);
            else if (m.equals("-o"))
                tellWesternStory(newLine);
            else if (m.equals("-p"))
                tellTwistedStory(newLine);
            else if (m.equals("-q"))
                tellFunnyStory(newLine);
            else if (m.equals("-r"))
                tellShortFunnyStory(newLine);
			else if (m.equals("-s"))
				tellACookingStory(newLine);
			else if (m.equals("-t"))
				tellPrometheusMyth(newLine);
			else if (m.equals("-u"))
				tellInterestingStory(newLine);
			else if (m.equals("-v"))
				tellJavaSong(newLine);

            sentence(newLine + "Would you like to read another story? Answer -yes or -no");
            b = scanner.nextLine();
			/* a loop that takes as input from the user only '-yes' or '-no'*/
            while (!((b.equals("-yes")) || (b.equals("-no")))) {
                sentence("You can only type -yes or -no" + newLine + "Please Try Again");
                b = scanner.nextLine();
            }
        }
    }
}

