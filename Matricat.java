package jetaKrasniqi2;

import java.util.Scanner;
public class Matricat {
	public static int[][] krijimi_i_matrices(int a, int b) {
		int [][] matrica = new int [a][b];
		Scanner input = new Scanner(System.in);
		System.out.println("Shtyp " + a*b + " elemente per matricen: ");
		for(int i = 0; i < matrica.length; i++) {
			for(int j = 0; j < matrica[i].length; j++) {
				matrica[i][j] = input.nextInt();
			}
			
		}
		input.close();
		return matrica;
	}
	public static double mesatarja_e_matrices(int [][] a) {
		double mesatarja = 0;
		int shuma = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				shuma += a[i][j];
			}
		}
		mesatarja = shuma / (a.length * a[0].length);
		return mesatarja;
		
	}
	
	public static int shuma_e_matrices(int[][] a) {
		int shuma = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				shuma += a[i][j];
			}
		}
		return shuma;
	}
	public static int maksimalja_e_matrices(int[][] a) {
		int max = a[0][0];
		for(int i = 0; i < a.length; i++) {
			for(int j = 1; j < a[i].length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
				}
			}
		}
		return max; 
		}
	public static int minimalja_e_matrices(int[][] a) {
		int min = a[0][0];
		for(int i = 0; i < a.length; i++) {
			for(int j = 1; j < a[i].length; j++) {
				if (a[i][j] < min) {
					min = a[i][j];
				}
			}
		}
		return min; 
		}
}
	
