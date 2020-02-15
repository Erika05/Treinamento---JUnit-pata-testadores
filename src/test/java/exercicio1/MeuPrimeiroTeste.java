package exercicio1;

import org.junit.Test;

public class MeuPrimeiroTeste {

	@Test
	public void teste1(){
		System.out.println("Teste1 executado."); 
	}
	@Test
	public void teste2(){
		System.out.println("Teste2 executado.");
	}
	public void naoTeste(){
		System.out.println("Esta mensagem não deve aparecer!");
	}
}
