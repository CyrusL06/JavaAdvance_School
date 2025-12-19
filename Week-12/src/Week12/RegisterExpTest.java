package Week12;
import java.util.regex.*;

//Computational theory how to design language system. 
//Language is by COmputer Science department a whole system use to design system
// Language -> Word, Sentence, 

public class RegisterExpTest 
{
		public static void main(String[] args)
		{
			String patternStr="[j]ava"; //can be capital or smaller case
			String patternStr2="[j]ava.+"; //have started with this

			
			Pattern myPattern = Pattern.compile(patternStr); //compile gives us regular expression
			
			String testStr = "java is fun!";
			Matcher myMatcher = myPattern.matcher(testStr); //Pattern we design
			
			
			if(myMatcher.matches())
				System.out.println("Matches!");
			else
				System.out.println("Not Matches");

			
			
			if(myMatcher.find()) //give us how many patter been founds
				System.out.println("Matches!");
			else
				System.out.println("Not Matches");
			
			
		}
}
