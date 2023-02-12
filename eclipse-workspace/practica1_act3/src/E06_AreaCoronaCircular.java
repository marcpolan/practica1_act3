import java.util.Scanner;

public class E06_AreaCoronaCircular {
	public static void main(String[] args) {

		Scanner teclat = new Scanner(System.in);

		System.out.print("Escribe el radio interior : ");
		double radioInt = teclat.nextDouble();

		System.out.print("Escribe el radio exterior : ");
		double radioExt = teclat.nextDouble();;
		
		Cercle petit=new Cercle(radioInt);
		Cercle gran=new Cercle(radioExt);

		Corona ccircular=new Corona(petit, gran);

		System.out.println("\nL'àrea del petit és "+petit.area());
		System.out.println("L'àrea del petit és "+gran.area());
		System.out.println("L'àrea de la corona "+ccircular.area());

	}
}
