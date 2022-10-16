#language:pt
#Author: joice_nas@hotmail.com

@criarTarefa
Funcionalidade: Criar tarefa
  Como usuario Quero realizar a criação de tarefa para organizacao
  
  Fundo:
    Dado que acesse o site martins bug tracker
    E que realize o login
    E que esteja no menu Criar Tarefa
    E clico em selecionar projeto
   	E preencho os campos
    E importe um arquivo
    E em Viabilidade selecione opcao desejada
    E marque o campo selecione para criar mais tarefa
    Quando clicar Criar Nova Tarefa
    
   
   

  @criarTarefa1
  Cenario: Criacao de tarefas
	 	Entao valido mensagem "Operacao realizada com sucesso."
      
    
    @criarTarefa2
    Cenario: Campos em branco
    Dado que os campos obrigatorios esteja em branco
    Entao valido mensagem sem preenchimento "Preencha esse campo."
    

