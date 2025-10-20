package application;

public class Superior {
	 protected double n1, n2, n3, media;
	    
	    public void SetNotas(double n1, double n2, double n3){
	        this.n1 = n1;
	        this.n2 = n2;
	        this.n3 = n3;
	    }
	    
	    public double CalculaMedia(){
	        media = (this.n1 * 0.35 + this.n2 * 0.5 + this.n3 * 0.15);
	        return media;
	    }    
}
