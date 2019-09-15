import java.util.Scanner;

// 백준 2747 피보나치 수(n이 주어 졌을때 n번째 피보나치 수 출력)
//Fn = Fn-1 + Fn-2 (n>=2)
import java.util.Scanner;

public class baekjoon2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("피보나치 수를 구할 값을 입력하시오. ");
		int a =s.nextInt();
		int []arr = new int[50];
		
		arr[1]=1;
		arr[2]=1;
		
	    for(int i =3; i<50;i++) {
	    	arr[i]= arr[i-1]+ arr[i-2];
	    }
	    
		 
		
	}

}
