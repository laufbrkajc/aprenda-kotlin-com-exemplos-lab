import br.org.example.dominio.*

fun main() {
    val alunosTeste = setOf(Aluno("NomeAluno0", "emailaluno0"),
                             Aluno("NomeAluno1", "emailaluno1"),
                             Aluno("NomeAluno2", "emailaluno2"),
                             Aluno("NomeAluno3", "emailaluno3"),
                             Aluno("NomeAluno4", "emailaluno4"))
    val conts = setOf(ConteudoEducacional("Sintaxe Java", Nivel.BASICO, 120),
                        ConteudoEducacional("Sintaxe Kotlin", Nivel.BASICO, 150),
                        ConteudoEducacional("Spring, do básico ao avançado", Nivel.BASICO, 250),
                        ConteudoEducacional("Git avançado", Nivel.INTERMEDIARIO, 50))
    val formacao0 = Formacao("Backend Java/Kotlin", conts)
    formacao0.matricular(alunosTeste)
    println(formacao0)
}