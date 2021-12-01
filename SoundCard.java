public class SoundCard extends ComponentDecorator{
    Computer computer;
    public SoundCard(Computer c){
        this.computer=c;

    }
    public String properties(){
        return computer.properties() + " - Sound Card";
    }

    public int cost(){
        return computer.cost()+ 170;
    }
    
}