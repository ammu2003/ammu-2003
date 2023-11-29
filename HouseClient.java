abstract class HouseTemplate
{
 //template method public final void buildHouse()
 { 
 buildFoundation();
  buildPillars();  
  buildWalls();
  buildWindows(); 
 System.out.println("house construction done");
 } //default implementation
 public void buildFoundation()
 {
  System.out.println("concreate cemnet and sand"); 
}
 public abstract void buildPillars();
 public abstract void buildWalls();
 public abstract void buildWindows();
}
 class WoodenHouse extends HouseTemplate
{ public void buildPillars()
 { 
 System.out.println("wooden pillars");
 }
 public void buildWalls()
 {  
System.out.println("wooden walls");
 } 
public void buildWindows()
 { 
 System.out.println("wooden windows");
 }
}

class GlassHouse extends HouseTemplate{
  public void buildPillars()
 { 
 System.out.println("glass pillars");
 }
 public void buildWalls()
 {
  System.out.println("glass walls");
 }
 public void buildWindows() {
  System.out.println("glass windows");
 }
}
class HouseClient1{
 public static void main(String args[]) {
 System.out.println("Wooden house steps");
  HouseTemplate ht=new WoodenHouse();
  ht.buildHouse(); 
System.out.println("******************");
 System.out.println("Glass house steps");
 ht=new GlassHouse();
 ht.buildHouse();
 }
}