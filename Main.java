package view;

import controller.Processos;

public class Main {
	public static void main(String[] args) {
		Processos opSistema = new Processos();
		String os = opSistema.Sistema();
		System.out.println(os);
		String a = "Windows";
		String ar[] = new String[3];
		ar = os.split(" ");
		String b = ar[0];
		System.out.println(ar[0]);
		String process = "TASKLIST /FO TABLE";
		opSistema.Processos(a, b , process);
		
	}
}