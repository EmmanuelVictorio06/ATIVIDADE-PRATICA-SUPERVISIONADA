# 📚 Projeto de Estrutura de Dados em Java – Pilhas, Filas e Intercalações

Este projeto foi desenvolvido para aplicar os conceitos de **estruturas de dados dinâmicas**, utilizando implementações manuais de **pilha** e **fila**, além de algoritmos de **intercalação (merge)** de dados com e sem uso de encadeamento. Todo o código foi escrito seguindo as restrições da disciplina de Estrutura de Dados do curso de Engenharia de Software da PUCPR.

---

# 📋 Sobre o Projeto

O foco deste trabalho é praticar a manipulação de estruturas de dados básicas **sem o uso de estruturas prontas** da linguagem Java. As regras incluem:

- Apenas `String`, `int`, `float`, `try-catch`, `throws`, e funções básicas de entrada e saída.
- Proibição de uso de `List`, `Map`, `ArrayList`, `StringBuilder`, arrays automáticos ou qualquer estrutura de dados pronta.
- Implementação manual de **pilhas**, **filas**, e **intercalações (merge)** com base em listas encadeadas.

---

# ⚙️ Funcionalidades

**📌 Pilha e Pilha Encadeada**
- Inserção de elementos (push).
- Remoção seguindo a lógica LIFO (pop).
- Impressão do conteúdo da pilha.

**📌 Fila e Fila Encadeada**
- Inserção de elementos (enqueue).
- Remoção na lógica FIFO (dequeue).
- Impressão do conteúdo da fila.

**🔀 Intercalação de Filas e Vetores**
- `MergeVetores.java`: intercala dois vetores ordenados em um novo vetor ordenado.
- `MergeFilasEncadeadas.java`: intercala duas filas encadeadas ordenadas em uma nova fila encadeada.

---

# 🧱 Estrutura do Projeto


Fila.java // Implementação de fila simples.
FilaEncadeada.java // Implementação de fila com lista encadeada.
Pilha.java // Implementação de pilha simples.
PilhaEncadeada.java // Implementação de pilha com lista encadeada.
MergeVetores.java // Algoritmo de intercalação de dois vetores.
MergeFilasEncadeadas.java // Algoritmo de merge de duas filas encadeadas.

---

# 🔗 Sistema de Fluxo de Dados

- **Pilha/PilhaEncadeada**: utilizam o topo como ponto de controle para operações push e pop.
- **Fila/FilaEncadeada**: utilizam frente e fim para controlar inserções e remoções.
- **MergeVetores**: percorre dois vetores ordenados e os combina ordenadamente.
- **MergeFilasEncadeadas**: compara elementos de duas filas encadeadas e cria uma nova com os elementos ordenados.

---

# 🚀 Tecnologias Utilizadas

- Java
- IDE recomendada: Visual Studio Code ou Eclipse
- Execução via terminal/console

---

# 🛠️ Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/usuario/repositorio.git
2. Abra os arquivos .java na sua IDE.

3. Compile e execute individualmente os arquivos com main (como MergeVetores.java ou MergeFilasEncadeadas.java).

4. Acompanhe a simulação das estruturas no console.

# 📌 Observações Importantes
- O projeto não utiliza recursos avançados ou bibliotecas externas.
- Toda a lógica é feita com manipulação direta de ponteiros (nós).
- O merge de vetores e filas mostra o domínio do conceito de intercalação ordenada.

# 👨‍💼 Créditos
- Projeto desenvolvido por Emmanuel Victorio, Misael Vicente e Otávio Augusto,
- Disciplina Resolução de Problemas Estruturados em Computação, Engenharia de Software – PUCPR.

# 📌 Links Importantes
- Repositório GitHub: https://github.com/usuario/repositorio
- (Opcional) Vídeo explicativo: https://www.youtube.com/seuvideo
  
