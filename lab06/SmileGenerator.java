//Patrick McGuire
//Lab 06
//Smile Generator Java Program 

public class SmileGenerator{
    public static void main(String [] args){
        for (int i = 0; i < 5; i++){
            System.out.print(":)");
        }
        System.out.println(" ");
        int i = 0;
        do{
            System.out.print(":)");
            i++;
        } while (i < 5);
        System.out.println(" ");
        int j = 0;
        while (j < 5){
            System.out.print(":)");
            j++;
        }
        System.out.print(" ");
        int random =(int) (Math.random()*99) + 1;
        for (i = 0; i < random; i++){
            System.out.print(":)");
        }
        System.out.println("  ");
        int count = 0;
        for (i = 0; i < random; i++){
            System.out.print(":)");
            count++;
            if (count > 30){
                System.out.println(" ");
                count = 0;
            }
        }
        System.out.println(" ");
        for (i = 0; i < 4; i++){
            System.out.print(":)")
            
        }
}
}
