package tema4;
import java.util.Arrays;
import java.util.Scanner;
public class N6 {

	public static void main(String[] args) {
		int codp[]=new int [10];
		int unip[]=new int [10];
		int unipi[]=new int [10];
		int unipr[]=new int [10];
		int codc=-1;
		int pedidos=0;
		
		Scanner in=new Scanner(System.in);
		
		for(int i=0;i<codp.length;i++)
		{
			unip[i]=(int) (1+Math.random()*(50));
			unipr[i]=unip[i];
			unipi[i]=unip[i];
			codp[i]=i+1;
		}
		
		do
		{
			int  igual=0;
			System.out.println("Digite o código do cliente:");
			codc=in.nextInt();
			if(codc<0) 
			{
				System.out.println("Código inválido tente novamente!");
				continue;
			}
			else if(codc==0) 
			{
				System.out.println("Saindo!");
				break;
			}
			int codpt;
			int unipt=0;
			int local=-1;
			int foi2=0;
			do
			{
				int foi=0;
				do
				{
					System.out.println("Digite o código do produto:");
					codpt=in.nextInt();
					for(int i=0;i<codp.length;i++)
					{
						if(codpt==codp[i]) 
						{
							foi++;
							local=i;
						}
					}
					if(foi==0) System.out.println("Código inexistente tente novamente!");
				}
				while(foi==0);
				System.out.println("Digite a quantidade do produto:");
				unipt=in.nextInt();
				if(unip[local]<unipt)
				{
					System.out.println("Não temos estoque suficiente dessa mercadoria!");
				}
				else
				{
					
					System.out.println("Pedido atendido!");
					unip[local]-=unipt;
					igual++;
				}
				System.out.println("Mais um produto? 0=Sim");
				foi2=in.nextInt();
			}while(foi2==0);
			
			if(igual>0)
			{
				for(int i=0;i<unip.length;i++)
				{
					unipr[i]=unip[i];
				}
				pedidos++;
			}
		}
		while(codc!=0);
		System.out.println("Código:           " + Arrays.toString(codp));
		System.out.println("Estoque original: " + Arrays.toString(unipi));
		System.out.println("Estoque         : " + Arrays.toString(unipr));
		System.out.println("Pedidos: "+ pedidos);
		
		in.close();
	}

}
