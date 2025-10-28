using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SEMANA_11_CASO1
{
    internal class Caso_2
    {
        static void Main(string[] args)
        {
            int canMin = 0;
            int canMax = 0;
            Console.Write("Digite el número de notas aleatorias enteros a generar:");
            int can = int.Parse(Console.ReadLine());
            int[] notas = new int[can];
            Random rand = new Random();
            for (int i = 0; i < can; i++)
            {
                //notas[i] = rand.Next(min,max+1);
                notas[i] = rand.Next(0, 21); // enteros 
                if (notas[i] == 0) canMin++;
                if (notas[i] == 20) canMax++;
            }
            Console.WriteLine("Lista de notas creadas de forma aleatoria:");
            for (int i = 0; i < can; i++)
            {
                if (notas[i] == 0) Console.WriteLine(notas[i]+"Nota maxima");
                else if (notas[i] == 20) Console.WriteLine(notas[i]+"Nota minima");
                else Console.WriteLine(notas[i]);
            }
            Console.WriteLine("Hay " + canMin + " con valor 0");
            Console.WriteLine("Hay " + canMax + " con valor 20");
            Console.ReadKey();
        }
    }
}         