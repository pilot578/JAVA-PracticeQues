public class AverageVarargs {
public static void main(String[] args){
System.out.println(average(1,43,2));

}
static double average(double...numbers){
    int sum = 0;
    for(double number : numbers){
       sum += number;
    }
    return sum/numbers.length;
}
}

