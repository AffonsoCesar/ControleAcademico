import java.util.*;

public class ControleAcademico {
	private List<Aluno> alunos = new LinkedList<Aluno>();
	private static boolean primeiroAluno;
	private boolean addAluno;
	
	public List<Aluno> getAlunos(){
		return alunos;
	}
	
	public void addAluno(Aluno aluno){
		if(this.alunos == null){
			this.setPrimeiroAluno(aluno);
		}
		else{
			alunos.add(aluno);
			addAluno = true;
		}
	}
	
	public boolean getAddAluno(){
		return addAluno;
	}
	
	public boolean getPrimeiroAluno(){
		return primeiroAluno;
	}
	
	public void setPrimeiroAluno(Aluno a) {
		alunos.add(a);
		primeiroAluno = true;
	}
	
	public String removerAluno(Aluno aluno){
		alunos.remove(aluno);
		return aluno.getNome();
		
	}
	
	public boolean getAlunoRemovido(Aluno a){
		if(a.equals(alunos)){
			return false;
		}
		return true;
	}
	
	public String procuraAlunoPorMatricula(int matricula){
		for(Aluno a : alunos){
			if(compararMatriculaAluno(matricula, a)){
				return a.getNome();
			}
		}
		throw new ExcecaoControleAcademico("Não encontrado");
	}
	
	public boolean procuraAlunoPormatriculaConfirmacao(int matricula){
		for(Aluno a : alunos){
			if(compararMatriculaAluno(matricula, a)){
				return true;
			}
		}
		throw new ExcecaoControleAcademico("Não encontrado");
	}
	
	public String procuraAlunoPorNome(String nome){
		for(Aluno a : alunos){
			if(comparaNomeAluno(nome, a)){
				return a.getNome();
			}
		}
		throw new ExcecaoControleAcademico("Não encontrado");
	}
	
	public boolean procurarAlunoPorNomeConfirmacao(String nome){
		for(Aluno a : alunos){
			if(comparaNomeAluno(nome, a)){
				return true;
			}
		}
		throw new ExcecaoControleAcademico("Não encontrado");
	}

	private boolean comparaNomeAluno(String nome, Aluno a) {
		return a.getNome().equals(nome);
	}
	
	public void setNomeAluno(String nome, int matricula){
		for(Aluno a : alunos){
			if(compararMatriculaAluno(matricula, a)){
				a.setNome(nome);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Não encontrado");		
	}

	private boolean compararMatriculaAluno(int matricula, Aluno a) {
		return a.getMatricula() == matricula;
	}
	
	public boolean setNomeAlunoConfirmacao(String nome, int matricula){
		for(Aluno a : alunos){
			if(compararMatriculaAluno(matricula, a)){
				if(comparaNomeAluno(nome, a)){
					return true;
				}
			}
		}
		throw new ExcecaoControleAcademico("Não encontrado");
	}
	
	public void setIdadeAluno(int idade, int matricula){
		for(Aluno a : alunos){
			if(compararMatriculaAluno(matricula, a)){
				a.setIdade(idade);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Não encontrado");		
	}
	
	public boolean setIdadeAlunoConfirmacao(int idade, int matricula){
		for(Aluno a : alunos){
			if(compararMatriculaAluno(matricula, a)){
				if(a.getIdade() == idade){
					return true;
				}
			}
		}
		throw new ExcecaoControleAcademico("Não encontrado");		
	}
	
	public void setSexoAluno(String sexo, int matricula){
		for(Aluno a : alunos){
			if(compararMatriculaAluno(matricula, a)){
				a.setSexo(sexo);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Não encontrado");		
	}
	
	public boolean setSexoAlunoConfirmacao(String sexo, int matricula){
		for(Aluno a : alunos){
			if(compararMatriculaAluno(matricula, a)){
				if(a.getSexo().equals(sexo)){
					return true;
				}
			}
		}
		throw new ExcecaoControleAcademico("Não encontrado");		
	}
}
