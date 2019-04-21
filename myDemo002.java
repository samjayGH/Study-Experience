//编写一个程序“计算买一个手机5499元，需要几张100元
//，几张50元，几张20元，几张10元，几张5元，几张1元”

public class myDemo002{
	//程序的执行入口，main方法
	public static void main(String[] args){
	//定义手机价格为5499元
	int pay = 5499;

	System.out.println("需要支付"+(pay/100)+"张100元");

	System.out.println("需要支付"+(pay%100/50)+"张50元");

	System.out.println("需要支付"+(pay%100%50/20)+"张20元");

	System.out.println("需要支付"+(pay%100%50%20/10)+"张10元");	

	System.out.println("需要支付"+(pay%100%50%20%10/5)+"张5元");	

	System.out.println("需要支付"+(pay%100%50%20%10%5/1)+"张1元");	

	
	}



}