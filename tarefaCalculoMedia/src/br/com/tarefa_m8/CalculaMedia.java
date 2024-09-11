package br.com.tarefa_m8;

public class CalculaMedia {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public CalculaMedia(String nome, double nota1, double nota2, double nota3, double nota4) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public void imprimirNotasEMedia() {
        System.out.println("Aluno: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Nota 4: " + nota4);
        System.out.println("Média final: " + calcularMedia());
    }

    public static void main(String[] args) {
        CalculaMedia aluno = new CalculaMedia("Johnny B. Goode", 7.5, 8.0, 9.2, 6.7);
        aluno.imprimirNotasEMedia();
    }
}
