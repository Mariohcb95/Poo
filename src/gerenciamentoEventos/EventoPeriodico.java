package gerenciamentoEventos;

import java.time.LocalDate;
import java.util.List;

import exception.DataInvalidaException;

public class EventoPeriodico extends Evento {
	private List<DiaSemana> diasSemana;

	public EventoPeriodico(String titulo, String descricao, LocalDate dtInicio, LocalDate dtFim, String localizacao,
			List<Participante> participantes, List<DiaSemana> diasSemana) throws DataInvalidaException {
		super(titulo, descricao, dtInicio, dtFim, localizacao, participantes);
		this.diasSemana = diasSemana;

	}

	public List<DiaSemana> getDiasSemana() {
		return diasSemana;
	}

	public void setDiasSemana(List<DiaSemana> diasSemana) {
		this.diasSemana = diasSemana;
	}

	@Override
	public String toString() {
		return "EventoPeriodico [diasSemana=" + diasSemana + "]";
	}
	
	public String GetTipoEvento() {
		return "Evento Tipo Periódico!";
	}
	
	
}
