public class Main {

    public static void main(String[] args) {
	// tam bölenlerinin toplamı kendisine eşit olan sayılara denir(6-> 3+2+1+)
        int number=29;
        int total=0;

        for(int i=1;i<number;i++){
            if(number%i==0){
                 total+=i;
            }
        }

        if(number==total){
            System.out.println("Sayı mükemmel sayıdır.");
        }else{
            System.out.println("Sayı mükemmel sayı değildir.");
        }
}
}
