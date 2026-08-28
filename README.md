# √ Raiz Quadrada
 
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/status-conclu%C3%ADdo-brightgreen?style=for-the-badge)
![License](https://img.shields.io/badge/licen%C3%A7a-MIT-blue?style=for-the-badge)
![Nível](https://img.shields.io/badge/n%C3%ADvel-iniciante-yellow?style=for-the-badge)
 
Programa em Java que percorre os números de **1 a 100** e mostra a **raiz quadrada** de cada um, usando o método pronto `Math.sqrt()` da API do Java.
 
---
 
## 📋 Descrição
 
O programa usa um laço `for` para varrer os números de 1 até 100. Para cada número, calcula a raiz quadrada e imprime o número ao lado do resultado.
 
## 💻 Código
 
```java
public class RaizQuadrada {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 100; numero++) {
            double raiz = Math.sqrt(numero);
            System.out.println("Número " + numero + " - Raiz Quadrada " + raiz);
        }
    }
}
```
 
## ▶️ Como executar
 
```bash
javac RaizQuadrada.java
java RaizQuadrada
```
 
## 📤 Exemplo de saída
 
```
Número 1 - Raiz Quadrada 1.0
Número 2 - Raiz Quadrada 1.4142135623730951
Número 3 - Raiz Quadrada 1.7320508075688772
...
Número 100 - Raiz Quadrada 10.0
```
 
## 🧠 Conceitos praticados
 
- Estrutura de repetição `for`
- Métodos prontos da API do Java (`Math.sqrt`)
- Tipo de dado `double` para valores decimais
- Concatenação de strings com `System.out.println`
## 🚀 Possíveis melhorias
 
- Arredondar o resultado para um número fixo de casas decimais usando `String.format("%.2f", raiz)`.
- Permitir que o usuário escolha o intervalo de números via `Scanner`.
- Indicar quais números são "quadrados perfeitos" (raiz exata, sem casas decimais).
---
 
<p align="center">Feito com ☕ e Java</p>
 
