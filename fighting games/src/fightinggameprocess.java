import java.util.ArrayList;
import java.util.Scanner;

public class fightinggameprocess
	{

		static ArrayList<fighterdatabase> printFighter= new ArrayList<fighterdatabase>();
		public static void main(String[] args)
			{
				fighterinformation.fillFighterInformation();
				fighterintroduce();
				

			}
		private static void fighterintroduce()
			{
				System.out.println("Welcome to the fighting game, choose your fighter");
				System.out.println("0 "+fighterinformation.fightInformation.get(0).getFighterName()+"  1 "+fighterinformation.fightInformation.get(1).getFighterName()+"  2 "+fighterinformation.fightInformation.get(2).getFighterName());
				Scanner userinput = new Scanner(System.in);
				System.out.println("Which fighter do you want to choose?");
				int userChooseFighter = userinput.nextInt();
				
				System.out.println("Your fighter is "+fighterinformation.fightInformation.get(userChooseFighter).getFighterName());
				System.out.println("Let's Fight!!!");
				
				
			}

	}
