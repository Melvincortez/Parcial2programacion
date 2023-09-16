// Implementa la interfaz AbstractFactory para Linux
public class LinuxFactory implements AbstractFactory {
    @Override
    public Boton crearBoton() {
        return new BotonLinux();
    }

    @Override
    public Ventana crearVentana() {
        return new VentanaLinux();
    }

    @Override
    public CuadroTexto crearCuadroTexto() {
        return new CuadroTextoLinux();
    }
}