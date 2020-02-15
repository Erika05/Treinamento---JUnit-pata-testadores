package exercicio14;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import categorias.Posititivos;
import categorias.Smoke;

public class TesteCategorizado {
	
	@Test
	@Category(Smoke.class)
	public void teste1()
	{
		
	}
	
	@Test
	@Category(Posititivos.class)
	public void teste2()
	{
		
	}
	
	@Test
	public void teste3()
	{
		
	}

}
