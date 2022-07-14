public class YangHuiTriangle{

	public static void main(String[] args){

			//使用二维数组打印一个10行杨辉三角
		int[][] YHT = new int[10][];

				for(int i = 0;i < YHT.length;i ++){

					YHT[i] = new int[i+1];
				
				//给每个一维数组开辟空间

					for(int j = 0;j < YHT[i].length;j ++){
						if(j == 0 || j == YHT[i].length - 1){
							YHT[i][j] = 1;
							//每一行第一个和最后一个元素都是1
						}else{
							YHT[i][j] = YHT[i-1][j] + YHT[i-1][j-1];
							//中间的元素
						}
					}
				
				}

		for(int i = 0;i < YHT.length;i++){
			for(int j = 0;j < YHT[i].length;j++){
				System.out.print(YHT[i][j]+"\t");
			}
			System.out.println();
		}
	}
}