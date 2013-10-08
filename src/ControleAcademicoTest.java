import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class ControleAcademicoTest {
	private ControleAcademico controleAcademico;
	private static final String ENDERECO_ALUNO = "Rua Pedro Batista";
	private static final int CPF_ALUNO = 251254125;
	private static final int MATRICULA_ALUNO = 81152424;
	private static final String SEXO_ALUNO = "Masculino";
	private static final int IDADE_ALUNO = 18;
	private static final String NOME_ALUNO = "João";
	private static final String ENDERECO_ALUNO1 = "rua 7 de setembro";
	private static final int CPF_ALUNO1 = 01202355412;
	private static final int MATRICULA_ALUNO1 = 12541254;
	private static final String SEXO_ALUNO1 = "feminino";
	private static final int IDADE_ALUNO1 = 19;
	private static final String NOME_ALUNO1 = "José";
	private static final String ENDERECO_PROFESSOR1 = "Rua 7 de setembro";
	private static final int CPF_PROFESSOR1 = 1254125;
	private static final String MATERIA_PROFESSOR1 = "Estrutura";
	private static final String NOME_PROFESSOR1 = "Joaquim";
	private static final String ENDERECO_PROFESSOR = "Rua da mangueira";
	private static final int CPF_PROFESSOR = 12541254;
	private static final String MATERIA_PROFESSOR = "L.P.";
	private static final String NOME_PROFESSOR = "Mariano";
	private static final String NOME_DIRETOR = "Roberto";
	private static final int CPF_DIRETOR = 125524125;
	private static final String ENDERECO_DIRETOR = "Av. Castelo Branco";
	private static final String NOME_DIRETOR2 = "Renan";
	private static final int CPF_DIRETOR2 = 4125251;
	private static final String ENDERECO_DIRETOR2 = "rua Santo Amaro";
	private static final String NOME_VICEDIRETOR = "Aoberto";
	private static final int CPF_VICEDIRETOR = 135524125;
	private static final String ENDERECO_VICEDIRETOR = "Av. Castelo Branco";
	private static final String NOME_VICEDIRETOR2 = "Renan";
	private static final int CPF_VICEDIRETOR2 = 4125251;
	private static final String ENDERECO_VICEDIRETOR2 = "rua Santo Amaro";
	
	public Aluno aluno(){
		Aluno aluno = new Aluno();
		aluno.setNome(NOME_ALUNO);
		aluno.setIdade(IDADE_ALUNO);
		aluno.setSexo(SEXO_ALUNO);
		aluno.setMatricula(MATRICULA_ALUNO);
		aluno.setCPF(CPF_ALUNO);
		aluno.setEndereco(ENDERECO_ALUNO);
		return aluno;
	}
	
	public Professor professor(){
		Professor professor = new Professor();
		professor.setNome(NOME_PROFESSOR);
		professor.setMateria(MATERIA_PROFESSOR);
		professor.setCPF(CPF_PROFESSOR);
		professor.setEndereco(ENDERECO_PROFESSOR);
		return professor;
	}
	
	public Diretor diretor(){
		Diretor diretor = new Diretor();
		diretor.setNome(NOME_DIRETOR);
		diretor.setCPF(CPF_DIRETOR);
		diretor.setEndereco(ENDERECO_DIRETOR);
		return diretor;
	}
	
	public ViceDiretor viceDiretor(){
		ViceDiretor viceDiretor = new ViceDiretor();
		viceDiretor.setNome(NOME_VICEDIRETOR);
		viceDiretor.setCPF(CPF_VICEDIRETOR);
		viceDiretor.setEndereco(ENDERECO_VICEDIRETOR);
		return viceDiretor;
	}
	
	@Before
	public void iniciar(){
		controleAcademico = new ControleAcademico();
	}
	
	@Test
	public void addPrimeiroAluno(){
		Aluno aluno = aluno();
		controleAcademico.setPrimeiroAluno(aluno);
		Assert.assertTrue("espera adicionar primeiro aluno", controleAcademico.getPrimeiroAluno());
	}
	
	@Test
	public void addAluno(){
		Aluno aluno = aluno();
		controleAcademico.addAluno(aluno);
	}
	
	@Test
	public void removerAluno(){
		Aluno aluno = aluno();
		controleAcademico.removerAluno(aluno);
		Assert.assertTrue("espera que remova aluno", controleAcademico.getAlunoRemovido(aluno));
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void procurarAlunoPorMatricula(){
		controleAcademico.procuraAlunoPorMatricula(MATRICULA_ALUNO);
		Assert.assertTrue("espera retornar nome do aluno", controleAcademico.procuraAlunoPormatriculaConfirmacao(MATRICULA_ALUNO));
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void procurarAlunoPorNome(){
		controleAcademico.procuraAlunoPorNome(NOME_ALUNO);
		Assert.assertTrue("espera retornar o nome do aluno", controleAcademico.procurarAlunoPorNomeConfirmacao(NOME_ALUNO));
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void procurarAlunoPorCPF(){
		controleAcademico.procurarAlunoPorCPF(CPF_ALUNO);
		Assert.assertTrue("espera retornar o nome do aluno", controleAcademico.procuraAlunoPorCPFConfirmacao(CPF_ALUNO));
	}
	@Test(expected=ExcecaoControleAcademico.class)
	public void setNomeAlunoPorMatricula(){
		controleAcademico.setNomeAlunoPorMatricula(NOME_ALUNO1, MATRICULA_ALUNO);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setIdadeAlunoPorMatricula(){
		controleAcademico.setIdadeAlunoPorMatricula(IDADE_ALUNO1, MATRICULA_ALUNO);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setSexoAlunoPorMatricula(){
		controleAcademico.setSexoAlunoPorMatricula(SEXO_ALUNO1, MATRICULA_ALUNO);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setMatriculaAlunoPorMatricula(){
		controleAcademico.setMatriculaAlunoPorMatricula(MATRICULA_ALUNO1, MATRICULA_ALUNO);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setCPFAlunoPorMatricula(){
		controleAcademico.setCPFAlunoPorMatricula(CPF_ALUNO1, MATRICULA_ALUNO);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setEnderecoPorMatricula(){
		controleAcademico.setEnderecoAlunoPorMatricula(ENDERECO_ALUNO1, MATRICULA_ALUNO);
	}

	@Test(expected=ExcecaoControleAcademico.class)
	public void setNomeAlunoPorNome(){
		controleAcademico.setNomeAlunoPorNome(NOME_ALUNO1, NOME_ALUNO);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setIdadeAlunoPorNome(){
		controleAcademico.setIdadeAlunoPorNome(IDADE_ALUNO1, NOME_ALUNO);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setSexoAlunoPorNome(){
		controleAcademico.setSexoAlunoPorNome(SEXO_ALUNO1, NOME_ALUNO);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setMatriculaAlunoPorNome(){
		controleAcademico.setMatriculaAlunoPorNome(MATRICULA_ALUNO1, NOME_ALUNO);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setCPFAlunoPorNome(){
		controleAcademico.setCPFAlunoPorNome(CPF_ALUNO1, NOME_ALUNO);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setEnderecoAlunoPorNome(){
		controleAcademico.setEnderecoAlunoProNome(ENDERECO_ALUNO1, NOME_ALUNO);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setNomeAlunoPorCPF(){
		controleAcademico.setNomeAlunoPorCPF(NOME_ALUNO1, CPF_ALUNO);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setIdadeAlunoPorCPF(){
		controleAcademico.setIdadeAlunoPorCPF(IDADE_ALUNO1, CPF_ALUNO);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setSexoAlunoPorCPF(){
		controleAcademico.setSexoAlunoPorCPF(SEXO_ALUNO1, CPF_ALUNO);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setMatriculaAlunoPorCPF(){
		controleAcademico.setMatriculaAlunoPorCPF(MATRICULA_ALUNO1, CPF_ALUNO);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setCPFAlunoPorCPF(){
		controleAcademico.setCPFalunoPorCPF(CPF_ALUNO1, CPF_ALUNO);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setEnderecoAlunoPorCPF(){
		controleAcademico.setEnderecoAlunoPorCPF(ENDERECO_ALUNO1, CPF_ALUNO);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void getNomeAluno(){
		Aluno aluno = aluno();
		controleAcademico.getNomeAluno(aluno);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void getIdadeAluno(){
		Aluno aluno = aluno();
		controleAcademico.getIdadeAluno(aluno);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void getSexoAluno(){
		Aluno aluno = aluno();
		controleAcademico.getSexoAluno(aluno);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void getMatriculaAluno(){
		Aluno aluno = aluno();
		controleAcademico.getMatriculaAluno(aluno);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void getCPFAluno(){
		Aluno aluno = aluno();
		controleAcademico.getCPFAluno(aluno);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void getEnderecoAluno(){
		Aluno aluno = aluno();
		controleAcademico.getEnderecoAluno(aluno);
	}
	
	@Test
	public void addPrimeiroProfessor(){
		Professor professor = professor();
		controleAcademico.setPrimeiroProfessor(professor);
		Assert.assertTrue("espera adicionar o primeiro Professor", controleAcademico.getPrimeiroProfessor());
	}
	
	@Test
	public void addProfessor(){
		Professor professor = professor();
		controleAcademico.addProfessor(professor);
	}
	
	@Test
	public void removerProfessor(){
		Professor professor = professor();
		controleAcademico.removerProfessor(professor);
		Assert.assertTrue("espera que remova o professor", controleAcademico.getProfessorRemovido(professor));
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void procurarProfessorPorNome(){
		controleAcademico.procuraProfessorPorNome(NOME_PROFESSOR);
		Assert.assertTrue("Espera retornar o nome do professor", controleAcademico.procuraProfessorPorNomeConfirmacao(NOME_PROFESSOR));
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void procurarProfessorPorMateria(){
		controleAcademico.procuraProfessorPorMateria(MATERIA_PROFESSOR);
		Assert.assertTrue("espera retornar o nome do professor", controleAcademico.procuraProfessorPorMateriaComfirmacao(MATERIA_PROFESSOR));
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void procurarProfessorPorCPF(){
		controleAcademico.procuraProfessorPorCPF(CPF_PROFESSOR);
		Assert.assertTrue("espera retornar o nome do professor", controleAcademico.procuraProfessorCPFConfirmacao(CPF_PROFESSOR));
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void procuraProfessorPorEndereco(){
		controleAcademico.procuraProfessorPorEndereco(ENDERECO_PROFESSOR);
		Assert.assertTrue("espera retornar o nome do professor", controleAcademico.procuraProfessorPorEnderecoConfirmacao(ENDERECO_PROFESSOR));
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setNomeProfessorPorNome(){
		controleAcademico.setNomeProfessorPorNome(NOME_PROFESSOR1, NOME_PROFESSOR);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setMateriaProfessorPorNome(){
		controleAcademico.setMateriaProfessorPorNome(MATERIA_PROFESSOR1, NOME_PROFESSOR);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setCPFProfessorPorNome(){
		controleAcademico.setCPFProfessor(CPF_PROFESSOR1, NOME_PROFESSOR);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setEnderecoProfessorPorNome(){
		controleAcademico.setEnderecoProfessorPorNome(ENDERECO_PROFESSOR1, NOME_PROFESSOR);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setNomeProfessorPorCPF(){
		controleAcademico.setNomeProfessorPorCPF(NOME_PROFESSOR1, CPF_PROFESSOR);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setMateriaProfessorPorCPF(){
		controleAcademico.setMateriaProfessorPorCPF(MATERIA_PROFESSOR1, CPF_PROFESSOR);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setCPFProfessorPorCPF(){
		controleAcademico.setCPFProfessorPorCPF(CPF_PROFESSOR1, CPF_PROFESSOR);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setEnderecoProfessorPorCPF(){
		controleAcademico.setEnderecoProfessorPorCPF(ENDERECO_ALUNO1, CPF_PROFESSOR);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void getNomeProfessor(){
		Professor professor = professor();
		controleAcademico.getNomeProfessor(professor);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void getMateriaProfessor(){
		Professor professor = professor();
		controleAcademico.getMateriaProfessor(professor);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void getCPFProfessor(){
		Professor professor = professor();
		controleAcademico.getCPFProfessor(professor);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void getEnderecoProfessor(){
		Professor professor = professor();
		controleAcademico.getEnderecoProfessor(professor);
	}
	
	@Test
	public void AdcionarDiretor(){
		Diretor diretor = diretor();
		controleAcademico.adcionarDiretor(diretor);
		Assert.assertTrue("espera que diretor tenha sido adicionado", controleAcademico.adicionarDiretor());
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setNomeDireto(){
		controleAcademico.setNomeDiretor(NOME_DIRETOR2);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setCPFDiretor(){
		controleAcademico.setCPFDiretor(CPF_DIRETOR2);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setEnderecoDiretor(){
		controleAcademico.setEnderecoDiretor(ENDERECO_DIRETOR2);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void getNomeDiretor(){
		controleAcademico.getNomeDiretor();
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void getCPFDiretor(){
		controleAcademico.getCPFDiretor();
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void getEnderecoDiretor(){
		controleAcademico.getEnderecoDiretor();
	}
	
	@Test
	public void AdcionarViceDiretor(){
		ViceDiretor viceDiretor = new ViceDiretor();
		controleAcademico.adcionarViceDiretor(viceDiretor);
		Assert.assertTrue("espera que vice diretor tenha sido adicionado", controleAcademico.adicionaViceDiretor());
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setNomeVicePresidente(){
		controleAcademico.setNomeViceDiretor(NOME_VICEDIRETOR2);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setCPFViceDiretor(){
		controleAcademico.setCPFViceDiretor(CPF_VICEDIRETOR2);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void setEnderecoViceDiretor(){
		controleAcademico.setEnderecoViceDiretor(ENDERECO_VICEDIRETOR2);
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void getNomeViceDiretor(){
		controleAcademico.getNomeViceDiretor();
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void getCPFViceDiretor(){
		controleAcademico.getCPFViceDiretor();
	}
	
	@Test(expected=ExcecaoControleAcademico.class)
	public void getEnderecoViceDireto(){
		controleAcademico.getEnderecoViceDiretor();
	}
}