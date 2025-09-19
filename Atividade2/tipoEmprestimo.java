public class tipoEmprestimo {
    double dias;

    double taxaMultaPorDia;

    public tipoEmprestimo(double taxaMultaPorDia) {
        this.taxaMultaPorDia = taxaMultaPorDia;
    }

    public double calcularMulta(int diasAtraso) {
        return diasAtraso * taxaMultaPorDia;
    }
}

// Classe para empréstimos de curto prazo
class EmprestimoCurtoPrazo extends tipoEmprestimo {
    public EmprestimoCurtoPrazo() {
        super(1.0); // Exemplo: R$ 1.00 de multa por dia
    }
}

// Classe para empréstimos de longo prazo
class EmprestimoLongoPrazo extends tipoEmprestimo {
    public EmprestimoLongoPrazo() {
        super(0.5); // Exemplo: R$ 0.50 de multa por dia
    }
}