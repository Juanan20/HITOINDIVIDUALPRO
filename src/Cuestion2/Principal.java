package Cuestion2;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Principal {
	public static void main(String[] args) throws FileNotFoundException {

		File fichero = new File("preguntas.txt");
		Scanner lector = new Scanner(fichero);
		Scanner lector1 = new Scanner(System.in);
		String pre1 = lector.nextLine();
		System.out.println("1: " + pre1);
		String resp1 = lector1.nextLine();
		double nota = 0;
		if (resp1.equals("El Amazonas")) {
			System.out.println("Respuesta Correcta!");
			nota = nota + 1;
		}else{
			System.out.println("Respuesta Incorrecta...");
			nota = nota - 0.5;
		}
		String pre2 = lector.nextLine();
		System.out.println("2: " + pre2);
		String resp2 = lector1.nextLine();
		if (resp2.equals("China")) {
			System.out.println("Respuesta Correcta!");
			nota = nota + 1;
		} else {
			System.out.println("Respuesta Incorrecta...");
			nota = nota - 0.5;

		}
		String pre3 = lector.nextLine();
		System.out.println("3: " + pre3);
		String resp3 = lector1.nextLine();
		if (resp3.equals("El Burj Khalifa")) {
			System.out.println("Respuesta Correcta!");
			nota = nota + 1;
		} else {
			System.out.println("Respuesta Incorrecta...");
			nota = nota - 0.5;
		}
		String pre4 = lector.nextLine();
		System.out.println("4: " + pre4);
		String resp4 = lector1.nextLine();
		if (resp4.equals("En Rumanía")) {
			System.out.println("Respuesta Correcta!");
			nota = nota + 1;
		} else {
			System.out.println("Respuesta Incorrecta...");
			nota = nota - 0.5;
		}
		String pre5 = lector.nextLine();
		System.out.println("5: " + pre5);
		String resp5 = lector1.nextLine();
		if (resp5.equals("La Ciudad del Vaticano")) {
			System.out.println("Respuesta Correcta!");
			nota = nota + 1;
		} else {
			System.out.println("Respuesta Incorrecta...");
			nota = nota - 0.5;
		}
		String pre6 = lector.nextLine();
		System.out.println("6: " + pre6);
		String resp6 = lector1.nextLine();
		if (resp6.equals("Titanic")) {
			System.out.println("Respuesta Correcta!");
			nota = nota + 1;
		} else {
			System.out.println("Respuesta Incorrecta...");
			nota = nota - 0.5;
		}
		String pre7 = lector.nextLine();
		System.out.println("7: " + pre7);
		String resp7 = lector1.nextLine();
		if (resp7.equals("1989")) {
			System.out.println("Respuesta Correcta!");
			nota = nota + 1;
		} else {
			System.out.println("Respuesta Incorrecta...");
			nota = nota - 0.5;
		}
		String pre8 = lector.nextLine();
		System.out.println("8: " + pre8);
		String resp8 = lector1.nextLine();
		if (resp8.equals("De 1914 a 1918")) {
			System.out.println("Respuesta Correcta!");
			nota = nota + 1;
		} else {
			System.out.println("Respuesta Incorrecta...");
			nota = nota - 0.5;
		}
		String pre9 = lector.nextLine();
		System.out.println("9: " + pre9);
		String resp9 = lector1.nextLine();
		if (resp9.equals("De 1939 a 1945")) {
			System.out.println("Respuesta Correcta!");
			nota = nota + 1;
		} else {
			System.out.println("Respuesta Incorrecta...");
			nota = nota - 0.5;
		}
		String pre10 = lector.nextLine();
		System.out.println("10: " + pre10);
		String resp10 = lector1.nextLine();
		if (resp10.equals("El 4 de julio")) {
			System.out.println("Respuesta Correcta!");
			nota = nota + 1;
		} else {
			System.out.println("Respuesta Incorrecta...");
			nota = nota - 0.5;
		}
		System.out.println("--------FIN DE LAS PREGUNTAS----------");
		System.out.println("-------SUMA DE NOTAS: " + nota + "----");
		lector.close();
	}

}