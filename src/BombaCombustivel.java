public class BombaCombustivel {
    public void abastecer(Carro carro){
        System.out.println("Modelo " + carro.getModelo()+ 
            "Chegou para abastecer");
        try{
        Thread.sleep(2000);
        }catch(InterruptedException error){
        
        carro.setTanqueCombustivel(40);
        
        System.out.println("Modelo" + carro.getModelo() + "TERMINOU DE ABASTECER");
}
  
