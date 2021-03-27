package tema4;

import java.util.Arrays;
import java.util.Scanner;

public class N9 {

	public static void main(String[] args) {
		char nome[][]= {{'V','i','l','a'},{'C','e','n','t','r','o'},{'F','u','n','d','o'},{'P','a','u','l','o'},{'V','e','l','h','a'}};
		int ma[][]= {{0, 10, 20, 30, 40},{10, 0, 25, 35, 45},{20, 25, 0, 55, 60},{30, 35, 55, 0, 90},{40, 45, 60, 90, 0}};
		int dist=0;
		
		Scanner in=new Scanner(System.in);
		
		for(int i=0; i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i>j)
				{
					System.out.println("Digite a distância entre a cidade " + (i+1) +" e a cidade " + (j+1) +" :");
					dist=in.nextInt();
					ma[i][j]=dist;
					ma[j][i]=dist;
				}
				else if (j==i)
				{
					ma[i][j]=0;
				}
			}
		}
		
		for(int i=0; i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.println(Arrays.toString(nome[j])+ " até "+ Arrays.toString(nome[i])+" = "+ ma[i][j]);
			}
		}
		
		in.close();
	}

}
