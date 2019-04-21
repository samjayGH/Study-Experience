/*多重循环联系/嵌套循环联系
1、打印直角三角形/等腰三角形/菱形
2、求1~10阶乘和
3、打印九九乘法表*/

public class myDemo004{
	/*public static void main(String[] args){
	
	Triangle();	//打印直角三角形/等腰三角形
	}
	Factorial();		//求印阶乘和
	Multiplication();	//打印九九乘法表
	}*/

	//程序：打印三角形、菱形
	/*public static void main(String[] args){
		//定义三角形行数（层数，高度）
		for(int i=0;i<5;i++){
			//控制打印空格数量
			for(int k=4;k>i;k--){
			System.out.print(" ");
			}
			//控制打印“*”数量
			for(int j=0;j<=i*2;j++){    //j<=i为打印直角三角形     j<=2*i为打印等腰三角形
			System.out.print("*");
			}
			System.out.println("");	
		}
		//以下内容开始打印倒三角，于上面三角形拼接成菱形
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
	
	
	//程序：计算阶乘
	/*public static void main(String[] args){
		
		int sum = 0;
		
		for(int i=1;i<=10;i++){
			
			int a = 1;//用来存放每次循环的阶乘所得结果
			
			for(int j=1;j<=i;j++){

				a *= j;	
				
			}
			System.out.println(i+"的阶乘是："+a);
		    sum += a;	
		}
		System.out.println("最终的阶乘和："+sum);
	}*/
	
	//程序：打印九九乘法表
	public static void main(String[] args){
	
		for(int i=1;i<10;i++){
	
			for(int j=1;j<=i;j++){
			
			System.out.print(i+"*"+j+"="+(i*j)+"  ");
			}
			System.out.println("");
		}
	
	}


}