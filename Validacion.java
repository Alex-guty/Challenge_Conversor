
public class Validacion {
	public boolean esNumero(String texto) {
		try {
			Double.parseDouble(texto);
			return texto.matches("[0-9]+");
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
