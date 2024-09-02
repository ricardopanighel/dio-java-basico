package edu.ricardopanighel.modulo1;

public class MinhaClasse {
    public static void main (String[] args) {
        String primeiroNome = "Ricardo";
        String segundoNome = "Panighel Lazarini";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
        public static String nomeCompleto (String primeiroNome, String segundoNome) {
            return primeiroNome.concat(" ").concat(segundoNome);
        }

}
