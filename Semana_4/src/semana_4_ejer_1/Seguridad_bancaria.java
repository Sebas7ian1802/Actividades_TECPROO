package semana_4_ejer_1;

import java.util.Date;
import java.util.ArrayList;

// 1.El banco 
class Banco {
    private String codigo;
    private String domicilioCentral;
    private ArrayList<Sucursal> sucursales;
}

// 2.La sucursal
class Sucursal {
    private String codigo;
    private String domicilio;
    private int numEmpleados;
}

// 3.El vigilante
class Vigilante {
    private String codigo;
    private int edad;
}

// 4.El delincuente
class Delincuente {
    private String codigo;
    private String nombre;
}

// 5.La banda
class Banda {
    private int numeroBanda;
    private int totalMiembros;
    private ArrayList<Delincuente> miembros;
}

// 6.El contrato 
class Contrato {
    private Vigilante vigilante;
    private Sucursal sucursal;
    private Date fechaContratacion;
    private boolean conArma; 
}

// 7.El atraco 
class Atraco {
    private Delincuente delincuente;
    private Sucursal sucursal;
    private Date fechaAtraco;
}