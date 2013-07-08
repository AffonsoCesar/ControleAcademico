import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;


public class ControleAcademicoTest {

	private ControleAcademico controleAcademico;
	
	@Before
	public void iniciar(){
		controleAcademico = new ControleAcademico();
	}
	
	@Test
	public void definirPrimeiroAluno(){
		controleAcademico.setPrimeiroAluno(true);
		Assert.assertTrue("espera que controleAcademico inicialize com null", controleAcademico.getPrimeiroAluno());
	}
	
	@Test
	public void addAluno(){
		Aluno aluno = new Aluno("João", 17, "masculino", 1234);
		controleAcademico.addAluno(aluno);
		Assert.assertTrue("espera que controleAcademico adicione aluno", controleAcademico.getPrimeiroAluno());
	}
}
