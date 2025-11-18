using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace S14_FUNAL_TEORIA_CASOS_CARACTERES
{
    internal class Clase2
    {
        static void Main()
        {
            Ejer1(); 
            Console.ReadKey();
        }

        static void Ejer1()
        {   
            Console.Write("Digite su nombre: ");
            string nom = Console.ReadLine();
            Console.WriteLine("Su nombre en vertical es: \n");

            foreach (var c in nom)
            {
                Console.WriteLine(c);
            }


            Console.Write("\n**********************************************************************\n");

            
            Console.WriteLine("Su nombre en vertical invertido es: \n");

            string nom_inver = "";
            for (int i = nom.Length - 1; i >= 0; i--)
            {
                Console.WriteLine(nom[i]);
                nom_inver += nom[i];
            }
            Console.WriteLine("Su nombre invertido es:" + nom_inver);


            Console.Write("\n**********************************************************************\n");

            int canVocales = 0;
            foreach (char c in nom.ToLower())
            {
                if ("aeiou".Contains(c))
                {
                    canVocales++;
                }
            }

            Console.WriteLine("Su nombre tiene " + canVocales + " vocales");











            Console.ReadKey();
        }
    }
}
