package esercizi.gestionestringhe;

public class Messaggio {
    // --- ATTRIBUTO ---
    private String testo;

    // --- COSTRUTTORE ---
    public Messaggio(String testo) {
        this.testo = testo;
    }

    // --- GETTER ---
    public String getTesto() {
        return testo;
    }

    // --- METODI OPERATIVI ---

    // 1. Conta le vocali usando charAt() e toLowerCase()
    public int contaVocali() {
        int contatore = 0;
        // Convertiamo tutto in minuscolo per semplificare i controlli
        String testoMinuscolo = testo.toLowerCase();

        for (int i = 0; i < testoMinuscolo.length(); i++) {
            char carattereCorrente = testoMinuscolo.charAt(i);

            if (carattereCorrente == 'a' || carattereCorrente == 'e' ||
                    carattereCorrente == 'i' || carattereCorrente == 'o' ||
                    carattereCorrente == 'u') {
                contatore++;
            }
        }
        return contatore;
    }

    // 2. Inverte la stringa leggendola dall'ultimo carattere al primo
    public String invertiTesto() {
        String testoInvertito = "";

        // Partiamo dall'ultimo indice (lunghezza - 1) e andiamo all'indietro fino a 0
        for (int i = testo.length() - 1; i >= 0; i--) {
            testoInvertito += testo.charAt(i); // Concateniamo i caratteri
        }

        return testoInvertito;
    }

    // 3. Controlla se è palindromo ignorando le maiuscole
    public boolean isPalindromo() {
        // Sfruttiamo il metodo che abbiamo già creato per ottenere la stringa al contrario
        String contrario = invertiTesto();

        // equalsIgnoreCase confronta due stringhe ignorando se sono maiuscole o minuscole
        return testo.equalsIgnoreCase(contrario);
    }

    // 4. Censura una parola specifica usando il metodo replace()
    public String censura(String parolaBannata) {
        // Generiamo una stringa di asterischi lunga quanto la parola da censurare
        String asterischi = "";
        for (int i = 0; i < parolaBannata.length(); i++) {
            asterischi += "*";
        }

        // Il metodo replace(vecchiaStringa, nuovaStringa) fa tutto il lavoro per noi
        return testo.replace(parolaBannata, asterischi);
    }
}
