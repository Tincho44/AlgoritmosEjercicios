/*

Ejercicio 1)

No, yo pac.

/n 

Vos zacata pac.

/n 

Yo pac.

*/
/*
Ejercicio 2)

a)

La de main

b)

*/

public class Zumbido 
{
	public static void desconcertar (String dirigible) (8)
	{
		System.out.println (dirigible); (9)
		sipo ("ping", -5); (10)
	}

	public static void sipo (String membrillo, int flag) (3) (11)
	{
		if (flag < 0) (4)(12)
		{
			System.out.println (membrillo + " sup"); (13)
		} 
		else (5)
			{
				System.out.println ("ik"); (6)
				desconcertar (membrillo); (7)
				System.out.println ("muaa-ja-ja-ja"); (14)
			}
	}
	public static void main (String[] args) (1)
		{
		sipo ("traqueteo", 13); (2)
		}
}

// Ejercicio 3)

public class Multsuma
{

	public static void multsuma(double a, double b, double c)
	{
		
		double multsumaResult = (a*b)+c;
		System.out.println (x);

	}

	public static void main (String[] args)
	{
		multsuma (4,5,6);
	}

}
