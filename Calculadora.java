package exercicio;

import java.util.Scanner;

public class Calculadora {
	double valor1;
	double valor2;
	double r;
	Scanner ler = new Scanner(System.in);

	double soma() {
		System.out.println("Digite o primeiro numero para a soma:");
		this.valor1 = ler.nextDouble();
		System.out.println("Digite o segundo numero para a soma:");
		this.valor2 = ler.nextDouble();
		r = this.valor1 + this.valor2;
		System.out.println(this.r);
		return r;
	}

	double subtrai() {
		System.out.println("Digite o primeiro numero para a subtração:");
		this.valor1 = ler.nextDouble();
		System.out.println("Digite o segundo numero para a subtração:");
		this.valor2 = ler.nextDouble();
		r = this.valor1 - this.valor2;
		System.out.println(this.r);
		return r;

	}

	double dividir() {
		System.out.println("Digite o primeiro numero para a divisão:");
		this.valor1 = ler.nextDouble();
		System.out.println("Digite o segundo numero para a divisão:");
		this.valor2 = ler.nextDouble();
		r = this.valor1 / this.valor2;
		System.out.println(this.r);
		return r;

	}

	double multiplica() {
		System.out.println("Informe o primeiro numero para a multipliçaõ:");
		this.valor1 = ler.nextDouble();
		System.out.println("Informe o segundo numero para a multipliçaõ:");
		this.valor2 = ler.nextDouble();
		r = this.valor1 * this.valor2;
		System.out.println(this.r);
		return r;

	}

}
