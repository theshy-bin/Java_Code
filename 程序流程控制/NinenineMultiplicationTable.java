public class NinenineMultiplicationTable{
//??ӡ?žų˷???
	public static void main(String[] args){

		int i = 1;
		int j = 1;

		for(i = 1;i <= 9;i++){
			for(j = 1;j <= i;j++){
				System.out.print("\t" + j + "*" + i + "=" + i*j);
			}
			System.out.println('\n');

		}
	}
}