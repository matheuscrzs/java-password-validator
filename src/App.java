import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua Senha: ");
        String senha = entrada.next();

        if (verificaSenha(senha)) {
            System.out.println("Sua senha segue os padrões !");

        } else {
            System.out.println("Sua invalida, não atende os padroes");
        }

    }

    public static boolean verificaSenha(String senha) {
        if (senha.length() < 8) {
            System.out.println("Senha muito curta!!!");
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

    return letraMaiuscula&&letraMinuscula&&digito&&CharEspec;
} 
}