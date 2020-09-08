package view;

import java.util.Scanner;

import controller.Processos;

public class Main {
	public static void main(String[] args) {
		Processos opSistema = new Processos();
		String os = opSistema.Sistema();
		Scanner input = new Scanner(System.in);
		Scanner par = new Scanner(System.in);
		String w = "Windows";
		String l = "Linux";
		String ar[] = new String[3];
		ar = os.split(" ");
		String b = ar[0];
		String process = "TASKLIST /FO TABLE";
		String processl = "ps -e";
		int n = 0 ;
		while (n != 9) {
			System.out.print("\n1 - Mostrar Sistema Operacional \n2 - Mostrar lista de Processos \n3- Martar Processo por PID \n4 - Matar Processo por nome \n9 - Finaliza programa \n\n" );
			int j = input.nextInt();
			n = j ;
			switch(j) {
			case 1:
				System.out.println("Sistema operacional é o " + os);
				break;
			case 2:	
				opSistema.Processos(w, b ,l, process,processl);
				break;
			case 3:
				String param = par.next();
				opSistema.killProcess(param , w , l , b);
				break;
			case 4:
				String r = par.next();
				opSistema.killProcess(r , w , l , b);
				break;				
			case 9:
				System.out.println("Fechando programa");
			}		
		}					
	}
}
