import java.util.Scanner;

//�÷�֧���ʵ�ֲ�ͬ�˲�ͬʱ�乺Ʊ
public class Tickets{

	public static void main(String[] args){

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������(1~100):");
		int age = scanner.nextInt();
		//age�������
		System.out.println("�������·�(1~12):");
		int mouth = scanner.nextInt();
		//mouth����·�
		int ticketsprice = 60;
		//ticketspritce���Ʊ��

			if(mouth > 4 || mouth < 10){
				//����
				if(age < 18 && age > 0 ){
					ticketsprice = ticketsprice / 2;
				}else if(age >= 18 && age < 60){
					ticketsprice = 60;
				}else{
					ticketsprice = ticketsprice / 3;
				}
			}else{
				//����
				if(age > 18 && age < 60){
					ticketsprice = 40;
				}else{
					ticketsprice = 20;
				}

			}

		System.out.println("����Ʊ����"+ticketsprice+"Ԫ");
	}
	
}