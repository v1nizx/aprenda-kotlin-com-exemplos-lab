enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado na formação $nome")
    }

    fun listarInscritos() {
        println("Inscritos na formação $nome:")
        inscritos.forEach { println("- ${it.nome}") }
    }
}

fun main() {
    val conteudo1 = ConteudoEducacional("Introdução à Kotlin")
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos em Kotlin")
    val conteudo3 = ConteudoEducacional("Kotlin Avançado")

    val formacaoKotlin = Formacao("Formação Kotlin", listOf(conteudo1, conteudo2, conteudo3))

    val usuario1 = Usuario("Alice")
    val usuario2 = Usuario("Bob")

    formacaoKotlin.matricular(usuario1)
    formacaoKotlin.matricular(usuario2)

    formacaoKotlin.listarInscritos()
}
