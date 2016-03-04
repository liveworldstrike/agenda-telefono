import java.util.HashMap;
/**
 * Write a description of class AgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AgendaTelefonica
{
    //
    private HashMap<String,String> agendatlf;

    /**
     * Constructor for objects of class AgendaTelefonica
     */
    public AgendaTelefonica()
    {
        agendatlf = new HashMap<>();
    }

    /**
     * Permite almacenar un nuevo número en la agenda indicando el nombre del contacto
     * y su numero de telefono asociado
     */
    public void enterNumber(String name, String number)
    {
        agendatlf.put(name , number);  
    }

    /**
     * Devuelve el numero de teléfono del contacto indicado. Si el contacto no existe, 
     * devuelve null.
     */
    public String lookupNumber(String name)
    {
        //si lo encuentra lo devuelve sino de manera de error devuelve null automaticamente
        return agendatlf.get(name);
    }

    /**
     * Print all keys
     */
    public void printAllNames()
    {
       System.out.println(agendatlf.keySet());
    }
}
