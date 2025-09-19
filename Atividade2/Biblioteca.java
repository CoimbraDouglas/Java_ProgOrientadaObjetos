class Biblioteca {
    public static void main(String[] args) {
        Material livro = new Livro("O Senhor dos Anéis", 1954);
        Material revista = new Revista("Veja", 2023);

        Emprestimo emprestimoCurto = new EmprestimoCurtoPrazo();
        Emprestimo emprestimoLongo = new EmprestimoLongoPrazo();

        int diasAtrasoLivro = 3; // Exemplo de atraso
        int diasAtrasoRevista = 5; // Exemplo de atraso

        double multaLivro = emprestimoCurto.calcularMulta(diasAtrasoLivro);
        double multaRevista = emprestimoLongo.calcularMulta(diasAtrasoRevista);

        System.out.println("Multa por atraso do livro '" + livro.getTitulo() + "': R$ " + multaLivro);
        System.out.println("Multa por atraso da revista '" + revista.getTitulo() + "': R$ " + multaRevista);
    }
}