public class TemporaryVariables{

	public static void main(String[] args){

		int i = 1;
		i = i++;
		/*
		规则使用临时变量：
		(1)temp = i;取值
		(2)i = i + 1;自增
		(3)i = temp;
		i = 1;
		*/
		System.out.println(i);
		i = 1;
		i = ++ i;
		/*
		规则使用临时变量：
		(1)i = i + 1;自增
		(2)temp = i;取值
		(3)i = temp;
		i = 2;
		*/
		System.out.println(i);
	}
}