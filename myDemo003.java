//ģ���ֹ��̣���Ϸ�ܹ�20������Ӣ�ۺ͹���������ɫ���ڵ�һ��ʱ��
//���޾���20�㣬�������辭��1200�㣬Ӣ�۾���Ϊ0��Ӣ��ÿɱһ���֣�
//����������ӹ��޵ľ���ֵ��ÿ��һ�����������辭����20%������С�����֣�
//���޾�����5%��Ӣ�۾����0����20��ʱ���ܹ�ɱ�˶��ٹ�

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
			System.out.print("��"+(level)+"�����������辭��"+levelUpExp);

			System.out.println("ɱ�ֻ�þ���"+monsterExp);
			
			for(int j=1;heroExp < levelUpExp;count++){
				heroExp += monsterExp;

				System.out.println(count);


			}
			
			//for(int levelUpExp=1200��)
	
		}
	
		System.out.println(count+(1200/20));
	}



}