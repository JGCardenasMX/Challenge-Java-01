import javax.swing.JOptionPane;

public class Conversor {
public static void main(String[] args) {
		Mensajes mensajes = new Mensajes();
		
		Object valorConvertir;
		int opcion;
		float cantidadFloat;
		
// Desplegamos el menu para elegir el tipo de conversion que requerimos (moneda o temperatura)
		Object conversionElegida = JOptionPane.showInputDialog(
				   null,
				   "Seleccione una opción de conversión",
				   "Menú",
				   JOptionPane.QUESTION_MESSAGE,
				   null,  // null para icono defecto
				   new Object[] { "Conversor de Moneda", "Conversor de Temperatura"}, 
				   "Conversor de Moneda"
				   );

		//System.out.println("El usuario ha elegido "+conversionElegida);
		
		if (conversionElegida == null) {
			mensajes.mensajeTerminado();
		}
		
		String conversionString = conversionElegida.toString();
				
		
// Seleccion de aplicacion y desplegamos el menu con las divisas que deseamos convertir
		if (conversionString == "Conversor de Moneda") {
			valorConvertir = JOptionPane.showInputDialog(
					   null,
					   "Elige la moneda a la que deseas convertir tu dinero",
					   "Monedas",
					   JOptionPane.QUESTION_MESSAGE,
					   null,  // null para icono defecto
					   new Object[] { "De Pesos(MX) a Dolar(US)", 
							   		  "De Pesos(MX) a Euro(UE)", 
							   		  "De Pesos(MX) a Libras(UK)", 
							   		  "De Pesos(MX) a Yen(JP)",
							   		  "De Pesos(MX) a Won(KS)",
							   		  "De Dolar(US) a Pesos(MX)",
							   		  "De Euros(UE) a Pesos(MX)",
							   		  "De Libras(UK) a Pesos(MX)",
							   		  "De Yen(JP) a Pesos(MX)",
							   		  "De Won(KS) a Pesos(MX)"
							   		  }, 
					   "De Pesos(MX) a Dolar(US)"
			);
			opcion = 1;

			//System.out.println("El usuario ha elegido "+valorConvertir);
					
		} else {
			valorConvertir = JOptionPane.showInputDialog(
					   null,
					   "Elige la moneda a la que deseas convertir tu dinero",
					   "Monedas",
					   JOptionPane.QUESTION_MESSAGE,
					   null,  // null para icono defecto
					   new Object[] { "De Celsius(°C) a Fahrenheit(°F)", 
							   		  "De Celsius(°C) a Kelvin(K)", 
							   		  "De Fahrenheit(°F) a Celsius(°C)", 
							   		  "De Fahrenheit(°F) a Kelvin(K)",
							   		  "De Kelvin(K) a Celsius(°C)",
							   		  "De Kelvin(K) a Fahrenheit(°F)"
							   		  }, 
					   "De Celsius(°C) a Fahrenheit(°F)"
			);
			opcion = 2;
			System.out.println("El usuario ha elegido "+valorConvertir);	
		}
		
		if (valorConvertir == null) {
			
			mensajes.mensajeTerminado();
		}
		
		String valorString = valorConvertir.toString();
			
		
// Ventana que nos pregunta por la cantidad de dinero que se quiere convertir
		if (opcion == 1) {
			String cantidadDinero = JOptionPane.showInputDialog(
					   null,
					   "Ingrese la cantidad de dinero que quiere convertir",
					   JOptionPane.QUESTION_MESSAGE);  // el icono sera un iterrogante
			if (cantidadDinero == null) {
				mensajes.mensajeTerminado();
			}
			cantidadFloat = Float.valueOf(cantidadDinero);
		} else {
			String cantidadDinero = JOptionPane.showInputDialog(
					   null,
					   "Ingrese la cantidad de grados que quiere convertir",
					   JOptionPane.QUESTION_MESSAGE);  // el icono sera un iterrogante
			if (cantidadDinero == null) {
				mensajes.mensajeTerminado();
			}
			cantidadFloat = Float.valueOf(cantidadDinero);
		}	        
		//System.out.println("El usuario decea convertir "+cantidadFloat);
				
				
// Switch con las divisas convertibles
		String unidadOrigen;
		String unidadFinal;
		float unidad;
		float conversion;
		float dolar = 20.00f;
		float euro = 21.25f;
		float libra = 25.00f;
		float yen = 0.15f;
		float won = 0.015f;
		float factorConversion = 1.8f;
		float kelvin = 273.15f;
				
		switch (valorString) {
		// Casos de divisas
		case "De Pesos(MX) a Dolar(US)":
			unidadOrigen = "Pesos";
			unidadFinal = "Dolares";
			mensajes.mensajeMoneda(cantidadFloat, unidadOrigen, unidadFinal, dolar);
			break;
			
		case "De Pesos(MX) a Euro(UE)":
			unidadOrigen = "Pesos";
			unidadFinal = "Euros";
			mensajes.mensajeMoneda(cantidadFloat, unidadOrigen, unidadFinal, euro);
			break;
			
		case "De Pesos(MX) a Libras(UK)":
			unidadOrigen = "Pesos";
			unidadFinal = "Libras";
			mensajes.mensajeMoneda(cantidadFloat, unidadOrigen, unidadFinal, libra);
			break;
			
		case "De Pesos(MX) a Yen(JP)":
			unidadOrigen = "Pesos";
			unidadFinal = "Yens";
			conversion = cantidadFloat / yen;
			mensajes.mensajeMoneda(cantidadFloat, unidadOrigen, unidadFinal, yen);
			break;
			
		case "De Pesos(MX) a Won(KS)":
			unidadOrigen = "Pesos";
			unidadFinal = "Wons";
			mensajes.mensajeMoneda(cantidadFloat, unidadOrigen, unidadFinal, won);
			break;
			
		case "De Dolar(US) a Pesos(MX)":
			unidadOrigen = "Dolares";
			unidadFinal = "Pesos";
			mensajes.mensajeMoneda(cantidadFloat, unidadOrigen, unidadFinal, dolar);
			break;
			
		case "De Euros(UE) a Pesos(MX)":
			unidadOrigen = "Euros";
			unidadFinal = "Pesos";
			mensajes.mensajeMoneda(cantidadFloat, unidadOrigen, unidadFinal, euro);
			break;
			
		case "De Libras(UK) a Pesos(MX)":
			unidadOrigen = "Libras";
			unidadFinal = "Pesos";
			mensajes.mensajeMoneda(cantidadFloat, unidadOrigen, unidadFinal, libra);
			break;
			
		case "De Yen(JP) a Pesos(MX)":
			unidadOrigen = "Yens";
			unidadFinal = "Pesos";
			mensajes.mensajeMoneda(cantidadFloat, unidadOrigen, unidadFinal, yen);
			break;
			
		case "De Won(KS) a Pesos(MX)":
			unidadOrigen = "Wons";
			unidadFinal = "Pesos";
			mensajes.mensajeMoneda(cantidadFloat, unidadOrigen, unidadFinal, won);
			break;
		
		// Casos para Temperatura
		case "De Celsius(°C) a Fahrenheit(°F)":
			unidadOrigen = "°C";
			unidadFinal = "°F";
			conversion = factorConversion * cantidadFloat + 32;
			// Ventana que muestra el resultado de la conversion
			mensajes.mensajeTemperatura(cantidadFloat, unidadOrigen, unidadFinal, conversion);
			break;
			
		case "De Celsius(°C) a Kelvin(K)":
			unidadOrigen = "°C";
			unidadFinal = "K";
			conversion = cantidadFloat + kelvin;
			mensajes.mensajeTemperatura(cantidadFloat, unidadOrigen, unidadFinal, conversion);
			break;
			
		case "De Fahrenheit(°F) a Celsius(°C)":
			unidadOrigen = "°F";
			unidadFinal = "°C";
			conversion = (cantidadFloat-32)/factorConversion;
			mensajes.mensajeTemperatura(cantidadFloat, unidadOrigen, unidadFinal, conversion);
			break;
			
		case "De Fahrenheit(°F) a Kelvin(K)":
			unidadOrigen = "°F";
			unidadFinal = "K";
			conversion = (cantidadFloat -32)/factorConversion+kelvin;
			mensajes.mensajeTemperatura(cantidadFloat, unidadOrigen, unidadFinal, conversion);
			break;
			
		case "De Kelvin(K) a Celsius(°C)":
			unidadOrigen = "K";
			unidadFinal = "°C";
			conversion = cantidadFloat - kelvin;
			mensajes.mensajeTemperatura(cantidadFloat, unidadOrigen, unidadFinal, conversion);
			break;
			
		case "De Kelvin(K) a Fahrenheit(°F)":
			unidadOrigen = "K";
			unidadFinal = "°F";
			conversion = factorConversion*(cantidadFloat - kelvin) + 32;
			mensajes.mensajeTemperatura(cantidadFloat, unidadOrigen, unidadFinal, conversion);
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "No has introducido una opción de conversión");
			break;
		}
		
		
		// Ventana de confirmacion de continuar con la aplicacion o cerrarla.
		int confirmado = JOptionPane.showConfirmDialog(
				   null,
				   "¿Deseas continuar?");

		if (JOptionPane.OK_OPTION == confirmado) {
			System.out.println("Continuamos");
			Conversor.main(args);
		}else {
		   System.out.println("Programa Terminado");
		   mensajes.mensajeTerminado();
		}
	}
}
