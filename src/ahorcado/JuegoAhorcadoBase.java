
package ahorcado;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
// 2. Clase Abstracta JuegoAhorcadoBase
abstract class JuegoAhorcadoBase implements JuegoAhorcado {
    protected String palabraSecreta;
    protected String palabraActual;
    protected int intentos;

    abstract void actualizarPalabraActual(char letra);
    abstract boolean verificarLetra(char letra);
    abstract boolean hasGanado();

    // Resto de implementación de la interfaz
}
