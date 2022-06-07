package prontuario.prontuario.eletronico;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;
import prontuario.Main;
import prontuario.cadastros.Cadastros;
import prontuario.cadastros.Paciente;

public class ProntuarioEletronico extends Paciente {

	static Scanner input = new Scanner(System.in);
	public static void prontuario() {

		byte option;

		do {

			System.out.println(displayMenu());
			option = input.nextByte();
			System.out.println("");

			switch (option) {
			case -1:
				Main.main(null);
				break;
			case 0:
				System.out.println("Exiting...");
				System.exit(1);
				break;
			case 1:
				System.out.println("NOVO ATENDIMENTO SELECIONADO");
				cadastrarAtendimento(Cadastros.pacientes);
				break;
			case 2:
				System.out.println("CONSULTA DE PRONTUARIO SELECIONADA");
				consultarProntuario(Cadastros.pacientes);
				break;
			default:
				System.out.println("Select a valid option!");
				break;
			}

		} while (option != 0);

	}
	

	public static String displayMenu() {
		String menu = "||====================================||";
		menu += "\n||             PRONTUARIO             ||";
		menu += "\n||-1 - Return                         ||";
		menu += "\n|| 0 - Exit                           ||";
		menu += "\n|| 1 - Novo Atendimento               ||";
		menu += "\n|| 2 - Consultar Prontuario           ||";
		menu += "\n||                                    ||";
		menu += "\n||====================================||";
		menu += "\nSelect an option:";

		return menu;
	}
	
	public static void listarPacientes(ArrayList<Paciente> pacientes) {
		
		for(byte count=0;count<pacientes.size();count++) {
			System.out.println(count+" - "+pacientes.get(count).getNome());
		}
	}
	
	private static void consultarProntuario(ArrayList<Paciente> pacientes) {
		listarPacientes(pacientes);
		System.out.println("Selecione o numero referente ao paciente.");
		byte index = input.nextByte();
		
		System.out.println("PRONTUARIO");
		System.out.println("Nome Paciente: "+pacientes.get(index).getNome());
		System.out.println("CPF: "+pacientes.get(index).getCpf());
		System.out.println("Nome mae "+pacientes.get(index).getNomeMae());
		System.out.println("Nome pai "+pacientes.get(index).getNomePai());
		System.out.println("endereco "+pacientes.get(index).getEndereco());
		System.out.println("sexo "+pacientes.get(index).getSexo());
		System.out.println("Data nascimento: "+pacientes.get(index).getNascimento());
		if(pacientes.get(index).atendimentos == null) {			
			System.out.println("Nenhum atendimento realizado");			
		} else {	
			for(byte count=0;count<pacientes.get(index).atendimentos.size();count++) {
				System.out.println("ATENDIMENTO "+(count+1));
				System.out.println("Data atendimento: "+pacientes.get(index).getAtendimento().get(count).getData());
				System.out.println("Data atendimento: "+pacientes.get(index).getAtendimento().get(count).getHora());
				System.out.println("Anamneses :"+pacientes.get(index).getAtendimento().get(count).getAnamnese());      //acessando dentro da lista de paciente o paciente um e dentro da lista atendimento o primeiro atendimento e dentro do primeiro atendimento a anamneses
				System.out.println("receita :"+pacientes.get(index).getAtendimento().get(count).getReceituario());
				System.out.println("Atestado/Declaracao :"+pacientes.get(index).getAtendimento().get(count).getAtestado());
				System.out.println("Encaminhamento :"+pacientes.get(index).getAtendimento().get(count).getEncaminhamento());
				System.out.println("alta :"+pacientes.get(index).getAtendimento().get(count).getAlta());
			} 
		}		
	}
	
	public static void cadastrarAtendimento(ArrayList<Paciente> pacientes) {
		listarPacientes(pacientes);
		
		System.out.println("Selecione o numero referente ao paciente.");
		byte index = input.nextByte();
		System.out.println("Voce selecionou o paciente "+pacientes.get(index).getNome());
		
		LocalDate dataAtendimento = LocalDate.now();
		LocalTime horaAtendimento = LocalTime.now();
		String anamnese = cadastrarAnamnese(index);
		String receituario = cadastrarReceita(index);
		String atestado = cadastrarAtestado(index);
		String encaminhamento = cadastrarEncaminhamento(index);
		String alta = cadastrarAlta(index);
		
		//CRIANDO ARRAY DE ATENDIMENTO
		
		Atendimento atendimento = new Atendimento(anamnese, receituario, atestado, encaminhamento, alta, dataAtendimento, horaAtendimento);     //CRIAR ATENDIMENTO
		pacientes.get(index).atendimentos.add(atendimento);	//ADICIONAR ATNEDIMENTO AO ARRAY
		
				
	}
	
	
	
	public static String cadastrarAnamnese(byte index) {
		System.out.println("Descreva a anamnese do paciente: ");
		String descricaoAnamnese = input.next();
		
		return descricaoAnamnese;
	}
	
	
	public static String cadastrarReceita(byte index) {
		System.out.println("Necessario receituario?");
		System.out.println("1 - SIM");
		System.out.println("2 - NAO");
		byte receita = input.nextByte();
		String descricaoReceita = null;
		
		if(receita == 1) {
			System.out.println("Informe a receita:");
			descricaoReceita = input.next();
		};
		
		return descricaoReceita;
	}
	public static String cadastrarAtestado(byte index) {
		System.out.println("Necessario atestado/declaracao?");
		System.out.println("1 - SIM");
		System.out.println("2 - NAO");
		byte option = input.nextByte();
		String atestado = null;
		
		if(option == 1) {
			System.out.println("Informe a receita:");
			atestado = input.next();
		};
		
		return atestado;
	}
	public static String cadastrarEncaminhamento(byte index) {
		System.out.println("Necessario encaminhamento?");
		System.out.println("1 - SIM");
		System.out.println("2 - NAO");
		byte option = input.nextByte();
		String encaminhamento = null;
		
		if(option == 1) {
			System.out.println("Informe a receita:");
			encaminhamento = input.next();
		};
		
		return encaminhamento;
	}
	
	public static String cadastrarAlta(byte index) {
		System.out.println("Descreva a alta do paciente: ");
		String descricaoAlta = input.next();
		
		return descricaoAlta;
	}
	
}
