# 📘 Exercício de Programação Orientada a Objetos - Java
Este repositório contém a implementação de um exercício da disciplina de **Programação Orientada a Objetos (POO)**.  
O objetivo é praticar conceitos como **classes, encapsulamento, métodos, atributos e interação via menu**.

---

## 📌 Descrição do Exercício

O programa consiste em:

- Criar a classe `Aluno`, contendo:
  - RA (Registro Acadêmico)
  - Notas das provas (`NtPrv1`, `NtPrv2`)
  - Notas dos trabalhos (`NtTrab1`, `NtTrab2`)

- Implementar métodos para:
  - Definir e obter valores dos atributos
  - Calcular a **média das provas**
  - Calcular a **média dos trabalhos**
  - Calcular a **média final** (baseada na média das provas e dos trabalhos)

- Criar um menu de interação com o usuário, exibindo as opções:

1 - Exibir Nota das Provas/Trabalhos </br>
2 - Exibir Média dos Trabalhos/Provas </br>
3 - Exibir Média Final </br>
4 - Sair </br>


⚠️ Para as opções **1, 2 e 3**, deve ser exibido também o **RA do aluno**.

---

## 🧮 Fórmulas Utilizadas
- **Média das Provas**:  
  Media Prova = 0.75 × Nota da Primeira Prova + 2 × Nota da Segunda Prova​ / 3

- **Média dos Trabalhos**:  
  Media Trabalho = 0.25 × Nota do Primeiro Trabalho + Nota do Segundo Trabalho​ / 2

- **Média Final**:  
  Media Final = Media Prova + Media Trabalho​ / 2

---

## 💻 Exemplo de Execução
    Digite o RA do aluno: 12345
    Digite a nota da primeira prova: 7.5
    Digite a nota da segunda prova: 8.0
    Digite a nota do primeiro trabalho: 6.0
    Digite a nota do segundo trabalho: 7.0
    
    ----- MENU -----
    1 - Exibir Nota das Provas/Trabalhos
    2 - Exibir Média dos Trabalhos/Provas
    3 - Exibir Média Final
    4 - Sair
    
    Digite a opcao: 2
    
    RA: 12345
    Média das Provas: 7.83
    Média dos Trabalhos: 6.62

---

## 📂 Estrutura do Projeto
📦 repositorio</br>
 ┣ 📜 Aluno.java</br>
 ┣ 📜 Aplic.java</br>
 ┣ 📜 README.md</br>
