
//程序：找出1~100中能被7整除的所有整数并且计算个数
public class myDemo005{
	public static void main(String[] args){
		
		int count = 0;
		for(int i=1;i<=100;i++){
			
			if(i%7==0){
			count++;
			System.out.println(i);
			}
			
			

		}
		System.out.println(count);
	}
}