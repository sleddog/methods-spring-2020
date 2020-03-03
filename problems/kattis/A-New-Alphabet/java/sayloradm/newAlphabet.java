import java.util.Scanner;
public class newAlphabet {

	public static void main(String[] args) 
	{
		
		newAlphabet doWork = new newAlphabet();
		Scanner in = new Scanner(System.in);
		String input = "";
		String translated = "";
		
		System.out.println("------------- \"A New Alphabet\" from Kattis -------------");
		System.out.println();
		
		System.out.print("Gimmie some words: ");
		input = in.nextLine();
		
		
		translated = doWork.translate(input.toLowerCase());
		
		
		System.out.println(translated);
		
		
		in.close();
	}
	
	private String translate(String word)
	{
		String newLetter = "";
		String[] letters = word.split("");
		
		for( String i : letters)
		{
			
			switch(i)
			{
			
			case "a":
				newLetter += "@" ;
				break;
				
			case "b":
				newLetter += "8";
				break;
				
			case "c":
				newLetter += "(";
				break;
				
			case "d":
				newLetter += "|)";
				break;
				
			case "e":
				newLetter += "3";
				break;
				
			case "f":
				newLetter += "#";
				break;
				
			case "g":
				newLetter += "6";
				break;
				
			case "h":
				newLetter += "[-]";
				break;
				
			case "i":
				newLetter += "|";
				break;
				
			case "j":
				newLetter += "_|";
				break;
				
			case "k":
				newLetter += "|<";
				break;
				
			case "l":
				newLetter += "1";
				break;
				
			case "m":
				newLetter += "[]\\/[]";
				break;
				
			case "n":
				newLetter += "[]\\'[]";
				break;
				
			case "o":
				newLetter += "0";
				break;
				
			case "p":
				newLetter += "|D";
				break;
				
			case "q":
				newLetter += "(,)";
				break;
				
			case "r":
				newLetter += "|Z";
				break;
				
			case "s":
				newLetter += "$";
				break;
				
			case "t":
				newLetter += "']['";
				break;
				
			case "u":
				newLetter += "|_|";
				break;
				
			case "v":
				newLetter += "\\/";
				break;
				
			case "w":
				newLetter += "\\/\\/";
				break;
				
			case "x":
				newLetter += "}{";
				break;
				
			case "y":
				newLetter += "`/";
				break;
				
			case "z":
				newLetter += "2";
				break;
				
			case " ":
				newLetter += " ";
				break;
				
			default:
				newLetter += i;
				break;
			
			}
		}
		
		return newLetter;
	}

}