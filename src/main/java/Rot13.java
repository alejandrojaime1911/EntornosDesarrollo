package main;

public class Rot13{

	public static void main(String[] args) {
		System.out.println(descifrar("NEEVON YVGEBANF l ivin Senapb"));
	}

	*//@return string que cifra/* 
	private static String cifrar(String msg) {
		StringBuilder cifrado = new StringBuilder();
		for(int i = 0; i < msg.length(); i++) {
			char c = msg.charAt(i);
			if (Character.isLetter(c)) {
				if(Character.isLowerCase(c)) {
					cifrado.append(rot13minus(c));
				} else {
					cifrado.append(rot13mayus(c));
				}
			} else {
				cifrado.append(c);
			}
		}
		return cifrado.toString();
	}
	
	private static String descifrar(String msg) {
		return cifrar(msg);
	}
	
	private static char rot13minus(char c) {
		char cifrado;
		if(c + 13 > 'z') {
			cifrado = (char) ('a' + (13 - ('z' - c)) - 1);
		} else {
			cifrado = (char) (c + 13);
		}
		return cifrado;
	}
	
	private static char rot13mayus(char c) {
		char cifrado;
		if(c + 13 > 'Z') {
			cifrado = (char) ('A' + (13 - ('Z' - c)) - 1);
		} else {
			cifrado = (char) (c + 13);
		}
		return cifrado;
	}
}
