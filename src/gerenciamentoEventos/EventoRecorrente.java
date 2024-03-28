package gerenciamentoEventos;

import java.time.LocalDate;
import java.util.List;

import exception.DataInvalidaException;

public class EventoRecorrente extends Evento{

	public EventoRecorrente(String titulo, String descricao, LocalDate dtInicio, LocalDate dtFim, String localizacao,
			List<Participante> participantes) throws DataInvalidaException {
		super(titulo, descricao, dtInicio, dtFim, localizacao, participantes);
			
	}
	public String GetTipoEvento() {
		return "Evento Tipo Recorrente!";
	}

}
