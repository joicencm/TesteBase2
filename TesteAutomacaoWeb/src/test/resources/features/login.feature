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
    E informe senha
    Entao acesse as tarefas

  @login2
  Cenario: Login em branco
    Quando avancar sem o usuario
    Entao informe valide mensagem "Sua conta pode estar desativada ou bloqueada ou o nome de usuário e a senha que você digitou não estão corretos."
    
  