# Desenvolvimento de Software I
Aulas de Desenvolvimento de Software | com o professor João Siles utilizando Java.

# Como baixar o Java

 - Acesse o site da Oracle e baixe o java
 - Preste atênção aonde o java será instalado
 - Pronto vc baixou ele :)
 
 
 # Como configurar o Java
 
 - Pesquise variaveis de ambiente na area de pesquisa do windows
 - Abra ele e aperte em Variaveis de Ambiente
 - Aperte na variavel PATH e cheque se já tem um caminho para o Java
 - Se não ouver um caminho vá aonde o Java foi instalado, aperte nele e ache a pasta bin, e copie o caminho dela.
 - Retorne ao PATH e aperte em novo e cole o caminho da pasta bin
 
 # Como checar se o Java foi configurado corretamente
 - Pesquise "cmd" na area de pesquisa do windows e abra ele
 - Escreva "java -version" ou "javac -version"
 - Se aparecer a versão do Java, quer dizer que o java foi configurado corretamente

 # Regras básicas do Java
 

 - O nome da file deve ser o mesmo nome da class
 - Todo o código deve começar com:
 ```
public class Nome do programa{
    public static void main(String[] args) {
        CÓDIGO AQUIIIIIIIIIIIII
    }
}
```

# Como o Java funciona
   Pelo oque eu entendi, o java é orientado a objetos e por isso ele funciona a partir de métodos. Por isso que quando nós vamos começar um código em java temos que escrever "public class" poque ele está criando uma classe que dentro possui um método que é a main: "public static void main(String[ ] args)". Então quando rodamos o código o compilador do java vai procurar a classe main e o seu método principal ( main ).

# Oque é Spring Boot 
  Spring Boot é um framework do java que ajuda o desenvolvedor a criar aplicações de forma rápida, simples e padronizada.

## Como configurar o Spring Boot  de 3 maneiras 
###  1. Spring initializr 
![enter image description here](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTP4dWwa6k_mjjvrfwSbB15cR-OCOpIdVjlHsu_yKk4Ww&s=10)

- Abra o site https://start.spring.io/ 
- Escolha as opções necessárias, e dependencias. (Prof recomenda usar Spring Web e Spring Boot Dev Tools)
- E crie o projeto
- Ele vai gerar um arquivo zip totalmente formatado

### 2. Vscode   
![enter image description here](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTp1XBXcsv2zHTIrC5DiGufOC6TM8YrU61nze6xwHypGw&s=10)

- Baixe o Vscode pelo link: https://code.visualstudio.com/
- Depois é só apertar ctrl + shift + P 
- Busque e selecione **Spring Initializr: Create a Maven Project**
- Então é só ir configurando o seu projeto 
