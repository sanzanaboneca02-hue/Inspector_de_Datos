package controlador;

import Vista.PanelDatos;

public class ControladorDatos {

    private PanelDatos vista;

    public ControladorDatos(PanelDatos vista) {

        this.vista = vista;

        // BOTÓN 1: ANALIZAR COMO TEXTO
        vista.getBtnAnalizarTexto().addActionListener(e -> {

            String texto = vista.getCampoEntrada().getText();

            int largo = texto.length();

            String mayusculas = texto.toUpperCase();

            vista.getLabelLargo().setText("Largo: " + largo);
            vista.getLabelMayus().setText("Mayúsculas: " + mayusculas);

        });

        // BOTÓN 2: OPERAR COMO NÚMERO
        vista.getBtnOperarNumero().addActionListener(e -> {

            try {

                String dato = vista.getCampoEntrada().getText();

                double numero = Double.parseDouble(dato);

                double raiz = Math.sqrt(numero);
                double potencia = Math.pow(numero, 2);

                vista.getLabelRaiz().setText("Raíz Cuadrada: " + String.valueOf(raiz));
                vista.getLabelPotencia().setText("Al Cuadrado: " + String.valueOf(potencia));

                vista.getLabelError().setText("");

            } catch (NumberFormatException e) {

                vista.getLabelError().setText("Error: Ingrese un número válido.");

            }

        });

        // BOTÓN 3: JUEGO ADIVINA EL NÚMERO
        vista.getBtnJuegoAdivina().addActionListener(e -> {

            vista.getLabelError().setText("");

            int secreto = (int)(Math.random() * 10) + 1;

            try {

                String dato = vista.getCampoEntrada().getText();

                int intento = Integer.parseInt(dato);

                if (intento == secreto) {

                    vista.getLabelJuego().setText("¡Ganaste! El número secreto era " + secreto);

                } else {

                    vista.getLabelJuego().setText("Perdiste. Era " + secreto + ", tú dijiste " + intento);

                }

            } catch (NumberFormatException e) {

                vista.getLabelError().setText("Error: Debes ingresar un número entero (1-10).");

            }

        });

    }
}



    
