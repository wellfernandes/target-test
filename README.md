# Target test

Resolução de teste aplicado pela empresa Target Sistemas. 

## 🚀 Descrição

O objetivo do target-test é apresentar as resoluções de quatro atividades de desenvolvimento, solicitadas pela empresa durante o seu processo seletivo.
A aplicação foi desenvolvida utilizando as tecnologias Java, JavaFX e Gson. 
A aplicação conta com um menu principal que dispõe acesso a resolução de cada uma das atividades solicitadas, com o intuito de tornar mais fácil a visualiação do avaliador.


### 📋 Pré-requisitos

Para executar a aplicação via executável .Jar, é necessário que alguns pré-requisitos sejam atendidos:

1) Ter o Java JDK instalado no sistema operacional;

* [Java JDK](https://www.azul.com/downloads/#download-openjdk) - O Java JDK utilizado foi o Java Zulu community 

2) Ter a biblioteca do JavaFX JDK versão 18.0.1 instalada no sistema operacional;

* [JavaFX JDK](https://gluonhq.com/products/javafx/) - O JavaFX JDK utilizado foi o JavaFX Gluon community 


### 🔧 Instalação

1) Instale o Java JDK e configure sua variável de ambiente de acordo com o seu sistema operacional;
2) Após realizado o download da biblioteca do JavaFX JDK, crie uma pasta no seu computador e extraia o arquivo compactado para ela - o caminho desta pasta será utilizado no comando para executar a aplicação;
3) Faça o download do arquivo executável target-test.jar e salve em sua área de trabalho;

* [target-test-app.jar](https://bityli.com/wceNAW) - Executável target-test-app.jar no google drive 

Para executar o target-test-app.jar é necessário que o argumento seja executado via terminal:
OBS: O arquivo target-test-app.jar deve estar salvo na área de trabalho.

No MacOs:

```
cd Desktop
java --module-path /Users/SEU-USUARIO-NO-MAC/PASTA-DA-BIBLIOTECA-JAVAFX/javafx-sdk-18.0.1/lib/ --add-modules javafx.controls,javafx.fxml -cp target-test-app.jar application.Main

```

No Windows:

```
cd Desktop
java --module-path C:\Users<SEU-USUARIO-NO-WINDOWS>\PASTA-DA-BIBLIOTECA-JAVAFX\javafx-sdk-18.0.1\lib --add-modules=javafx.controls,javafx.fxml -cp target-test-app.jar
```

O sistema operacional utilizado durante o desenvolvimento foi o MacOS, por este motivo alguns campos como labels e textfields podem sofrer distorções gráficas quando executada a aplicação em outros sistemas operacionais. Isso não afetará os resultados da aplicação.


---
[Linkedin](https://www.linkedin.com/in/wellitonfernandes/) 😊