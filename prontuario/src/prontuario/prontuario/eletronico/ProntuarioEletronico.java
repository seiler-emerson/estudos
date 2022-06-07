package prontuario.prontuario.eletronico;

import java.time.LocalDate;
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
				consultarPaciente(Cadastros.pacientes);
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
	
	
	
	private static void consultarPaciente(ArrayList<Paciente> pacientes) {
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
		System.out.println("Anamneses :"+pacientes.get(index).getAtendimento().get(0).getAnamnese());      //acessando dentro da lista de paciente o paciente um e dentro da lista atendimento o primeiro atendimento e dentro do primeiro atendimento a anamneses
		System.out.println("receita :"+pacientes.get(index).getAtendimento().get(0).getReceituario());
		System.out.println("documento :"+pacientes.get(index).getAtendimento().get(0).getDocumentos());
		System.out.println("alta :"+pacientes.get(index).getAtendimento().get(0).getAlta());
		
	}
	
	public static void cadastrarAtendimento(ArrayList<Paciente> pacientes) {
		listarPacientes(pacientes);
		
		System.out.println("Selecione o numero referente ao paciente.");
		byte index = input.nextByte();
		System.out.println("Voce selecionou o paciente "+pacientes.get(index).getNome());
		
		
		
		
		
//		ArrayList<Atendimento> atendimento = new ArrayList<>();
		String anamnese = cadastrarAnamnese(index);
		String receituario = cadastrarReceita(index);
		String documento = cadastrarDocumento(index);
		String alta = cadastrarAlta(index);
		
		//CRIANDO ARRAY DE ATENDIMENTO
		
		Atendimento atendimento = new Atendimento(anamnese, receituario, documento, alta);     //CRIAR ATENDIMENTO
		pacientes.get(index).atendimentos.add(atendimento);	//ADICIONAR ATNEDIMENTO AO ARRAY
		
		
//		System.out.println(atendimento.getAnamnese());
//		System.out.println(atendimento.getReceituario());
//		System.out.println(atendimento.getDocumentos());
//		System.out.println(atendimento.getAlta());
		
		
	}
	
	public static void listarPacientes(ArrayList<Paciente> pacientes) {
		for(byte count=0;count<pacientes.size();count++) {
			System.out.println(count+" - "+pacientes.get(count).getNome());
		}
		
	}
	
	public static String cadastrarAnamnese(byte index) {
		//System.out.println("Descreva a anamnese do paciente: ");
		//String descricaoAnamnese = input.next();
		
		String descricaoAnamnese = "teste de anamnese";
		
		return descricaoAnamnese;
	}
	
	
	public static String cadastrarReceita(byte index) {
		//System.out.println("Necessario receituario?");
		//System.out.println("1 - SIM");
		//System.out.println("2 - NAO");
		//byte receita = input.nextByte();
		//String descricaoReceita = null;
		
		//if(receita == 1) {
		//	System.out.println("Informe a receita:");
		//	descricaoReceita = input.next();
		//	
		//};
		
		String descricaoReceita = "teste de receituario";
		
		return descricaoReceita;
	}
	public static String cadastrarDocumento(byte index) {
		String documento="teste de documento";
		
		return documento;
	}
	public static String cadastrarAlta(byte index) {
		String alta="teste de alta";
		
		return alta;
	}
	
}
