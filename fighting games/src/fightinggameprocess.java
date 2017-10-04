import java.util.ArrayList;
import java.util.Scanner;

public class fightinggameprocess
	{
		
		
		static int computerFighterChoice= (int)(Math.random()*3)+0;
		static int computerDamage=0;
		static int userChooseFighter=0;
		static String computerActionChoice;
		
		public static void main(String[] args)
			{
				fighterinformation.fillFighterInformation();
				fighterintroduce();
				playerchoosing();
				

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
		static void playerchoosing()
			{
				int computerHp=fighterinformation.fightInformation.get(computerFighterChoice).getHp();
				int playerHp=fighterinformation.fightInformation.get(userChooseFighter).getHp();
				boolean result = true;
				while(result)
					{
						int reflectPoints= (int)(Math.random()*3)+1;
						int fightingselfdamage=(int)(Math.random()*2)+1;
						int computerActions= (int)(Math.random()*2)+1;
						switch(computerActions)
						{
							case 1:
									{
										computerDamage=fighterinformation.fightInformation.get(computerFighterChoice).getAttack();
										break;
									}
							case 2:
								
									{
										computerDamage=fighterinformation.fightInformation.get(computerFighterChoice).getDefence();
										break;
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
												System.out.println("Computer Hp drops "+(fighterinformation.fightInformation.get(userChooseFighter).getAttack()-computerDamage) + " point");
												computerHp=computerHp-fighterinformation.fightInformation.get(userChooseFighter).getAttack()+computerDamage;
												System.out.println("Computer Hp has "+computerHp+" left.");
												playerHp=playerHp-fightingselfdamage;
												System.out.println("Since computer's attack damage is lower or equal to your attack damage, the computer randomly do "+fightingselfdamage+" damage to you too.");
												System.out.println("You have "+playerHp+" left.");
								
											}
										else
											{
												System.out.println("Your Hp drops "+(computerDamage-fighterinformation.fightInformation.get(userChooseFighter).getAttack()) + " point");
												playerHp=playerHp+fighterinformation.fightInformation.get(userChooseFighter).getAttack()-computerDamage;
												System.out.println("Your Hp has "+playerHp+" left.");
												System.out.println("Since your attack damage is lower or equal to the computer attack damage, you randomly do "+fightingselfdamage+" points to the computer.");
												computerHp=computerHp-fightingselfdamage;
												System.out.println("Computer has "+computerHp+" left.");
												
											}
										
									}
								else
									{
										System.out.println("You choose to fight and deals "+fighterinformation.fightInformation.get(userChooseFighter).getAttack()+" points");
										System.out.println("Computer choose defence and stops "+computerDamage+" points");
										if(fighterinformation.fightInformation.get(userChooseFighter).getAttack()>computerDamage)
											{
												System.out.println("Computer Hp drops "+(fighterinformation.fightInformation.get(userChooseFighter).getAttack()-computerDamage) + " point");
												computerHp=computerHp-fighterinformation.fightInformation.get(userChooseFighter).getAttack()+computerDamage;
												System.out.println("Computer Hp has "+computerHp+" left.");
												
											}
										else
											{
												System.out.println("Since your attack damage is lower or even with the computer's defence, reflect "+reflectPoints+" points");
												playerHp=playerHp-reflectPoints;
												System.out.println("Your Hp has "+playerHp+" left.");
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
												computerHp=computerHp-reflectPoints;
												System.out.println("Since your defence damage is higher or even with the computer's attack, you reflects "+reflectPoints+" points to the computer");
												System.out.println("Computer Hp has "+computerHp+" left.");
												
												
											}
										else
											{
												playerHp=playerHp+fighterinformation.fightInformation.get(userChooseFighter).getDefence()-computerDamage;
												System.out.println("Your Hp drops "+(fighterinformation.fightInformation.get(userChooseFighter).getAttack()-computerDamage) + "point");
												System.out.println("Your Hp has "+playerHp+" left.");
											}
									
									}
								else
									{
										System.out.println("Both of you choose to defence so no damage to any one.");
									}
							}
						if(computerHp<1)
							{
								System.out.println("You just win the game!!!");
								result=false;
								break;
							}
						else if(playerHp<1)
						{
							System.out.println("You just lost the game!!!");
							result=false;
							break;
						}
					}
				
				
			}
		

	}
