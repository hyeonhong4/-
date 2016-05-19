import java.lang.*;
public class zoo{

  public static void main(String[] args){
    Animal[] zoo = new Animal[5];
    zoo[0]=new Animal("ªÁ¿⁄","æÓ»Ô");
    zoo[1]=new Animal("∞ÌæÁ¿Ã","æﬂøÀ");
    zoo[2]=new Animal("¡„","®t®t");
    zoo[3]=new Animal("∞≥","∏€∏€");
    zoo[4]=new Animal("µ≈¡ˆ","≤‹≤‹");
    
    all_sounds(zoo);
    
    
  }
  
  
  public static void all_sounds(Animal[] zoo){
    for(int i=0;i<=4;i++){
    System.out.println("The "+zoo[i].name+" gose "+zoo[i].sound);
                         }
  }


}

