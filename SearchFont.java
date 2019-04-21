package Fonts;

import java.awt.GraphicsEnvironment;
import javax.swing.JOptionPane;

public class SearchFont {

	public static void main(String[] args) {
		String font=JOptionPane.showInputDialog("Enter font type.");
		boolean beFont=false;
		String[] nameFont=GraphicsEnvironment.getLocalGraphicsEnvironment().
				getAvailableFontFamilyNames();
		for( String n: nameFont) {
			if(n.equalsIgnoreCase(font)){
				beFont=true;
			}
		}
		if(beFont) {
			System.out.println("Installed font.");
		}
		else {
			System.out.println("Uninstalled font.");
		}

	}

}
