import java.util.ArrayList;
import java.util.Scanner;

public class fightinggameprocess
	{

		static ArrayList<fighterdatabase> printFighter= new ArrayList<fighterdatabase>();
		static int computerFighterChoice= (int)(Math.random()*3)+0;
		static int computerDamage=0;
		static int userChooseFighter=0;
		static String computerActionChoice;
		public static void main(String[] args)
			{
				fighterinformation.fillFighterInformation();
				fighterintroduce();
				playerchoosing();
				computerchooseactions();
				

			}
		

		private static void fighterintroduce()
			{
				System.out.println("Welcome to the fighting game, choose your fighter!!!");
				System.out.println("0 "+fighterinformation.fightInformation.get(0).getFighterName()+"  1 "+fighterinformation.fightInformation.get(1).getFighterName()+"  2 "+fighterinformation.fightInformation.get(2).getFighterName());
				Scanner userinput = new Scanner(System.in);
				int userchoosefighter = userinput.nextInt();
				userChooseFighter=userchoosefighter;
				System.out.println("Which fighter do you want to choose?");
				
				System.out.println("Your fighter is "+fighterinformation.fightInformation.get(userChooseFighter).getFighterName());
				System.out.println("Your opponent is "+fighterinformation.fightInformation.get(computerFighterChoice).getFighterName());
				System.out.println("Let's Fight!!!");
				
			}
		private static void computerchooseactions()
			{
				
			}
		private static void playerchoosing()
			{
				int computerActions= (int)(Math.random()*2)+1;
				switch(computerActions)
				{
					case 1:
							{
								computerDamage=fighterinformation.fightInformation.get(computerFighterChoice).getAttack();;
								computerActionChoice="Attack";
							}
					case 2:
						
							{
								computerDamage=fighterinformation.fightInformation.get(computerFighterChoice).getDefence();
								computerActionChoice="Defence";
							}
				}
				
				Scanner userinput1 = new Scanner(System.in);
				System.out.println("Do you want to fight or defence?");
				System.out.println("(1) fight  (2) defence");
				int userChooseAction = userinput1.nextInt();
				
				if(userChooseAction==1)
					{
						if(computerActions==1)
							{
								System.out.println("Computer choose fight and deals "+computerDamage+" points");
								System.out.println("You deal "+fighterinformation.fightInformation.get(userChooseFighter).getAttack()+" points");
								System.out.println(fighterinformation.fightInformation.get(userChooseFighter).getAttack()-computerDamage);
								System.out.println("Your Hp was " + fighterinformation.fightInformation.get(userChooseFighter).getHp());
							}
						else
							{
								
							}
						
					}
				
			}
		

	}
