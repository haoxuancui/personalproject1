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
				System.out.println("Which fighter do you want to choose?");
				System.out.println("0 "+fighterinformation.fightInformation.get(0).getFighterName()+"  1 "+fighterinformation.fightInformation.get(1).getFighterName()+"  2 "+fighterinformation.fightInformation.get(2).getFighterName());
				Scanner userinput = new Scanner(System.in);
				int userchoosefighter = userinput.nextInt();
				userChooseFighter=userchoosefighter;
				
				
				System.out.println("Your fighter is "+fighterinformation.fightInformation.get(userChooseFighter).getFighterName());
				System.out.println("Your opponent is "+fighterinformation.fightInformation.get(computerFighterChoice).getFighterName());
				System.out.println("Let's Fight!!!");
				
			}
		private static void computerchooseactions()
			{
				
			}
		private static void playerchoosing()
			{
				int computerHp=fighterinformation.fightInformation.get(computerFighterChoice).getHp();
				int playerHp=fighterinformation.fightInformation.get(userChooseFighter).getHp();
				boolean result = true;
				while(result)
					{
						int computerActions= (int)(Math.random()*2)+1;
						switch(computerActions)
						{
							case 1:
									{
										computerDamage=fighterinformation.fightInformation.get(computerFighterChoice).getAttack();
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
										System.out.println("You choose fights and deals "+fighterinformation.fightInformation.get(userChooseFighter).getAttack()+" points");
										
										if(fighterinformation.fightInformation.get(userChooseFighter).getAttack()>computerDamage)
											{
												System.out.println("Computer Hp drops "+(fighterinformation.fightInformation.get(userChooseFighter).getAttack()-computerDamage) + "point");
												computerHp=computerHp-fighterinformation.fightInformation.get(userChooseFighter).getAttack()+computerDamage;
												System.out.println("Computer Hp has "+computerHp+" left.");
											}
										else
											{
												System.out.println("Your Hp drops "+(computerDamage-fighterinformation.fightInformation.get(userChooseFighter).getAttack()) + "point");
												playerHp=playerHp+fighterinformation.fightInformation.get(userChooseFighter).getAttack()-computerDamage;
												System.out.println("Your Hp has "+playerHp+" left.");
											}
										
									}
								else
									{
										System.out.println("You deal "+fighterinformation.fightInformation.get(userChooseFighter).getAttack()+" points");
										System.out.println("Computer choose defence and stops "+computerDamage+" points");
										if(fighterinformation.fightInformation.get(userChooseFighter).getAttack()>computerDamage)
											{
												System.out.println("Computer Hp drops "+(fighterinformation.fightInformation.get(userChooseFighter).getAttack()-computerDamage) + " point");
												computerHp=computerHp-fighterinformation.fightInformation.get(userChooseFighter).getAttack()+computerDamage;
												System.out.println("Computer Hp has "+computerHp+" left.");
											}
										else
											{
												System.out.println("You didn't do any damages");
												
											}
										
									}
								
							}
						else
							{
								if(computerActions==1)
									{
										System.out.println("You choose defence and stops "+fighterinformation.fightInformation.get(userChooseFighter).getDefence()+" points");
										System.out.println("Computer choose fight and deals "+computerDamage+" points");
										if(fighterinformation.fightInformation.get(userChooseFighter).getDefence()>computerDamage)
											{
												playerHp=playerHp+fighterinformation.fightInformation.get(userChooseFighter).getAttack()-computerDamage;
												System.out.println("Your Hp drops "+(fighterinformation.fightInformation.get(userChooseFighter).getAttack()-computerDamage) + "point");
												System.out.println("Your Hp has "+playerHp+" left.");
												
											}
										else
											{
												System.out.println("Computer didn't do any damages to you.");
											}
									
									}
								else
									{
										System.out.println("Both of you choose to defence so no damage to any one.");
									}
							}
						if(computerHp==0)
							{
								System.out.println("You just win the game!!!");
								result=false;
								break;
							}
						else if(playerHp==0)
						{
							System.out.println("You just lost the game!!!");
							result=false;
							break;
						}
					}
				
				
			}
		

	}
