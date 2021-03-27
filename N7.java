package tema4;

import java.util.Arrays;

public class N7 {

	public static void main(String[] args) {
		int ma[][]=new int [4][3];
		int col[]=new int [3];
		int lin[]=new int [4];
		
		for (int l=0;l<4;l++)
		{
			for(int c=0;c<3;c++)
			{
				ma[l][c]=(int) (1+Math.random()*(10));
			}
		}

		Arrays.fill(col, 0);
		Arrays.fill(lin, 0);
		
		for (int l=0;l<4;l++)
		{
			for(int c=0;c<3;c++)
			{
				lin[l]+=ma[l][c];
				col[c]+=ma[l][c];
			}
		}
		for(int l=0;l<4;l++)
		{
			System.out.println(Arrays.toString(ma[l]) + " = " + lin[l]);
		}
		System.out.println("|| || || ");
		System.out.println(Arrays.toString(col));
		
	}
}
