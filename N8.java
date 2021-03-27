package tema4;

import java.util.Arrays;
import java.util.Scanner;

public class N8 {

	public static void main(String[] args) {
		int ma[][]=new int [4][5];
		int tot[]=new int [4];
		int ven[]=new int [5];
		int total=0;
		
		Scanner in=new Scanner(System.in);
		
		for(int l=0;l<4;l++)
		{
			for(int c=0;c<5;c++)
			{
				System.out.println((c+1)+"º Vendedor "+(l+1)+ "º Semana:");
				ma[l][c]=in.nextInt();
			}
		}
		
		Arrays.fill(tot, 0);
		Arrays.fill(ven, 0);
		
		for(int l=0;l<4;l++)
		{
			for(int c=0;c<5;c++)
			{
				tot[l]+=ma[l][c];
				ven[c]+=ma[l][c];
				total+=ma[l][c];
			}
		}

		for(int l=0;l<4;l++)
		{
			System.out.println((l+1) +"º Semana = "+ tot[l]);
		}
		
		for(int c=0;c<5;c++)
		{
			System.out.println((c+1) +"º Vendedor = "+ ven[c]);
		}
		System.out.println("Total do mês = "+ total);
		
		in.close();
		
		for(int l=0;l<4;l++)
		{
			System.out.println(Arrays.toString(ma[l]));
		}
	}

}
