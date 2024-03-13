/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Answers;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tang Chun Xuan
 */
public class StatProgram {
    private ArrayList<Integer> scoreList = new ArrayList<>();
  private Scanner scanner = new Scanner(System.in);
  
  
  public void addItem() {
    int input=0;
    System.out.print("\nEnter new item to add: ");
    do{
        int newItem = scanner.nextInt();
        if(input>=0){
            scoreList.add(newItem);
        }else{
            break;
        }
    
    }while(input>=0);
    
  }
  
  public void lowestScore(){
      int temp=scoreList.get(0);
      for(int i=0;i<scoreList.size();i++){
          if(temp>scoreList.get(i)){
              temp=scoreList.get(i);
          }
      }
      System.out.println("lowest:"+temp);
  }
  
  public void highestScore(){
      int temp=scoreList.get(0);
      for(int i=0;i<scoreList.size();i++){
          if(temp<scoreList.get(i)){
              temp=scoreList.get(i);
          }
      }
      System.out.println("Highest:"+temp);
  }
  
  public void AverageScore(){
      int sum=0;
      for(int i=0;i<scoreList.size();i++){
       sum+=scoreList.get(i);
      }
      System.out.println("average: "+sum);
  }
  
  public void choose(){
      for (int i = 0; i < scoreList.size(); i++) {
      System.out.printf("%3d. %d\n", (i + 1), scoreList.get(i));
    }
  }
  
  public static void main(String[] args) {
    StatProgram s =new StatProgram();
    s.addItem();
    s.lowestScore();
    s.highestScore();
    
  }
    
}
