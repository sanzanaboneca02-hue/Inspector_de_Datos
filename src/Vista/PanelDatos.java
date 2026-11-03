
package Vista;

import javax.swing.*;
import java.awt.*;

public class PanelDatos extends JFrame {

    // Campo de entrada
    private JTextField campoEntrada;

    // Etiquetas de resultados
    private JLabel labelLargo;
    private JLabel labelMayus;
    private JLabel labelRaiz;
    private JLabel labelPotencia;
    private JLabel labelJuego;
    private JLabel labelError;

    // Botones
    private JButton btnAnalizarTexto;
    private JButton btnOperarNumero;
    private JButton btnJuegoAdivina;

    public PanelDatos(String titulo) {

        setTitle(titulo);
        setSize(750, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout(15, 15));

        // PANEL PRINCIPAL
        JPanel principal = new JPanel();
        principal.setLayout(new BoxLayout(principal, BoxLayout.Y_AXIS));
        principal.setBorder(BorderFactory.createEmptyBorder(20, 25, 20, 25));

        // TITULO
        JLabel tituloLabel = new JLabel("INSPECTOR DE DATOS");
        tituloLabel.setFont(new Font("Arial", Font.BOLD, 23));
        tituloLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        principal.add(tituloLabel);
        principal.add(Box.createVerticalStrut(20));

        // PANEL DE ENTRADA
        JPanel panelEntrada = new JPanel(new FlowLayout(FlowLayout.LEFT));

        panelEntrada.setBorder(
            BorderFactory.createTitledBorder("Ingreso de datos")
        );

        campoEntrada = new JTextField(25);

        panelEntrada.add(new JLabel("Ingrese un dato:"));
        panelEntrada.add(campoEntrada);

        principal.add(panelEntrada);
        principal.add(Box.createVerticalStrut(15));

        // PANEL DE BOTONES
        JPanel panelBotones = new JPanel(new GridLayout(1, 3, 10, 10));

        panelBotones.setBorder(
            BorderFactory.createTitledBorder("Operaciones")
        );

        btnAnalizarTexto = new JButton("Analizar Texto");
        btnOperarNumero = new JButton("Operar Número");
        btnJuegoAdivina = new JButton("Adivina el Número");

        panelBotones.add(btnAnalizarTexto);
        panelBotones.add(btnOperarNumero);
        panelBotones.add(btnJuegoAdivina);

        principal.add(panelBotones);
        principal.add(Box.createVerticalStrut(20));

        // PANEL DE RESULTADOS
        JPanel panelResultados = new JPanel(new GridLayout(0, 1, 5, 8));

        panelResultados.setBorder(
            BorderFactory.createTitledBorder("Resultados")
        );

        labelLargo = new JLabel("Largo: ");
        labelMayus = new JLabel("Mayúsculas: ");
        labelRaiz = new JLabel("Raíz cuadrada: ");
        labelPotencia = new JLabel("Al cuadrado: ");
        labelJuego = new JLabel("Resultado del juego: ");
        labelError = new JLabel(" ");

        panelResultados.add(labelLargo);
        panelResultados.add(labelMayus);
        panelResultados.add(labelRaiz);
        panelResultados.add(labelPotencia);
        panelResultados.add(labelJuego);
        panelResultados.add(labelError);

        principal.add(panelResultados);

        add(principal, BorderLayout.CENTER);

        setVisible(true);
    }

    // GETTERS

    public JTextField getCampoEntrada() {
        return campoEntrada;
    }

    public JLabel getLabelLargo() {
        return labelLargo;
    }

    public JLabel getLabelMayus() {
        return labelMayus;
    }

    public JLabel getLabelRaiz() {
        return labelRaiz;
    }

    public JLabel getLabelPotencia() {
        return labelPotencia;
    }

    public JLabel getLabelJuego() {
        return labelJuego;
    }

    public JLabel getLabelError() {
        return labelError;
    }

    public JButton getBtnAnalizarTexto() {
        return btnAnalizarTexto;
    }

    public JButton getBtnOperarNumero() {
        return btnOperarNumero;
    }

    public JButton getBtnJuegoAdivina() {
        return btnJuegoAdivina;
    }
}

