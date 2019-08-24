package br.ufc.poo.misto.exec;
import java.util.Scanner;
import br.ufc.poo.misto.modelo.Tamagoshi;

public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Tamagoshi NovoTamagoshi = new Tamagoshi();
		NovoTamagoshi.inicializar();
		
		int opcao = 0;	
		
		while(true) {	
			System.out.println("");
			System.out.println("MENU");
			System.out.println("");
			System.out.println("(1) COMER");
			System.out.println("(2) DORMIR");
			System.out.println("(3) BRINCAR");
			System.out.println("(4) BANHAR");
			System.out.println("");
			System.out.print("Selecione uma opção: ");
			opcao = in.nextInt();
			System.out.println("");

				switch(opcao) {
					case 1:
						NovoTamagoshi.eat();
						System.out.println("Nhame Nhame!!!");
						System.out.println("");
						System.out.print(NovoTamagoshi);
						break;
					case 2:
						NovoTamagoshi.sleep();
						System.out.println("ZZZZZZZzzzzzzzz!!!");
						System.out.println();						
						System.out.println(NovoTamagoshi);
						break;
					case 3:
						NovoTamagoshi.play();
						System.out.println("Chuta no Gol porra");
						System.out.println();						
						System.out.println(NovoTamagoshi);						
						break;
					case 4:
						NovoTamagoshi.shower();
						System.out.println("");
						System.out.println();						
						System.out.println(NovoTamagoshi);						
						break;
					default:
							System.out.println("Opção Inválida!!!");
				}
			Scanner pause = new Scanner(System.in);
			System.out.println("");
			System.out.println("Pressione ENTER para continuar...");
			pause.nextLine();
			
		}
	}				
}

