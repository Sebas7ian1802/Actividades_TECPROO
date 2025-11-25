using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.InteropServices;
using System.Text;
using System.Threading.Tasks;

namespace S15_FUNAL_TEORIA_ARREGLOS_BIDIMENSIONALES
{
    internal class Program
    {
        internal class Clase1
        {

            static void Main()
            {
                Ejer5();
                Console.ReadKey(); 
            }
            //*****************************************************************************************************************
            //*IDENTIFICATION DIVISION
            //*PROGRAM-ID: SUMA DE MATRICES EJERCICIO 1 
            //*AUTHOR: LENIN 
            //*****************************************************************************************************************
            static void Ejer1()
            {
                Console.WriteLine("Matriz 1");
                Console.Write("Digite # de filas: ");
                int fil1 = int.Parse(Console.ReadLine());
                Console.Write("Digite # de columnas: ");
                int col1 = int.Parse(Console.ReadLine());

                int[,] edades = new int[fil1, col1];
                for (int f = 0; f < fil1; f++)
                {
                    for (int c = 0; c < col1; c++)
                    {
                        Console.Write("Digital el elemento en la pos: ["+f+" "+c+"]:");
                        edades[f, c] = int.Parse(Console.ReadLine());
                    }
                }

                Console.WriteLine("Matriz de edades: ");
                for (int f = 0; f < fil1; f++)
                {
                    for (int c = 0; c < col1; c++)
                    {
                        Console.Write(edades[f, c] + "   ");
                    }
                    Console.WriteLine();
                }

                Console.WriteLine("Matriz 2");
                Console.Write("Digite # de filas: ");
                int fil2 = int.Parse(Console.ReadLine());
                Console.Write("Digite # de columnas: ");
                int col2 = int.Parse(Console.ReadLine());

                int[,] edades2 = new int[fil2, col2];
                for (int f = 0; f < fil2; f++)
                {
                    for (int c = 0; c < col2; c++)
                    {
                        Console.Write("Digital el elemento en la pos: ["+f+" "+c+"]:");
                        edades2[f, c] = int.Parse(Console.ReadLine());
                    }
                }

                // Sumar las dos matrices
                Console.WriteLine("Suma de matrices: ");
                for (int f = 0; f < fil1; f++)
                {
                    for (int c = 0; c < col1; c++)
                    {
                        Console.Write(edades[f, c] + edades2[f, c] + "  ");
                    }
                    Console.WriteLine();
                }

                Console.ReadKey();
            }

            //*****************************************************************************************************************
            //*IDENTIFICATION DIVISION
            //*PROGRAM-ID: IDENTIDAD EJERCICIO 2 
            //*AUTHOR: SMOVARGAS 
            //*****************************************************************************************************************
            static void Ejer2()
            {
                Console.Write("Digite el orden de la matriz identidad: ");
                int n = int.Parse(Console.ReadLine());

                int[,] identidad = new int[n, n];

                for (int f = 0; f < n; f++)
                {
                    for (int c = 0; c < n; c++)
                    {
                        if (f == c)
                            identidad[f, c] = 1;
                        else
                            identidad[f, c] = 0;
                    }
                }

                Console.WriteLine("Matriz identidad: ");
                for (int f = 0; f < n; f++)
                {
                    for (int c = 0; c < n; c++)
                    {
                        Console.Write(identidad[f, c] + " ");
                    }
                    Console.WriteLine();
                }

                Console.ReadKey();
            }
            //*****************************************************************************************************************
            //*IDENTIFICATION DIVISION
            //*PROGRAM-ID: IDENTIDAD EJERCICIO 2 
            //*AUTHOR: LENIN
            //*****************************************************************************************************************
            static void Ejer3()
            {
                Console.Write("Digite el orden de la matriz identidad: ");
                int n = int.Parse(Console.ReadLine());

                int[,] matriz = new int[n, n];
                for (int f = 0; f < n; f++)
                {
                    for (int c = 0; c < n; c++)
                    {
                        if (f == c)
                        {
                            matriz[f, c] = 1;
                        }    
                        Console.Write(matriz[f,c]+ "  ");
                    }
                    Console.WriteLine();
                }
            Console.ReadKey();
            }
            //*****************************************************************************************************************
            //*IDENTIFICATION DIVISION
            //*PROGRAM-ID: ALEATORIOS EJERCICIO 4 
            //*AUTHOR: LENIN
            //*****************************************************************************************************************
            static void Ejer4()
            {
                Console.Write("Digite el orden de la matriz cuadrada para numeros enteros aleatorios: ");
                int n = int.Parse(Console.ReadLine());
                Random rand = new Random();
                int[,] matriz = new int[n, n];
                for (int i = 0; i < n; i++)
                {
                    for (int j = 0; j < n; j++)
                    {
                        //matriz[i,j] = rand.Next(0, 21);
                        matriz[i,j]=rand.Next(10, 100);
                        Console.Write(matriz[i,j]+" ");
                    }
                    Console.WriteLine();
                }
                Console.ReadKey();

            }
            //*****************************************************************************************************************
            //*IDENTIFICATION DIVISION
            //*PROGRAM-ID: NOTAS ALEATORIOS 0-20 EJERCICIO 5 
            //*AUTHOR: LENIN
            //*****************************************************************************************************************
            static void Ejer5()
            {
                Console.Write("Digite el orden de la matriz cuadrada para numeros decimales aleatorios: ");
                int n2 = int.Parse(Console.ReadLine());
                Random rand = new Random();
                double[,] matriz = new double[n2, n2];
                for (int i = 0; i < n2; i++)
                {
                    for (int j = 0; j < n2; j++)
                    {
                        matriz[i, j] = Math.Round(rand.NextDouble()*20, 2);
                        Console.Write(matriz[i, j] + "  ");
                    }
                    Console.WriteLine();
                }
                Console.ReadKey();
            }
        } 
    }
}
