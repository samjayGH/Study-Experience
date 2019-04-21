import java.util.*;
//一个模拟双色球开奖的程序
public class myDemo006{
	public static void main(String[] args){
	
		Random r = new Random();
	
		int [] radBall = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33};
	
		int [] blueBall = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

		int [] systemRedBall = new int [6];

		int [] userRedBall = new int [6];

		int index = 0;

		for(int i=0;i<6;i++){
		
			for (int j=0;j<1;j--){				//创建一个死循环
				index = r.nextInt(33);			//随机生成索引（范围：0~32）
				if (radBall [index] != 0){		//判断是否重复，如果重复重新取值

					systemRedBall [i] = radBall [index];
				
					radBall [index] = 0;
					break;						//跳出循环	
				}                                 
			}
		}
		index = r.nextInt(16);					//随机生成索引（范围：0~15）
		
		System.out.println("本期开奖号码为："+Arrays.toString(systemRedBall)+"  "+"+"+"  "+blueBall [index]);

	
	}
}