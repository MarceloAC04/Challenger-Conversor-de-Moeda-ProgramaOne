package br.com.alura.conversormoeda.classes;

public class Menu {
    String menu = """
            -----------------------------------------
            *   Bem-Vindo ao Conversor de Moedas$   *
            -----------------------------------------
            *   1) USD --> BRL                      *
            *   2) BRL --> USD                      *
            *   3) EUR --> BRL                      *
            *   4) BRL --> EUR                      *
            *   5) GBP --> BRL                      *
            *   6) BRL --> GBP                      *
            *   7) USD --> EUR                      *
            *   8) EUR --> USD                      *
            *   9) USD --> GBP                      *
            *   10) GBP --> USD                     *
            *   0) Sair do Conversor                *
            -----------------------------------------
            Digite uma opção válida:
            """;

    public Menu() {
        System.out.println(menu);
    }
}
