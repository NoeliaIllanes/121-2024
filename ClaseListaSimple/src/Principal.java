public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LS_NormalPer A = new LS_NormalPer();
		LS_NormalPer B = new LS_NormalPer();
		
		System.out.println(A.esVacia());
		System.out.println("nro de nodos de la lista: " + A.nroNodos());
		
//		A.leer2(4);
//		A.mostrar();
		
		Persona z1 = new Persona("marcos", 15);
		Persona z2 = new Persona("luis", 22);
		Persona z3 = new Persona("alan", 20);
		Persona z4 = new Persona("lupe", 22);
		Persona z5 = new Persona("marcelo", 25);
		Persona z6 = new Persona("wilson", 19);
		
		A.adiFinal(z4);
		A.adiFinal(z3);
		A.adiFinal(z2);
		A.adiFinal(z1);
		
		//A.adiFinal(z5);
		
		A.mostrar();
	
		System.out.println("********************************************");
		
		B.adiPrincipio(z4);
		B.adiPrincipio(z3);
		B.adiPrincipio(z2);
		B.adiPrincipio(z1);
		
		B.mostrar();
	
	}
}



