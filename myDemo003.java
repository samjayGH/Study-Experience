//模拟打怪过程：游戏总共20级，有英雄和怪兽两个角色，在第一级时，
//怪兽经验20点，升级所需经验1200点，英雄经验为0，英雄每杀一个怪，
//自身经验就增加怪兽的经验值；每升一级，升级所需经验涨20%（忽略小数部分）
//怪兽经验涨5%，英雄经验归0，求到20级时，总共杀了多少怪

public class myDemo003{
	public static void main (String[] args){
	
	int heroExp = 0;

	int monsterExp =20;
	int levelUpExp = 1200;
	int count = 0;
		for(int level=2;level<20;level++){
			
			levelUpExp *= 1.2;
			monsterExp *= 1.05;
			heroExp = 0;
			System.out.print("第"+(level)+"级升级级所需经验"+levelUpExp);

			System.out.println("杀怪获得经验"+monsterExp);
			
			for(int j=1;heroExp < levelUpExp;count++){
				heroExp += monsterExp;

				System.out.println(count);


			}
			
			//for(int levelUpExp=1200；)
	
		}
	
		System.out.println(count+(1200/20));
	}



}