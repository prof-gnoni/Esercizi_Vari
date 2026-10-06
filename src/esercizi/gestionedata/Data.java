package esercizi.gestionedata;
public class Data {
    // --- ATTRIBUTI ---
    private int giorno;
    private int mese;
    private int anno;

    // --- COSTRUTTORI ---

    // Costruttore di default (crea la data 1/1/1970)
    public Data() {
        this.giorno = 1;
        this.mese = 1;
        this.anno = 1970;
    }

    // Costruttore con parametri
    public Data(int giorno, int mese, int anno) {
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }

    // --- GETTERS ---
    public int getGiorno() {
        return giorno;
    }

    public int getMese() {
        return mese;
    }

    public int getAnno() {
        return anno;
    }

    // --- SETTERS ---
    public void setGiorno(int giorno) {
        this.giorno = giorno;
    }

    public void setMese(int mese) {
        this.mese = mese;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    // --- METODI DI VISUALIZZAZIONE ---
    public void visualizza() {
        System.out.printf("%02d/%02d/%04d%n", giorno, mese, anno);
    }

    public String getNomeMese() {
        String[] nomiDeiMesi = {
                "Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno",
                "Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre"
        };

        if (this.mese >= 1 && this.mese <= 12) {
            return nomiDeiMesi[this.mese - 1];
        }
        return "Mese non valido";
    }

    // --- METODI LOGICI E DI CONTROLLO ---
    public boolean isLeapYear() {
        return (anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0);
    }

    public int giorniNelMese() {
        switch (this.mese) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYear()) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 31;
        }
    }

    public boolean isValida() {
        if (anno < 1 || mese < 1 || mese > 12 || giorno < 1) {
            return false;
        }
        return giorno <= giorniNelMese();
    }

    // --- METODI DI MANIPOLAZIONE E CONFRONTO ---
    public void giornoSuccessivo() {
        this.giorno++;

        if (this.giorno > giorniNelMese()) {
            this.giorno = 1;
            this.mese++;

            if (this.mese > 12) {
                this.mese = 1;
                this.anno++;
            }
        }
    }

    public boolean isPrimaDi(Data altraData) {
        if (this.anno < altraData.getAnno()) {
            return true;
        } else if (this.anno == altraData.getAnno()) {
            if (this.mese < altraData.getMese()) {
                return true;
            } else if (this.mese == altraData.getMese()) {
                return this.giorno < altraData.getGiorno();
            }
        }
        return false;
    }
}