#language:pt
#Author: your.email@your.domain.com

@login
Funcionalidade: Login de acesso
 Como usuario quero acessar login para ter acesso nas tarefas

  @login1
  Cenario: Login valido
    Dado que acesse o site mantis bug tracker
    E informe a usuario
    E clicar para entrar com usuario
    Entao acesse as tarefas

  @login2
  Cenario: Login em branco
    Dado que acesse o site mantis bug tracker
    Quando avancar sem o usuario
    Entao informe "Sua conta pode estar desativada ou bloqueada ou o nome de usuário e a senha que você digitou não estão corretos."
    
    @login2
  Cenario: Login errado
    Dado que acesse o site mantis bug tracker
    Quando informar usuario incorreto
    E informar uma senha
    Entao informe "Sua conta pode estar desativada ou bloqueada ou o nome de usuário e a senha que você digitou não estão corretos."