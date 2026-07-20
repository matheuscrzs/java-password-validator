import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua Senha: ");
        String senha = entrada.next();

        if (verificaSenha(senha)) {
            System.out.println("Sua senha atende os requisitos de segurãnça !");

        }

        else {
            System.out.println("Senha invalida, não atende os requisitos de segurãnça. ");
        }
        int força = point(senha);

        if (força < 3) {
            System.out.println("Senha Fraca");
        }
        if (força >= 3 && força <= 5) {
            System.out.println("Senha Moderada");
        }
        if (força >= 6 && força <= 9) {
            System.out.println("Senha Forte");
        }
        if (força >= 10 && força <= 12) {
            System.out.println("Senha Muito forte");
        }
        if (força >= 13 && força <= 16) {
            System.out.println("Senha Excelente");
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

        for (char c : senha.toCharArray()) {
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

        }
        if (!letraMinuscula) {
            System.out.println("Sua senha precisa de ao menos uma letra minúscula !");
        }
        if (!digito) {
            System.out.println("Sua senha precisa de ao menos um número !");
        }
        if (!CharEspec) {
            System.out.println("Sua senha precisa de ao menos um caractere especial ! (Ex: @, #, _, &). ");
        }

        return letraMaiuscula && letraMinuscula && digito && CharEspec;
    }

    public static int point(String senha) {
        int mai = 0;
        int min = 0;
        int num = 0;
        int espe = 0;
        int contador = 0;

        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) {
                mai += 1;
            } else if (Character.isLowerCase(c)) {
                min += 1;
            } else if (Character.isDigit(c)) {
                num += 1;
            } else if (!Character.isLetterOrDigit(c)) {
                espe += 1;
            }

        }
        if (mai == 2) {
            contador += 1;
        }
        if (mai == 3) {
            contador += 2;
        }
        if (mai >= 4) {
            contador += 4;
        }

        if (min == 7) {
            contador += 1;
        }
        if (min == 8) {
            contador += 2;
        }
        if (min >= 9) {
            contador += 4;
        }

        if (num == 2) {
            contador += 1;
        }
        if (num == 3) {
            contador += 2;
        }
        if (num >= 4) {
            contador += 4;
        }

        if (espe == 2) {
            contador += 1;
        }
        if (espe == 3) {
            contador += 2;
        }
        if (espe >= 4) {
            contador += 4;
        }

        return contador;
    }

}
