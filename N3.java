package tema4;
public class N3 {

	public static void main(String[] args) 
	{
		int v[] = new int[10]; 
		int soma=0, contpares=0, menor=10, maior=0;
		float med=0;
		
		
		for (int i=0; i<v.length; i++) {
			v[i] = (int) (1+Math.random()*(10));
		}
		
		
		System.out.println("Números gerados:");
		for (int i=0;i<v.length;i++) 
		{
			System.out.printf("%d ", v[i]);
		}
		
		
		for (int i=0;i<v.length;i++) 
		{
			soma+=v[i];
			if((v[i]%2)==0)
			{
				med+=v[i];
				contpares++;
			}
			if(v[i]>maior) maior=v[i];
			if(v[i]<menor) menor=v[i];
		}
		med= (float) med/contpares;
		
		System.out.println("\nSoma: " + soma);
		System.out.printf("Média dos pares: %.2f\n");
		System.out.println("Menor número: " + menor);
		System.out.println("Maior número: " + maior);
		
		
	}
}


