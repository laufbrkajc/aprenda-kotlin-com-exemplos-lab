package br.org.example.dominio

enum class Nivel { SEM_NIVEL, BASICO, INTERMEDIARIO, DIFICIL }

data class ConteudoEducacional(val titulo: String = "Sem título",
                          val nivel: Nivel = Nivel.SEM_NIVEL,
                          val cargaHoraria: Int = 0)
{
}