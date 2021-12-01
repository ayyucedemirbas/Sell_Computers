public class DVDRom extends ComponentDecorator{
    Computer computer;
    public DVDRom(Computer c){
        this.computer=c;

    }
    public String properties(){
        return computer.properties() + " - DVDRom";
    }

    public int cost(){
        return computer.cost()+80;
    }
    
}