using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using BIBLIOTECA_SEMANA9_TEORIA;//importando un librería - biblioteca

namespace CASO_LIBRERIA
{
    internal class Program
    {
        static void Main()
        {
            int op;
            do
            {
                Console.WriteLine("\nCasuística con librería");
                Console.WriteLine("Casuística básica");
                Console.WriteLine("1. Suma");
                Console.WriteLine("2. Resta");
                Console.WriteLine("3. Multiplicación");
                Console.WriteLine("4. Division");
                Console.WriteLine("5. Salir");
                Console.Write("Digite # de opción: ");
                op = int.Parse(Console.ReadLine());
                switch (op)
                {
                    case 1:
                        {
                            Ingreso_datos();
                            Console.WriteLine("\nLa suma es: " + Cuatro_operaciones.Sumar(Globales.a, Globales.b));
                            break;
                        }

                    case 2:
                        {
                            Ingreso_datos();
                            Console.WriteLine("\nLa resta es: " + Cuatro_operaciones.Restar(Globales.a, Globales.b));
                            break;
                        }
                    case 3:
                        {
                            Ingreso_datos();
                            Console.WriteLine("\nLa multiplicación es: " + Cuatro_operaciones.Multiplicar(Globales.a, Globales.b));
                            break;
                        }
                    case 4:
                        {
                            Ingreso_datos();
                            if (Globales.b != 0)
                            {
                                Console.WriteLine("\nLa división es: " + Cuatro_operaciones.Dividir(Globales.a, Globales.b));
                            }
                            else
                            {
                                Console.WriteLine("Error: No se puede dividir por cero.");
                            }
                            break;
                        }

                    case 5: Console.WriteLine("\nSaliste del sw"); break;
                    default: Console.WriteLine("\nDigite Opción correcta"); break;

                }

            } while (op != 5);
            Console.ReadKey();
        }

        public class Globales
        {
            public static int a, b;
        }
        static void Ingreso_datos()
        {
            Console.Write("Digite el primer numero: ");
            Globales.a = int.Parse(Console.ReadLine());
            Console.Write("Digite el segundo numero: ");
            Globales.b = int.Parse(Console.ReadLine());
        }
    }
}

