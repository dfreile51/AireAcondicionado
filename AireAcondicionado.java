public class AireAcondicionado {
    
    // La temperatura del aireacondicionado
    private double temperatura;
    // Maximo de temperatura
    private double max;
    // Minimo de temperatura
    private double min;
    // Incremento de temperatura
    private double incremento;

    /** 
     * Crea un aireacondicionado
     */
    public AireAcondicionado(double maximaTemperatura, double minimaTemperatura) {
        temperatura = 15.0;
        max = maximaTemperatura;
        min = minimaTemperatura;
        incremento = 5.0;
    }
    
    // Subir la temperatura
    public void subirTemperatura() {
        if ((temperatura + incremento) <= max) {
            temperatura = temperatura + incremento;
        }
        else {
            System.out.println("No se puede subir más la temperatura, se ha llegado al máximo");
        }
    }
    
    // Bajar la temperatura
    public void bajarTemperatura() {
        if ((temperatura - incremento) >= min) {
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
}
