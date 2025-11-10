/*
    The following asks the user to type and enter an input to the console,
    which is then printed back to the console.
*/

using System;

public class CSharpSample
{
    public static void Main(string[] args)
    {
        Console.WriteLine("Type text to the console, then press enter: ");
        var x = Console.ReadLine();
        Console.WriteLine ($"You entered {x}");
    }
}