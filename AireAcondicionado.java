public class AireAcondicionado {
    
    // La temperatura del aireacondicionado
    private double temperatura;

    /** 
     * Crea un aireacondicionado
     */
    public AireAcondicionado() {
        temperatura = 15.0;
    }
    
    // Subir la temperatura
    public void subirTemperatura() {
        temperatura = temperatura + 5.0;
    }
    
    // Bajar la temperatura
    public void bajarTemperatura() {
        temperatura = temperatura - 5.0;
    }
    
    // Obtener la temperatura
    public double getTemperatura() {
        return temperatura;
    }
}
