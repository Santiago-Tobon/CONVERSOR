import java.text.DecimalFormat;
import javax.swing.*;


public class MonedayTiempo  extends JFrame{
    public static void main(String[] args) {
        // Tasa de cambio ficticia (solo para fines de demostración)

        Interfaz iFaz = new Interfaz();
        iFaz.setVisible(true);
        iFaz.setLocationRelativeTo(null);
        iFaz.setResizable(false);
        iFaz.setBounds(0, 0, 600, 400);
        
        double tasaCambioUSD = 3800;
        double tasaCambioEUR = 4183;
        double tasaCambioGBP = 4854;
        double tasaCambioYEN = 26.52;
        double tasaCambioWON = 2.95;

        
    }
}

        Object[] options = { "Convertir Monedas", "Convertir Temperatura", "Salir" };
        int choice = JOptionPane.showOptionDialog(null, "¿Qué deseas hacer?", "Convertir",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        if (choice == 2) {
            JOptionPane.showMessageDialog(null, "Programa Cerrado");
            System.exit(0);
        }

        if (choice == 0) {
            DecimalFormat formatoDecimal = new DecimalFormat("#.##");
            boolean continuarPrograma = true;

            while (continuarPrograma) {
                String[] opciones = { "Pesos a Euros", "Pesos a Dólares", "Pesos a Libras Esterlinas", "Pesos a Yen",
                        "Pesos a Won" };

                String cambio = (String) JOptionPane.showInputDialog(null, "Elige una opción:",
                        "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                String input = JOptionPane.showInputDialog("Ingrese la cantidad en pesos colombianos: ");
                double pesos;
                
                try {
                    pesos = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no válido.");
                    return;
                }

                double resultado = 0;

                if (cambio.equals("Pesos a Dólares")) {
                    resultado = pesos / tasaCambioUSD; // Utiliza la tasa de cambio ficticia
                    JOptionPane.showMessageDialog(null,
                            pesos + " pesos colombianos son " + formatoDecimal.format(resultado) + " dólares.");
                } else if (cambio.equals("Pesos a Euros")) {
                    // Calcula la conversión a euros de manera similar
                } // Agrega más conversiones aquí

                if (cambio.equals("Pesos a Euros")) {
                    resultado = pesos / tasaCambioEUR; // Utiliza la tasa de cambio ficticia
                    JOptionPane.showMessageDialog(null,
                            pesos + " pesos colombianos son " + formatoDecimal.format(resultado) + " euros.");
                } else if (cambio.equals("Pesos a Euros")) {
                    // Calcula la conversión a euros de manera similar
                } // Agrega más conversiones aquí

                if (cambio.equals("Pesos a Libras Esterlinas")) {
                    resultado = pesos / tasaCambioGBP; // Utiliza la tasa de cambio ficticia
                    JOptionPane.showMessageDialog(null,
                            pesos + " pesos colombianos son " + formatoDecimal.format(resultado) + " Libras Esterlinas.");
                } else if (cambio.equals("Pesos a Euros")) {
                    // Calcula la conversión a euros de manera similar
                } // Agrega más conversiones aquí

                if (cambio.equals("Pesos a Yen")) {
                    resultado = pesos / tasaCambioYEN; // Utiliza la tasa de cambio ficticia
                    JOptionPane.showMessageDialog(null,
                            pesos + " pesos colombianos son " + formatoDecimal.format(resultado) + " Yen.");
                } else if (cambio.equals("Pesos a Euros")) {
                    // Calcula la conversión a euros de manera similar
                } // Agrega más conversiones aquí

                if (cambio.equals("Pesos a Won")) {
                    resultado = pesos / tasaCambioWON; // Utiliza la tasa de cambio ficticia
                    JOptionPane.showMessageDialog(null,
                            pesos + " pesos colombianos son " + formatoDecimal.format(resultado) + " Won.");
                } else if (cambio.equals("Pesos a Euros")) {
                    // Calcula la conversión a euros de manera similar
                } // Agrega más conversiones aquí

                int confirm = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmar",
                        JOptionPane.YES_NO_CANCEL_OPTION);

                if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
                    continuarPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                }
            }
        }


        
        if (choice == 1) {

            Boolean SeguirPrograma = true;
            while (SeguirPrograma) {

                String[] opciones = { "Celsius a Fahrenheit", "Fahrenheit a Celsius" };
                int opcion = JOptionPane.showOptionDialog(null, "Elige una opción de conversión:",
                        "Convertidor de Temperatura", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                        null, opciones, opciones[0]);

                String valorStr = JOptionPane.showInputDialog("Ingresa el valor a convertir: ");

                double valor = 0;
                try {
                    valor = Double.parseDouble(valorStr);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no válido");
                    System.exit(0);
                }

                double resultado = 0;
                if (opcion == 0) {
                    resultado = (valor * 9 / 5) + 32;
                    JOptionPane.showMessageDialog(null,
                            valor + " grados Celsius son " + resultado + " grados Fahrenheit");
                } else if (opcion == 1) {
                    resultado = (valor - 32) * 5 / 9;
                    JOptionPane.showMessageDialog(null,
                            valor + " grados Fahrenheit son " + resultado + " grados Celsius");
                }

                int continuar = JOptionPane.showConfirmDialog(null, "¿Deseas continuar usando el programa?", "",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                if (continuar == JOptionPane.NO_OPTION || continuar == JOptionPane.CANCEL_OPTION) {
                    SeguirPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");

                }
            }

        }

    }
}
