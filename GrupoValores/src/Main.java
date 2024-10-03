/*INICIAR
    DECLARAR notas COMO REAL
    DECLARAR somarNotas COMO REAL
    DECLARAR maior COMO REAL
    DECLARAR media COMO REAL
    DECLARAR qtdadeNotas COMO INTEIRO
    DECLARAR contador COMO INTEIRO

    somarNotas <- 0
    maior <- 0
    contador <- 0

    ESCREVER "Digite a quantidade de notas que você deseja colocar ou (0 para sair)"
    LER qtdadeNotas

    ENQUANTO contador < qtdadeNotas E qtdadeNotas > 0 FAZER
        ESCREVER "Digite a nota do aluno"
        LER notas

        somarNotas <- somarNotas + notas
        contador <- contador + 1

        SE notas > maior ENTÃO
            maior <- notas
        FIM SE
    FIM ENQUANTO

    SE contador > 0 ENTÃO
        media <- somarNotas / qtdadeNotas
        ESCREVER "A média dos alunos é: " + media
        ESCREVER "A maior nota é: " + maior
    FIM SE
FIM */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    float notas=0, somarNotas = 0,maior =0, media;

    int qtdadeNotas, contador = 0;

    System.out.println("Digite a quantidade notas que você deseja colocar ou (0 para sair)");
    qtdadeNotas = entrada.nextInt();

    while (contador < qtdadeNotas && qtdadeNotas > 0){
        //enquanto o contador iniciado no 0 for menor que o valor digitado pelo usuario da qtadade e notas, e o mesmo for maior que 0 o loop roda!

        System.out.println("Digite a nota do aluno do aluno");
        notas = entrada.nextFloat();

        somarNotas += notas; //pega nota enviado pelo usuario e sempre guarda na variavel somar notas e soma todas.
        contador++;// soma mais 1 no contador

        if (notas > maior){

            maior = notas;

        }

    }
        if (contador>0){

            media = somarNotas/qtdadeNotas;
            System.out.println("A média dos alunos é: " + media);
            System.out.println("A maior nota é: " + maior);
        }

    }
}