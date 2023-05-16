import java.util.Scanner;
import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String yOrN;
    ArrayList<Integer> p1 = new ArrayList<>();
    ArrayList<Integer> p2 = new ArrayList<>();
    int sum1 = 0;
    int sum2 = 0;
    boolean p1Win = false;
    boolean p2Win = false;
    boolean tie = false;
    p1.add((int)(Math.random()*10)+1);
    p1.add((int)(Math.random()*10)+1);
    sum1+=p1.get(0);
    sum1+=p1.get(1);
    p2.add((int)(Math.random()*10)+1);
    p2.add((int)(Math.random()*10)+1);
    sum2+=p2.get(0);
    sum2+=p2.get(1);
    System.out.println("Player One Cards: "+p1.get(0)+", "+p1.get(1));
    System.out.println("Player Two Cards: "+p2.get(0)+", "+p1.get(1));
    System.out.println("Player One, would you like to hit?(Y/N) ");
    yOrN = input.nextLine();
    while(yOrN.equals("Y")){
      p1.add((int)(Math.random()*10)+1);
      sum1+=p1.get(p1.size()-1);
      if(sum1<=21){
      System.out.print("Player One Cards: "+p1.get(0)+", "+p1.get(1));
      for(int i = 2; i<p1.size();i++){
        System.out.print(", "+p1.get(i));
      }
      System.out.println();
      } else {
        p2Win = true;
        break;
      }
        System.out.println("Player One, would you like to hit?(Y/N) ");
        yOrN = input.nextLine();
    }
    if(!p2Win){
      System.out.println("Player Two Cards: "+p2.get(0)+", "+p2.get(1));
      System.out.println("Player Two, would you like to hit?(Y/N) ");
      yOrN = input.nextLine();
      while(yOrN.equals("Y")){
        p2.add((int)(Math.random()*10)+1);
        sum2+=p2.get(p2.size()-1);
        if(sum2<=21){
        System.out.print("Player Two Cards: "+p2.get(0)+", "+p2.get(1));
        for(int i = 2; i<p2.size();i++){
          System.out.print(", "+p2.get(i));
        }
        System.out.println();
        } else {
          p1Win = true;
          break;
        }
        System.out.println("Player Two, would you like to hit or stay?(Y/N) ");
        yOrN = input.nextLine();
    }
    }
    System.out.print("Final Player One Cards: ");
    for(int i = 0; i < p1.size();i++){
      if(i!=p1.size()-1){
        System.out.print(p1.get(i)+", ");
      } else{
        System.out.println(p1.get(i));
      }
    }
    System.out.print("Final Player Two Cards: ");
    for(int i = 0; i < p2.size();i++){
      if(i!=p2.size()-1){
        System.out.print(p2.get(i)+", ");
      } else{
        System.out.println(p2.get(i));
      }
    }
    if(!p2Win&&sum1>sum2){
      p1Win = true;
    } else if(!p1Win&&sum2>sum1){
      p2Win = true;
    } else {
      tie = true;
    }
    if(p1Win){
      System.out.println("Player One Wins");
    } else if(p2Win){
      System.out.println("Player Two Wins");
    } else if(tie){
      System.out.println("Tie! ");
    }
  }
}