public class CD {
    private String titolo;
    private String autore;
    private int numeroBrani;
    private int durata;

    public CD(String titolo, String autore, int brani, int durata) {
        this.titolo = titolo;
        this.autore = autore;
        this.numeroBrani = brani;
        this.durata = durata;
    }

    public CD(CD cd) {
        this(cd.titolo, cd.autore, cd.numeroBrani, cd.durata);
    }
    
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getBrani() {
        return numeroBrani;
    }

    public void setBrani(int brani) {
        this.numeroBrani = brani;
    }

    public int getDurata() {
        if (durata > 0) {
            return durata;
        } else {
            return -2;
        }
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public boolean equals(CD altroCD) {
        return this.titolo.equals(altroCD.getTitolo()) &&
                this.autore.equals(altroCD.getAutore()) &&
                this.numeroBrani == altroCD.getBrani() &&
                this.durata == altroCD.getDurata();
    }

    public int compareDurata(CD c) {
        int verifica = 0;
        if (this.durata > c.getDurata())
            verifica = 1;
        else if (this.durata < c.getDurata())
            verifica = -1;

        return verifica;
    }

    public String toString() {
        String s = "";
        s = "titolo: " + this.titolo + " Autore: " + this.autore + " numero brani: " + numeroBrani
                + " durata complessiva: " + durata;
        return s;
    }

}
