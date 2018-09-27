package progra_class4;

public class PROGRA_Class4 {

    public static void main(String[] args) {
        //BREAK instruction
        int number = 20;
        int factorial = 1;
        for(int index=1;index<=number;index++){
            long factorialMax = factorial * index;
            if (factorialMax>1047483647){
                System.out.println("Limit exceeded on position:"+index);
                break;
            }else{
                factorial = factorial * index;
            }
        }
        System.out.println("Factorial is:"+factorial);
        
        //CONTINUE Instruction
        int money = 100; //meters
        int gas = 15; //litter
        while(money>0){
            System.out.println("Driving car");
            gas = gas - 6;
            if (gas>0){
                System.out.println("No refill needed");
                continue;
            }
            gas = 15;
            money = money - 17;
            System.out.println("Filling the tank");
            System.out.println("Current Money:"+money);    
        }   
    } 
}
