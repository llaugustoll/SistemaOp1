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
	
	public void Processos(String a , String b , String l ,String process, String processl) {
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
		if (b.intern() == l){
			
			try {
				Process p = Runtime.getRuntime().exec(processl);
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
		
	}

	public void killProcess(String param ,String a , String b , String c) {
		if(c.intern() == a ) { 
			String cmdPid = "TASKKILL /PID";
			String cmdNome = "TASKKILL /IM";
			int pid = 0 ;
			StringBuffer buffer = new StringBuffer();
			
			try {
				pid = Integer.parseInt(param);
				buffer.append(cmdPid);
				buffer.append(" ");
				buffer.append(pid);		
			}catch (NumberFormatException e) {
				buffer.append(cmdNome);
				buffer.append(" ");
				buffer.append(param);
			}
			
			try {
				Runtime.getRuntime().exec(buffer.toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (c.intern() == b) {
				String cmdPid = "kill -9";
				String cmdNome = "pkill -9";
				int pid = 0 ;
				StringBuffer buffer = new StringBuffer();
				
				try {
					pid = Integer.parseInt(param);
					buffer.append(cmdPid);
					buffer.append(" ");
					buffer.append(pid);		
				}catch (NumberFormatException e) {
					System.out.println("aqui "+param);
					buffer.append(cmdNome);
					buffer.append(" ");
					buffer.append(param);
				}
				
				try {
					Runtime.getRuntime().exec(buffer.toString());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}
