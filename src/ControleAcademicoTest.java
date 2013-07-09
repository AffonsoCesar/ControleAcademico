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
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void procurarAlunoPorCPF(){
		String nome = "João";
		controleAcademico.procuraAlunoPorNome(nome);
		Assert.assertTrue("espera retornar o nome do aluno", controleAcademico.procurarAlunoPorNomeConfirmacao(nome));
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setNomeAluno(){
		String nome = "José";
		int matricula = 1234587;
		controleAcademico.setNomeAluno(nome, matricula);
		Assert.assertTrue("espera trocar o nome do aluno", controleAcademico.setNomeAlunoConfirmacao(nome, matricula));
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setIdadeAluno(){
		int idade = 18;
		int matricula = 1254125;
		controleAcademico.setIdadeAluno(idade, matricula);
		Assert.assertTrue("espera trocar a idade do aluno", controleAcademico.setIdadeAlunoConfirmacao(idade, matricula));
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setSexoAluno(){
		String sexo = "feminino";
		int matricula = 1254125;
		controleAcademico.setSexoAluno(sexo, matricula);
		Assert.assertTrue("espera trocar o sexo", controleAcademico.setSexoAlunoConfirmacao(sexo, matricula));
	}
}
