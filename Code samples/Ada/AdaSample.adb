-- The following prints "Hello, world" to the console 10 times.

with Ada.Text_IO; use Ada.Text_IO;

procedure AdaSample is
begin
   for i in 1 .. 10 loop
      Put_Line("Hello, world");
   end loop;
end AdaSample;