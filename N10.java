package tema4;

import java.util.Arrays;
import java.util.Scanner;

public class N10 {

	public static void main(String[] args) {
		char m[][]= {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
		int terminou=0, inverte=0;
		Scanner in=new Scanner(System.in);
		
		do 
		{
			for (int l=0; l<3; l++)
			{
				System.out.println(Arrays.toString(m[l]));
			}
			
			int opl, opc;
			if(inverte==0)
			{
				System.out.println("Vez do jogador 1 (linha)(coluna):");
				opl=in.nextInt();
				opc=in.nextInt();
				if(m[opl-1][opc-1]==' ')
				{
					System.out.println("Jogada efetuada!");
					inverte=1;
					terminou++;
					m[opl-1][opc-1]='X';
				}
				else 
				{
					System.out.println("Posição inválida!");
					continue;
				}
			}
			else
			{
				System.out.println("Vez do jogador 2 (linha)(coluna):");
				opl=in.nextInt();
				opc=in.nextInt();
				if(m[opl-1][opc-1]==' ')
				{
					System.out.println("Jogada efetuada!");
					inverte=0;
					terminou++;
					m[opl-1][opc-1]='O';
				}
				else 
				{
					System.out.println("Posição inválida!");
					continue;
				}
			}
			}
			
		while(terminou!=9);
		
		in.close();

	}
	
}
