🖥️Sistema de cálculo de folha de pagamento🚀

Projeto universitário desenvolvido em grupo para a matéria de Agoritmos e Lógica de programação

Esse programa simula um sistema de folha de pagamento, onde você pode:

Cadastrar funcionários de 3 tipos:

✔️Padrão

✔️Comissionado

✔️Produção

* Gerar a folha de pagamento

* Evitar matrícula duplicada


O programa começa importando classes importantes:

Locale (para formatar números),
Scanner (para ler dados do usuário),
ArrayList (para armazenar informações dinamicamente).

A classe principal define um salário base fixo de R$ 2.000,00, que será usado no cálculo dos salários.

No método main, são criadas listas para guardar funcionários e matrículas, além de um menu que se repete com do-while, permitindo ao usuário escolher opções como cadastrar funcionários, gerar a folha ou sair.

O controle das opções é feito com switch, direcionando para diferentes métodos conforme a escolha.

O sistema permite cadastrar três tipos de funcionários:

Padrão: recebe apenas o salário base.
Comissionado: recebe salário base + comissão sobre vendas.
Produção: recebe salário base + bônus por peças produzidas.

Em todos os casos, há validações para evitar valores inválidos e matrículas duplicadas.

O método de controle de matrícula garante que não existam registros repetidos.

A folha de pagamento exibe todos os funcionários cadastrados, ou informa se não houver nenhum.

O programa só termina quando o usuário escolhe sair, encerrando corretamente com o fechamento do Scanner.



<img width="1076" height="707" alt="Captura de Tela (4)~2" src="https://github.com/user-attachments/assets/adf2ce5b-1bfb-4e93-8878-220e27909bc8" />

<img width="1138" height="709" alt="Captura de Tela (3)~2" src="https://github.com/user-attachments/assets/a8f79187-eb3b-4348-bdc6-d49521b0ecac" />

<img width="1124" height="718" alt="Captura de Tela (2)~2" src="https://github.com/user-attachments/assets/56ff9b8a-640c-4716-b435-a15d04bc2c74" />




