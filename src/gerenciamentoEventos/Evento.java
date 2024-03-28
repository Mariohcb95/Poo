package gerenciamentoEventos;

import java.time.LocalDate;
import java.util.List;

import exception.DataInvalidaException;

public abstract class Evento {
	protected String titulo;
	protected String descricao;
	protected LocalDate dtInicio;
	protected LocalDate dtFim;
	protected String localizacao;
	protected List<Participante> participantes;
	
	public Evento(String titulo, String descricao, LocalDate dtInicio, LocalDate dtFim, String localizacao,
			List<Participante> participantes) throws DataInvalidaException {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
		this.localizacao = localizacao;
		this.participantes = participantes;
		
		if (dtInicio.isAfter(dtFim)) {
			throw new DataInvalidaException("A data final não pode ser maior que a data de início.");
		}
	}
	
	public void AdicionaParticipante(Participante paticipante) {
		this.participantes.add(paticipante);
	}
	
	public void RemoveParticipante(Participante participante) {
		this.participantes.remove(participante);
	}
	
	public void ListaParticipantes() {
		System.out.println(" - Participantes -");
		for (Participante participante : this.participantes) {
			System.out.println("Nome: " + participante.getNome());
		}
	}
	
	
}
