# Descrições Gerais

O GhostScan é um software/spyware cuja finalidade é gerar arquivos que monitoram as informações de pessoas. O software funciona tal
como um programador - ele cria programas chamado **Keylogger** que monitora indivíduos baseando em configurações do usuário. As configurações do usuário são: 

### Seleção de Scanners: 
  * Scanner de mouse 
  * Scanner de monitor 
  * Scanner de IP público
  * Scanner de rede interna completa
  
### Seleção de sistemas de camuflagem:
  * Inicialização automática
  * Ocultação de arquivo
  * Programação de tempo de execução
  
### Seleção de Gerador do Keylogger:
  * Inserção de email
  * Inserção de senha
  * Criação de nome do KeyLogger

_**Observações:** Por padrão, o software gera o keylogger com scanner de teclado, mesmo se o usuário não configurar nada._

# Funcionamento do GhostScan

## 1. Interface Inicial

  Na interface Inicial, o usuário está no menu **Início**, aqui ele insere um Email qualquer e a senha do email para envio dos
  dados monitorados, digita o nome do arquivo do keylogger para ser gerado. Por padrão o software mantém selecionado o 
  **Gerador de Keylogger**. O gerador de vírus é uma outra opção extra para brincar com seus amigos, são apenas vírus troll e
  não tem a capacidade de danificar um computador, dependendo do vírus que foi gerado, Exemplo: _Scorpion_, para ser possível  danificar um sistema em sua plena natureza, o computador alvo deveria ter uma segurança extremamente falha, como: Permissões para excluir arquivos; O que não é o caso de muitos computadores hoje em dia. 
  
  **Recomendações:** _Sempre utilize um email & senha inutilizável pré-criado para inserir no software, assim para testar os vírus ou keyloggers, tenha no seu computador uma máquina virtual instalado um sistema operacional para testes._
  
  ![](/Imagens/GhostScan1.png)
  
## 2. Seleção de Scanners

   ### 2.1 Scanner de mouse
   
   Com a opção de mouse selecionado, o keylogger gerado vai apenas monitorar as posições de mouse e as teclas pressionadas
   pelo alvo. Já que o Scanner de monitor não consegue scanear o ponteiro do mouse, O Scanner do mouse vai enviar todas as 
   informações em modo texto de posições clicadas pelo alvo. Cada região da tela que o usuário clicar, o keylogger irá enviar
   informações com termos ao referentes aos cliques, Exemplo: Topo-esquerdo, Topo-direito, centro da tela, rodapé-esquerdo,etc...
   
   ![](/Imagens/GhostScan2.jpg)
   
   ### 2.2 Scanner de monitor
   
   Com a opção de monitor selecionado, o keylogger vai enviar anexos do tamanho completo da tela do alvo para o email configurado. A cada intervalo de tempo ou cliques do mouse, o usuário receberá um novo email com a imagem Screenshot do monitor,
   assim o usuário poderá saber com mais detalhes o que seu alvo está fazendo visualmente.
   
   ![](/Imagens/GhostScan3.jpg)
   
   ### 2.3 Scanner de IP público
   
   Muito se sabe que IPs públicos ou **IPs Externos** revelam muita coisa sobre uma pessoa, **Exemplo:** _A localização do computador do alvo quando rastreado._ Com a opção de IP público selecionado, o keylogger enviará os números de IP público do alvo.
   
   ![](/Imagens/GhostScan4.jpg)
   
   ### 2.4 Scanner de rede interna
   
   As informações de rede interna é de grande valia pra quem conhece/trabalha na área. Com a opção de rede interna selecionada, o email configurado no keylogger recebe informações completas, como: Interfaces de redes, nomes das placas de rede instaladas, Números IPV4 e IPV6 (IPs internos), gateway, máscaras de sub-rede, broadcast, nome do computador completo e todas as redes conectadas ao computador do alvo.

  ![](/Imagens/GhostScan5.jpg)
  
  ### 2.5 Scanner de teclado
  
  Por padrão, este funcionamento não precisa ser selecionado pois o próprio keylogger encarrega de enviar informações de teclas,
  mesmo sem nada configurado, já que o nome _Keylogger_ deriva do significado **_Registro de teclas_**. As teclas pressionadas
  enviadas para o email são concatenadas e a cada email recebido uma parte de uma frase digitada pelo alvo é mostrada, porém sempre exibindo e completando todo o restante da frase por cada email. Sabendo que as informações escaneadas são enviadas em um intervalo de tempo de 10 segundos, Então é recomendável que o usuário baixe as informações de emails relevantes e sempre procure 
  fazer uma "limpeza" da sua caixa de entrada, pois a quantidade de informações recebidas em 1 dia é absurdamente grande. Este é um outro exemplo para usar um **Email de teste inutilizável** na configuração do keylogger.
  
## 3. Seleção de sistemas de camuflagem

### 3.1 Inicialização automática

Nesta opção, o sistema do keylogger se responsabiliza em se auto-copiar para a pasta descrito na variável de ambiente **%AppData%** cujo conteúdo é "C:\Users\xxxx\AppData\Roaming\", onde "xxxx" seria a pasta de usuário do computador, o sistema faz uma concatenação com os próximos diretórios, ficando: "C:\Users\xxxx\AppData\Roaming\Microsoft\Windows\Start Menu\Programs". Neste diretório é aonde fica todos os programas que executa automaticamente quando o computador é ligado, então se o keylogger é
copiado para este diretório significa que o keylogger vai executar automaticamente toda vez que o computador ligar. 

**Observações:** _Percebemos que este diretório é pertencente a plataforma **Windows**. Isso significa que se for monitorar uma pessoa que está utilizando uma plataforma linux, a opção de **Inicialização Automática** não irá funcionar. Porém o processo de copiar para a pasta de inicialização pode ser feita manualmente._

**Detalhes:** _O software foi desenvolvido para ambientes Windows, mesmo que o GhostScan tenha funcionalidades que também executa no Linux. Futuramente o código fonte será adaptado para executar todas as funcionalidades em quaisquer plataformas._

 ![](/Imagens/GhostScan7.jpg)
 
### 3.2 Ocultação de arquivo

Este é um processo que oculta o keylogger após executado, quando esta opção é selecionada, o modo invisível é ativado o que significa que no local que for executado o keylogger, o sistema executa comandos para fazer sumir o arquivo. Nem mesmo ativando
a opção de "Mostrar arquivos ocultos" do painel de controle irá achar o keylogger, pois o keylogger utiliza um comando específico do sistema para ocultar arquivos, mesmo que eles ainda continuam executando na máquina do alvo.

![](/Imagens/GhostScan8.jpg)

### 3.3 Programação de tempo de execução

Na parte de "Tempo de execução" existe uma informação que mostra a data atual e um campo de texto para inserir uma data. A data que é inserida é referente ao dia e mês que o keylogger irá ser finalizado, ou seja, parar de executar. O sistema identifica a data atual e faz uma comparação com a data inserida a cada dia que o keylogger é iniciado, quando a data atual é igual a data inserida, o sistema finaliza a tarefa relacionada ao keylogger.Isto é quando o usuário decide monitorar seu alvo durante um tempo específico.

![](/Imagens/GhostScan9.jpg)

## 4. Geração do Keylogger
  
  Na Interface inicial é inserido um email e uma senha pré-criada para testes. Logo após clicar em "Testar Conexão", o sistema faz uma autenticação de login do email e envia uma mensagem confirmando que o keylogger irá funcionar com sucesso. Isto é para testar se há uma conexão com a internet e se realmente o email irá receber informações do keylogger. 
![](/Imagens/GhostScan10.jpg)
Após testar a conexão, é inserido o nome do arquivo Keylogger que será gerado. É recomendável que utilize um nome menos chamativo, discreto e comum, algo que o alvo não irá suspeitar. Neste caso, como o arquivo gerado é um .jar(Arquivo Executável Java), é colocado o nome "Java Update" - já que o **Atualizador do Java**(Java Update) é bastante comum estar instalado em computadores que contém a JRE(Java Runtime Environment). Após definir o nome, o botão "Criar Keylogger" é clicado e uma mensagem de confirmação pergunta se realmente quer gerar o keylogger.

![](/Imagens/GhostScan11.jpg)

Após clicado em sim, o arquivo nomeado **Java Update.jar** é criado na pasta de instalação do GhostScan, este arquivo pode ser transportado, enviado e executado em qualquer computador que contém a JRE.
_Para mais informações, consulte a pasta **Imagens** no repositório do GitHub que contém imagens que demonstra o funcionamento completo de um keylogger._

![](/Imagens/GhostScan12.jpg)
## 5. Informações do software


