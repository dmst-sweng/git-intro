import java.util.Scanner;

/**
 * A class to print a story that will be developed collaboratively.
 * Extend test thisssssssss test class by adding your literary input near the end of
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
	 * Tells a story , different every time , according to the reader's mood.
	 *
	 * @param mood A String value that indicates the type of the story we are going to tell.
	 * @param newLine A String that contains the new line separator.
	 *
	 * @return A thankfull message to the reader for his patience.
	 */
    static String tellStory(String mood , String newLine) {

		if (mood.equals("-a")) {
			tellHappyStory(newLine);
		} 
		
		else if (mood.equals("-b")) {
			tellHorrifyingStory(newLine);
		}
		
		else if (mood.equals("-c")) {
			tellFunnyStory(newLine);
		}
			
		else {
			sentence( "You can chose -a or -b or -c , nothing else. Please retry.");
		}
		
		return("Thank you for your help");
	}
	
	/**
	 * Function that is used to create a horryfying story.
	 */
	static void tellHorrifyingStory(String newLine) {
		sentence("Good for you, cause weather forecast shows that tonight we'll have an equal experience :) .");
	}
	
	/**
	 * Function that is used to create a happy story.
	 */
	static void tellHappyStory(String newLine) {
		sentence("Our proposal is to take a day-off and relax, everything is ok!!!");
		sentence("It doesn't matter if there is a storm outside , you can still sit next to the fireplace and enjoy your hot chocolate.");
	}
	
	/**
	 * Function that is used to create a funny story.
	 */
	static void tellFunnyStory(String newLine) {
		sentence("Suddenly a wolf comes out of the wood" + newLine + "How do you react??" + newLine + "-d.Run"+ newLine +"-f.Fight"+ newLine +"-g.Call your mum(mummas little boy) ");
		
		Scanner scanner = new Scanner(System.in);
		String wolf = scanner.nextLine();
		reactionToWolfAppearance(wolf);
	}
	
	/**
	 *	This function is used to inform the reader about the outcome of his choice to the wolf appearance.
	 *
	 *	@param answer The answer of the reader.
	 */
	static void reactionToWolfAppearance(String answer) {
		
		if(answer.equals("-d")) {
			String mergeContinuationOfStory="The wolf is faster you die";
		    mergeContinuationOfStory+="\n You wake up and realise it was just a dream ,within a dream ,within a dream...\n so you decide to call DiCaprio to figure out what's going on.";
		    sentence(mergeContinuationOfStory);
	    }
		
		else if(answer.equals("-f")) {
			sentence("The wolf is stronger you die");
		}
		
		else if(answer.equals("-g")) {
			sentence("Your mum comes out of the woods kicks the wolf and saves you!! You lucky scum.");
			sentence("But, although you survived, a big brown bear is approaching you on your way home!You have to do something!");
		}
		
		else {
			sentence( "You can choose -d or -f or -g , nothing else. Please retry.");
		}
	}

    public static void main(String[] args) {

		String newLine = System.getProperty("line.separator");
		sentence("It was a dark and stormy night.");
		sentence("How was your stormy night?" + newLine + "If you were terrified choose -a" + newLine + "If you enjoyed it, choose -b" + newLine + "If you want to laugh, choose -c");

		Scanner scanner = new Scanner(System.in);
		String m = scanner.nextLine();
		sentence(tellStory(m , newLine));
    }
	
}