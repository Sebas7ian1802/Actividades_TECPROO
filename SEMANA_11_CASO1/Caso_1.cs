using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FUNAL_SEMANA11_TEORIA_CASO1
{
    internal class Caso_1
    {
        static void Main(string[] args)
        {
            int sumaEdades = 0;
            int canP = 0;
            int canI = 0;
            Console.Write("Digite cantidades de edades a ingresar: ");
            int can = int.Parse(Console.ReadLine());
            int[] edades = new int[can]; //vector para almacenar n edades
            for (int i = 0; i < can; i++)
            {
               edades[i] = int.Parse(Console.ReadLine());
                sumaEdades += edades[i];
                if (edades[i] % 2 == 0) canP++;
                else canI++;
            }
            // Visualizar las edades ingresadas 
            Console.WriteLine("Las edades ingresadas son: ");
            for (int i = 0; i < can; i++)
            {
                Console.WriteLine($"La edad en la posicion {i} es: {edades[i]}");
            }
            Console.WriteLine($"La suma de edades es: {sumaEdades}");
            Console.WriteLine("El promedio de edades es:" + sumaEdades*1.0/can);
            Console.WriteLine("Hay " + canP + " edades pares");
            Console.WriteLine("Hay " + canI + " edades impares");
            Console.ReadKey();
        }
    }
}
