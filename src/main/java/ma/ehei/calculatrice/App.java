package ma.ehei.calculatrice;

public class App {
	public static void main(String[] args) {
		System.out.println(Calculatrice.add(5, 5));
		Calculatrice calculatrice = new Calculatrice();
        int resultatMultiplication = calculatrice.multiplication(3, 4);
        System.out.println("Résultat de la multiplication : " + resultatMultiplication);
    
	}
}
