import java.util.Scanner;

//用分支语句实现不同人不同时间购票
public class Tickets{

	public static void main(String[] args){

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年龄(1~100):");
		int age = scanner.nextInt();
		//age获得年龄
		System.out.println("请输入月份(1~12):");
		int mouth = scanner.nextInt();
		//mouth获得月份
		int ticketsprice = 60;
		//ticketspritce存放票价

			if(mouth > 4 || mouth < 10){
				//旺季
				if(age < 18 && age > 0 ){
					ticketsprice = ticketsprice / 2;
				}else if(age >= 18 && age < 60){
					ticketsprice = 60;
				}else{
					ticketsprice = ticketsprice / 3;
				}
			}else{
				//淡季
				if(age > 18 && age < 60){
					ticketsprice = 40;
				}else{
					ticketsprice = 20;
				}

			}

		System.out.println("您的票价是"+ticketsprice+"元");
	}
	
}