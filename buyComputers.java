public class buyComputers{
  public static void main(String[] args) {
      Computer c1 =new Computer();
      Computer c2 =new Computer();
      Computer c3 =new Computer();

      c1=new HardDisk(c1);
      System.out.print("c1 cost: "+ c1.cost());
      System.out.print("c1 properties: "+ c1.properties());

      c2=new HardDisk(c2);
      c2=new Monitor(c2);
      System.out.print("c2 cost: "+ c2.cost());
      System.out.print("c2 properties: "+ c2.properties());

      c3=new HardDisk(c3);
      c3=new Monitor(c3);
      c3=new DVDRom(c3);
      c3=new SoundCard(c3);
      System.out.print("c3 cost: "+ c3.cost());
      System.out.print("c3 properties: "+ c3.properties());
  }
    
}