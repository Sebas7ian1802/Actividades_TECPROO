using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BIBLIOTECA_SEMANA9_TEORIA
{
    public static class Cuatro_operaciones
    {
        public static double Sumar(double n1, double n2)
        {
            return n1 + n2;
        }

        public static double Restar(double n1, double n2)
        {
            return n1 - n2;
        }

        public static double Multiplicar(double n1, double n2)
        {
            return n1 * n2;
        }

        public static double Dividir(double n1, double n2)
        {
            if (n2 != 0)
            {
                return n1 / n2;
            }
            else
            {
                // Retorna Not a Number (NaN) para indicar una división por cero.
                return double.NaN;
            }
        }
    }
}
