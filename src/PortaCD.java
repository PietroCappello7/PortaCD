public class PortaCD {
    private CD[] dischi;
    private int max_num_cd;

    

    public PortaCD(int n) {
        max_num_cd = n;
        dischi = new CD[max_num_cd];
    }

    public int setCD(int pos, CD cdInserire) {
        int restituzione = -1;
        if (pos >= 0 && pos < max_num_cd) {
            if (dischi[pos] == null) {
                dischi[pos] = new CD(cdInserire);
                restituzione = pos;
            } else {
                restituzione = -2;
            }
        } else {
            restituzione = -2;
        }
        return restituzione;
    }

    public CD getCD(int pos) {
        if (pos >= 0 && pos < max_num_cd) {
            if (dischi[pos] != null) {
                return new CD(dischi[pos]);
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    public int killCD(int pos) {
        int restituzione = -1;
        if (pos >= 0 && pos < max_num_cd) {
            if (dischi[pos] != null) {
                dischi[pos] = null;
                restituzione = pos;

            } else {
                restituzione = -2;
            }
        } else {
            restituzione = -2;
        }
        return restituzione;
    }

    public int getNumMaxDischi() {
        return max_num_cd;
    }

    public int getN() {
        int n = 0;
        for (int i = 0; i < max_num_cd; i++) {
            if (dischi[i] != null) {
                n += 1;
            }
        }
        return n;
    }

    public int cercaCDPerTitolo(String titolo) {
        int restituzione = -1;
        boolean trovato = false;
        int i = 0;
        while (i < max_num_cd && !trovato) {
            if (dischi[i] != null && dischi[i].getTitolo().toLowerCase().equals(titolo.toLowerCase())) {
                restituzione = i;
                trovato = true;
            }
            i++;
        }
        if(trovato == false){
            restituzione = -2;
        }
        return restituzione;
    }

    public int confrontaTuttaCollezione(PortaCD portacdd){
        int pos = 0;
        int varuscita = -1;
        boolean trovato = true;
        while (trovato && pos < max_num_cd) {
            while (trovato && pos < max_num_cd) {
                if(dischi[pos] != null && portacdd.getCD(pos) != null){
                    if(dischi[pos].equals(portacdd.getCD(pos))){
                        trovato = false;
                        varuscita = pos;
                    }
                }
            }pos++;
        }pos++;
        return varuscita;
    }
        
    public int confrontaCollezione(PortaCD portaCDiProva) {
        int numeroCDComune = 0;
        for (int i = 0; i < max_num_cd; i++) {
            for (int j = 0; j < portaCDiProva.getNumMaxDischi(); j++) {
                if (dischi[i] != null && portaCDiProva.getCD(j) != null) {
                    if (dischi[i].equals(portaCDiProva.getCD(j))) {
                        numeroCDComune++;
                    }
                }
            }
        }
        return numeroCDComune;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < max_num_cd; i++) {
            if (dischi[i] != null) {
                s += "disco " + i + " = " + dischi[i].toString() + "\n";
            } else {
                s += "posto n " + i + "\n";
            }
        }
        return s;
    }
}