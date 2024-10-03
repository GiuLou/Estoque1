
    public class Estoque {
        private Livro[] livros;
        private int contador;
    
        public Estoque() {
            livros = new Livro[100];
            contador = 0;
        }
    
        public void adicionarLivro(Livro livro) {
            for (int i = 0; i < contador; i++) {
                if (livros[i].getIsbn().equals(livro.getIsbn())) {
                    livros[i].setQuantidade(livros[i].getQuantidade() + livro.getQuantidade());
                    return;
                }
            }
            if (contador < livros.length) {
                livros[contador++] = livro;
            } else {
                System.out.println("Estoque cheio. Não é possível adicionar mais livros.");
            }
        }
    
        public void removerLivro(String isbn) {
            for (int i = 0; i < contador; i++) {
                if (livros[i].getIsbn().equals(isbn)) {
                    livros[i] = livros[contador - 1];
                    livros[contador - 1] = null;
                    contador--;
                    return;
                }
            }
            System.out.println("Livro não localizado em estoque..");
        }
    
        public Livro buscarLivro(String isbn) {
            for (int i = 0; i < contador; i++) {
                if (livros[i].getIsbn().equals(isbn)) {
                    return livros[i];
                }
            }
            System.out.println("Livro não localizado em estoque..");
            return null;
        }
    
        public void listarLivros() {
            for (int i = 0; i < contador; i++) {
                System.out.println(livros[i]);
            }
        }
    
        public void atualizarQuantidade(String isbn, int quantidade) {
            for (int i = 0; i < contador; i++) {
                if (livros[i].getIsbn().equals(isbn)) {
                    livros[i].setQuantidade(quantidade);
                    return;
                }
            }
            System.out.println("Livro não localizado em estoque.");
        }
    }
    
    

