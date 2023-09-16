//paso numero 4
public class Juego {
    private AbstractFactory fabrica;

    public Juego(AbstractFactory fabrica) {
        this.fabrica = fabrica;
    }

    public void iniciarJuego() {
        Boton boton = fabrica.crearBoton();
        Ventana ventana = fabrica.crearVentana();
        CuadroTexto cuadroTexto = fabrica.crearCuadroTexto();


        boton.renderizar();
        ventana.mostrar();
        cuadroTexto.dibujar();

    }


}
