public class HollowPyramid{
//��ӡ���Ľ�����
	public static void main(String[] args){

		int totalLevel = 10;
		//����

		for(int i = 1;i <= totalLevel;i ++){

			//���*֮ǰ�������Ӧ�ո� = �ܲ���-��ǰ��
			for(int k = 1;k <= totalLevel - i;k++){

				System.out.print(" ");

			}

			//���ƴ�ӡÿ��*����
			for(int j = 1;j <= 2 * i - 1;j++){

				if (j == 1||j == 2 * i - 1||i == totalLevel){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}

			}

			//��ӡ��һ���Զ�����
			System.out.println("");


		}

	}
}