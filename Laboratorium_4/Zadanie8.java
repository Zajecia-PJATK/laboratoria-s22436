enum RodzajSilnika {
    DIESEL, BENZYNA
}

abstract class Maszyna{
    protected String marka, nazwa, pojemnoscSilnika;
    protected RodzajSilnika rodzajSilnika;
}

class Kosiarka extends Maszyna{
    private boolean czyMelekser, czyNaped;
    private int liczbaOstrzy;

    public Kosiarka(String marka, String nazwa, String pojemnoscSilnika, RodzajSilnika rodzajSilnika, boolean czyMelekser, boolean czyNaped, int liczbaOstrzy) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.rodzajSilnika = rodzajSilnika;
        this.czyMelekser = czyMelekser;
        this.czyNaped = czyNaped;
        this.liczbaOstrzy = liczbaOstrzy;
    }

    public void wyswietl() {
        System.out.println("marka: '" + marka + '\'' +
                ", nazwa: '" + nazwa + '\'' +
                ", pojemnoscSilnika: '" + pojemnoscSilnika + '\'' +
                ", rodzajSilnika: " + rodzajSilnika +
                ", czyMelekser: " + czyMelekser +
                ", czyNaped: " + czyNaped +
                ", liczbaOstrzy: " + liczbaOstrzy);
    }

    public boolean isCzyMelekser() {
        return czyMelekser;
    }

    public void setCzyMelekser(boolean czyMelekser) {
        this.czyMelekser = czyMelekser;
    }

    public boolean isCzyNaped() {
        return czyNaped;
    }

    public void setCzyNaped(boolean czyNaped) {
        this.czyNaped = czyNaped;
    }

    public int getLiczbaOstrzy() {
        return liczbaOstrzy;
    }

    public void setLiczbaOstrzy(int liczbaOstrzy) {
        this.liczbaOstrzy = liczbaOstrzy;
    }
}