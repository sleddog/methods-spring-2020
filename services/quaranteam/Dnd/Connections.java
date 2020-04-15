package strategyPattern;

import java.util.Scanner;

public class Connections {

	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
		String input = "";
		String[] splitted;
		String app;
		Context c;
		
		for (int i = 0; i < 3; i++)
		{
			
		System.out.println("Enter friend's name first and app to connect with second: ");
		input = in.nextLine();
		
		splitted = input.split(" ");
		
		app = splitted[1];
		
		c= new Context(splitted);
		
		
		switch (app.toLowerCase())
		{
		
		case "facebook":
				c.changeStrat(new Facebook());
				c.filter();
				break;
		case "instagram":
			c.changeStrat(new Instagram());
			c.filter();
			break;
		case "snapchat":
			c.changeStrat(new Snapchat());
			c.filter();
			break;
		case "twitter":
			c.changeStrat(new Twitter());
			c.filter();
			break;	
		}
		
		}
		
		in.close();
	}

}
