public class App {
    public boolean isPrime(long number){
        if(number == 2){
            return true;
        }
        if(number %2==0){
            return false;
        }
        for(long i=3;i*i<=number;i+=2){
            if(number %i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        if(args.length<1||args.length>1){
            System.out.println("Please input one single number as the program argument.");
            System.exit(0);
        }
    
    App appObj = new App();
    try {
        long input = Long.parseLong(args[0]);
        System.out.println(appObj.isPrime(input));
        
    } catch (Exception e) {
        System.out.println("please input a valid number as a program argument.");
    }
}
}

