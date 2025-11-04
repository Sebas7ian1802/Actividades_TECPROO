using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SEMANA_11_CASO1
{
    internal class Caso_3
    {
        static void Main(string[] args)
        {
            Console.Write("Digite numeros de notas aleatorias reales a generar:");
            int can = int.Parse(Console.ReadLine());
            double[] notas = new double[can];
            Random rand = new Random();
            for (int i = 0; i < can; i++)
            {
                notas[i] = rand.NextDouble();
                notas[i] = Math.Round(rand.NextDouble() * (20 - 0) + 0, 2);
            }
            Console.WriteLine("Notas reales generadas");
            for (int i = 0; i < can; i++)
            {
                Console.WriteLine(notas[i]);
            }
            Console.ReadKey();
        }
    }
}
