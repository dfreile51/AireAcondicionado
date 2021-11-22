public class AireAcondicionado {
    
    // La temperatura del aireacondicionado
    private double temperatura;
    // Maximo de temperatura
    private double max;
    // Minimo de temperatura
    private double min;
    // Maxima temperatura seleccionada
    private double maxSeleccionada;
    // Minima temperatura seleccionada
    private double minSeleccionada;
    // Incremento de temperatura
    private double incremento;
    // Cambios de temperatura
    private int cambiosTemperatura;

    /** 
     * Crea un aireacondicionado
     */
    public AireAcondicionado(double maximaTemperatura, double minimaTemperatura) {
        temperatura = 15.0;
        maxSeleccionada = temperatura;
        minSeleccionada = temperatura;
        max = maximaTemperatura;
        min = minimaTemperatura;
        incremento = 5.0;
        cambiosTemperatura = 0;
    }
    
    // Subir la temperatura
    public void subirTemperatura() {
        if ((temperatura + incremento) <= max) {
            temperatura = temperatura + incremento;
            cambiosTemperatura = cambiosTemperatura + 1;
            if (temperatura < maxSeleccionada) {
                maxSeleccionada = temperatura;
            }
        }
        else {
            System.out.println("No se puede subir más la temperatura, se ha llegado al máximo");
        }
    }
    
    // Bajar la temperatura
    public void bajarTemperatura() {
        if ((temperatura - incremento) >= min) {
            temperatura = temperatura - incremento;
            cambiosTemperatura = cambiosTemperatura + 1;
            if (temperatura < minSeleccionada) {
                minSeleccionada = temperatura;
            }
        }
        else {
            System.out.println("No se puede bajar más la temperatura, se ha llegado al mínimo");
        }
    }
    
    // Obtener la temperatura
    public double getTemperatura() {
        return temperatura;
    }
    
    // Añadir Incremento
    public void setIncremento(double nuevoIncremento) {
        if (nuevoIncremento > 0) {
            incremento = nuevoIncremento;
        }
        else {
            System.out.println("No se pueden incrementos negativos");
        }
    }
    
    // Muestra por pantalla las estadisticas
    public void mostrarEstadisticas() {
        String detalles = getEstadisticas();
        System.out.println(detalles);
    }
    
    // Devuelve las estadísticas
    public String getEstadisticas() {
        String estadisticas = ("Temperatura actual: " + temperatura + "- Temp. máxima posible: " + max + "- Temp. mínima posible: " + min + " - Temp. máxima seleccionada: " + maxSeleccionada + " - Temp. mínima seleccionada: " + minSeleccionada + " - Temperatura cambiada " + cambiosTemperatura + " veces");
        return estadisticas;
    }
}
