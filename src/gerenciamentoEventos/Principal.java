package gerenciamentoEventos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import exception.DataInvalidaException;

public class Principal {

	public static void main(String[] args) throws DataInvalidaException {
		try {
			

			List<DiaSemana> dias = new ArrayList<DiaSemana>();
			dias.add(DiaSemana.TERCA);
			dias.add(DiaSemana.QUARTA);
			dias.add(DiaSemana.SEXTA);
			
			
			List<Participante> participantes = new ArrayList<Participante>();
			
			EventoPeriodico evento1 = new EventoPeriodico("Festa Do Mário", "Trazer carne", 
					LocalDate.of(2024, 3, 1), LocalDate.of(2024, 3, 28), "Minha casa", participantes, dias );
			
			Participante p1 = new Participante("Gean");
			Participante p2 = new Participante("Mário");
			Participante p3 = new Participante("Mônica");
			Participante p4 = new Participante("Thomas");
			
			
			evento1.AdicionaParticipante(p1);
			evento1.AdicionaParticipante(p2);
			evento1.AdicionaParticipante(p3);
			evento1.AdicionaParticipante(p4);
			
			evento1.RemoveParticipante(p2);
			
			evento1.ListaParticipantes();
			
			System.out.println("deu certo");
			
		}catch(DataInvalidaException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		
	}

}
