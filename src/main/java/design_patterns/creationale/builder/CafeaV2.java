package design_patterns.creationale.builder;

public class CafeaV2 {


    private TipCafea tipCafea;
    private boolean cuLapte;
    private boolean cuZahar;
    private String dimensiune;

    public CafeaV2(TipCafea tipCafea) {
        this.tipCafea = tipCafea;

    }

    public CafeaV2 setTipCafea(TipCafea tipCafea) {
        this.tipCafea = tipCafea;
        return this;
    }

    public CafeaV2 setCuLapte(boolean cuLapte) {
        this.cuLapte = cuLapte;
        return this;
    }

    public CafeaV2 setCuZahar(boolean cuZahar) {
        this.cuZahar = cuZahar;
        return this;
    }

    public CafeaV2 setDimensiune(String dimensiune) {
        this.dimensiune = dimensiune;
        return this;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CafeaV2{");
        sb.append("tipCafea=").append(tipCafea);
        sb.append(", cuLapte=").append(cuLapte);
        sb.append(", cuZahar=").append(cuZahar);
        sb.append(", dimensiune='").append(dimensiune).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
