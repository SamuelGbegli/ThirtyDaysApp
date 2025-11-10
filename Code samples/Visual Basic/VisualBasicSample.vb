' The following assigns an integer with the value of 30, then enters a while loop
' that prints the value, subtracts one from the value until the value is 0.'

'NOTE: This is VB.NET, the version of Visual Basic released in 2002.

Module SampleModule
    Sub Main()
        Dim Value As Integer = 30
        While Value > 0
            Console.WriteLine("Value is " & Value)
            Value -= 1
        End While
    End Sub
End Module
