package tema4;
import java.util.Scanner;
public class N1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A[]=new int[10], B[]=new int[10];
		double C[]=new double[10];
		
		System.out.println("Valores vetor A:");
		
		for(int cont=0;cont<A.length; cont++)
		{
			A[cont]=in.nextInt();
		}
		
		System.out.println("Valores vetor B:");
		
		for(int cont=0;cont<B.length; cont++)
		{
			B[cont]=in.nextInt();
		}
		
		for(int cont=0;cont<C.length; cont++)
		{
			C[cont]= (float) A[cont]/B[cont];
		}
		
		System.out.println();
		System.out.println("Valores vetor C:");
		for(int cont=(C.length-1);cont>=0; cont--)
		{
			System.out.printf("%.2f ", C[cont]);
		}
		System.out.println();
		System.out.println("Valores pares vetor A:");
		for(int cont=0;cont<A.length; cont++)
		{
			if((A[cont]%2)==0) System.out.printf("%d ", A[cont]);
		}
		in.close();
	}

}
