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
	public void addPrimeiroAluno(){
		Aluno aluno = new Aluno("João", 18, "masculino", 12354, 1254125, "rua felipe rodrigues");
		controleAcademico.setPrimeiroAluno(aluno);
	}
	
	@Test
	public void addAluno(){
		Aluno aluno = new Aluno("João", 18, "masculino", 12354, 1254125, "rua felipe rodrigues");
		controleAcademico.addAluno(aluno);
	}
	
	@Test
	public void removerAluno(){
		Aluno aluno = new Aluno("João", 18, "masculino", 12354, 1254125, "rua felipe rodrigues");
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
	public void procurarAlunoPorNome(){
		String nome = "João";
		controleAcademico.procuraAlunoPorNome(nome);
		Assert.assertTrue("espera retornar o nome do aluno", controleAcademico.procurarAlunoPorNomeConfirmacao(nome));
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void procurarAlunoPorCPF(){
		int CPF = 0125412544;
		controleAcademico.procurarAlunoPorCPF(CPF);
		Assert.assertTrue("espera retornar o nome do aluno", controleAcademico.procuraAlunoPorCPFConfirmacao(CPF));
	}
	@Test(expected=ExcecaoControleAcademico.class)
	public void setNomeAlunoPorMatricula(){
		String nome = "José";
		int matricula = 1234587;
		controleAcademico.setNomeAlunoPorMatricula(nome, matricula);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setIdadeAlunoPorMatricula(){
		int idade = 18;
		int matricula = 1254125;
		controleAcademico.setIdadeAlunoPorMatricula(idade, matricula);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setSexoAlunoPorMatricula(){
		String sexo = "feminino";
		int matricula = 1254125;
		controleAcademico.setSexoAlunoPorMatricula(sexo, matricula);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setMatriculaAlunoPorMatricula(){
		int novaMatricula = 12541254;
		int matricula = 12525414;
		controleAcademico.setMatriculaAlunoPorMatricula(novaMatricula, matricula);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setCPFAlunoPorMatricula(){
		int CPF = 01202355412;
		int matricula = 01242545214;
		controleAcademico.setCPFAlunoPorMatricula(CPF, matricula);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setEnderecoPorMatricula(){
		String endereco = "rua 7 de setembro";
		int matricula = 12454125;
		controleAcademico.setEnderecoAlunoPorMatricula(endereco, matricula);
	}

	@Test(expected=ExcecaoControleAcademico.class)
	public void setNomeAlunoPorNome(){
		String novoNome = "José";
		String nome = "João";
		controleAcademico.setNomeAlunoPorNome(novoNome, nome);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setIdadeAlunoPorNome(){
		int idade = 25;
		String nome = "João";
		controleAcademico.setIdadeAlunoPorNome(idade, nome);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setSexoAlunoPorNome(){
		String sexo = "masculino";
		String nome = "João";
		controleAcademico.setSexoAlunoPorNome(sexo, nome);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setMatriculaAlunoPorNome(){
		int matricula = 123524145;
		String nome = "João";
		controleAcademico.setMatriculaAlunoPorNome(matricula, nome);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setCPFAlunoPorNome(){
		int CPF = 125412589;
		String nome = "João";
		controleAcademico.setCPFAlunoPorNome(CPF, nome);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setEnderecoAlunoPorNome(){
		String endereco = "rua pedro batista";
		String nome = "Severino";
		controleAcademico.setEnderecoAlunoProNome(endereco, nome);
	}
	
	@Test
	public void getNomeAluno(){
		Aluno aluno = new Aluno("João", 18, "masculino", 12354, 1254125, "rua felipe rodrigues");
		controleAcademico.getNomeAluno(aluno);
	}
	
	@Test
	public void getIdadeAluno(){
		Aluno aluno = new Aluno("João", 18, "masculino", 12354, 1254125, "rua felipe rodrigues");
		controleAcademico.getIdadeAluno(aluno);
	}
	
	@Test
	public void getSexoAluno(){
		Aluno aluno = new Aluno("João", 18, "masculino", 12354, 1254125, "rua felipe rodrigues");
		controleAcademico.getSexoAluno(aluno);
	}
	
	@Test
	public void getMatriculaAluno(){
		Aluno aluno = new Aluno("João", 18, "masculino", 12354, 1254125, "rua felipe rodrigues");
		controleAcademico.getMatriculaAluno(aluno);
	}
	
	@Test
	public void getCPFAluno(){
		Aluno aluno = new Aluno("João", 18, "masculino", 12354, 1254125, "rua felipe rodrigues");
		controleAcademico.getCPFAluno(aluno);
	}
	
	
	
	
}
