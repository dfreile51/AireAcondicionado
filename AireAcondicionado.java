public class AireAcondicionado {
    
    // La temperatura del aireacondicionado
    private double temperatura;
    // Maximo de temperatura
    private double max;
    // Minimo de temperatura
    private double min;
    // Maxima temperatura seleccionada
    private double maxseleccionada;
    // Minima temperatura seleccionada
    private double minseleccionada;
    // Incremento de temperatura
    private double incremento;
    // Cambios de temperatura
    private int cambiosTemperatura;

    /** 
     * Crea un aireacondicionado
     */
    public AireAcondicionado(double maximaTemperatura, double minimaTemperatura) {
        temperatura = 15.0;
        maxseleccionada = maximaTemperatura;
        minseleccionada = minimaTemperatura;
        max = 20.0;
        min = 0.0;
        incremento = 5.0;
    }
    
    // Subir la temperatura
    public void subirTemperatura() {
        if ((temperatura + incremento) <= maxseleccionada) {
            temperatura = temperatura + incremento;
        }
        else {
            System.out.println("No se puede subir más la temperatura, se ha llegado al máximo");
        }
    }
    
    // Bajar la temperatura
    public void bajarTemperatura() {
        if ((temperatura - incremento) >= minseleccionada) {
            temperatura = temperatura - incremento;
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
    public void setIncremento(double aumentarIncremento) {
        if (aumentarIncremento > 0) {
            incremento = incremento + aumentarIncremento;
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
        String estadisticas = ("Temperatura actual: " + temperatura + "- Temp. máxima posible: " + max + "- Temp. mínima posible: " + min + " - Temp. máxima seleccionada: " + maxseleccionada + " - Temp. mínima seleccionada: " + minseleccionada + " - Temperatura cambiada " + cambiosTemperatura + " veces");
        return estadisticas;
    }
}
