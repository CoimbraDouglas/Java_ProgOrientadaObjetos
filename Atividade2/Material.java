// Classe base para os materiais
abstract class Material {
    protected String titulo;
    protected int anoPublicacao;

    public Material(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
}

// Classe para livros
class Livro extends Material {
    public Livro(String titulo, int anoPublicacao) {
        super(titulo, anoPublicacao);
    }
}

// Classe para revistas
class Revista extends Material {
    public Revista(String titulo, int anoPublicacao) {
        super(titulo, anoPublicacao);
    }
}