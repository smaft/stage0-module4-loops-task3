package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
       String nb = Integer.toString(t);
       int sum=0;
       int number=0;
       for(int i=0;i<=nb.length()-1;++i){
        char character=nb.charAt(i);
        number=Character.getNumericValue(character);
        sum=sum+number;
    }
    System.out.println("Sum of digits of Entered Number:"+sum);
    }
}