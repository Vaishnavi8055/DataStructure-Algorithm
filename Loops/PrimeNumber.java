class PrimeNumber {
    
    public static void main(String[] args) {
        
        boolean isNotPrime = false;

        int tocheck = 10;
        // 2

        if(tocheck == 2){
            System.out.print(tocheck + " is a Prime Number");
        }

        for(int i=2 ; i<tocheck ; i++){
            if(tocheck % i == 0){
              isNotPrime = true; 
              break;
            }
        }

        if (isNotPrime) {
            System.out.print(tocheck + " is not Prime Number");
        } else {
            System.out.print(tocheck + " is a Prime Number");
        }
    }
}
