import java.util.*;
public class zoo{

  public static void main(String[] args){
    int number = 0;
    int a = 0;
    while(a==0){
      try{
      Scanner my_zoo_number = new Scanner(System.in);
      System.out.println("What Animal Number?");
      number = my_zoo_number.nextInt();
      a=1;
    }catch(Exception e){
    System.out.println("Number");
    }
    }
    Animal[] zoo = new Animal[number];
    
    for(int i=0;i<zoo.length;i++){
    
    Scanner my_zoo_animal = new Scanner(System.in);
    System.out.println((i+1)+" - What Animal?");
    String my_animal = my_zoo_animal.nextLine();
    
    Scanner my_zoo_sound = new Scanner(System.in);
    System.out.println(my_animal+" What Sound?");
    String my_sound = my_zoo_sound.nextLine();
    
    zoo[i]=new Animal(my_animal,my_sound);
    
    }
    
    all_sounds(zoo);
  }
  
  
  public static void all_sounds(Animal[] zoo){
    for(int i=0;i<zoo.length;i++){
    System.out.println("The "+zoo[i].name+" gose "+zoo[i].sound);
                         }
  }


}
