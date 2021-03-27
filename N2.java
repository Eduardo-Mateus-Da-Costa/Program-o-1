package tema4;
import java.util.Scanner;
public class N2 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		char a[]=new char[10];
		
		for(int cont=0;cont<a.length;cont++)
		{
			a[cont]= in.next().charAt(0);
		}
		System.out.println();
		for(int cont=0;cont<a.length;cont++)
		{
			System.out.printf("%c ", a[cont]);
		}
		System.out.println();
		for(int cont=(a.length-1);cont>=0;cont--)
		{
			System.out.printf("%c ", a[cont]);
		}
		System.out.println();
		
		in.close();
	}

}
