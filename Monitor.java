public class Monitor extends ComponentDecorator{
    Computer computer;
    public Monitor(Computer c){
        this.computer=c;

    }
    public String properties(){
        return computer.properties() + " - Monitor";
    }

    public int cost(){
        return computer.cost()+ 170;
    }
    
}