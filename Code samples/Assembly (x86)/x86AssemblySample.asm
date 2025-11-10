/*
    The following prints "Hello, world" to the console by moving data to
    the CPU's registers.

    This is for x86/IA-32 processors and the NASM compiler. The program is
    based on what is featured in this YouTube video: https://youtu.be/j--zbDv_2QQ
*/

section .text
    global _start

_start:
    mov edx, len    ;moves message length to register
    mov ecx, msg    ;moves message to register
    mov ebx, 1      ;file descriptor (stdout)
    mov eax, 4      ;system call (sys_write)
    int 0x80        ;calls kernel

    mov eax, 1      ;system call  (sys_exit)
    int 0x80        ;calls kernel

section .data
    msg db "Hello, world", 10 ;sets value to "Hello, world" and linebreak
    len equ $ -msg ;sets value to length of msg