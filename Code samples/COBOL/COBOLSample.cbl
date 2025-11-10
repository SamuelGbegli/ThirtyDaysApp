           *> The following creates a variable, assigns a value to the
           *> variable and prints the value.

           IDENTIFICATION DIVISION.
           PROGRAM-ID. COBOL-SAMPLE.
           DATA DIVISION.
               WORKING-STORAGE SECTION.
                   77 X PIC 99.
           PROCEDURE DIVISION.
               SET X TO 30.
               DISPLAY "The value of X is "X.
           STOP RUN.
           