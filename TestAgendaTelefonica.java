
/**
 * Write a description of class TestAgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestAgendaTelefonica
{
    // instance variables - replace the example below with your own
    private int numeroTestsFallados ;

    /**
     * Constructor for objects of class TestAgendaTelefonica
     */
    public TestAgendaTelefonica()
    {
        numeroTestsFallados = 0;

        AgendaTelefonica agendatlf = new AgendaTelefonica();        
        numeroTestsFallados += testea(null, agendatlf.lookupNumber("pepe"),"lookupNumber(String name)");
        agendatlf.enterNumber("pepa", "666");
        numeroTestsFallados += testea("666", agendatlf.lookupNumber("pepa"),"String lookupNumber(String name)");
        numeroTestsFallados += testea(null, agendatlf.lookupNumber("pepo"),"String lookupNumber(String name)si no hay");

     
        if (numeroTestsFallados == 0) {
            System.out.println("Todos los test se han pasado correctamente!!");
        }
        else {
            System.out.println("Han fallado " + numeroTestsFallados + " tests!!!");
        }
    }

    public int testea(Object valorEsperado, Object valorObtenido, 
    String nombreFuncion)
    {
        int valorDevuelto = 0;
        if (valorEsperado == valorObtenido) {
            System.out.println("OK: " + nombreFuncion);
        }
        else {
            System.out.println("ERROR!!!!! " + nombreFuncion);
            System.out.println("Valor obtenido: " + valorObtenido + 
                " / Valor esperado: " + valorEsperado);
            valorDevuelto = 1;
        }
        return valorDevuelto;
    }

}