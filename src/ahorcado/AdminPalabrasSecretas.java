
package ahorcado;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// 5. Clase AdminPalabrasSecretas
public class AdminPalabrasSecretas {
    public List<String> palabras;
    private boolean modoFijo = false, modoAzar = false;
    private String palabraFija;
    
    public AdminPalabrasSecretas() {
        this.palabras = new ArrayList<>();
        palabras.add("HOLA");
        palabras.add("MUNDO");
        palabras.add("PROGRAMACION");
    }

    public boolean agregarPalabra(String palabra) {
        if (palabras.contains(palabra.toUpperCase())) {
            return false;
        } else {
            palabras.add(palabra.toUpperCase());
            return true;
        }
    }

    public String seleccionarPalabraAzar() {
        Random random = new Random();
        return palabras.get(random.nextInt(palabras.size())).toUpperCase();
    }
    
    public String imprimirLista() {
        return imprimirLista(new StringBuilder(), 0);
    }
    
    private String imprimirLista(StringBuilder palabrasInfo, int index) {
        if (index < palabras.size()) {
            palabrasInfo.append(index + 1 + ".- " + palabras.get(index)).append("\n");
            return imprimirLista(palabrasInfo, index + 1);
        }
        return palabrasInfo.toString();
    }

    public List<String> getPalabras() {
        return palabras;
    }

    public boolean isModoFijo() {
        return modoFijo;
    }

    public void setModoFijo(boolean modoFijo) {
        this.modoFijo = modoFijo;
    }

    public boolean isModoAzar() {
        return modoAzar;
    }

    public void setModoAzar(boolean modoAzar) {
        this.modoAzar = modoAzar;
    }

    public void setPalabraFija(String palabraFija) {
        this.palabraFija = palabraFija;
    }

    public String getPalabraFija() {
        return palabraFija;
    }
}
