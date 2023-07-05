import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Menu {

	public static void main(String[] args) {

		UIManager.put("OptionPane.background", Color.ORANGE);
		UIManager.put("Panel.background", Color.ORANGE);
		Border bordePersonalizado = new LineBorder(Color.BLACK, 18);
		UIManager.put("OptionPane.border", bordePersonalizado);

		menuConversorMonedas conversionMonedas = new menuConversorMonedas();
		menuConversorTemperatura conversionTemperatura = new menuConversorTemperatura();
		Menu(conversionMonedas, conversionTemperatura);
	}

	public static void Menu(menuConversorMonedas conversionMonedas, menuConversorTemperatura conversionTemperatura) {
		boolean continuar = true;

		while (continuar) {
			String opciones[] = { "Seleccionar opción", "1-Conversor de Monedas", "2-Conversor de Temperatura",
					"3-Salir" };

			String op = (String) JOptionPane.showInputDialog(null, "Menu Principal de Conversion", "Alura+Oracle",
					JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);

			if (op != null) {
				switch (op) {
				case "1-Conversor de Monedas":
					conversionMonedas.mConversorMonedas();
					break;
				case "2-Conversor de Temperatura":
					conversionTemperatura.mconvertirTemperatura();

					break;
				case "3-Salir":
					JOptionPane.showMessageDialog(null, "Programa Terminado", "Alura+Oracle",
							JOptionPane.CLOSED_OPTION);
					System.exit(0);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opción inválida", "Alura+Oracle", JOptionPane.ERROR_MESSAGE);
					break;

				}
			}

			int opContinuar = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?", "Alura+Oracle",
					JOptionPane.YES_NO_OPTION);
			if (opContinuar == JOptionPane.NO_OPTION) {
				continuar = false;
			}
		}
		JOptionPane.showMessageDialog(null, "Programa Terminado", "Alura+Oracle", JOptionPane.CLOSED_OPTION);
		System.exit(0);
	}

}
