package ar.com.conversorDeMonedas.codigo;

import javax.swing.JOptionPane;

public class ConversorDeMoneda {
	
	public static void main(String[] args) {
		
		mostrarMenuPrincipal();
		
	}
	
	public static void mostrarMenuPrincipal() {
		
		String[] opciones = {
				"Conversor de Moneda",
				"Conversor de Peso",
				"Salir"
		};
		
		int seleccion = JOptionPane.showOptionDialog(
				null,
				"Seleccione una Opcion: ",
				"Menu Conversor",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE,
				null,
				opciones,
				opciones[0]
		);
		
		switch (seleccion) {
				case 0:
					realizarConversionMoneda();
					break;
				case 1:
					realizarConversionPeso();
					break;
				case 2:
					JOptionPane.showMessageDialog(	null, "Gracias por su visita!");
					System.exit(0);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opcion Invalida, Saliendo del Programa.");
					System.exit(1);
					break;
		}
		
	}
	
	public static void realizarConversionMoneda() {
		String cantidadStr = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero:");
		
		if (cantidadStr == null) {
			// Si el usuario presiona "Cancelar", volvemos al menú principal
			mostrarMenuPrincipal();
			return;
		}
		
		try {
			// Convertir la cantidad ingresada a un valor numérico
			double cantidad = Double.parseDouble(cantidadStr);

			// Aquí implementarías la lógica de conversión de moneda
			// Puedes pedir al usuario que ingrese la moneda de origen y destino utilizando
			// JOptionPane.showInputDialog y mostrar el resultado de la conversión en un
			// JOptionPane.showMessageDialog
			// También puedes utilizar APIs de conversión de moneda, como por ejemplo https://exchangeratesapi.io/

			// Supongamos que la conversión devuelve un valor convertido
			double resultado = cantidad * 1.12; // Conversión de dólares a euros (valor ficticio)

			// Mostrar el resultado en un cuadro de diálogo
			JOptionPane.showMessageDialog(null, cantidad + " dólares son " + resultado + " euros.");

		} catch (NumberFormatException e) {
			// Si el usuario ingresó un valor no numérico, mostrar un mensaje de error
			JOptionPane.showMessageDialog(null, "Cantidad inválida. Por favor, ingrese un valor numérico.");
		}

		// Volver al menú principal después de mostrar el resultado o el mensaje de error
		mostrarMenuPrincipal();
	}
	
	 public static void realizarConversionPeso() {
	        // Implementar aquí la lógica de la otra función 1
	        JOptionPane.showMessageDialog(null, "Función de Conversor de Peso aún no implementado.");
	        mostrarMenuPrincipal();
	    }

}
