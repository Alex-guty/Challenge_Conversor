import javax.swing.JOptionPane;

public class menuConversorTemperatura {

	public void mconvertirTemperatura() {

		Validacion valida = new Validacion();

		String valor = JOptionPane.showInputDialog(null, "Ingrese el valor de Temperatura:", "Alura+Oracle",
				JOptionPane.QUESTION_MESSAGE);

		if (valor != null) {
			if (valida.esNumero(valor)) {
				double temperatura = Double.parseDouble(valor);

				String[] opciones = { "Seleccionar tipo de Conversión", "1-Celsius a Fahrenheit",
						"2-Fahrenheit a Celsius" };
				String op = (String) JOptionPane.showInputDialog(null, "Conversor de Temperatura", "Alura+Oracle",
						JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);

				switch (op) {
				case "1-Celsius a Fahrenheit":
					double resultadoFahrenheit = (temperatura * 9 / 5) + 32;
					JOptionPane.showMessageDialog(null, temperatura + " °C equivale a " + resultadoFahrenheit + " °F",
							"Alura+Oracle", JOptionPane.INFORMATION_MESSAGE);
					break;
				case "2-Fahrenheit a Celsius":
					double resultadoCelsius = (temperatura - 32) * 5 / 9;
					JOptionPane.showMessageDialog(null, temperatura + " °F equivale a " + resultadoCelsius + " °C",
							"Alura+Oracle", JOptionPane.INFORMATION_MESSAGE);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opción inválida", "Alura+Oracle", JOptionPane.ERROR_MESSAGE);
					break;
				}
			} else {
				JOptionPane.showMessageDialog(null, "Error! Ingrese valores numéricos", "Alura+Oracle",
						JOptionPane.ERROR_MESSAGE);
				mconvertirTemperatura();
			}
		}
	}
}
