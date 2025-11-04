using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace S12_FUNAL_TEORIA_ARREGLO_UNIDIMENSIONAL
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ejemplo con arreglos unidimensionales");
            Console.Write("Digite cantidad de edades: ");
            int can = int.Parse(Console.ReadLine());
            int[] edades = new int[can];
            for (int i = 0; i < can; i++)
            {
                Console.Write("Digite edad en la posición " + i + ": ");
                edades[i] = int.Parse(Console.ReadLine());
            }

            Console.WriteLine("Las edades ingresadas son: ");
            for (int i = 0; i < can; i++)
            {
                Console.WriteLine(edades[i]);
            }
            Console.WriteLine("Edades en forma ascendente");
            Console.WriteLine("por método burbuja");
            for (int i = 0; i < can; i++)
            {
                int aux;
                for (int j = i + 1; j < can; j++)
                {
                    if (edades[i] > edades[j])
                    {
                        aux = edades[i];
                        edades[i] = edades[j];
                        edades[j] = aux;
                    }
                }
            }
            for (int i = 0; i < can; i++)
            {
                Console.WriteLine(edades[i]);
            }

            Console.WriteLine("Edades en forma descendente");
            Console.WriteLine("por método burbuja");
            for (int i = can - 1; i >= 0; i--)
            {
                Console.WriteLine(edades[i]);
            }
            int[] edades1 = new int[can + 1];
            for (int i = 0; i < can; i++)
            {
                edades1[i] = edades[i];
            }
            Console.WriteLine("Lista de edades1");
            for (int i = can - 1; i >= 0; i--)
            {
                Console.WriteLine(edades1[i]);
            }
            Console.Write("Digite la posicion donde se va ingresar la nueva edad: ");
            int posi = int.Parse(Console.ReadLine());//2
            Console.Write("Digite edad a insertar: ");
            int edad = int.Parse(Console.ReadLine());//50
            for (int i = can; i > posi; i--)
            {
                edades1[i] = edades1[i - 1];
            }
            edades1[posi] = edad;
            Console.WriteLine("Lista con la nueva edad");
            for (int i =can ; i>=0; i--)
            {
                Console.WriteLine(edades1[i]);
            }
            Console.ReadKey();
        }
    }
}
