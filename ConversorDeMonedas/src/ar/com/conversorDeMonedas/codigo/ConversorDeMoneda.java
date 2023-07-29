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
		
			String opcionSeleccionada = (String) JOptionPane.showInputDialog(
					
		            null,
		            "Seleccione una Opción:",
		            "Menu Conversor",
		            JOptionPane.PLAIN_MESSAGE,
		            null,
		            opciones,
		            opciones[0]
		            		
		     );

			if (opcionSeleccionada == null) {
	            
	            JOptionPane.showMessageDialog(null, "Gracias por su visita!");
	            System.exit(0);
	            
	        } else {
            
		        switch (opcionSeleccionada) {
	                case "Conversor de Moneda":
	                    realizarConversionMoneda();
	                    break;
	                case "Conversor de Peso":
	                    realizarConversionPeso();
	                    break;
	                case "Salir":
	                    JOptionPane.showMessageDialog(null, "Gracias por su visita!");
	                    System.exit(0);
	                    break;
	                default:
	                    JOptionPane.showMessageDialog(null, "Opción Inválida.");
	                    mostrarMenuPrincipal();
	                    break;
	                    
	            }
        }
 }

	
	public static void realizarConversionMoneda() {
        // Aquí implementarías el código para el conversor de moneda
        // Puedes utilizar JOptionPane.showInputDialog para pedir al usuario los datos necesarios
        // y mostrar el resultado de la conversión en un JOptionPane.showMessageDialog
        // También puedes utilizar APIs de conversión de moneda, como por ejemplo https://exchangeratesapi.io/

        JOptionPane.showMessageDialog(null, "Función de Conversor de Moneda aún no implementada.");
        mostrarMenuPrincipal();
    }
	
	 public static void realizarConversionPeso() {
	        // Implementar aquí la lógica de la otra función 1
	        JOptionPane.showMessageDialog(null, "Función de Conversor de Peso aún no implementado.");
	        mostrarMenuPrincipal();
	    }

}
