package model;

import java.util.Stack;

public class InvertCharacters {

	private Stack<Character> listChar = new Stack<>();
	private Stack<Character> listCharInverted = new Stack<>();
	private String str = "";

	public InvertCharacters() {

	}

	public String splitString(String text) {
		for (int i = 0; i < text.length(); i++) { // stack
			listChar.push(text.charAt(i));
		}
		return invertString(text);
	}

	public String invertString(String text) {
		for (int j = 0; j < text.length(); j++) { // pop
			listCharInverted.push(listChar.pop());
		}
		for (int k = 0; k < listCharInverted.size(); k++) {
			str += Character.toString(listCharInverted.get(k));
		}
		return str;
	}
}
