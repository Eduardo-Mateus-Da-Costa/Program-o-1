package tema4;

import java.util.Arrays;
import java.util.Scanner;

public class N5 {

	public static void main(String[] args) {
		char jan[]=new char [20];
		char cor[]=new char [20];
		int op=0;
		int lug, cheio;
		int pol;
		Scanner in=new Scanner(System.in);
		
		Arrays.fill(jan, '0');
		Arrays.fill(cor, '0');
		
		do
		{
			System.out.println("1-Vender passagens\r\n"
					+ "2-Mostrar o mapa de ocupação do ônibus\r\n"
					+ "");
			op=in.nextInt();
			
			cheio=0;
			for(int i=0; i<jan.length;i++)
			{
				if(jan[i]=='X') cheio++;
				if(cor[i]=='X') cheio++;
			}
			if(cheio==40)
			{
				System.out.println("Ônibus lotado!");
				op=3;
				break;
			}
			
			pol=-1;
			lug=0;
			switch (op)
			{
			case 1:
			{
				System.out.println("1-Janela\r\n" + "2-Corredor\r\n" + "");
				lug=in.nextInt();
				System.out.println("Número da poltrona 1-20:");
				pol=in.nextInt();
				if(lug==1)
				{
					if (jan[pol-1]=='0') 
					{
						System.out.println("Venda efetivada!");
						jan[pol-1]='X';
					}
					else
					{
						System.out.println("Poltrona já ocupada!");
					}
				}
				else
				{
					if (cor[pol-1]=='0') 
					{
						System.out.println("Venda efetivada!");
						cor[pol-1]='X';
					}
					else
					{
						System.out.println("Poltrona já ocupada!");
					}
				}
				break;
			}
			case 2:
			{
				System.out.printf("Janela:");
				for(int i=0;i<(jan.length-10);i++)
				{
					System.out.printf(" %c ", jan[i]);
				}
				System.out.println();
				System.out.printf("Corredor:");
				for(int i=0;i<(cor.length-10);i++)
				{
					System.out.printf(" %c ", cor[i]);
				}
				System.out.println();
				System.out.printf("Corredor:");
				for(int i=(cor.length-10);i<cor.length;i++)
				{
					System.out.printf(" %c ", jan[i]);
				}
				System.out.println();
				System.out.printf("Janela:");
				for(int i=(jan.length-10);i<jan.length;i++)
				{
					System.out.printf(" %c ", jan[i]);
				}
				System.out.println();
				
			}
			}
		}
		while (op!=3);
		
		in.close();
		
	}

}
