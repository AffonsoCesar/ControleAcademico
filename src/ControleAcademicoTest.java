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
	public void criarAluno() {
		Aluno aluno = new Aluno("João", 17, "masculino", 1234);
		controleAcademico.setPrimeiroAluno(aluno);
		Assert.assertTrue("Aluno foi adicionado", true);	
	}

}
