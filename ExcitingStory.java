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

    static String answer(String mood) {

	if (mood.equals("-a")) {
		sentence("Our proposal is to take a day-off and relax, everything is ok!!!");
	} else if (mood.equals("-b")) {
		sentence("Good for you, cause weather forecast shows that tonight we'll have an equal experience :) .");
	}
	else if(mood.equals("-d")){
		                       String mergeContinuationOfStory="The wolf is faster you die";
		                       mergeContinuationOfStory+="\n You wake up and realise it was just a dream ,within a dream ,within a dream...\n so you decide to call DiCaprio to figure out what's going on.";
		                       sentence(mergeContinuationOfStory);
	                           }
	else if(mood.equals("-f")){sentence("The wolf is stronger you die");}
	else if(mood.equals("-g")){sentence("Your mum comes out of the woods kicks the wolf and saves you!! You lucky scum.  ");}
	else {
		sentence( "You can chose -a or -b or -d or -f or -g, nothing else. Please retry.");
	}

	return("Thank you for your help");

	}

    public static void main(String[] args) {

	String newLine = System.getProperty("line.separator");
	sentence("It was a dark and stormy night.");
	sentence("How was your stormy night?" + newLine + "If you were terrified choose -a" + newLine + "If you enjoyed it, choose -b");

	Scanner scanner = new Scanner(System.in);
	String m = scanner.nextLine();
	answer(m);

sentence("Suddenly a wolf comes out of the wood" + newLine + "How do you react??" + newLine + "-d.Run"+ newLine +"-f.Fight"+ newLine +"-g.Call your mum(mummas little boy) ");
String wolf = scanner.nextLine();
answer(wolf);
if (wolf.equals("-g"))
	sentence("But, although you survived, a big brown bear is approaching on your way home!");
    }

}
