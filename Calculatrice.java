package Devoir_�4;

public class Calculatrice 
{

	public static void main(String[] args)
	{
	String Op;
	int Nb, Res;
	
	Op = "";
	
	while (Op.equals("F")==false)  {
	  Res=Saisie.lire_int("Quel est le premier nombre ?");
	  Op=Saisie.lire_String("Quel est votre op�rateur ?");
	  while ((Op.equals("F")==false) && (Op.equals("C")==false)){
		  Nb=Saisie.lire_int("Quel est votre deuxi�me nombre ?");
		  
		  if (Op.equals("+")) Res += Nb;
		  else if (Op.equals("-")) Res -= Nb;
		  		else if (Op.equals("*")) Res *= Nb;
		  
		  System.out.println("Votre r�sultat est "+Res); 
		  
		  Op=Saisie.lire_String("Quel est l'op�rateur suivant ?");
		  
		  
		  
	  }
	  }
	
	System.out.println("Fin des calculs");
	}
		
		
	}


