// Paso 1: Define la interfaz AbstractFactory
public interface AbstractFactory {
    Boton crearBoton();
    Ventana crearVentana();
    CuadroTexto crearCuadroTexto();

}