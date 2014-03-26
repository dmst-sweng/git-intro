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
		sentence("It was very bright");
		sentence("Throught this light, two very big eyes were seeing everything!");
		sentence("They were coming closer and closer and then...Oh my god...I'm in the universe!");
		sentence ("I can see lots of stars and i am a little overwelmed.");
		sentence("I was shocked, in fact");
		sentence("The sounds of creation, were bashing my ears, while an unrecognisable species, started talking to me!");
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
		sentence("Yet, you feel it is time, you should close your book and start playing some Minecraft.");
	}

	/**
	 * Function that is used to create a horryfying story.
	 */
	static void tellHorrifyingStory(String newLine) {
		sentence("Good for you, cause weather forecast shows that tonight we'll have an equal experience :) .");

		sentence ("So the horrifing adventure begins. You walk down an isle and you see blood running off the walls.");
		sentence("Where zombies and vampires collaborate to cease lifeforms that bllom in daylight.");

	}

	/**
	 * Function that is used to create a happy story.
	 *
	 * @param newLine The line separator String.
	 *
	 */
	static void tellHappyStory(String newLine) {

		sentence("Our proposal is to take a day-off and relax, everything is ok!!!");
	    sentence("It doesn't matter if there is a storm outside , you can still sit next to the fireplace and enjoy your hot chocolate.");
		sentence("Suddenly you hear the door bell. Who can it be outside in such a stormy night?");
		sentence("What do you do?" + newLine + "-o.\tYou are curious and you open the door" + newLine + "-i.\tIgnore the bell. Relax and enjoy your chocolate.");



		Scanner input = new Scanner(System.in);
		String answer = input.nextLine();


        while (!(answer.equals("-o") || answer.equals("-i")))  {
			sentence("You can only Type -o or -i "+newLine+ "Please Try Again");
			answer = input.nextLine();
		}




		reactionToDoorBell(answer , newLine);
	}


	static void lostInThoughts(String newLine) {
		sentence("and you could only hear the rain and the wind.");
		sentence("I couldn't stop thinking about what had just happened. Jolene will probably never speak to me again.");
		sentence("Of course I deserve it. Yes, yes I certainly deserve it. I ruined everything.");
		sentence("And then, all these rhinoceros around me. Maybe they were happier than me, after all they were just animals.");
		sentence("Maybe I should become a rhinoceros too. Of course then, I would lose Jolene forever. Oh God, I don't know what to do.");
		sentence("I will go home and think about it. Anyway, now I don't have much left to keep me happy as a human. Yes definately as a rhinoceros I would be happier.");
		sentence("Who cares about rhinos???");
	}



	/**
	 * This function is used to inform the reader about the outcome of his reaction to the door bell.
	 *
	 * @param answer The reader's answer.
	 * @param newLine The line separator String.

	 */
	static void reactionToDoorBell(String answer , String newLine) {

		if (answer.equals("-o")) {
			sentence("It's a courier." + newLine + "-Congratulations Sir , you have just won 5.000.000$ in the lottery" + newLine + "You can just not believe your luck and you faint...");
			sentence("You wake up, on the couch, covered with a blanket. The courier sits in a chair next to the fire. What are you going to do?" + newLine + "-y.\t Become friends." + newLine + "-z.\t Say thanks and send him away.");

			Scanner input_x = new Scanner(System.in);
			String your_answer = input_x.nextLine();

			while (!(answer.equals("-y") || answer.equals("-z")))  {
				sentence("You can only Type -y or -z "+newLine+ "Please Try Again");
				your_answer = input_x.nextLine();
			}
			reactionToCourier(answer , newLine);
		}
		else if (answer.equals("-i"))
			sentence("Great choice! It was your annoying neighboor. He would probably wanted some sugar... for the 25th time this week.");
	}

	/**
	  * Funktion that is used to print the outcome of the reaction to the courier
	  */

	static void reactionToCourier(String answer , String newLine) {
		if (answer.equals("-y"))
			sentence("You become best friend and travel to Vegas and get married");

		else if (answer.equals("-z"))
			sentence("He is a little disaponted but leaves without causing any problem.");
		}
           /**
		   	 * Function that is used to create a Creepy story.
		   	 */
		       static void tellCreepyStory(String newLine) {
		           sentence("You are sleeping after a hard day when suddenly you wake up."
		           + newLine + "The storm is raging out of your window and the room is dark and silent.\nEverything seems normal but you feel that something is odd."
		           + newLine + "With a small move you open your lamp and you get out of your bed.\nAfter scanning the room carefully you decide to drink some water to calm down."
		           + newLine +"You walk towards the door when suddenly it closes with a shrieking sound.\nThe light flickers and goes off."
		           + newLine +"Ok,now you're scared!How do you react?"
		           + newLine +"-a \tGo back to sleep.\nYou are tired enough to get worried about some noises and a little breeze!"
		           + newLine +"-b \tYou can't just ignore everything,\nyou try to open the door so you can investigate further."
		           + newLine +"-c \tYou stay still,frozen with fear hoping that it was nothing.");

		           Scanner scanner = new Scanner(System.in);
		   		String Reaction1 = scanner.nextLine();

		   		while (!(Reaction1.equals("-a") || Reaction1.equals("-b") || Reaction1.equals("-c")) ) {
		   					sentence("You can only Type -a or -b or -c"+newLine+ "Please Try Again");
		   			Reaction1 = scanner.nextLine();
		   	           }
		   	           reactionToDoorClosing(Reaction1);
		   		   }


		              /**
		   		 	 *	This function is used to inform the reader about the outcome of his choice to the door closing.
		   		 	 *
		   		 	 *	@param answer The answer of the reader.
		   	         */
		            static void reactionToDoorClosing(String answer){
		   			 String newLineC = System.getProperty("line.separator");

		                   if (answer.equals("-a")){
		   				sentence("You close your eyes and open them again after a second.'What's happening?...'"
		   				+newLineC+"but before you manage to complete your thoughts you see her.\nAn old woman in a black dress is standing right in front of you!"
		   				+newLineC+"when you focus you can see her bloody deformed face\njust a breath away from yours and her pale white eyes staring into yours!"
		   				+newLineC+"You try to scream but it's like there is no air in your lungs...\nThe last thing you can feel is your body going numb "
		   				+newLineC+"and the last thing you hear is her terrifying voice...I HAVE FOUND YOU!"
		   				+newLineC+"After a couple of days a relative visited your house\nbut he didn't find you there."
		   				+newLineC+"No one ever found out what happened to that young,kind person\nliving in the house on the cliff..."
		   				);}
		   			else if (answer.equals("-b")){
		   				 sentence("The door opens after a little push.You light a candle and you head downstairs."
		   				 +newLineC+"You walk down the stairs and into the living room.\nAs you approach the kitchen you notice a movement on your right!"
		   				 +newLineC+"You turn quickly and your heart loses a beat only to realise you are looking at your mirror."
		   				 +newLineC+"'I am so stupid' you think.You turn around and open the door to the kitchen when suddenly you hear a cracking sound!"
		   				 +newLineC+"You turn around slowly and you see the mirror,but this time it is cracked...How did this happen?"
		   				 +newLineC+"How do you continue?"
		                 +newLineC+"-a \tYou approach the mirror to see what caused the crack."
		                 +newLineC+"-b \tOk thats it,you are getting out of this place!"
		   				 );

		   				  Scanner scan = new Scanner(System.in);
		   				 		String Reaction2 = scan.nextLine();

		   				 		while (!(Reaction2.equals("-a") || Reaction2.equals("-b")) ) {
		   				 			sentence("You can only Type -a or -b"+newLineC+ "Please Try Again");
		   				 			Reaction2 = scan.nextLine();
		   	                   }
		                       ReactionToCrackedMirror(Reaction2);
		   				 }
		   			else{
		   				sentence("You don't know how much time passed since the door closed.\nA minute?Two minutes?A year?"
		   				+newLineC+"The only thing you know for sure is you have to do something.\nThe moment you decide to move you hear an echoing whisper..."
		   				+newLineC+"'I AM COMING FOR YOU...' a moment of silence and then footsteps behind the door!"
		   				+newLineC+"-a \tScared like hell you jump out of the window."
		                +newLineC+"-b \tYou remain still,you close your eyes and think 'It's not real...its not real...'"
		   				);
		   				             Scanner scan = new Scanner(System.in);
		   							  String Reaction2 = scan.nextLine();

		   								 		while (!(Reaction2.equals("-a") || Reaction2.equals("-b")) ) {
		   								 			sentence("You can only Type -a or -b"+newLineC+ "Please Try Again");
		   								 			Reaction2 = scan.nextLine();
		   					                   }
		                       ReactionToFootsteps(Reaction2,newLineC);
		   			}

		   		 }



		                       /**
		   					 *	This function continues the creepy story
		   					 *
		   					 *	@param answer The answer of the reader.
		   	                 */
		              static void ReactionToFootsteps(String answer,String newline4){
		   			   if (answer.equals("-a")){
		   			   sentence("The window breaks with a loud noise\nand you find yourself lying on the wet ground of your garden"
		   			   +newline4+"You try to stand up but you feel a sharp pain from your leg."
		   			   +newline4+"After gathering all your remaining strength you stand up and start running!"
		   			   +newline4+"You run as fast as you can,trying to ignore your pain."
		   			   +newline4+"As you run away from your house through the heavy rain\nyou could swear that you heard an old woman screaming but you won't stop."
		   			   +newline4+"After some time you reach the nearby village."
		   			   +newline4+"You stop,take a deep breath and relax.There are other people there,you are safe..."
		   			   +newline4+".\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\nOr are you?");
		   			   }
		   			   else{
		   			   sentence("Unfortunately it is real...\nthe door opens and you stand there staring at the terrifying"
		   			   +newline4+"figure of an old woman in a black dress floating above the floor."
		   			   +newline4+"As you are paralyzed with fear she gets close and touches your chest with her cold hand."
		   			   +newline4+"You try to talk but the words refuse to come out."
		   			   +newline4+"As you fall into the void you can hear her voice saying 'Your time has come...emprace the darkness'"
		   			   );
		   			      }
		   		        }





		   		            /**
		   		 		 	 *	This function continues the creepy story
		   		 		 	 *
		   		 		 	 *	@param answer The answer of the reader.
		   	                 */
		   		 static void ReactionToCrackedMirror(String answer){
		   		 String newLineD = System.getProperty("line.separator");

		   		 if (answer.equals("-a")){
		   		 	sentence("As you walk towards the mirror,you notice something very strange."
		   			+newLineD+"Your reflection on the cracked mirror won't mimic your movement.\nActually it won't move at all!"
		   			+newLineD+"It's just standing there...looking at a spot right over your left shoulder..."
		   			+newLineD+"You slowly turn your head when you feel a cold hand grasping your neck."
		   			+newLineD+"How do you react?"
		   			+newLineD+"-a I run as fast as i can and  try to get out."
		   			+newLineD+"-b I close my eyes and try to convince myself that everything is in my head"
		   				);
		   				Scanner scan1 = new Scanner(System.in);
		   				String Reaction3 = scan1.nextLine();

		   					while (!(Reaction3.equals("-a") || Reaction3.equals("-b")) ) {
		   						sentence("You can only Type -a or -b"+newLineD+ "Please Try Again");
		   						Reaction3 = scan1.nextLine();
		   					         }
		                    reactionToUnsettlingEvent(Reaction3,newLineD);
		   				    }
		   		 			else{
		   				     happyEnd(newLineD);
		   				    }

		   		 }
		                    /**
		   				 *	This function continues the creepy story
		   				 *
		   				 *	@param answer The answer of the reader.
		   	             */
		            static void reactionToUnsettlingEvent(String answer,String newlineS){
		   			 if (answer.equals("-a"))
		   			 happyEnd(newlineS);
		   			 else{
		   				 sentence("You close your eyes but nothing changes."
		   			     +newlineS+"You understand now that everything is real...but its too late."
		   			     +newlineS+"You try to move but your body won't react to your will."
		   			     +newlineS+"The last thing you manage to do is utter a question...'Who are you?'"
		   			     +newlineS+"\n\n\nI am the fourth horseman...\n\n\n"
		   					 );
		   				 }
		   			 }

		   		 static void happyEnd(String newlineS){
		   			 sentence("You run as fast as you can,practically breaking the entrance door."
		   			 +newlineS+"As you run away from your house through the heavy rain\nyou could swear that you heard an old woman screaming but you won't stop."
		   			 +newlineS+"After some time you reach the nearby village."
		   			 +newlineS+"You stop,take a deep breath and relax.There are other people there,you are safe..."
		   			 +newlineS+".\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\nOr are you?");
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
			 sentence("The wolf is faster you die");
		     sentence("You wake up and realise it was just a dream ,within a dream ,within a dream...");
		     sentence("so you decide to call DiCaprio to figure out what's going on.");
		     sentence("You call DiCaprio but he is on vacation.. So you go hunting ");
		     sentence("But while you are haunting, THE EXACT same wolf attacks you, and chops your FREAKING EAR OFF! ");
	    } else if (answer.equals("-f")) {
		  	Scanner scan = new Scanner(System.in);
			sentence("Choose a weapon from your Bag:"+ newLine2 + "-h.\tFor AK47, choose " + newLine2 + "-i.\tFor beretta 92fs, choose " + newLine2 + "-j.\tFor Magnum 357, choose -j");

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
			sentence("But, even though you survived, a big brown bear is approaching you on your way home!You have to do something!");
			sentence("What are your options? "+newLine2+ "-k.\tGive the bear some honey " + newLine2 + "-d.\tPlay dead " + newLine2 + "-l.\tCall Mum, again!!" );

			Scanner scanner = new Scanner(System.in);
			String bear = scanner.nextLine();

			while (!(bear.equals("-k") || bear.equals("-l") || bear.equals("-d") )) {
				sentence("You can only type -k or -d or -l "+newLine2+ "Please Try Again");
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
		} else if (answer.equals("-d")) {
			String continuationOfStory = "The bear comes near you and smells you. You don't move at all...the bear is stupid and leaves. You survive lucky smartass...";
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

                sentence("I am home with blackout. darkness is everywhere. ");
        	    sentence("Suddenly, i noticed a light from the apartment across the street.");
		        sentence("For no reason i started watching this window and something make me feel alone and unprotected.");
	         	sentence("A man appeared behind this window.");
	       	    sentence("he was watching the storm. he make me feel scared. it was like he was looking into my eyes.");
	       	    sentence("But it is not possibly. He cannot see me. I am in the darkness.");
		        sentence("But i can see his look... ");
		        sentence("he is talking to someone, who i cannot see.");
		        sentence("Now he has a spiteful laugh...");
		        sentence("A woman appears behind him and makes him a hug.");
	            sentence("She is beautiful. she has long red hair.");
	            sentence("He turns  and put his hands around her neck.");
	            sentence("He strangles her.");
		        sentence("She is screaming but nothing sounds.");
		        sentence("She falls at the floor. she is dead.");
		        sentence("He turns to look at the window and he is happy...");
		        sentence("He is happy and high listening to the legend Bob Marley");
		        sentence("He suddnely starts laughing hysterically, and looks at me again!");
                        sentence("I feel more scared now and I run to the phone to call the police!");
			sentence("The phone doesn't work...");
			sentence("Suddenly I heard a voice behind me.");
			sentence("The man was at my back with a bloody knife...");
        }

        /**
			 *	This function is used for readers who get bored easily.
			 *
			 *	@param answer The answer of the reader.
	   */
	   public static void bored(String newLine) {
		   sentence("The end. ");
	   }

       /**      main method*/

    public static void main(String[] args) {

		String newLine = System.getProperty("line.separator");
		Scanner scanner = new Scanner(System.in);
		String b = "-yes";
		while(b.equals("-yes")){

			sentence("It was a dark and stormy night.");
        	sentence( newLine +"If you were terrified choose -a" + newLine + "If you enjoyed it, choose -b" + newLine + "If you want adventure, choose -c" + newLine + "If you want science fiction, choose -d" + newLine + "If you want a different story, choose -e" + newLine + "If you want a scary story, choose -f"+ newLine + "If you want a creepy story, choose -g"+ newLine + "If you want to know what I think about this night, choose -h" + newLine + "if you are bored to read a story, choose -m");


			/* Initial choice of the reader among Happy, Horryfying, Adventure and Science Fiction Story */

			String m=scanner.nextLine();

			/* A loop which force the user to insert the correct character (-a or -b or -c or -d) */
			while (!(m.equals("-a") || m.equals("-b") || m.equals("-c") || m.equals("-d") || m.equals("-e") || m.equals("-f")|| m.equals("-g")|| m.equals("-h") || m.equals("-m")) ) {
	        	sentence("You can only Type -a or -b or -c or -d or -e or -f or -g or -h" +newLine+ "Please Try Again");
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
			else if (m.equals("-g"))
				tellCreepyStory(newLine);
			else if (m.equals("-h"))
				lostInThoughts(newLine);
			else if (m.equals("-m"))
			    bored(newLine);





			sentence(newLine + "Would you like to read another story?Answer -yes or -no");
			b = scanner.nextLine();

			while(!((b.equals("-yes"))||(b.equals("-no")))){
				sentence("You can only type -yes or -no" + newLine + "Please Try Again");
				b=scanner.nextLine();
			}

	}
}
}

