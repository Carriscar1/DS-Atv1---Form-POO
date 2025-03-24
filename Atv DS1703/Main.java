import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner Scanner = new Scanner (System.in);
        Pessoa pessoa  = null;
        int op;

        do {
        System.out.println("Bem vindo ao sistema de cadastro de Pessoas!\nEscolha uma operação:\n 1 - Cadastrar uma nova pessoa\n 2 - Editar dados de uma nova pessoa cadastrada \n 3 - Apresentar dados de uma pessoa cadastrada\n 4 - Excluir dados de uma pessoa cadastrada\n 5 - Sair ");
        System.out.println("\nEscolha a opção desejada:");
        op = Scanner.nextInt();
        
        switch (op) {
            case 1:
            if (pessoa != null) {
                System.out.println("Já existe um cadastro, edite ou exclua o cadastro atual\n");
                break;
            }
            System.out.print("Digite o nome ");
                String nome = Scanner.next();
            System.out.print("\nIdade: ");
                int idade = Scanner.nextInt();
                Scanner.nextLine();
            System.out.print("\nEmail: ");
                String email = Scanner.nextLine();
                pessoa = new Pessoa(nome, idade, email);
            System.out.println("\nCadastro realizado com sucesso.\n");
            
            
            break;


            case 2:
            if (pessoa != null) {
            System.out.println("Digite o novo nome:");
                nome = Scanner.next();
            System.out.print("Digite a nova Idade:");
                idade = Scanner.nextInt();
                Scanner.nextLine();
            System.out.println("Digite o novo Email:");
                email = Scanner.nextLine();
                pessoa.editarPessoa(nome, idade, email);
                System.out.println("\nCadastro atualizado com sucesso.\n");
           
            } else {
            System.out.println("\nNenhuma pessoa cadastrada.\n");
        }
            break;

            case 3:
            if (pessoa != null) {
                pessoa.apresentarPessoa();
            } else {
                System.out.println("\nNenhuma pessoa cadastrada.\n");
            }

            break;

            case 4:
            if (pessoa != null) {
                pessoa.excluirPessoa();                
            } else {
                System.out.println("\n nenhuma pessoa foi cadastrada.\n");
            }

            break;

            case 5:
            System.out.println("\n\nsaindo...\n");
            break;

            default: System.out.print("\n\n\nOpção incorreta, coloque uma opção válida\n");
           
            break;
        }
        
    }
    while (op != 5);
        Scanner.close();
}

}
