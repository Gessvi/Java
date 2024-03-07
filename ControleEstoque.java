public class Main
{
	public static void main(String[] args) {
    
		System.out.println ("--- PRODUTOS DO ESTOQUE ---");
			System.out.println ("Processador Cynix");
				System.out.println("Processador Intel Core");
					System.out.println ("Processador AMD");
					
 System.out.println ("===================================================================");
			         System.out.println ();
	int m1 = 500;
	int m2 = 600;
	int m3 = 1000;
    int	tr = 7;
	int lr = 60;
    int	ea = 100;
    float vmd, emin, emax, tmd;
    
		System.out.println ("Nome do produto: Processador Cynix");
			System.out.println("Mes 01 :" + m1);
				System.out.println ("Mes 02: " + m2);
					System.out.println ("Mes 03: " + m3);
				        System.out.println ("Tempo de reposicao: " + tr);
					        System.out.println ("Lote de repocisao: " + lr);
					            System.out.println ("Estoque atual: " + ea);
    
	vmd = (m1 + m2+ m3)/3/25;
    emin = (tr * vmd);
    emax = (lr + emin);
    
        System.out.println("Valor Media Diaria = " + vmd);
            System.out.println ("Estoque Minimo = " + emin);
              System.out.println ("Estoque Máximo = " + emax);
              
              if (ea > min)
              {
                  System.out.println (" \n --Nao Comprar-- \n");
              }else {
                  System.out.println (" \n --Comprar-- \n");
              }
              
	System.out.println ("===================================================================");   
					             System.out.println();
	
	int a = 100;
	int b = 100;
	int c = 100;
    int	Tr = 5;
	int Lr = 50;
    int	Ea = 70;
    
		System.out.println ("Nome do produto: Processador Intel Core");
			System.out.println("Mes 01 :" + a);
				System.out.println ("Mes 02: " + b);
					System.out.println ("Mes 03: " + c);
				        System.out.println ("Tempo de reposicao: " + Tr);
					        System.out.println ("Lote de repocisao: " + Lr);
						        System.out.println ("Estoque atual: " + Ea);
    Vmd = (a + b+ c)/3/25;
    Emin = (Tr * Vmd);
    Emax = (Lr + Emin);
    
        System.out.println("Valor Media Diaria = " + Vmd);
            System.out.println ("Estoque Minimo = " + Emin);
              System.out.println ("Estoque Máximo = " + Emax);
	
	 if (Ea > Min)
              {
                  System.out.println (" \n --Nao Comprar-- \n");
              }else {
                  System.out.println (" \n --Comprar-- \n");
              }
	 System.out.println ("===================================================================");
						         System.out.println ();
	int A = 250;
	int B = 350;
	int C = 450;
    int	TR = 9;
	int LR = 100;
    int	EA = 80;
    
		 System.out.println ("Nome do produto: Processador AMD");
			System.out.println("Mes 01 :" + A);
				System.out.println ("Mes 02: " + B);
					System.out.println ("Mes 03: " + C);
				        System.out.println ("Tempo de reposicao: " + TR);
					        System.out.println ("Lote de repocisao: " + LR);
						        System.out.println ("Estoque atual: " + EA);
    
    
	VMD = (A + B+ C)/3/25;
    EMIN = (TR * VMD);
    EMAX = (LR + EMIN);	
    
       System.out.println("Valor Media Diaria = " + VMD);
            System.out.println ("Estoque Minimo = " + EMIN);
              System.out.println ("Estoque Máximo = " + EMAX);
              
               if (EA > MIN)
              {
                  System.out.println (" \n --Nao Comprar-- \n");
              }else {
                  System.out.println (" \n --Comprar-- \n");
              }
	}
}
