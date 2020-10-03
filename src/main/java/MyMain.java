import java.util.concurrent.ThreadLocalRandom;
public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        int[] arr = new int[10000];
        int n = 0;
        int s = 0;        
        double total = 0;
        for(int i=0;i<10000;i++){
            for(int j=0;j<6;j++){
            	n = ThreadLocalRandom.current().nextInt(1, 7);
            	if(n==6){
            		s=1;
            		break;
            	}else{
            		s=0;
            	}            	
            }
            arr[i]=s;
        }
        for(int i=0; i<arr.length; i++){
        	total = total + arr[i];
        }
        double average = (total / arr.length)*100;
        return average;
    }     

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int[] arr = new int[10000];		
        double total = 0;
        for(int i=0;i<10000;i++){
        	int s = 0;       
            for(int j=0;j<12;j++){
            	int d = ThreadLocalRandom.current().nextInt(1, 7);
            	if(d==6) {
            		s++;
            	}
            	if(s==2) {
            		arr[i]+=1;
            		break;
            	}
            }
        }
        for(int i=0; i<arr.length; i++){
        	total = total + arr[i];
        }
        double average = total / arr.length*100;
        return average;
}

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int[] arr = new int[10000];
        double total = 0;
        for(int i=0;i<10000;i++){
        	int s = 0;       
            for(int j=0;j<18;j++){
            	int d = ThreadLocalRandom.current().nextInt(1, 7);
            	if(d==6) {
            		s++;
            	}
            	if(s==3) {
            		arr[i]+=1;
            		break;
            	}
            }
        }
        for(int i=0; i<arr.length; i++){
        	total = total + arr[i];
        }
        double average = total / arr.length*100;
        return average;
    }


    public static void main(String[] args) {
        System.out.println(probabilityOneSix());
        System.out.println(probabilityTwoSixes());
        System.out.println(probabilityThreeSixes());
    }
}
