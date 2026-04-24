package semana_4_ejer_1;

import java.util.ArrayList;

// 1.Carrera
class Carrera {
    private int idCarrera;
    private String nombre;
    
    // Relacion -una carrera tiene "varios" cursos
    private ArrayList<Curso> cursos;
}

// 2.El curso
class Curso {
    private int idCurso;
    private String nombre;
    private String descripcion;
    private int horasPorSemana;
    
   
    private ArrayList<Seccion> secciones;
}

// 3.Profesor
class Profesor {
    private int idProfesor;
    private String nombre;
    private String telefono;
    private double sueldo;
    
   
    private ArrayList<Seccion> secciones;
}

// 4.La Sección
class Seccion {
    private int idSeccion;
    private String aula;
    
   
    private Curso curso;
    private Profesor profesor;
}

// 5.El Alumno
class Alumno {
    private int idAlumno;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
}

// CLASE INTERMEDIA (muchos a muchos)


// 6.La Matricula 
class Matricula {
    private Alumno alumno;
    private Seccion seccion;
   
    private double nota; 
}