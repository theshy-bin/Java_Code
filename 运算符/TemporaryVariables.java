public class TemporaryVariables{

	public static void main(String[] args){

		int i = 1;
		i = i++;
		/*
		����ʹ����ʱ������
		(1)temp = i;ȡֵ
		(2)i = i + 1;����
		(3)i = temp;
		i = 1;
		*/
		System.out.println(i);
		i = 1;
		i = ++ i;
		/*
		����ʹ����ʱ������
		(1)i = i + 1;����
		(2)temp = i;ȡֵ
		(3)i = temp;
		i = 2;
		*/
		System.out.println(i);
	}
}