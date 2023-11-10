programa {
  inclua biblioteca Tipos --> tp

  funcao inicio() {
    real num1
    real num2 
    cadeia num3
    cadeia num4
    real num3real
    real num4real
    cadeia op
    real total


    /*escreva("Calculadora", "\n")
    escreva("Insira o 1 numero: ")
    leia(num1)
    escreva("\n","Insira o 2 numero: ")
    leia(num2)*/

    escreva("Calculadora", "\n")
    escreva("Insira o 1 numero: ")
    leia(num3)
    
    se(tp.cadeia_e_real(num3)){
      num3real = tp.cadeia_para_real(num3)
      //escreva(num3real, "\n")
    }senao escreva("ERROR")
    

    escreva("\n","Insira o 2 numero: ")
    leia(num4)
    escreva("\n")
    se(tp.cadeia_e_real(num4)){
      num4real = tp.cadeia_para_real(num4)
      //escreva(num4real, "\n")
    }senao escreva("\n","ERROR")
    

    faca{
      escreva("\n","Escolha o operador logico: ", "\n")
      escreva("+, ")
      escreva("-, ")
      escreva("*, ")
      escreva("/: ")
      escreva("\n")
      leia(op)
    } enquanto (op != "+" e op != "-" e op != "*" e op != "/")
    
    se (op == "+" ou op == "-" ou op == "*" ou op == "/")
    escreva("\n","Operador escolhido é: ", op)


    /*se (op == "+")
    total = num1 + num2
    se (op == "-")
    total = num1 - num2
    se (op == "*")
    total = num1 * num2
    se (op == "/")
    total = num1 / num2*/

    se (op == "+")
    total = num3real + num4real
    se (op == "-")
    total = num3real - num4real
    se (op == "*")
    total = num3real * num4real
    se (op == "/")
    total = num3real / num4real

    escreva("\n","O resultado é: ",total)

  }
}
