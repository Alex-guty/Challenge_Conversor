import javax.swing.JOptionPane;

public class menuConversorMonedas {

	Validacion valida = new Validacion();

	public void mConversorMonedas() {
		String[] opciones = { "Seleccionar tipo de Conversión", "1-USD a EUR", "2-EUR a USD", "3-COLONES a EUR",
				"4-EUR a COLONES", "5-COLONES a USD", "6-USD a COLONES", "7-Salir" };

		String op = (String) JOptionPane.showInputDialog(null, "Conversor de Monedas", "Alura+Oracle",
				JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);

		if (op != null) {
			switch (op) {
			case "1-USD a EUR":
				convertirUSDaEUR();
				break;
			case "2-EUR a USD":
				convertirEURaUSD();
				break;
			case "3-COLONES a EUR":
				convertirColonesaEUR();
				break;
			case "4-EUR a COLONES":
				convertirEURaColones();
				break;
			case "5-COLONES a USD":
				convertirColonesaUSD();
				break;
			case "6-USD a COLONES":
				convertirUSDaColones();
				break;
			case "7-Salir":
				JOptionPane.showMessageDialog(null, "Progama Terminado", "Alura+Oracle",
						JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opción inválida", "Alura+Oracle", JOptionPane.ERROR_MESSAGE);

				break;
			}
		}
	}

	public void convertirUSDaEUR() {
		String valorUSD = JOptionPane.showInputDialog(null, "Ingrese el valor en USD:", "Alura+Oracle",
				JOptionPane.QUESTION_MESSAGE);

		if (valorUSD != null) {
			if (valida.esNumero(valorUSD)) {
				double cantidadUSD = Double.parseDouble(valorUSD);

				// Tipo de cambio fijo de USD a EUR
				double tipoCambio = 0.85;

				double cantidadEUR = cantidadUSD * tipoCambio;
				JOptionPane.showMessageDialog(null, "$" + cantidadUSD + " USD equivale a €" + cantidadEUR + " EUR"
						+ "\n" + "Tienes €" + cantidadEUR + " Euros", "Alura+Oracle", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Error! Ingrese valores numericos", "Alura+Oracle",
						JOptionPane.ERROR_MESSAGE);
				convertirUSDaEUR(); // vuelve solicitar la entrada
			}
		}
	}

	public void convertirEURaUSD() {
		String valorEUR = JOptionPane.showInputDialog(null, "Ingrese el valor en EUR:", "Alura+Oracle",
				JOptionPane.QUESTION_MESSAGE);

		if (valorEUR != null) {
			if (valida.esNumero(valorEUR)) {
				double cantidadEUR = Double.parseDouble(valorEUR);

				// Tipo de cambio fijo de EUR a USD
				double tipoCambio = 1.18;

				double cantidadUSD = cantidadEUR * tipoCambio;
				JOptionPane.showMessageDialog(null, "€" + cantidadEUR + " EUR equivale a $" + cantidadUSD + " USD"
						+ "\n" + "Tienes $" + cantidadUSD + " Dolares", "Alura+Oracle",
						JOptionPane.INFORMATION_MESSAGE);

			} else {
				JOptionPane.showMessageDialog(null, "Error! Ingrese valores numericos", "Alura+Oracle",
						JOptionPane.ERROR_MESSAGE);
				convertirEURaUSD();// vuelve solicitar la entrada
			}
		}
	}

	public void convertirColonesaEUR() {
		String valorColones = JOptionPane.showInputDialog(null, "Ingrese el valor en Colones:", "Alura+Oracle",
				JOptionPane.QUESTION_MESSAGE);

		if (valorColones != null) {
			if (valida.esNumero(valorColones)) {
				double cantidadColones = Double.parseDouble(valorColones);

				// Tipo de cambio fijo de Colones a EUR
				double tipoCambio = 588.89;

				double cantidadEUR = cantidadColones / tipoCambio;
				String resultadoFormateado = String.format("%.2f", cantidadEUR);
				JOptionPane
						.showMessageDialog(null,
								"₡" + cantidadColones + " Colones equivale a €" + cantidadEUR + " EUR" + "\n"
										+ "Tienes €" + resultadoFormateado + "Euros",
								"Alura+Oracle", JOptionPane.INFORMATION_MESSAGE);
			} else {

				JOptionPane.showMessageDialog(null, "Error! Ingrese valores numericos", "Alura+Oracle",
						JOptionPane.ERROR_MESSAGE);
				convertirColonesaEUR();// vuelve solicitar la entrada
			}
		}
	}

	public void convertirEURaColones() {
		String valorEUR = JOptionPane.showInputDialog(null, "Ingrese el valor en EUR:", "Alura+Oracle",
				JOptionPane.QUESTION_MESSAGE);

		if (valorEUR != null) {
			if (valida.esNumero(valorEUR)) {

				double cantidadEUR = Double.parseDouble(valorEUR);

				// Tipo de cambio fijo de EUR a Colones
				double tipoCambio = 588.89;
				double cantidadColones = cantidadEUR * tipoCambio;
				String resultadoFormateado = String.format("%.2f", cantidadColones);
				JOptionPane
						.showMessageDialog(null,
								"€" + cantidadEUR + " EUR equivale a ₡" + cantidadColones + " Colones" + "\n"
										+ "Tienes ₡" + resultadoFormateado + "Colones",
								"Alura+Oracle", JOptionPane.INFORMATION_MESSAGE);

			} else {
				JOptionPane.showMessageDialog(null, "Error! Ingrese valores numericos", "Alura+Oracle",
						JOptionPane.ERROR_MESSAGE);
				convertirEURaColones();// vuelve solicitar la entrada
			}

		}
	}

	public void convertirColonesaUSD() {
		String valorColones = JOptionPane.showInputDialog(null, "Ingrese el valor en Colones:", "Alura+Oracle",
				JOptionPane.QUESTION_MESSAGE);

		if (valorColones != null) {
			if (valida.esNumero(valorColones)) {
				double cantidadColones = Double.parseDouble(valorColones);

				// Tipo de cambio fijo de Colones a USD
				double tipoCambio = 545;
				double cantidadUSD = (cantidadColones / tipoCambio);
				String resultadoFormateado = String.format("%.2f", cantidadUSD);

				JOptionPane.showMessageDialog(null, "₡" + cantidadColones + " Colones equivale a $" + cantidadUSD
						+ " USD" + "\n" + "Tienes $" + resultadoFormateado + " Dolares");
			} else {
				JOptionPane.showMessageDialog(null, "Error! Ingrese valores numericos", "Alura+Oracle",
						JOptionPane.ERROR_MESSAGE);
				convertirColonesaUSD(); // vuelve solicitar la entrada
			}
		}
	}

	public void convertirUSDaColones() {
		String valorUSD = JOptionPane.showInputDialog(null, "Ingrese el valor en USD:");

		if (valorUSD != null) {
			if (valida.esNumero(valorUSD)) {

				double cantidadUSD = Double.parseDouble(valorUSD);
				// Tipo de cambio fijo de USD a Colones
				double tipoCambio = 545;

				double cantidadColones = (cantidadUSD * tipoCambio);
				String resultadoFormateado = String.format("%.2f", cantidadColones);

				JOptionPane.showMessageDialog(null, "$" + cantidadUSD + " USD equivale a ₡" + cantidadColones
						+ " Colones" + "\n" + "Tienes ₡" + resultadoFormateado + " Colones");

			} else {
				JOptionPane.showMessageDialog(null, "Error! Ingrese valores numericos", "!!Advertencia!!",
						JOptionPane.ERROR_MESSAGE);
				convertirUSDaColones(); // vuelve solicitar la entrada
			}
		}
	}

}