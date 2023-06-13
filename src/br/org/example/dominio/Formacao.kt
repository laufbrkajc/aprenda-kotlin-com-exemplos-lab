package br.org.example.dominio

class Formacao(val nome: String, val conteudos: Set<ConteudoEducacional>) {
    val alunos = mutableSetOf<Aluno>()
    var nivel = Nivel.SEM_NIVEL
        private set
    var cargaHoraria = conteudos.stream().let { it ->
        var cargaHorariaTotal = 0
        it.forEach { cc -> cargaHorariaTotal += cc.cargaHoraria }
        cargaHorariaTotal
    }

    init {
        for (cont in conteudos) {
            if (cont.nivel > this.nivel)
                this.nivel = cont.nivel
        }
    }

    fun matricular(novosAlunos: Set<Aluno>) {
        alunos.addAll(novosAlunos)
    }

    fun cancelarMatricula(desistentes: Set<Aluno>) {
        alunos.removeAll(desistentes)
    }

    public override fun toString(): String {
        return "Formacao(${this.nome}, ${this.cargaHoraria}, ${this.nivel}, ${this.hashCode()})"
    }
}