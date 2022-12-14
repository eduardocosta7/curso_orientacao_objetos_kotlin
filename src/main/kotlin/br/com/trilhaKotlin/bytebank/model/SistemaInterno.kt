package br.com.trilhaKotlin.bytebank.model

class SistemaInterno {
    fun entra(admin: Autenticavel, senha: Int, autenticado: () -> Unit = {}) {
        if (admin.autentica(senha)) {
            println("Bem-vindo ao Bytebank")
            autenticado()
        } else {
            println("Falha na autentificação")
        }
    }

    fun entraReceiver(admin: Autenticavel, senha: Int, autenticado: SistemaInterno.() -> Unit = {}) {
        if (admin.autentica(senha)) {
            println("Bem-vindo ao Bytebank")
            autenticado(this)
        } else {
            println("Falha na autentificação")
        }
    }

    fun pagamento(){
        println("Realizando pagamento")
    }
}