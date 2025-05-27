public class Carro extends Thread {
    private BombaCombustivel bombaCombustivel;
    private String modelo;
    private int idCar;
    private int tanqueCombustivel;

    public Carro(String modelo, int id, BombaCombustivel bombaCombustivel) {
        this.modelo = modelo;
        this.idCar = id;
        this.tanqueCombustivel = 40;
        this.bombaCombustivel = bombaCombustivel;
    }

    @Override
    public void run() {
        System.out.println(this.modelo + " COMEÇOU A RODAR!");

        while (getTanqueCombustivel() > 0) {
            try {
                Thread.sleep(500);

                System.out.println(this.modelo
                        + " - " + this.idCar
                        + " - " + getTanqueCombustivel() + " l");

                setTanqueCombustivel(getTanqueCombustivel() - 1);

                if (this.tanqueCombustivel <= 10) {
                    System.out.println(this.modelo + " PRECISA ABASTECER!");
                    bombaCombustivel.abastecer(this);
                }
            } catch (InterruptedException ex) {
                System.out.println("Erro na thread do carro: " + ex.getMessage());
            }
        }

        System.out.println(this.modelo + " FICOU SEM COMBUSTÍVEL!");
    }

    public void setTanqueCombustivel(int qtde) {
        this.tanqueCombustivel = qtde;
    }

    public int getTanqueCombustivel() {
        return tanqueCombustivel;
    }

    public String getModelo() {
        return this.modelo;
    }
}
