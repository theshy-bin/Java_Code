public class TemporaryVariable{

	public static void main(String[] args){

		int i = 1;
		i = i ++;
		/*
		����ʹ����ʱ������
		(1)temp = i;ȡֵ
		(2)i = i + 1;����
		(3)i = temp;
		*/
		System.out.println(i+'\n');
		i = 1;
		i = ++ i;
		/*
		����ʹ����ʱ������
		(1)i = i + 1;����
		(2)temp = i;ȡֵ
		(3)i = temp;
		*/
		System.out.println(i);
	}
}