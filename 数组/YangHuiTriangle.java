public class YangHuiTriangle{

	public static void main(String[] args){

			//ʹ�ö�ά�����ӡһ��10���������
		int[][] YHT = new int[10][];

				for(int i = 0;i < YHT.length;i ++){

					YHT[i] = new int[i+1];
				
				//��ÿ��һά���鿪�ٿռ�

					for(int j = 0;j < YHT[i].length;j ++){
						if(j == 0 || j == YHT[i].length - 1){
							YHT[i][j] = 1;
							//ÿһ�е�һ�������һ��Ԫ�ض���1
						}else{
							YHT[i][j] = YHT[i-1][j] + YHT[i-1][j-1];
							//�м��Ԫ��
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