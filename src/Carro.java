public class Carro extends Thread{
    private BombaCombustivel    bombaCombustivel;
    private String              modelo;
    private int                 idCar;
    private int                 tanqueCombustivel;
    
    public Carro (String m, int id, BombaCombustivel bombaCombustivel){
    this.modelo             = m;
    this.idCar              = id;
    this.tanqueCombustivel  = 40;
    this.bombaCombustivel   = bombaCombustivel;
    }

    @Override
    public void run(){
        System.out.println(this.modelo + " COMEÇOU A RODAR!");
        
        while(getTanqueCombustivel() > 0){
           try{
               Thread.sleep(500);
               System.out.println(this.modelo
                                    + " - " 
                                    + this.idCar
                                    + " - " 
                                    + this.getTanqueCombustivel()
                                    + " l");
                setTanqueCombustivel(getTanqueCombustivel() - 1);  
                if(this.tanqueCombustivel <= 10){
                    System.out.println(this.modelo + "PRECISA ABASTECER!");
                    bombaCombustivel.abastecer(this);
                }
           } catch (InterruptedException ex){
                
           }
    }
        System.out.println(this.modelo + "FICOU SEM COMBUSTÍVEL!");
    
}
    public void setTanqueCombustivel(int qtde){
        this.tanqueCombustivel = qtde; 
   }

    /**
     * @return the tanqueCombustivel
     */
    public int getTanqueCombustivel() {
        return tanqueCombustivel;
    }
    
}
