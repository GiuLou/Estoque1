public class App {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        
        Livro livro1 = new Livro("Diario de uma garota nada popular", "Rachel Renée Russel", "8576861038", 10);
        Livro livro2 = new Livro("2003", "Giulia", "9788598078304", 5);
        
        estoque.adicionarLivro(livro1);
        estoque.adicionarLivro(livro2);
        
       
        System.out.print("Livros em estoque:");
        estoque.listarLivros();
        
        
        estoque.atualizarQuantidade("8576861038", 15);
        System.out.println("\nApós atualizar a quantidade:");
        estoque.listarLivros();
        
        
        estoque.removerLivro("9788598078304");
        System.out.println("\nApós remover um livro:");
        estoque.listarLivros();
        
        
        Livro livroBuscado = estoque.buscarLivro("8576861038");
        System.out.println("Livro buscado: " + livroBuscado);
    }
}
