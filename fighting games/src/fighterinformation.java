import java.util.ArrayList;
public class fighterinformation
	{

		static ArrayList<fighterdatabase> fightInformation = new ArrayList<fighterdatabase>();
		public static void fillFighterInformation()
			{
					int fighterAttack= (int)(Math.random()*3)+4;
					int fighterDefence = (int)(Math.random()*3)+4;
					int assasinOffence = (int)(Math.random()*4)+5;
					int assasinDefence = (int)(Math.random()*3)+2;
					int tankOffence = (int)(Math.random()*3)+3;
					int tankDefence = (int)(Math.random()*5)+4;
					fightInformation.add(new fighterdatabase("bigboy", 10, fighterAttack, fighterDefence));
					fightInformation.add(new fighterdatabase("assasin", 8, assasinOffence, assasinDefence));
					fightInformation.add(new fighterdatabase("tank", 15, tankOffence, tankDefence));
			}	
				

	}
