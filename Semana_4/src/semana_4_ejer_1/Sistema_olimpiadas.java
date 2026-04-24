package semana_4_ejer_1;

import java.util.Date;
import java.util.ArrayList;

// 1. La sede principal
class Sede {
    private int idSede;
    private int numeroComplejos;
    private double presupuesto;
    private ArrayList<Complejo> complejos;
}

// 2. El complejo polideportivo
class Complejo {
    private int idComplejo;
    private String localizacion;
    private String jefeOrganizacion;
    private double areaTotal;
    private ArrayList<Area> areas;
    private ArrayList<Evento> eventos;
}

// 3. El area
class Area {
    private int idArea;
    private String descripcion;
    private String localizacion;
}

// 4. El evento
class Evento {
    private int idEvento;
    private Date fecha;
    private int duracion;
    private int numParticipantes;
    private int numComisarios;
}

// 5.El comisario
class Comisario {
    private int idComisario;
    private String nombre;
}

// 6.La clase intermedia
class RolComisario {
    private Comisario comisario;
    private Evento evento;
    private String rol;
}