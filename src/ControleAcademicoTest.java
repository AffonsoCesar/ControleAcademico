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
	public void addAluno(){
		Aluno aluno = new Aluno("João", 17, "masculino", 1234);
		controleAcademico.addAluno(aluno);
		Assert.assertTrue("espera que controleAcademico adicione aluno", controleAcademico.getAddAluno());
	}
	
	@Test
	public void removerAluno(){
		Aluno aluno = new Aluno("João", 17, "masculino", 1234);
		controleAcademico.removerAluno(aluno);
		Assert.assertTrue("espera que remova aluno", controleAcademico.getAlunoRemovido(aluno));
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void procurarAlunoPorMatricula(){
		int matricula = 12458547;
		controleAcademico.procuraAlunoPorMatricula(matricula);
		Assert.assertTrue("espera retornar nome do aluno", controleAcademico.procuraAlunoPormatriculaConfirmacao(matricula));
	}
}
