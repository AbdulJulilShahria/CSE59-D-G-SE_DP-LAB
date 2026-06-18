

interface Clickable{
    void onClick();
}
class Button implements Clickable{
    @Override
    public void onClick(){
        System.out.println("Button was cliked");
    }
}
 public class Main7{
     public static void main(String[] args) {
         Button btn = new Button ();
         btn.onClick();
     }
 }
