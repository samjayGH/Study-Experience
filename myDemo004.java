/*����ѭ����ϵ/Ƕ��ѭ����ϵ
1����ӡֱ��������/����������/����
2����1~10�׳˺�
3����ӡ�žų˷���*/

public class myDemo004{
	/*public static void main(String[] args){
	
	Triangle();	//��ӡֱ��������/����������
	}
	Factorial();		//��ӡ�׳˺�
	Multiplication();	//��ӡ�žų˷���
	}*/

	//���򣺴�ӡ�����Ρ�����
	/*public static void main(String[] args){
		//�����������������������߶ȣ�
		for(int i=0;i<5;i++){
			//���ƴ�ӡ�ո�����
			for(int k=4;k>i;k--){
			System.out.print(" ");
			}
			//���ƴ�ӡ��*������
			for(int j=0;j<=i*2;j++){    //j<=iΪ��ӡֱ��������     j<=2*iΪ��ӡ����������
			System.out.print("*");
			}
			System.out.println("");	
		}
		//�������ݿ�ʼ��ӡ�����ǣ�������������ƴ�ӳ�����
		for(int i=0;i<4;i++){
			for(int k=0;k<=i;k++){
			System.out.print(" ");
			}
			for(int j=7;j>2*i;j--){
			System.out.print("*");
			}
			System.out.println("");
		}
	}*/
	
	
	//���򣺼���׳�
	/*public static void main(String[] args){
		
		int sum = 0;
		
		for(int i=1;i<=10;i++){
			
			int a = 1;//�������ÿ��ѭ���Ľ׳����ý��
			
			for(int j=1;j<=i;j++){

				a *= j;	
				
			}
			System.out.println(i+"�Ľ׳��ǣ�"+a);
		    sum += a;	
		}
		System.out.println("���յĽ׳˺ͣ�"+sum);
	}*/
	
	//���򣺴�ӡ�žų˷���
	public static void main(String[] args){
	
		for(int i=1;i<10;i++){
	
			for(int j=1;j<=i;j++){
			
			System.out.print(i+"*"+j+"="+(i*j)+"  ");
			}
			System.out.println("");
		}
	
	}


}