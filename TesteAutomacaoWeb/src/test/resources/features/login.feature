#language:pt
#Author: your.email@your.domain.com

@login
Funcionalidade: Login de acesso
 Como usuario quero acessar login para ter acesso nas tarefas
 
 
	Fundo:
	  Dado que acesse o site mantis bug tracker

  @login1
  Cenario: Login valido
    Quando informe usuario
    E clique em entrar com usuario
    E informe senha
    E clique em entrar com a senha
    Entao acesse as tarefas

  @login2
  Cenario: Login em branco
    Quando avancar sem o usuario
    Entao informe valide mensagem "Sua conta pode estar desativada ou bloqueada ou o nome de usuario e a senha que voce digitou nao estao corretos."
    
  