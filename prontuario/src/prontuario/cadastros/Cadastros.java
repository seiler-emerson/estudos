package prontuario.cadastros;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import prontuario.Main;
import prontuario.prontuario.eletronico.Atendimento;

public class Cadastros {

	static Scanner input = new Scanner(System.in);

	public static ArrayList<Paciente> pacientes = new ArrayList<>(); // contem a lista de pacientes - verificar para inserir dentro de um metodo talvez
	public static ArrayList<Medico> medicos = new ArrayList<>();
	
	public static void cadastro() {
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
				System.exit(2);
				break;
			case 1:
				System.out.println("CADASTRANDO PACIENTE");
				cadastrarPaciente(pacientes);
				break;
			case 2:
				System.out.println("CADASTRANDO MEDICO");
				cadastrarMedico(medicos);
				break;
			default:
				System.out.println("Select a valid option!");
				break;
			}

		} while (option != 0);

	}

	public static String displayMenu() {
		String menu = "||====================================||";
		menu += "\n||              CADASTROS             ||";
		menu += "\n||-1 - Return                         ||";
		menu += "\n|| 0 - Exit                           ||";
		menu += "\n|| 1 - Registrar Patiente             ||";
		menu += "\n|| 2 - Registrar Medico               ||";
		menu += "\n||                                    ||";
		menu += "\n||====================================||";
		menu += "\nSelect an option:";

		return menu;
	}

	public static void cadastrarPaciente(ArrayList<Paciente> pacientes) {

		// PACIENTES TESTE
		Paciente nomePaciente1 = new Paciente("Joao da Silva", "123.123.123-33", "Maria da Silva", "Jose da Silca",
				"Rua 123", "m", LocalDate.of(1945, 2, 1));
		nomePaciente1.setAtendimento(new ArrayList<>());
		pacientes.add(nomePaciente1);
		
		
		Paciente nomePaciente2 = new Paciente("Joana da Silva", "456.456.456-77", "Julia Garcia", "Joao da Silca",
				"Rua 456", "f", LocalDate.of(1985, 6, 13));
		
		pacientes.add(nomePaciente2);
//		nomePaciente2.setAtendimento(new ArrayList<>());
		// CRIANDO VARIAVEIS PARA RECEBER DADOS

		String nome;
		String cpf;
		String nomeMae;
		String nomePai;
		String endereco;
		String sexo; // MUDAR PARA CHAR
		byte dia;
		byte mes;
		short ano;

		/*
		// CAPTURANDO DADOS

		System.out.println("Digite o nome do paciente:");
		nome = input.next();

		System.out.println("Digite o cpf do paciente:");
		cpf = input.next();

		System.out.println("Digite o nome da mae do paciente:");
		nomeMae = input.next();

		System.out.println("Digite o nome do pai do paciente:");
		nomePai = input.next();

		System.out.println("Digite o endereco do paciente:");
		endereco = input.next();

		System.out.println("Digite o sexo do paciente:");
		sexo = input.next();

		System.out.println("Digite a dia de nascimento do paciente:");
		dia = input.nextByte();

		System.out.println("Digite o mes de nascimento do paciente:");
		mes = input.nextByte();

		System.out.println("Digite o ano de nascimento do paciente:");
		ano = input.nextShort();

		// CRIANDO UM PACIENTE
		Paciente nomePaciente = new Paciente(nome, cpf, nomeMae, nomePai, endereco, sexo, LocalDate.of(ano, mes, dia)); // NECESSARIO DEIXAR O nomePaciente dinamico para n ficar tudo com msm nome

		// ADICIONANDO UM PACIENTE NO ARRAY DE PACIENTES
		pacientes.add(nomePaciente);
*/
		/*
		 * 
		 * //CRIANDO UM ATENDIMENTO nomePaciente.setAtendimento(new ArrayList<>());
		 * nomePaciente.getAtendimento().add(new Atendimento(anamnese1, receita1,
		 * documento1, alta1));
		 * 
		 * 
		 * 
		 * pacientes.add(new Paciente(nome, cpf, nomeMae, nomePai, endereco, sexo,
		 * LocalDate.of(ano, mes, dia))); System.out.println("PRONTUARIO");
		 * System.out.println("Nome Paciente: "+nomePaciente.getNome());
		 * System.out.println("CPF: "+nomePaciente.getCpf());
		 * System.out.println("Nome mae "+nomePaciente.getNomeMae());
		 * System.out.println("Nome pai "+nomePaciente.getNomePai());
		 * System.out.println("endereco "+nomePaciente.getEndereco());
		 * System.out.println("sexo "+nomePaciente.getSexo());
		 * System.out.println(pacientes.get(0).getAtendimento().get(0).getAnamnese());
		 * //acessando dentro da lista de paciente o paciente um e dentro da lista
		 * atendimento o primeiro atendimento e dentro do primeiro atendimento a
		 * anamneses
		 * 
		 * 
		 */
	}

	public static void cadastrarMedico(ArrayList<Medico> medicos) {
		
		// 	MEDICO TESTE
		Medico nomeMedico1 = new Medico("Rafael da Silva", "145.345.345-34", "Julia Silva", "Carlos da Silva", "Rua Barao", "m", LocalDate.of(1975, 3, 30), "Clinico Geral", "123456-9");
		medicos.add(nomeMedico1);

		// CRIANDO VARIAVEIS PARA RECEBER DADOS

		String nome;
		String cpf;
		String nomeMae;
		String nomePai;
		String endereco;
		String sexo; // MUDAR PARA CHAR
		byte dia;
		byte mes;
		short ano;
		String especialidade;
		String numeroConselho;

		// CAPTURANDO DADOS

		System.out.println("Digite o nome do medico:");
		nome = input.next();

		System.out.println("Digite o cpf do medico:");
		cpf = input.next();

		System.out.println("Digite o nome da mae do medico:");
		nomeMae = input.next();

		System.out.println("Digite o nome do pai do medico:");
		nomePai = input.next();

		System.out.println("Digite o endereco do medico:");
		endereco = input.next();

		System.out.println("Digite o sexo do medico:");
		sexo = input.next();

		System.out.println("Digite a dia de nascimento do medico:");
		dia = input.nextByte();

		System.out.println("Digite o mes de nascimento do medico:");
		mes = input.nextByte();

		System.out.println("Digite o ano de nascimento do medico:");
		ano = input.nextShort();
		
		System.out.println("Qual a especialidade do medico?");
		especialidade = input.next();
		
		System.out.println("Qual o numero do conselho do medico?");
		numeroConselho = input.next();

		// CRIANDO UM MEDICO
		Medico nomeMedico = new Medico(nome, cpf, nomeMae, nomePai, endereco, sexo, LocalDate.of(ano, mes, dia), especialidade, numeroConselho); // NECESSARIO DEIXAR O nomeMedico dinamico para n ficar tudo com msm nome

		// ADICIONANDO UM PACIENTE NO ARRAY DE PACIENTES
		medicos.add(nomeMedico);

	}

}