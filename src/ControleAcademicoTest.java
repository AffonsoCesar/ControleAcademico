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
		Aluno aluno = new Aluno("Jo�o", 18, "masculino", 12354, 1254125, "rua felipe rodrigues");
		controleAcademico.setPrimeiroAluno(aluno);
	}
	
	@Test
	public void addAluno(){
		Aluno aluno = new Aluno("Jo�o", 18, "masculino", 12354, 1254125, "rua felipe rodrigues");
		controleAcademico.addAluno(aluno);
	}
	
	@Test
	public void removerAluno(){
		Aluno aluno = new Aluno("Jo�o", 18, "masculino", 12354, 1254125, "rua felipe rodrigues");
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
		String nome = "Jo�o";
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
		String nome = "Jos�";
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
		String novoNome = "Jos�";
		String nome = "Jo�o";
		controleAcademico.setNomeAlunoPorNome(novoNome, nome);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setIdadeAlunoPorNome(){
		int idade = 25;
		String nome = "Jo�o";
		controleAcademico.setIdadeAlunoPorNome(idade, nome);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setSexoAlunoPorNome(){
		String sexo = "masculino";
		String nome = "Jo�o";
		controleAcademico.setSexoAlunoPorNome(sexo, nome);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setMatriculaAlunoPorNome(){
		int matricula = 123524145;
		String nome = "Jo�o";
		controleAcademico.setMatriculaAlunoPorNome(matricula, nome);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setCPFAlunoPorNome(){
		int CPF = 125412589;
		String nome = "Jo�o";
		controleAcademico.setCPFAlunoPorNome(CPF, nome);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setEnderecoAlunoPorNome(){
		String endereco = "rua pedro batista";
		String nome = "Severino";
		controleAcademico.setEnderecoAlunoProNome(endereco, nome);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setNomeAlunoPorCPF(){
		String nome = "Jo�o";
		int CPF = 1252145254;
		controleAcademico.setNomeAlunoPorCPF(nome, CPF);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setIdadeAlunoPorCPF(){
		int idade = 25;
		int CPF = 01254125;
		controleAcademico.setIdadeAlunoPorCPF(idade, CPF);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setSexoAlunoPorCPF(){
		String sexo = "Masculino";
		int CPF = 12541254;
		controleAcademico.setSexoAlunoPorCPF(sexo, CPF);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setMatriculaAlunoPorCPF(){
		int matricula = 012412115;
		int CPF = 1252514452;
		controleAcademico.setMatriculaAlunoPorCPF(matricula, CPF);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setCPFAlunoPorCPF(){
		int novoCPF = 1245412541;
		int CPF = 1256252541;
		controleAcademico.setCPFalunoPorCPF(novoCPF, CPF);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setEnderecoAlunoPorCPF(){
		String endereco = "rua severino de menezes lira";
		int CPF = 1254401254;
		controleAcademico.setEnderecoAlunoPorCPF(endereco, CPF);
	}
	
	@Test
	public void getNomeAluno(){
		Aluno aluno = new Aluno("Jo�o", 18, "masculino", 12354, 1254125, "rua felipe rodrigues");
		controleAcademico.getNomeAluno(aluno);
	}
	
	@Test
	public void getIdadeAluno(){
		Aluno aluno = new Aluno("Jo�o", 18, "masculino", 12354, 1254125, "rua felipe rodrigues");
		controleAcademico.getIdadeAluno(aluno);
	}
	
	@Test
	public void getSexoAluno(){
		Aluno aluno = new Aluno("Jo�o", 18, "masculino", 12354, 1254125, "rua felipe rodrigues");
		controleAcademico.getSexoAluno(aluno);
	}
	
	@Test
	public void getMatriculaAluno(){
		Aluno aluno = new Aluno("Jo�o", 18, "masculino", 12354, 1254125, "rua felipe rodrigues");
		controleAcademico.getMatriculaAluno(aluno);
	}
	
	@Test
	public void getCPFAluno(){
		Aluno aluno = new Aluno("Jo�o", 18, "masculino", 12354, 1254125, "rua felipe rodrigues");
		controleAcademico.getCPFAluno(aluno);
	}
	
	@Test
	public void addPrimeiroProfessor(){
		Professor professor = new Professor("Jo�o", "computa��o", 1254125, "rua b");
		controleAcademico.setPrimeiroProfessor(professor);
	}
	
	@Test
	public void addProfessor(){
		Professor professor = new Professor("Jo�o", "computa��o", 1254125, "rua b");
		controleAcademico.addProfessor(professor);
	}
	
	@Test
	public void removerProfessor(){
		Professor professor = new Professor("Jo�o", "computa��o", 1254125, "rua b");
		controleAcademico.removerProfessor(professor);
		Assert.assertTrue("espera que remova o professor", controleAcademico.getProfessorRemovido(professor));
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void procurarProfessorPorNome(){
		String nome = "Joaquim";
		controleAcademico.procuraProfessorPorNome(nome);
		Assert.assertTrue("Espera retornar o nome do professor", controleAcademico.procuraProfessorPorNomeConfirmacao(nome));
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void procurarProfessorPorMateria(){
		String materia = "matem�tica";
		controleAcademico.procuraProfessorPorMateria(materia);
		Assert.assertTrue("espera retornar o nome do professor", controleAcademico.procuraProfessorPorMateriaComfirmacao(materia));
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void procurarProfessorPorCPF(){
		int CPF = 1020232001;
		controleAcademico.procuraProfessorPorCPF(CPF);
		Assert.assertTrue("espera retornar o nome do professor", controleAcademico.procuraProfessorCPFConfirmacao(CPF));
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void procuraProfessorPorEndereco(){
		String endereco = "Rua da mangueira";
		controleAcademico.procuraProfessorPorEndereco(endereco);
		Assert.assertTrue("espera retornar o nome do professor", controleAcademico.procuraProfessorPorEnderecoConfirmacao(endereco));
	}
}