import java.util.*;

public class ControleAcademico {
	private List<Aluno> alunos = new ArrayList<Aluno>();
	private static boolean primeiroAluno;
	private static boolean addAluno;
	
	public List<Aluno> getAlunos(){
		return alunos;
	}
	
	public void addAluno(Aluno alunos){
		this.alunos.add(alunos);
	}
	
	public static boolean getAddAluno(){
		return addAluno;
	}
	
	public boolean getPrimeiroAluno(){
		return primeiroAluno;
	}
	
	public void setPrimeiroAluno(boolean a) {
		primeiroAluno = a;
	}

}
