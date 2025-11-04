using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FUNAL_SEMANA7_TEORIA
{
    internal class Program
    {
        static void Main()
        {
            Ejer6();
            Console.ReadKey(); //detenimiento de consola
        }

        static void Ejer1()
        {
            //for

            Console.WriteLine("Ejer1: Caso con for");
            for (int i = 1; i <= 10; i++)
                Console.Write(i + "  ");

            Console.ReadKey();
        }
        static void Ejer2()
        {
            // for descendente

            Console.WriteLine("Ejer2: Caso con for descendente");
            for (int i = 10; i >= 1; i--)
                Console.Write(i + "  ");

            Console.ReadKey();
        }
        static void Ejer3()
        {
            //while (j<=10)

            Console.WriteLine("Ejer3: Caso con while");
            int j = 1;
            while (j <= 10)
            {
                while (j <= 10)
                {
                    Console.Write(j + "  ");
                    j++;
                }
            }

            Console.ReadKey();

        }
        static void Ejer4()
        {
            // while descendente

            Console.WriteLine("Ejer4: Caso con while descendente");
            int j = 10;
            while (j >= 1)
            {
                Console.Write(j + "  ");
                j--;
            }

            Console.ReadKey();
        }
        static void Ejer5()
        {
            // do while

            Console.WriteLine("Ejer5: Caso con do while");
            int k = 1;
            do
            {
                Console.Write(k + "  ");
                k++;
            } while (k <= 10);

            Console.ReadKey();
        }
        static void Ejer6()
        {
            // do while descendente

            Console.WriteLine("Ejer6: Caso con do while descendente");
            int k = 10;
            do
            {
                Console.Write(k + "  ");
                k--;
            } while (k >= 1);

            Console.ReadKey();

        }
        static void Ejer7()
        {
            Console.Write("Cantidad de estudiantes: ");
            int n = int.Parse(Console.ReadLine());

            int suma = 0;
            for (int i = 1; i <= n; i++)
            {
                Console.Write($"Edad del estudiante {i}: ");
                suma += int.Parse(Console.ReadLine());
            }

            double promedio = suma * 1.0 / n;
            Console.WriteLine($"Promedio de edades: {promedio:F2}");
            Console.ReadKey();
        }
        static void Ejer8()
        {
            Console.Write("Cantidad de estudiantes: ");
            int n = int.Parse(Console.ReadLine());

            int suma = 0;
            int mayores = 0;
            int menores = 0;
            for (int i = 1; i <= n; i++)
            {
                Console.Write($"Edad del estudiante {i}: ");
                int edad = int.Parse(Console.ReadLine());
                suma += edad;
                if (edad >= 18)
                    mayores++;
                else
                    menores++;
            }

            double promedio = suma * 1.0 / n;
            Console.WriteLine($"Promedio de edades: {promedio:F2}");
            Console.WriteLine($"Hay {mayores} estudiantes mayores de edad y {menores} menores de edad.");
            Console.ReadKey();
        }

    }
}
