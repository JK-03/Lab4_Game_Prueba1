
package ahorcado;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
// 3. Clase JuegoAhorcadoFijo
class JuegoAhorcadoFijo extends JuegoAhorcadoBase {
    private boolean partidaGanada = false;
    private char letra;
    
    public JuegoAhorcadoFijo(String palabraSecreta) {
        this.palabraSecreta = palabraSecreta.toUpperCase();
        this.palabraActual = generarPalabraActual(this.palabraSecreta);
        this.intentos = 10;
    }

    @Override
    public void inicializarPalabraSecreta() {
        this.palabraActual = generarPalabraActual(this.palabraSecreta);
    }

    private String generarPalabraActual(String palabraSecreta) {
        StringBuilder palabraActualBuilder = new StringBuilder();
        for (char c : palabraSecreta.toCharArray()) {
            if (Character.isWhitespace(c)) {
                palabraActualBuilder.append("  ");
            } else {
                palabraActualBuilder.append("_ ");
            }
        }
        return palabraActualBuilder.toString();
    }
    
    @Override
    public void jugar() {
        if (!verificarLetra(letra)) {
            intentos--;
        }

        actualizarPalabraActual(letra);

        if (hasGanado()) {
            JOptionPane.showMessageDialog(null, "¡Felicidades! Has ganado. La palabra secreta era: " + palabraSecreta, "Ganador", JOptionPane.INFORMATION_MESSAGE);
            setPartidaGanada(true);
        } else if (intentos == 0) {
            JOptionPane.showMessageDialog(null, "Lo siento, has perdido. La palabra secreta era: " + palabraSecreta, "Perdedor", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @Override
    void actualizarPalabraActual(char letra) {
        StringBuilder nuevaPalabraActual = new StringBuilder(palabraActual);
        for (int i = 0; i < palabraSecreta.length(); i++) {
            char c = palabraSecreta.charAt(i);
            if (c == letra) {
                nuevaPalabraActual.setCharAt(i * 2, letra);
            }
        }
        palabraActual = nuevaPalabraActual.toString();
    }

    @Override
    boolean verificarLetra(char letra) {
        return palabraSecreta.contains(String.valueOf(letra));
    }

    @Override
    boolean hasGanado() {
        String palabraActualSinEspacios = palabraActual.replaceAll("\\s+", "");
        String palabraSecretaSinEspacios = palabraSecreta.replaceAll("\\s+", "");
        return palabraActualSinEspacios.equals(palabraSecretaSinEspacios);
    }

    public String getPalabraActual() {
        return palabraActual;
    }

    public int getIntentos() {
        return intentos;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public boolean isPartidaGanada() {
        return partidaGanada;
    }

    public void setPartidaGanada(boolean partidaGanada) {
        this.partidaGanada = partidaGanada;
    }

    public String getPalabraSecreta() {
        return palabraSecreta;
    }
}
