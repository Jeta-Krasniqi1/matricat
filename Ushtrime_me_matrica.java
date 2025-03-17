package jetaKrasniqi2;

public class Ushtrime_me_matrica {

	public static void main(String[] args) {
		int[][] matrica_ime = Matricat.krijimi_i_matrices(3,3);
		System.out.println("Matrica:");
		for(int i = 0; i < matrica_ime.length; i++) {
			for(int j = 0; j < matrica_ime[i].length; j++) {
				System.out.print(matrica_ime[i][j] + " ");
			}
				System.out.println();
		}
		int shuma = Matricat.shuma_e_matrices(matrica_ime);
		System.out.println("Shuma e matrices eshte: " + shuma);
		double mesatarja = Matricat.mesatarja_e_matrices(matrica_ime);
		System.out.println("Mesatarja e matrices eshte: " + mesatarja);
		int maksimalja =  Matricat.maksimalja_e_matrices(matrica_ime);
		System.out.println("Maksimalja e matrices eshte: " + maksimalja);
		double minimalja = Matricat.minimalja_e_matrices(matrica_ime);
		System.out.println("Minimalja e matrices eshte: " + mesatarja);
	}
}
