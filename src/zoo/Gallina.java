package zoo;

/**
 * Clase Gallina del Zoológico
 * @author jose
 */
public class Gallina extends Ave {
 
    private String cacareo = "GRRRRR";
    
    /**
     * Constructor sin parámetros
     */
    public Gallina () {}
    
    /**
     * Constructor con 4 parámetros
     * @param habitat           Ecosistema donde vive el animal
     * @param comida            Alimento que consume
     * @param longevidad        Cuanto vive expresado en años
     * @param periodoIncubacion Días de incubación
     */
    public Gallina (Habitat habitat, String comida, int longevidad, int periodoIncubacion) {
        super(habitat, comida, longevidad, periodoIncubacion);
    }
    
    /**
     * Método para establecer el mensaje de cacareo
     * @param cacareo string de mensaje de cacareo
     * 
     */
    public void setCacareo (String cacareo) { this.cacareo = cacareo; }
    
    /**
     * Método para obtener el mensaje de cacareo
     * @return string con el mensaje de cacareo
     */
    public String getCacareo () { return cacareo; }
    
    /** Método para que la gallina emita un sonido
     * 
     */
    public void rugir () { System.out.println(cacareo); }
    
    /**
     * Método para que la gallina coma
     */
    public void comer () { System.out.println("Estoy comiendo " + comida); }
    
    /**
     * Método para que la gallina se desplace
     */
    public void desplazar () { System.out.println("Estoy volando con mucha dificultad"); }
}
