package exercicio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int escolha;
		Scanner ler = new Scanner(System.in);
		Calculadora calcula=new Calculadora();
		System.out.println("Digite 1 para somar:\n 2 para subtrair:\n 3 para dividir:\n 4 para multiplicar:");
		escolha = ler.nextInt();
		
		if (escolha == 1) {
			calcula.soma();
		}else if(escolha==2) {
			calcula.subtrai();
			
		}else if(escolha==3) {
			calcula.dividir();
		}else if(escolha==4) {
			calcula.multiplica();
		}

	}

}
