public class Game{
public static  void showGameTitle(){
System.out.println("Welcome to Adventure Quest!");
}
public static void showGameRules(){
System.out.println("Rules:");
System.out.println("Rules:\n 1. Collect coins\n 2.Avoid obstacles\n 3. Reach the goal ");
}
public static void showLoadingScreen(){
System.out.println("Loading game... Please wait");
}
public static void main(String [] args){
 showGameTitle();
 showGameRules();
 showLoadingScreen();
}
}
