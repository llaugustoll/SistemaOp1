package view;

import controller.Processos;

public class Main {
	public static void main(String[] args) {
		Processos opSistema = new Processos();
		String os = opSistema.Sistema();
	
		String a = "Windows";
		String ar[] = new String[3];
		ar = os.split(" ");
		String b = ar[0];
		

		String process = "TASKLIST /FO TABLE";
		//String param = "10152";	
		opSistema.Processos(a, b , process);
		//String param = "cmd.exe";
		//opSistema.killProcess(param);
		
	}
}
