//��дһ�����򡰼�����һ���ֻ�5499Ԫ����Ҫ����100Ԫ
//������50Ԫ������20Ԫ������10Ԫ������5Ԫ������1Ԫ��

public class myDemo002{
	//�����ִ����ڣ�main����
	public static void main(String[] args){
	//�����ֻ��۸�Ϊ5499Ԫ
	int pay = 5499;

	System.out.println("��Ҫ֧��"+(pay/100)+"��100Ԫ");

	System.out.println("��Ҫ֧��"+(pay%100/50)+"��50Ԫ");

	System.out.println("��Ҫ֧��"+(pay%100%50/20)+"��20Ԫ");

	System.out.println("��Ҫ֧��"+(pay%100%50%20/10)+"��10Ԫ");	

	System.out.println("��Ҫ֧��"+(pay%100%50%20%10/5)+"��5Ԫ");	

	System.out.println("��Ҫ֧��"+(pay%100%50%20%10%5/1)+"��1Ԫ");	

	
	}



}