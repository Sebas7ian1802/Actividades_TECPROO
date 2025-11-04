using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SEMANA_11_CASO1
{
    internal class Caso_4
    {
        static void Main(string[] args)
        {
            Console.Write("Digite cantidad de sueldos enteros de 4 digitos a generar: ");
            int can = int.Parse(Console.ReadLine());
            int[] sueldos = new int[can];
            Random rand = new Random();
            for (int i = 0; i < can; i++)
            {
                sueldos[i] = rand.Next(1000, 10000);
            }
            Console.WriteLine("Lista de sueldos generados");
            for (int i = 0; i < can; i++)
            {
                Console.WriteLine(sueldos[i]);
            }
            //int sueldoMinimo = sueldos.Min();
            int minSueldo = sueldos[0];
            for (int i = 1; i < can; i++)
            {
                if (sueldos[i] < minSueldo)
                {
                    minSueldo = sueldos[i];
                }
            }
            Console.WriteLine("El sueldo minimo es: " + minSueldo);
            Console.ReadKey();
        }
    }
}