package design_patterns.creationale.builder;

public class Cafea {

    private TipCafea tipCafea;
    private boolean cuLapte;
    private boolean cuZahar;
    private String dimensiune;

    private Cafea(TipCafea tipCafea, boolean cuLapte, boolean cuZahar, String dimensiune) {
        this.tipCafea = tipCafea;
        this.cuLapte = cuLapte;
        this.cuZahar = cuZahar;
        this.dimensiune = dimensiune;
    }

    public static class CafeaBuilder{

        private TipCafea tipCafea;
        private boolean cuLapte;
        private boolean cuZahar;
        private String dimensiune;

        public CafeaBuilder setTipCafea(TipCafea tipCafea) {
            this.tipCafea = tipCafea;
            return this;

        }

        public CafeaBuilder setCuLapte(boolean cuLapte) {
            this.cuLapte = cuLapte;
            return this;
        }

        public CafeaBuilder setCuZahar(boolean cuZahar) {
            this.cuZahar = cuZahar;
            return this;
        }

        public CafeaBuilder setDimensiune(String dimensiune) {
            this.dimensiune = dimensiune;
            return this;
        }

        public Cafea build(){

            return new Cafea(tipCafea,cuLapte,cuZahar,dimensiune);

        }

    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cafea{");
        sb.append("tipCafea=").append(tipCafea);
        sb.append(", cuLapte=").append(cuLapte);
        sb.append(", cuZahar=").append(cuZahar);
        sb.append(", dimensiune='").append(dimensiune).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
