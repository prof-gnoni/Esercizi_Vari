package esercizi.gestionestringhe;

public class GestioneMessaggio {
    public static void main(String[] args) {
        // Test 1: Contare le vocali
        Messaggio msg1 = new Messaggio("Esercitazione Java");
        System.out.println("Testo: " + msg1.getTesto());
        System.out.println("Numero di vocali: " + msg1.contaVocali());
        System.out.println("Testo invertito: " + msg1.invertiTesto());
        System.out.println("-----------------------------------");

        // Test 2: Palindromo (Anna)
        Messaggio msg2 = new Messaggio("Anna");
        System.out.println("Testo: " + msg2.getTesto());
        System.out.println("È palindromo? " + msg2.isPalindromo()); // true
        System.out.println("-----------------------------------");

        // Test 3: Censura
        Messaggio msg3 = new Messaggio("Oggi il capo è molto arrabbiato. Attenti al capo!");
        System.out.println("Testo originale: " + msg3.getTesto());
        System.out.println("Testo censurato: " + msg3.censura("capo"));
    }
}
