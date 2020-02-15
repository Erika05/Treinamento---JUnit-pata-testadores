package exercicio13;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class ValidacoesFluentes {

	@Test
	public void validacaoEqualsto()
	{
		String produto="TV 40 polegadas";
		assertThat(produto,equalTo("TV 40 polegadas"));
	   	}
	
	@Test
	public void validacaoIs()
	{
		int codigo=50;
		assertThat(codigo,is(50));
	    
	}
	
	
	@Test
	public void validacaoAnyOf()
	{
		String resultadoObtido="A cor selecionada foi vermelha.";
		assertThat(resultadoObtido,anyOf(containsString("vermelha"),containsString("vermelho")));
	    
	}
	
	
	@Test
	public void validacaoHasItens()
	{
		List<String> listaProdutos=new ArrayList<String>();
		listaProdutos.add("iPhone 8 Plus 64GB");
		listaProdutos.add("Adaptador USB-C VGA");
		listaProdutos.add("Apple TV 4 geracao");
		assertThat(listaProdutos,hasItem("Adaptador USB-C VGA"));
	    
	}
}
