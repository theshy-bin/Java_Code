public class HollowPyramid{
//打印空心金字塔
	public static void main(String[] args){

		int totalLevel = 10;
		//层数

		for(int i = 1;i <= totalLevel;i ++){

			//输出*之前，输出对应空格 = 总层数-当前层
			for(int k = 1;k <= totalLevel - i;k++){

				System.out.print(" ");

			}

			//控制打印每层*个数
			for(int j = 1;j <= 2 * i - 1;j++){

				if (j == 1||j == 2 * i - 1||i == totalLevel){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}

			}

			//打印完一层自动换行
			System.out.println("");


		}

	}
}