package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Processos {
	public Processos() {
		super();
	}
	
	public String Sistema() {
		String os = System.getProperty("os.name");
		return os;
	}
	
	public void Processos(String a , String b , String process) {
		if(b.intern() == a) {
			try {
				Process p = Runtime.getRuntime().exec(process);
				InputStream fluxo = p.getInputStream();
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer  = new BufferedReader(leitor);
				String linha = buffer.readLine();
				while (linha != null) {
					System.out.println(linha);
					linha = buffer.readLine();
				}
				buffer.close();
				leitor.close();
				fluxo.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		else {
			System.out.println("os" +"\n" + a +" "+ b);
		}
		
	}


}
