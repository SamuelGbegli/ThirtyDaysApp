package com.example.thirtydaysapp

//Stores information about a programming language
class LanguageContainer(
    //The name of the programming language
    val name: Int,
    //The programming language's logo
    val logo: Int?,
    //A summary of the language
    val description: Int,
    //An image with sample code of the programming language
    val codeSample: Int,
    //Text explaining what the sample code does
    val codeSampleText: Int,
    //A description of the sample code image
    val codeSampleDescription: Int,
) {

    companion object{
        val languages = listOf<LanguageContainer>(
            // C
            LanguageContainer(
                name = R.string.c_caption,
                logo = R.drawable.c_logo,
                description = R.string.c_description,
                codeSample = R.drawable.c_sample,
                codeSampleText = R.string.c_code_summary,
                codeSampleDescription = R.string.c_code_image_description
            ),
            // C++
            LanguageContainer(
                name = R.string.c_plus_plus_caption,
                logo = R.drawable.c_plus_plus_logo,
                description = R.string.c_plus_plus_description,
                codeSample = R.drawable.c_plus_plus_sample,
                codeSampleText = R.string.c_plus_plus_code_summary,
                codeSampleDescription = R.string.c_plus_plus_code_image_description
            ),
            // Java
            LanguageContainer(
                name = R.string.java_caption,
                logo = R.drawable.java_logo,
                description = R.string.java_description,
                codeSample = R.drawable.java_sample,
                codeSampleText = R.string.java_code_summary,
                codeSampleDescription = R.string.java_code_image_description
            ),
            // Kotlin
            LanguageContainer(
                name = R.string.kotlin_caption,
                logo = R.drawable.kotlin_logo,
                description = R.string.kotlin_description,
                codeSample = R.drawable.kotlin_sample,
                codeSampleText = R.string.kotlin_code_summary,
                codeSampleDescription = R.string.kotlin_code_image_description
            ),
            // Python
            LanguageContainer(
                name = R.string.python_caption,
                logo = R.drawable.python_logo,
                description = R.string.python_description,
                codeSample = R.drawable.python_sample,
                codeSampleText = R.string.python_code_summary,
                codeSampleDescription = R.string.python_code_image_description
            ),
            // JavaScript
            LanguageContainer(
                name = R.string.javascript_caption,
                logo = R.drawable.javascript_logo,
                description = R.string.javascript_description,
                codeSample = R.drawable.javascript_sample,
                codeSampleText = R.string.javascript_code_summary,
                codeSampleDescription = R.string.javascript_code_image_description
            ),
            // TypeScript
            LanguageContainer(
                name = R.string.typescript_caption,
                logo = R.drawable.typescript_logo,
                description = R.string.typescript_description,
                codeSample = R.drawable.typescript_sample,
                codeSampleText = R.string.typescript_code_summary,
                codeSampleDescription = R.string.typescript_code_image_description
            ),
            // Haskell
            LanguageContainer(
                name = R.string.haskell_caption,
                logo = R.drawable.haskell_logo,
                description = R.string.haskell_description,
                codeSample = R.drawable.haskell_sample,
                codeSampleText = R.string.haskell_code_summary,
                codeSampleDescription = R.string.haskell_code_image_description
            ),
            // C#
            LanguageContainer(
                name = R.string.c_sharp_caption,
                logo = R.drawable.c_sharp_logo,
                description = R.string.c_sharp_description,
                codeSample = R.drawable.c_sharp_sample,
                codeSampleText = R.string.c_sharp_code_summary,
                codeSampleDescription = R.string.c_sharp_code_image_description
            ),
            // Rust
            LanguageContainer(
                name = R.string.rust_caption,
                logo = R.drawable.rust_logo,
                description = R.string.rust_description,
                codeSample = R.drawable.rust_sample,
                codeSampleText = R.string.rust_code_summary,
                codeSampleDescription = R.string.rust_code_image_description
            ),
            // Scala
            LanguageContainer(
                name = R.string.scala_caption,
                logo = R.drawable.scala_logo,
                description = R.string.scala_description,
                codeSample = R.drawable.scala_sample,
                codeSampleText = R.string.scala_code_summary,
                codeSampleDescription = R.string.scala_code_image_description
            ),
            // Go
            LanguageContainer(
                name = R.string.go_caption,
                logo = R.drawable.go_logo,
                description = R.string.go_description,
                codeSample = R.drawable.go_sample,
                codeSampleText = R.string.go_code_summary,
                codeSampleDescription = R.string.go_code_image_description
            ),
            // Elixir
            LanguageContainer(
                name = R.string.elixir_caption,
                logo = R.drawable.elixir_logo,
                description = R.string.elixir_description,
                codeSample = R.drawable.elixir_sample,
                codeSampleText = R.string.elixir_code_summary,
                codeSampleDescription = R.string.elixir_code_image_description
            ),
            // BASIC
            LanguageContainer(
                name = R.string.basic_caption,
                logo = null,
                description = R.string.basic_description,
                codeSample = R.drawable.basic_sample,
                codeSampleText = R.string.basic_code_summary,
                codeSampleDescription = R.string.basic_code_image_description
            ),
            // Ada
            LanguageContainer(
                name = R.string.ada_caption,
                logo = R.drawable.ada_logo,
                description = R.string.ada_description,
                codeSample = R.drawable.ada_sample,
                codeSampleText = R.string.ada_code_summary,
                codeSampleDescription = R.string.ada_code_image_description
            ),
            // OCaml
            LanguageContainer(
                name = R.string.ocaml_caption,
                logo = R.drawable.ocaml_logo,
                description = R.string.ocaml_description,
                codeSample = R.drawable.ocaml_sample,
                codeSampleText = R.string.ocaml_code_summary,
                codeSampleDescription = R.string.ocaml_code_image_description
            ),
            // Visual Basic .NET
            LanguageContainer(
                name = R.string.visual_basic_dotnet_caption,
                logo = R.drawable.visual_basic_dotnet_logo,
                description = R.string.visual_basic_description,
                codeSample = R.drawable.visual_basic_dotnet_sample,
                codeSampleText = R.string.visual_basic_code_summary,
                codeSampleDescription = R.string.visual_basic_code_image_description
            ),
            // COBOL
            LanguageContainer(
                name = R.string.cobol_caption,
                logo = null,
                description = R.string.cobol_description,
                codeSample = R.drawable.cobol_sample,
                codeSampleText = R.string.cobol_code_summary,
                codeSampleDescription = R.string.cobol_code_image_description
            ),
            // R
            LanguageContainer(
                name = R.string.r_caption,
                logo = R.drawable.r_logo,
                description = R.string.r_description,
                codeSample = R.drawable.r_sample,
                codeSampleText = R.string.r_code_summary,
                codeSampleDescription = R.string.r_code_image_description
            ),
            // Swift
            LanguageContainer(
                name = R.string.swift_caption,
                logo = R.drawable.swift_logo,
                description = R.string.swift_description,
                codeSample = R.drawable.swift_sample,
                codeSampleText = R.string.swift_code_summary,
                codeSampleDescription = R.string.swift_code_image_description
            ),
            // Lua
            LanguageContainer(
                name = R.string.lua_caption,
                logo = R.drawable.lua_logo,
                description = R.string.lua_description,
                codeSample = R.drawable.lua_sample,
                codeSampleText = R.string.lua_code_summary,
                codeSampleDescription = R.string.lua_code_image_description
            ),
            // F#
            LanguageContainer(
                name = R.string.f_sharp_caption,
                logo = R.drawable.f_sharp_logo,
                description = R.string.f_sharp_description,
                codeSample = R.drawable.f_sharp_sample,
                codeSampleText = R.string.f_sharp_code_summary,
                codeSampleDescription = R.string.f_sharp_code_image_description
            ),
            // Objective-C
            LanguageContainer(
                name = R.string.objective_c_caption,
                logo = null,
                description = R.string.objective_c_description,
                codeSample = R.drawable.objective_c_sample,
                codeSampleText = R.string.objective_c_code_summary,
                codeSampleDescription = R.string.objective_c_code_image_description
            ),
            // Ruby
            LanguageContainer(
                name = R.string.ruby_caption,
                logo = R.drawable.ruby_logo,
                description = R.string.ruby_description,
                codeSample = R.drawable.ruby_sample,
                codeSampleText = R.string.ruby_code_summary,
                codeSampleDescription = R.string.ruby_code_image_description
            ),
            // SQL
            LanguageContainer(
                name = R.string.sql_caption,
                logo = null,
                description = R.string.sql_description,
                codeSample = R.drawable.sql_sample,
                codeSampleText = R.string.sql_code_summary,
                codeSampleDescription = R.string.sql_code_image_description
            ),
            // PHP
            LanguageContainer(
                name = R.string.php_caption,
                logo = R.drawable.php_logo,
                description = R.string.php_description,
                codeSample = R.drawable.php_sample,
                codeSampleText = R.string.php_code_summary,
                codeSampleDescription = R.string.php_code_image_description
            ),
            // Bash
            LanguageContainer(
                name = R.string.bash_caption,
                logo = R.drawable.bash_logo,
                description = R.string.bash_description,
                codeSample = R.drawable.bash_sample,
                codeSampleText = R.string.bash_code_summary,
                codeSampleDescription = R.string.bash_code_image_description
            ),
            // Assembly
            LanguageContainer(
                name = R.string.assembly_caption,
                logo = null,
                description = R.string.assembly_description,
                codeSample = R.drawable.assembly_sample,
                codeSampleText = R.string.assembly_code_summary,
                codeSampleDescription = R.string.assembly_code_image_description
            ),
            // Fortran
            LanguageContainer(
                name = R.string.fortran_caption,
                logo = R.drawable.fortran_logo,
                description = R.string.fortran_description,
                codeSample = R.drawable.fortran_sample,
                codeSampleText = R.string.fortran_code_summary,
                codeSampleDescription = R.string.fortran_code_image_description
            ),
            // Elm
            LanguageContainer(
                name = R.string.elm_caption,
                logo = R.drawable.elm_logo,
                description = R.string.elm_description,
                codeSample = R.drawable.elm_sample,
                codeSampleText = R.string.elm_code_summary,
                codeSampleDescription = R.string.elm_code_image_description
            ),
        )
    }
}