package prontuario.cadastros;

import java.time.LocalDate;
import java.time.LocalTime;
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

		// CRIANDO UM PACIENTE e ADICIONANDO UM PACIENTE NO ARRAY DE PACIENTES
		Paciente paciente = new Paciente(nome, cpf, nomeMae, nomePai, endereco, sexo, LocalDate.of(ano, mes, dia)); // NECESSARIO DEIXAR O nomePaciente dinamico para n ficar tudo com msm nome
		paciente.setAtendimento(new ArrayList<>());
		pacientes.add(paciente);

		paciente.cadastroRealizado(nome);
	}

	public static void cadastrarMedico(ArrayList<Medico> medicos) {
		
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
		Medico medico = new Medico(nome, cpf, nomeMae, nomePai, endereco, sexo, LocalDate.of(ano, mes, dia), especialidade, numeroConselho); // NECESSARIO DEIXAR O nomeMedico dinamico para n ficar tudo com msm nome

		// ADICIONANDO UM PACIENTE NO ARRAY DE PACIENTES
		medicos.add(medico);

	}
	
	public static void preCadastro(ArrayList<Paciente> pacientes, ArrayList<Medico> medicos) {
		if(pacientes.size()==0) {
				
			//PACIENTES
			Paciente nomePaciente1 = new Paciente("Sheldon Li Cooper", "010.110.010-01", "Mary Cooper", "George Cooper", "Av Los Robles Avenue, 2311 Pasadena", "m", LocalDate.of(1980, 2, 26));
			nomePaciente1.setAtendimento(new ArrayList<>());
			pacientes.add(nomePaciente1);
			Atendimento atendimento1 = new Atendimento("Dor abdominal", "laxante - 8/8h - 1 dia ", "Atestado", "encaminhamento para gastro", "Liberado", LocalDate.of(2022, 2, 1), LocalTime.of(20, 10));
			nomePaciente1.atendimentos.add(atendimento1);
			Atendimento atendimento6 = new Atendimento("Dor de cabeca", "paracetamol - 8/8h - se dor ", "Declaracao de comparecimento", "encaminhamento para neuro", "Liberado", LocalDate.of(2022, 2, 1), LocalTime.of(20, 10));
			nomePaciente1.atendimentos.add(atendimento6);
			
			Paciente nomePaciente2 = new Paciente("Joana da Silva", "456.456.456-77", "Julia Garcia", "Joao da Silca", "Rua 456, Decimal, Numerais", "f", LocalDate.of(1985, 6, 13));
			nomePaciente2.setAtendimento(new ArrayList<>());
			pacientes.add(nomePaciente2);
			Atendimento atendimento2 = new Atendimento("Dor abdominal", "laxante - 8/8h - 1 dia ", "Atestado", "encaminhamento para gastro", "Liberado", LocalDate.of(2022, 2, 1), LocalTime.of(20, 10));
			nomePaciente2.atendimentos.add(atendimento2);
			
			Paciente nomePaciente3 = new Paciente("Cleber Silveira", "456.956.316-11", "Carla Silva Garcia", "Olindio Silveira", "Rua 456", "m", LocalDate.of(1995, 4, 13));
			nomePaciente3.setAtendimento(new ArrayList<>());
			pacientes.add(nomePaciente3);
			Atendimento atendimento3 = new Atendimento("Dor de cabeca", "paracetamol - 8/8h - se dor ", "Declaracao de comparecimento", "encaminhamento para neuro", "Liberado", LocalDate.of(2022, 2, 1), LocalTime.of(20, 10));
			nomePaciente3.atendimentos.add(atendimento3);
			
			Paciente nomePaciente4 = new Paciente("Silvana Github", "256.256.312-21", "Olivia Github", "Linus Github", "Rua Versionamento, Git, Online", "f", LocalDate.of(2003, 10, 6));
			nomePaciente4.setAtendimento(new ArrayList<>());
			pacientes.add(nomePaciente4);
			Atendimento atendimento4 = new Atendimento("Dor de cabeca", "paracetamol - 8/8h - se dor ", "Declaracao de comparecimento", "encaminhamento para neuro", "Liberado", LocalDate.of(2022, 2, 1), LocalTime.of(20, 10));
			nomePaciente4.atendimentos.add(atendimento4);
			
			Paciente nomePaciente5 = new Paciente("Joao da Silva", "123.123.123-33", "Maria da Silva", "Jose da Silva", "Rua 123, Centro, Numerais", "m", LocalDate.of(1945, 2, 1));
			nomePaciente5.setAtendimento(new ArrayList<>());
			pacientes.add(nomePaciente5);
			Atendimento atendimento5 = new Atendimento("Dor de cabeca", "paracetamol - 8/8h - se dor ", "Declaracao de comparecimento", "encaminhamento para neuro", "Liberado", LocalDate.of(2022, 2, 1), LocalTime.of(20, 10));
			nomePaciente5.atendimentos.add(atendimento5);
			
			
			//MEDICOS
			Medico nomeMedico1 = new Medico("Rafael da Silva", "145.345.345-34", "Julia Silva", "Carlos da Silva", "Rua Barao", "m", LocalDate.of(1975, 3, 30), "Clinico Geral", "123456-9");
			medicos.add(nomeMedico1);
			
			Medico nomeMedico2 = new Medico("Lizabel Balta", "745.468.345-84", "Carla Balta", "Clovis Balta", "Rua Conselheiro, 3476, Rocio Pequeno", "f", LocalDate.of(1986, 9, 14), "Obstetra", "9836745-9");
			medicos.add(nomeMedico2);
		}
	}

}