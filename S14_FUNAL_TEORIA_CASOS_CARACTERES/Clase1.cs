using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace S14_FUNAL_TEORIA_CASOS_CARACTERES
{
    internal class Clase1
    {

        static void Main()
        {
            Ejer2();
            Console.ReadKey(); //detenimiento de consola
        }

        static void Ejer1()
        {
            Console.Write("Digite su nombre y apellido: ");
            string nom = Console.ReadLine();
            Console.WriteLine("Su nombre tiene " + nom.Length + " caracteres");
            Console.WriteLine("Los dos primeros caracteres de su nombre es: " + nom.Substring(0, 2));
            Console.WriteLine("Los dos ultimos caracteres de su nombre son: " + nom.Substring(nom.Length - 2, 2));
            Console.WriteLine("El nombre en mayuscula es: " + nom.ToUpper());
            Console.WriteLine("El nombre en minuscula es: " + nom.ToLower());
            Console.WriteLine("Digite su primer nombre y despues su apellido: ");

            Console.ReadKey();
        }
        static void Ejer2()
        {
            Console.WriteLine("Digite sus datos: ");
            string[] datos = Console.ReadLine().Split(' ');
            if (datos.Length == 1)
                Console.WriteLine("Su nombre es: " + datos[0]);
            else if (datos.Length == 2)
            {
                Console.WriteLine("Su nombre es: " + datos[0]);
                Console.WriteLine("Su apellido paterno es: " + datos[1]);
            }
            else
            {
                Console.WriteLine("Su nombre es: " + datos[0]);
                Console.WriteLine("Su apellido paterno es: " + datos[1]);
                Console.WriteLine("Su apellido materno es: " + datos[2]);
            }
              
        




















        }
    }
}
