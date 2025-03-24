public class Pessoa {

         
        private String nome;
        private int idade;
        private String email;
    
        public Pessoa(String nome, int idade, String email) {
            this.nome = nome;
            this.idade = idade;
            this.email = email;
        }
    
        public void editarPessoa(String nome, int idade, String email) {
            this.nome = nome;
            this.idade = idade;
            this.email = email;
        }
    
        public void apresentarPessoa() {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("E-mail: " + email);
        }
    
        public void excluirPessoa() {
            this.nome = null;
            this.idade = 0;
            this.email = null;
            System.out.println("\n\nCadastro excluído com sucesso.\n\n");
        }
}
