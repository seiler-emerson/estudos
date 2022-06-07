package prontuario.relatorios;

import java.util.ArrayList;
import java.util.Scanner;
import prontuario.Main;
import prontuario.cadastros.Cadastros;
import prontuario.cadastros.Paciente;
import prontuario.prontuario.eletronico.ProntuarioEletronico;

public class Relatorios {

	static Scanner input = new Scanner(System.in);

	public static void relatorio() {

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
				System.out.println("RELATORIO - NUMERO DE PACIENTES CADASTRADOS");
				relatorioNumeroPacientes(Cadastros.pacientes);
				break;
			case 2:
				System.out.println("RELATORIO - NUMERO DE CONSULTAS MEDICAS REALIZADAS");
				relatorioNumeroAtendimentos(Cadastros.pacientes);
				break;
			case 3:
				System.out.println("RELATORIO - DETALHES PACIENTES");
				relatorioDetalhesPacientes(Cadastros.pacientes);
				break;
			default:
				System.out.println("Select a valid option!");
				break;
			}

		} while (option != 0);

	}

	public static String displayMenu() {
		String menu = "||====================================||";
		menu += "\n||              RELATORIOS            ||";
		menu += "\n||-1 - Return                         ||";
		menu += "\n|| 0 - Exit                           ||";
		menu += "\n|| 1 - Numero de Pacientes            ||";
		menu += "\n|| 2 - Numbero de Consultas           ||";
		menu += "\n|| 3 - Dados Pacientes                ||";
		menu += "\n||                                    ||";
		menu += "\n||====================================||";
		menu += "\nSelect an option:";

		return menu;
	}
	
	private static void relatorioNumeroPacientes(ArrayList<Paciente> pacientes) {
		byte numeroPacientes=0;
		for(byte count=0;count<pacientes.size();count++) {
			numeroPacientes+=1;
		}
		
		System.out.println("Numero pacientes cadastrados: "+numeroPacientes);
	}
	
	private static void relatorioNumeroAtendimentos(ArrayList<Paciente> pacientes) {
		byte numeroAtendimentos=0;
		for(byte count=0;count<pacientes.size();count++) {
			for(byte count2=0;count2<pacientes.get(count).atendimentos.size();count2++) {
				numeroAtendimentos+=1;
			}
		}
		
		System.out.println("Numero de atendimentos cadastrados: "+numeroAtendimentos);
	}
	
	private static void relatorioDetalhesPacientes(ArrayList<Paciente> pacientes) {
		
		
		ProntuarioEletronico.listarPacientes(pacientes);
		System.out.println("Selecione um paciente: ");
		byte option = input.nextByte();
		
		byte numeroAtendimentos=0;
		for(byte count=0;count<pacientes.get(option).atendimentos.size();count++) {
			numeroAtendimentos+=1;
		}
		
		System.out.println("Nome Completo: "+pacientes.get(option).getNome());
		System.out.println("CPF: "+pacientes.get(option).getCpf());
		System.out.println("Nome Mae: "+pacientes.get(option).getNomeMae());
		System.out.println("Nome Pai: "+pacientes.get(option).getNomePai());
		System.out.println("Endereco: "+pacientes.get(option).getEndereco());
		System.out.println("Sexo: "+pacientes.get(option).getSexo());
		System.out.println("Data nascimento: "+pacientes.get(option).getNascimento());
		System.out.println("Numero Atendimentos: "+numeroAtendimentos);
		
		
	}

}