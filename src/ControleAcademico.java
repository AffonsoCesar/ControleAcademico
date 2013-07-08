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
			if(a.getMatricula() == matricula){
				return a.getNome();
			}
		}
		throw new ExcecaoControleAcademico("Não encontrado");
	}
	
	public boolean procuraAlunoPormatriculaConfirmacao(int matricula){
		for(Aluno a : alunos){
			if(a.getMatricula() == matricula){
				return true;
			}
		}
		throw new ExcecaoControleAcademico("Não encontrado");
	}
}
