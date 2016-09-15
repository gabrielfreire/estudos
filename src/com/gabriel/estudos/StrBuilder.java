package com.gabriel.estudos;

public class StrBuilder {
	String vazio;
	public static void main(String[] args) {

		String cert = "Certificado";
		String pais = "Armenia";
		System.out.println(cert.compareTo(pais)); // compareTo will return negative if the String being compared comes first than the other one and positive if it comes after than the other one
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		sb.append("guilherme");
		sb2.append("Gabriel").delete(2, 3);
		System.out.println(sb);
		System.out.println(sb.indexOf("e") + sb.lastIndexOf("e")); // 13
		System.out.println(sb.indexOf("k")+ sb.lastIndexOf("k")); // -2 cuz when there is no index for a letter it returns -1
		System.out.println(sb2); // Gariel cuz the index 2 is 'b' and it finishes at 3, so only 'b' is deleted
		
		String s = "aba";
		String va = null;
		String full = "ola " + va;
		
//		for(int i = 0; i < 9; i++){
//			s += "aba";
//		}
		System.out.println(s.length()); //30
		s.concat("  aa");
		System.out.println(full);
	
		
	}
	//it doesnt compile
//	public static void imprime(){
//		String msg;
//		if(!msg.isEmpty()){
//			System.out.println(msg);
//		}else{
//			System.out.println("vazio");
//		}
//		
//	}
}
