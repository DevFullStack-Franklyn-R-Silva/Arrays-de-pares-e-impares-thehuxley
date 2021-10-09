package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> listImpar = new ArrayList<>();
		List<Integer> listPar = new ArrayList<>();

		int contPar = 0;
		int contImpar = 0;
		
		for (int i = 0; i < 15; i++) {
			int x = sc.nextInt();

			if (x % 2 == 0) {
				listPar.add(x);
				if (listPar.size() > 4) {
					for (Integer p : listPar) {
						System.out.println("par[" + contPar + "] = " + p);
						contPar++;
					}
					contPar = 0;
					listPar.clear();
				}

			} else {
				listImpar.add(x);
				if (listImpar.size() > 4) {
					for (Integer p : listImpar) {
						System.out.println("impar[" + contImpar + "] = " + p);
						contImpar++;
					}
					contImpar = 0;
					listImpar.clear();
				}
			}
		}

		for (Integer p : listImpar) {
			System.out.println("impar[" + contImpar + "] = " + p);
			contImpar++;

		}
		for (Integer p : listPar) {
			System.out.println("par[" + contPar + "] = " + p);
			contPar++;

		}

		sc.close();
	}

}
