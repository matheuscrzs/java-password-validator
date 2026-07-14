import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua Senha: ");
        String senha = entrada.next();

        if (verificaSenha(senha)) {
            System.out.println("Sua senha atende os requisitos de segurãnça !");

        } else {
            System.out.println("Senha invalida, não atende os requisitos de segurãnça. ");
        }

    }

    public static boolean verificaSenha(String senha) {
      if (senha.length() < 8) {
            System.out.println("Sua senha precisa ter no mínimo 8 digitos. ");
            return false;
        }
        boolean letraMaiuscula = false;
    boolean letraMinuscula = false;
    boolean digito = false;
    boolean CharEspec = false;

    for(
    char c:senha.toCharArray())
    {
        if (Character.isUpperCase(c)) {
            letraMaiuscula = true;
        } else if (Character.isLowerCase(c)) {
            letraMinuscula = true;
        } else if (Character.isDigit(c)) {
            digito = true;
        } else if (!Character.isLetterOrDigit(c)) {
            CharEspec = true;
        }
        

    }


         
        if (!letraMaiuscula) {
            System.out.println("Sua senha precisa de ao menos uma letra maiúscula !");
            
        } if (!letraMinuscula) {
            System.out.println("Sua senha precisa de ao menos uma letra minúscula !");
        } if (!digito) {
            System.out.println("Sua senha precisa de ao menos um número !");
        } if (!CharEspec) {
            System.out.println("Sua senha precisa de ao menos um caractere especial ! (Ex: @, #, _, &). ");
        }

        
    return letraMaiuscula&&letraMinuscula&&digito&&CharEspec;

}

}