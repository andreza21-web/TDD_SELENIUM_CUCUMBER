#language: pt

Funcionalidade: TesteBuscaCredenciada de Palavra

  Sendo um visitante do site soc
  Quero fazer uma pesquisa
  Para que eu possa encontrar algo

  Cenario: TesteBuscaCredenciada

    Dado o acesso guiado para a conexao
    E acesso a rede credenciada
    Quando submeto um cep e um filtro
    Entao deve ser redirecionado para a tela com o credenciado

