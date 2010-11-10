/**
 * Created by Periklis Ntanasis (Master_ex) and Ivan Kanakarakis (c00kiemon5ter)
 * This is a demo for NetBeans IDE Swing drug n drop features designed
 * for a foss-aueb presentation
 */
package dummycalculator;

import gui.CalculatorUI;

public class DummyCalculator {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
                    new CalculatorUI().setVisible(true);
			}
		});
	}
}
