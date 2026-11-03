
package controlador;

import Vista.PanelDatos;

public class ControladorDatos {

    // Variable que conecta con la ventana
    private PanelDatos vista;

    // Constructor
    public ControladorDatos(PanelDatos vista) {

        this.vista = vista;

        // =================================
        // BOTÓN 1: ANALIZAR COMO TEXTO
        // =================================

        vista.getBtnAnalizarTexto().addActionListener(e -> {

            String texto = vista.getCampoEntrada().getText();

            if (texto.trim().isEmpty()) {

                vista.getLabelError().setText(
                    "Error: Ingrese un texto."
                );

            } else {

                int largo = texto.length();

                String mayusculas = texto.toUpperCase();

                vista.getLabelLargo().setText(
                    "Largo: " + largo
                );

                vista.getLabelMayus().setText(
                    "Mayúsculas: " + mayusculas
                );

                vista.getLabelError().setText("");
            }

        });


        // =================================
        // BOTÓN 2: OPERAR COMO NÚMERO
        // =================================

        vista.getBtnOperarNumero().addActionListener(e -> {

            try {

                String dato = vista.getCampoEntrada().getText();

                double numero = Double.parseDouble(dato);

                if (numero < 0) {

                    vista.getLabelError().setText(
                        "Error: No se puede calcular raíz de un negativo."
                    );

                } else {

                    double raiz = Math.sqrt(numero);

                    double potencia = Math.pow(numero, 2);

                    vista.getLabelRaiz().setText(
                        "Raíz Cuadrada: " + String.valueOf(raiz)
                    );

                    vista.getLabelPotencia().setText(
                        "Al Cuadrado: " + String.valueOf(potencia)
                    );

                    vista.getLabelError().setText("");
                }

            } catch (NumberFormatException ex) {

                vista.getLabelError().setText(
                    "Error: Ingrese un número válido."
                );

            }

        });


        // =================================
        // BOTÓN 3: JUEGO ADIVINA EL NÚMERO
        // =================================

        vista.getBtnJuegoAdivina().addActionListener(e -> {

            vista.getLabelError().setText("");

            int secreto = (int)(Math.random() * 10) + 1;

            try {

                String dato = vista.getCampoEntrada().getText();

                int intento = Integer.parseInt(dato);

                if (intento < 1 || intento > 10) {

                    vista.getLabelError().setText(
                        "Error: Ingresa un número del 1 al 10."
                    );

                } else if (intento == secreto) {

                    vista.getLabelJuego().setText(
                        "¡Ganaste! El número secreto era " + secreto
                    );

                } else {

                    vista.getLabelJuego().setText(
                        "Perdiste. Era " + secreto +
                        ", tú dijiste " + intento
                    );

                }

            } catch (NumberFormatException ex) {

                vista.getLabelError().setText(
                    "Error: Debes ingresar un número entero (1-10)."
                );

            }

        });

    }

}

