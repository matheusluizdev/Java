package application;

public class Tecnico extends Superior {
    
    public void SetNota(double n1, double n2, double n3){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    
    @Override
    public double CalculaMedia(){
        media = (this.n1 + this.n2 * 2 + this.n3 * 2) / 5;
        return media;
    }
    
}
