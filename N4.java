package tema4;

import java.util.Arrays;

public class N4 {

	public static void main(String[] args) 
	{
		int v[] = new int[100]; 
		int sor[]= new int[6];
		int mais, valor;
		Arrays.fill(sor, 0);
		
		
		for (int i=0; i<v.length; i++) {
			v[i] = (int) (1+Math.random()*(6));
		}
		
		
		System.out.printf("N�meros gerados:");
		for (int i=0;i<v.length;i++) 
		{
			if((i%10)==0) System.out.println(); //melhor vizualiza��o
			System.out.printf("%d ", v[i]);
		}
		
		for (int i=0;i<v.length;i++) 
		{
			switch (v[i])
			{
				case 1:
				{
					sor[0]++;
					break;
				}
				case 2:
				{
					sor[1]++;
					break;
				}
				case 3:
				{
					sor[2]++;
					break;
				}
				case 4:
				{
					sor[3]++;
					break;
				}
				case 5:
				{
					sor[4]++;
					break;
				}
				case 6:
				{
					sor[5]++;
					break;
				}
			}
		}
		
		System.out.println();
		for(int i=0; i<6;i++)
		{
			System.out.printf("O valor %d foi sorteador %d vezes.\n", (i+1), sor[i]);
		}
		
		
		mais=sor[0];
		valor=0;
		for(int i=1; i<6;i++)
		{
			if(sor[i]>mais) 
			{
				mais=sor[i];
				valor=i+1;	
			}
		}
		
		System.out.printf("O valor mais sorteado foi %d, com %d vezes.\n", valor, mais);
	}
}



