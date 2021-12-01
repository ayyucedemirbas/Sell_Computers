public class HardDisk extends ComponentDecorator{
    Computer computer;
    public HardDisk(Computer c){
        this.computer=c;

    }
    public String properties(){
        return computer.properties() + " - HardDisk";
    }

    public int cost(){
        return computer.cost()+ 120;
    }
    
}