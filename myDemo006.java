import java.util.*;
//һ��ģ��˫ɫ�򿪽��ĳ���
public class myDemo006{
	public static void main(String[] args){
	
		Random r = new Random();
	
		int [] radBall = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33};
	
		int [] blueBall = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

		int [] systemRedBall = new int [6];

		int [] userRedBall = new int [6];

		int index = 0;

		for(int i=0;i<6;i++){
		
			for (int j=0;j<1;j--){				//����һ����ѭ��
				index = r.nextInt(33);			//���������������Χ��0~32��
				if (radBall [index] != 0){		//�ж��Ƿ��ظ�������ظ�����ȡֵ

					systemRedBall [i] = radBall [index];
				
					radBall [index] = 0;
					break;						//����ѭ��	
				}                                 
			}
		}
		index = r.nextInt(16);					//���������������Χ��0~15��
		
		System.out.println("���ڿ�������Ϊ��"+Arrays.toString(systemRedBall)+"  "+"+"+"  "+blueBall [index]);

	
	}
}