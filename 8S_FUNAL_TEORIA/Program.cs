using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FUNAL_SEMANA8_TEORIA
{
    internal class Program
    {
        static void Main()
        {
            Ejer1();

            Console.ReadKey(); //detenimiento de consola
        }
        static void Ejer1()
        {
            int op;

            do
            {
                Console.WriteLine("Casuística de cuatro operaciones");
                Console.WriteLine("1.Suma");
                Console.WriteLine("2.Resta");
                Console.WriteLine("3.Multiplicación");
                Console.WriteLine("4.Division");
                Console.WriteLine("5.Salir");
                Console.Write("Digite # de opción: ");
                op = int.Parse(Console.ReadLine());
                double num1 = 0.0, num2 = 0;
                if (op >= 1 && op <= 4)
                {
                    Console.Write("Digite primer número: ");
                    num1 = double.Parse(Console.ReadLine());
                    Console.Write("Digite segundo número: ");
                    num2 = double.Parse(Console.ReadLine());
                }
                switch (op)
                {
                    case 1: Suma(num1, num2); break;
                    case 2: Resta(num1, num2); break;
                    case 3: Multiplicación(num1, num2); break;
                    case 4: Division(num1, num2); break;
                    case 5: Console.WriteLine("Gracias por utilizar en sw"); break;
                    default: Console.WriteLine("Digite # opción correcta"); break;
                }
            } while (op != 5);
            Console.ReadKey();

        }

            static void Suma(double n1, double n2)
            {
                Console.WriteLine("La suma es: " + (n1 + n2));
            }
            static void Resta(double n1, double n2)
            {
                Console.WriteLine("La resta es: " + (n1 - n2));
            }
            static void Multiplicación(double n1, double n2)
            {
                Console.WriteLine("La multiplicación es: " + (n1 * n2));
            }
            static void Division(double n1, double n2)
            {
                if (n2 != 0)
                {
                    Console.WriteLine("La division es: " + (n1 / n2));
                }
                else
                {
                    Console.WriteLine("Digite denominador diferente de '0' ");
                }
            }

            static double Suma2(double n1, double n2)
            {
                return (n1 + n2);
            }

            static double Resta2(double n1, double n2)
            {
                return (n1 - n2);
            }

            static double Multiplicación2(double n1, double n2)
            {
                return (n1 * n2);
            }

            static double Division2(double n1, double n2)
            {

                if (n2 != 0)
                {
                    return n1 / n2;
                }
                else
                {
                    return double.NaN;
                }
            }

        
    }
}

