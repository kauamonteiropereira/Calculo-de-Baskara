# 📐 Báskara

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/status-conclu%C3%ADdo-brightgreen?style=for-the-badge)
![License](https://img.shields.io/badge/licen%C3%A7a-MIT-blue?style=for-the-badge)

Programa em Java que calcula as raízes de uma equação de segundo grau (**Ax² + Bx + C**) utilizando a **fórmula de Báskara**, a partir de valores informados pelo usuário.

---

## 📋 Descrição

O programa lê os coeficientes `A`, `B` e `C` digitados pelo usuário, calcula o discriminante (delta) e, dependendo do seu valor, informa se a equação possui duas raízes reais, uma raiz única, ou nenhuma raiz real.

## 💻 Código

​```java
import java.util.Scanner;

public class Baskara {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = leitor.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = leitor.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = leitor.nextDouble();

        double delta = (b * b) - (4 * a * c);

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("A equação possui uma única raiz: x = " + x);
        } else {
            double raizDelta = Math.sqrt(delta);
            double x1 = (-b + raizDelta) / (2 * a);
            double x2 = (-b - raizDelta) / (2 * a);
            System.out.println("A equação possui duas raízes:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
​```

## ▶️ Como executar

​```bash
javac Baskara.java
java Baskara
​```

## 📤 Exemplo de execução

​```
Digite o valor de A: 1
Digite o valor de B: -5
Digite o valor de C: 6
A equação possui duas raízes:
x1 = 3.0
x2 = 2.0
​```

## 🧠 Conceitos praticados

- Entrada de dados com `Scanner`
- Estrutura condicional `if / else if / else`
- Cálculo do discriminante (delta) de uma equação de segundo grau
- Métodos da API do Java (`Math.sqrt`)
- Tipo de dado `double` para valores decimais

## 🚀 Possíveis melhorias

- Tratar o caso de `A = 0` (que deixaria de ser uma equação de segundo grau e causaria divisão por zero).
- Validar se o usuário digitou números válidos (tratamento de exceção com `try/catch`).
- Arredondar as raízes para um número fixo de casas decimais.

---

<p align="center">Feito com ☕ e Java</p>
