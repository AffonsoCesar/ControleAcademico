import java.util.*;

public class ControleAcademico {
	private List<Aluno> alunos = new LinkedList<Aluno>();
	private static boolean primeiroAluno;
	private List<Professor> professores = new LinkedList<Professor>();
	private static boolean primeiroProfessor;
	private Diretor diretor;
	private ViceDiretor viceDiretor;
	
	public List<Aluno> getAlunos(){
		return alunos;
	}
	
	public void addAluno(Aluno aluno){
		if(this.alunos == null){
			this.setPrimeiroAluno(aluno);
		}
		else{
			alunos.add(aluno);
		}
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
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public boolean procuraAlunoPormatriculaConfirmacao(int matricula){
		for(Aluno a : alunos){
			if(compararMatriculaAluno(matricula, a)){
				return true;
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public String procuraAlunoPorNome(String nome){
		for(Aluno a : alunos){
			if(comparaNomeAluno(nome, a)){
				return a.getNome();
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public boolean procurarAlunoPorNomeConfirmacao(String nome){
		for(Aluno a : alunos){
			if(comparaNomeAluno(nome, a)){
				return true;
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}

	private boolean comparaNomeAluno(String nome, Aluno a) {
		return comparandoNome(nome, a);
	}
	
	public String procurarAlunoPorCPF(int CPF){
		for(Aluno a : alunos){
			if(comparaCPF(CPF, a)){
				return a.getNome();
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public boolean procuraAlunoPorCPFConfirmacao(int CPF){
		for(Aluno a : alunos){
			if(comparaCPF(CPF, a)){
				return true;
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}

	private boolean comparaCPF(int CPF, Aluno a) {
		return comparandoCPF(CPF, a);
	}
	
	public void setNomeAlunoPorMatricula(String nome, int matricula){
		for(Aluno a : alunos){
			if(compararMatriculaAluno(matricula, a)){
				a.setNome(nome);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");		
	}

	private boolean compararMatriculaAluno(int matricula, Aluno a) {
		return a.getMatricula() == matricula;
	}
	
	public void setIdadeAlunoPorMatricula(int idade, int matricula){
		for(Aluno a : alunos){
			if(compararMatriculaAluno(matricula, a)){
				a.setIdade(idade);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");		
	}
	
	public void setSexoAlunoPorMatricula(String sexo, int matricula){
		for(Aluno a : alunos){
			if(compararMatriculaAluno(matricula, a)){
				a.setSexo(sexo);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");		
	}
	
	public void setMatriculaAlunoPorMatricula(int novaMatricula, int matricula){
		for(Aluno a : alunos){
			if(compararMatriculaAluno(matricula, a)){
				a.setMatricula(novaMatricula);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public void setCPFAlunoPorMatricula(int CPF, int matricula){
		for(Aluno a : alunos){
			if(compararMatriculaAluno(matricula, a)){
				a.setCPF(CPF);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public void setEnderecoAlunoPorMatricula(String endereco, int matricula){
		for(Aluno a : alunos){
			if(compararMatriculaAluno(matricula, a)){
				a.setEndereco(endereco);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public void setNomeAlunoPorNome(String novoNome, String nome){
		for(Aluno a : alunos){
			if(comparandoNome(nome, a)){
				a.setNome(novoNome);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public void setIdadeAlunoPorNome(int idade, String nome){
		for(Aluno a : alunos){
			if(comparandoNome(nome, a)){
				a.setIdade(idade);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public void setSexoAlunoPorNome(String sexo, String nome){
		for(Aluno a : alunos){
			if(comparandoNome(nome, a)){
				a.setSexo(sexo);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public void setMatriculaAlunoPorNome(int matricula, String nome){
		for(Aluno a : alunos){
			if(comparandoNome(nome, a)){
				a.setMatricula(matricula);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public void setCPFAlunoPorNome(int CPF, String nome){
		for(Aluno a : alunos){
			if(comparandoNome(nome, a)){
				a.setCPF(CPF);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public void setEnderecoAlunoProNome(String endereco, String nome){
		for(Aluno a : alunos){
			if(comparandoNome(nome, a)){
				a.setEndereco(endereco);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}

	private boolean comparandoNome(String nome, Aluno a) {
		return a.getNome().equals(nome);
	}
	
	public void setNomeAlunoPorCPF(String nome, int CPF){
		for(Aluno a : alunos){
			if(comparandoCPF(CPF, a)){
				a.setNome(nome);
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public void setIdadeAlunoPorCPF(int idade, int CPF){
		for(Aluno a : alunos){
			if(comparandoCPF(CPF, a)){
				a.setIdade(idade);
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public void setSexoAlunoPorCPF(String sexo, int CPF){
		for(Aluno a : alunos){
			if(comparandoCPF(CPF, a)){
				a.setSexo(sexo);
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public void setMatriculaAlunoPorCPF(int matricula, int CPF){
		for(Aluno a : alunos){
			if(comparandoCPF(CPF, a)){
				a.setMatricula(matricula);
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public void setCPFalunoPorCPF(int novoCPF, int CPF){
		for(Aluno a : alunos){
			if(comparandoCPF(CPF, a)){
				a.setCPF(novoCPF);
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	public void setEnderecoAlunoPorCPF(String endereco, int CPF){
		for(Aluno a : alunos){
			if(comparandoCPF(CPF, a)){
				a.setEndereco(endereco);
			}
		}
		throw new ExcecaoControleAcademico("Aluno não encontrado");
	}
	
	private boolean comparandoCPF(int CPF, Aluno a) {
		return a.getCPF() == CPF;
	}
	
	public String getNomeAluno(Aluno aluno){
		if(alunos.equals(aluno)){
			return aluno.getNome();
		}
		else{
			throw new ExcecaoControleAcademico("não existe esse aluno");
		}
	}
	
	public int getIdadeAluno(Aluno aluno){
		if(alunos.equals(aluno)){
			return aluno.getIdade();
		}
		else{
			throw new ExcecaoControleAcademico("não existe esse aluno");
		}
	}
	
	public String getSexoAluno(Aluno aluno){
		if(alunos.equals(aluno)){
			return aluno.getSexo();
		}
		else{
			throw new ExcecaoControleAcademico("não existe esse aluno");
		}
	}
	
	public int getMatriculaAluno(Aluno aluno){
		if(alunos.equals(aluno)){
			return aluno.getMatricula();
		}
		else{
			throw new ExcecaoControleAcademico("não existe esse aluno");
		}
	}
	
	public int getCPFAluno(Aluno aluno){
		if(alunos.equals(aluno)){
			return aluno.getCPF();
		}
		else{
			throw new ExcecaoControleAcademico("não existe esse aluno");
		}
	}
	
	public String getEnderecoAluno(Aluno aluno){
		if(alunos.equals(aluno)){
			return aluno.getEndereco();
		}
		else{
			throw new ExcecaoControleAcademico("não existe esse aluno");
		}
	}
	
	public List<Professor> getProfessor(){
		return professores;
	}
	
	public void addProfessor(Professor professor){
		if(this.professores == null){
			this.setPrimeiroProfessor(professor);
		}
		else{
			professores.add(professor);
		}
	}
	
	public void setPrimeiroProfessor(Professor p) {
		professores.add(p);
		primeiroProfessor = true;
	}
	
	public boolean getPrimeiroProfessor(){
		return primeiroProfessor;
	}
	
	public String removerProfessor(Professor professor){
		professores.remove(professor);
		return professor.getNome();
	}
	
	public boolean getProfessorRemovido(Professor p){
		if(p.equals(professores)){
			return false;
		}
		return true;
	}
	
	public String procuraProfessorPorNome(String nome){
		for(Professor p : professores){
			if(comparaNomeProfessor(nome, p)){
				return p.getNome();
			}
		}
		throw new ExcecaoControleAcademico("Professor não encontrado");
	}
	
	private boolean comparaNomeProfessor(String nome, Professor p) {
		return p.getNome().equals(nome);
	}
	
	public boolean procuraProfessorPorNomeConfirmacao(String nome){
		for(Professor p : professores){
			if(comparaNomeProfessor(nome, p)){
				return true;
			}
		}
		throw new ExcecaoControleAcademico("Professor não encontrado");
	}
	
	public String procuraProfessorPorMateria(String materia){
		for(Professor p : professores){
			if(comparaMateriaProfessor(materia, p)){
				return p.getNome();
			}
		}
		throw new ExcecaoControleAcademico("Professor não encontrado");
	}
	
	private boolean comparaMateriaProfessor(String materia, Professor p){
		return p.getMateria().equals(materia);
	}
	
	public boolean procuraProfessorPorMateriaComfirmacao(String materia){
		for(Professor p : professores){
			if(comparaMateriaProfessor(materia, p)){
				return true;
			}
		}
		throw new ExcecaoControleAcademico("Professor não encontrado");

	}
	
	public String procuraProfessorPorCPF(int CPF){
		for(Professor p : professores){
			if(comparaCPFProfessor(CPF, p)){
				return p.getNome();
			}
		}
		throw new ExcecaoControleAcademico("Professor não encontrado");		
	}
	
	private boolean comparaCPFProfessor(int CPF, Professor p){
		return comparandoCPFProfessor(CPF, p);
	}
	
	private boolean comparandoCPFProfessor(int CPF, Professor p){
		return p.getCPF() == CPF;
	}
	
	public boolean procuraProfessorCPFConfirmacao(int CPF){
		for(Professor p : professores){
			if(comparaCPFProfessor(CPF, p)){
				return true;
			}
		}
		throw new ExcecaoControleAcademico("Professor não encontrado");
	}
	
	public String procuraProfessorPorEndereco(String endereco){
		for(Professor p : professores){
			if(comparaEnderecoProfessor(endereco, p)){
				return p.getNome();
			}
		}
		throw new ExcecaoControleAcademico("Professor não encontrado");
	}
	
	private boolean comparaEnderecoProfessor(String endereco, Professor p){
		return p.getEndereco().equals(endereco);
	}
	
	public boolean procuraProfessorPorEnderecoConfirmacao(String endereco){
		for(Professor p : professores){
			if(comparaEnderecoProfessor(endereco, p)){
				return true;
			}
		}
		throw new ExcecaoControleAcademico("Professor não encontrado");
	}
	
	public void setNomeProfessorPorNome(String novoNome, String nome){
		for(Professor p : professores){
			if(comparaNomeProfessor(nome, p)){
				p.setNome(novoNome);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Professor não encontrado");
	}
	
	public void setMateriaProfessorPorNome(String materia, String nome){
		for(Professor p : professores){
			if(comparaNomeProfessor(nome, p)){
				p.setMateria(materia);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Professor não encontrado");
	}
	
	public void setCPFProfessor(int CPF, String nome){
		for(Professor p : professores){
			if(comparaNomeProfessor(nome, p)){
				p.setCPF(CPF);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Professor não encontrado");
	}
	
	public void setEnderecoProfessorPorNome(String endereco, String nome){
		for(Professor p : professores){
			if(comparaNomeProfessor(nome, p)){
				p.setEndereco(endereco);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Professor não encontrado");
	}
	
	public void setNomeProfessorPorCPF(String nome, int CPF){
		for(Professor p : professores){
			if(comparaCPFProfessor(CPF, p)){
				p.setNome(nome);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Professor não encontrado");
	}
	
	public void setMateriaProfessorPorCPF(String materia, int CPF){
		for(Professor p : professores){
			if(comparaCPFProfessor(CPF, p)){
				p.setMateria(materia);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Professor não encontrado");
	}
	
	public void setCPFProfessorPorCPF(int novoCPF, int CPF){
		for(Professor p : professores){
			if(comparaCPFProfessor(CPF, p)){
				p.setCPF(CPF);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Professor não encontrado");
	}
	
	public void setEnderecoProfessorPorCPF(String endereco, int CPF){
		for(Professor p : professores){
			if(comparaCPFProfessor(CPF, p)){
				p.setEndereco(endereco);
				return;
			}
		}
		throw new ExcecaoControleAcademico("Professor não encontrado");
	}
	
	public String getNomeProfessor(Professor professor){
		if(professores.equals(professor)){
			return professor.getNome();
		}
		else{
			throw new ExcecaoControleAcademico("não existe esse aluno");
		}
	}
	
	public String getMateriaProfessor(Professor professor){
		if(professores.equals(professor)){
			return professor.getMateria();
		}
		else{
			throw new ExcecaoControleAcademico("não existe esse aluno");
		}
	}
	
	public int getCPFProfessor(Professor professor){
		if(professores.equals(professor)){
			return professor.getCPF();
		}
		else{
			throw new ExcecaoControleAcademico("não existe esse aluno");
		}
	}
	
	public String getEnderecoProfessor(Professor professor){
		if(professores.equals(professor)){
			return professor.getEndereco();
		}
		else{
			throw new ExcecaoControleAcademico("não existe esse aluno");
		}
	}
	
	public void adcionarDiretor(Diretor diretor){
		this.diretor = diretor;
	}
	
	public boolean adicionarDiretor(){
		if(diretor != null){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void setNomeDiretor(String nome){
		if(diretor != null){
			diretor.setNome(nome);
		}
		else{
			throw new ExcecaoControleAcademico("Não existe diretor cadastrado");
		}
	}
	
	public void setCPFDiretor(int CPF){
		if(diretor != null){
			diretor.setCPF(CPF);
		}
		else{
			throw new ExcecaoControleAcademico("Não existe diretor cadastrado");
		}
	}
	
	public void setEnderecoDiretor(String enderecoo){
		if(diretor != null){
			diretor.setEndereco(enderecoo);
		}
		else{
			throw new ExcecaoControleAcademico("Não existe diretor cadastrado");
		}
	}
	
	public String getNomeDiretor(){	
		if(diretor != null){
			return diretor.getNome();
		}
		else{
			throw new ExcecaoControleAcademico("Não existe diretor cadastrado");
		}
	}
	
	public int getCPFDiretor(){
		if(diretor != null){
			return diretor.getCPF();
		}
		else{
			throw new ExcecaoControleAcademico("Não existe diretor cadastrado");
		}
	}
		
	public String getEnderecoDiretor(){
		if(diretor != null){
			return diretor.getEndereco();
		}
		else{
			throw new ExcecaoControleAcademico("Não existe diretor cadastrado");
		}
	}
	
	public void adcionarViceDiretor(ViceDiretor viceDiretor){
		this.viceDiretor = viceDiretor;
	}
	
	public boolean adicionaViceDiretor(){
		if(viceDiretor != null){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void setNomeViceDiretor(String nome){
		if(viceDiretor != null){
			viceDiretor.setNome(nome);
		}
		else{
			throw new ExcecaoControleAcademico("Não existe diretor cadastrado");
		}
	}
	
	public void setCPFViceDiretor(int CPF){
		if(viceDiretor != null){
			viceDiretor.setCPF(CPF);
		}
		else{
			throw new ExcecaoControleAcademico("Não existe diretor cadastrado");
		}
	}
	
	public void setEnderecoViceDiretor(String endereco){
		if(viceDiretor != null){
			viceDiretor.setEndereco(endereco);
		}
		else{
			throw new ExcecaoControleAcademico("Não existe diretor cadastrado");
		}
	}
	
	public String getNomeViceDiretor(){
		if(viceDiretor != null){
			return viceDiretor.getNome();
		}
		else{
			throw new ExcecaoControleAcademico("Não existe diretor cadastrado");
		}
	}
	
	public int getCPFViceDiretor(){
		if(viceDiretor != null){
			return viceDiretor.getCPF();
		}
		else{
			throw new ExcecaoControleAcademico("Não existe diretor cadastrado");
		}
	}
	
	public String getEnderecoViceDiretor(){
		if (viceDiretor != null) {
			return viceDiretor.getEndereco();
		}
		throw new ExcecaoControleAcademico("Não existe diretor cadastrado");
	}
}