public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro e : EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + " -> " + e.getNome());
        }

        EstadoBrasileiro eb = EstadoBrasileiro.CEARA;
        System.out.println(eb.getSigla() + " -> " + eb.getNome());
    }
}
