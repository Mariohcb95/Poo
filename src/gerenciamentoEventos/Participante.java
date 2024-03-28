package gerenciamentoEventos;

public class Participante {
	private String nome;

	public Participante(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Participante [nome=" + nome + "]";
	}
	
	
}
