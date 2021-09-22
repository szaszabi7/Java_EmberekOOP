package hu.petrik.emberekoop;

public class Ember {
    private String nev;
    private String szulDatum;
    private String szulHely;

    public Ember(String nev, String szulDatum, String szulHely) {
        this.nev = nev;
        this.szulDatum = szulDatum;
        this.szulHely = szulHely;
    }

    public int getSzuletesiEv(){
        String szuletesiEvStringben = this.szulDatum.substring(0,4);
        return Integer.parseInt(szuletesiEvStringben);
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %s", this.nev, this.szulDatum, this.szulHely);
    }
}
