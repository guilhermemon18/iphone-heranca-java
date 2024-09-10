
# POO - Desafio

# Modelagem e Diagrama��o de um Componente iPhone

Neste projeto, foi modelado e criado o diagrama para a representa��o UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telef�nico e Navegador na Internet.

### Contexto
Com base no v�deo de lan�amento do iPhone de 2007 (link abaixo), foi elaborada a diagrama��o das classes e interfaces UML neste README. Em seguida, implementadas as classes e interfaces no formato de arquivos `.java` neste projeto.

[Lan�amento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)
- Minutos relevantes: 00:15 at� 00:55

### Funcionalidades a Modelar
1. **Reprodutor Musical**
   - M�todos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telef�nico**
   - M�todos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
   - M�todos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

## Objetivo
1. Criar um diagrama UML que represente as funcionalidades descritas acima.
2. Implementar as classes e interfaces correspondentes em Java (Opcional).


## Diagrama de Classes do iPhone
Na pasta img/diagramas cont�m um arquivo de imagem SVG ilustrando o diagrama criado, mas  a seguir tamb�m � ilustrado:

```mermaid
classDiagram
    class ReprodutorMusical {
    	<<interface>> 
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        <<interface>> 
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        <<interface>> 
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
    }

    ReprodutorMusical <|-- iPhone
    AparelhoTelefonico <|-- iPhone
    NavegadorInternet <|-- iPhone
```

