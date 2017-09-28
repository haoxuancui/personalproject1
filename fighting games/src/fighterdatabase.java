
public class fighterdatabase
	{
		private String fighterName;
		private int hp;
		private int attack;
		private int defence;
		
		public fighterdatabase(String f, int h, int a, int de)
					{
						fighterName = f;
						hp = h;
						attack = a;
						defence = de;
					}

		public String getFighterName()
			{
				return fighterName;
			}

		public void setFighterName(String fighterName)
			{
				this.fighterName = fighterName;
			}

		public int getHp()
			{
				return hp;
			}

		public void setHp(int hp)
			{
				this.hp = hp;
			}

		public int getAttack()
			{
				return attack;
			}

		public void setAttack(int attack)
			{
				this.attack = attack;
			}

		public int getDefence()
			{
				return defence;
			}

		public void setDefence(int defence)
			{
				this.defence = defence;
			}

	}
