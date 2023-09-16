// Implementa la interfaz AbstractFactory para macOS
public class MacFactory implements AbstractFactory {
    @Override
    public Boton crearBoton() {
        return new BotonMac();
    }

    @Override
    public Ventana crearVentana() {
        return new VentanaMac();
    }

    @Override
    public CuadroTexto crearCuadroTexto() {
        return new CuadroTextoMac();
    }
}
