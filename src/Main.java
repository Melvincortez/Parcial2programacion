public class Main {
    //  Paso 6: Crear instancias de Juego y ejecutar en diferentes sistemas operativos

            public static void main(String[] args) {
                // Ejecutar en Windows
                AbstractFactory fabricaWindows = (AbstractFactory) new WindowsFactory();
                Juego juegoWindows = new Juego(fabricaWindows);
                juegoWindows.iniciarJuego();

                // Ejecutar en macOS
                AbstractFactory fabricaMac = (AbstractFactory) new MacFactory();
                Juego juegoMac = new Juego(fabricaMac);
                juegoMac.iniciarJuego();

                // Ejecutar en Linux
                AbstractFactory fabricaLinux = (AbstractFactory) new LinuxFactory();
                Juego juegoLinux = new Juego(fabricaLinux);
                juegoLinux.iniciarJuego();
            }
        }





