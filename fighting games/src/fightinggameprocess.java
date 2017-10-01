import java.util.ArrayList;
import java.util.Scanner;

public class fightinggameprocess
	{

		static ArrayList<fighterdatabase> printFighter= new ArrayList<fighterdatabase>();
		public static void main(String[] args)
			{
				fighterinformation.fillFighterInformation();
				fighterintroduce();
				playerchoosing();
				computerchooseactions();
				

			}
		

		private static void fighterintroduce()
			{
				System.out.println("Welcome to the fighting game, choose your fighter");
				System.out.println("0 "+fighterinformation.fightInformation.get(0).getFighterName()+"  1 "+fighterinformation.fightInformation.get(1).getFighterName()+"  2 "+fighterinformation.fightInformation.get(2).getFighterName());
				Scanner userinput = new Scanner(System.in);
				System.out.println("Which fighter do you want to choose?");
				int userChooseFighter = userinput.nextInt();
				int computerChoice= (int)(Math.random()*3)+0;
				
				System.out.println("Your fighter is "+fighterinformation.fightInformation.get(userChooseFighter).getFighterName());
				System.out.println("Your opponent is "+fighterinformation.fightInformation.get(computerChoice).getFighterName());
				System.out.println("Let's Fight!!!");
				
			}
		private static void computerchooseactions()
			{
				int computerActions= (int)(Math.random()*2)+1;
				if (computerActions==1)
					{
						int fighting=fighterinformation.fightInformation.get(0).getAttack();
					}
			}
		private static void playerchoosing()
			{
				Scanner userinput1 = new Scanner(System.in);
				System.out.println("Do you want to fight or defnece?");
				System.out.println("(1) fight  (2) defence");
				int userChooseAction = userinput1.nextInt();
				
				
			}
		

	}
