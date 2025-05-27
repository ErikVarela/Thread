public class Principal {

    public static void main(String[] args) {
        BombaCombustivel bombaFuel = new BombaCombustivel();
        Carro carro1 = new Carro("Nissa", 1,bombaFuel);
        carro1.start();
        
        Carro carro2 = new Carro("Toyota", 2,bombaFuel);
        carro2.start();
        
        Carro carro3 = new Carro("BMW", 3,bombaFuel);
        carro3.start();
        
        Carro carro4 = new Carro("Honda", 4,bombaFuel);
        carro4.start();
        
        Carro carro5 = new Carro("Volkswagen", 4,bombaFuel);
        carro5.start();
        
    }
    
}
