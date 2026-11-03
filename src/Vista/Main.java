package Vista;

import controlador.ControladorDatos;

public class Main {

    public static void main(String[] args) {

        PanelDatos vista = new PanelDatos("Inspector de Datos");

        ControladorDatos controlador = new ControladorDatos(vista);

    }
}

