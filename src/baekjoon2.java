import java.util.Scanner;

// ���� 2747 �Ǻ���ġ ��(n�� �־� ������ n��° �Ǻ���ġ �� ���)
//Fn = Fn-1 + Fn-2 (n>=2)
import java.util.Scanner;

public class baekjoon2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("�Ǻ���ġ ���� ���� ���� �Է��Ͻÿ�. ");
		int a =s.nextInt();
		int []arr = new int[50];
		
		arr[1]=1;
		arr[2]=1;
		
	    for(int i =3; i<50;i++) {
	    	arr[i]= arr[i-1]+ arr[i-2];
	    }
	    
		 
		
	}

}
