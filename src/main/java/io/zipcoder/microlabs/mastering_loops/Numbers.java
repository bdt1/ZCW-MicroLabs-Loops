package io.zipcoder.microlabs.mastering_loops;

public class Numbers {


	public String oneToTen(){
    	String numbers = "*** Output ***\noneToTen()";
    			for(int i = 1; i<=10; i++) {	
    			numbers += "\n" + i;}
        return numbers;
    }

    public String oddNumbers(){
    	String numbers = "*** Output ***\noddNumbers()";
		for(int i = 1; i<=20; i++) {	
		if (i % 2 == 1)
			numbers += "\n" + i;}
		return numbers;
    
    }

    public String squares(){
    	String numbers = "*** Output ***\nsquares()";
		for(int i = 1; i<=10; i++) {	
			numbers += "\n" + (i*i);}
		return numbers;
    }

    public String random4(){
    	String numbers = "";
		for(int i = 1; i<=4; i++) {	
			int random = (int)(Math.random() * 10 + 1);
			numbers += "\n" + random;}
		return numbers;
    }

    public String even(int n){
    	String numbers = "*** Output ***\neven(" + (n) + ")";
		for(int i = 1; i<n; i++) {	
		if (i % 2 == 0)
			numbers += "\n" + i;}
		return numbers;
    
    }

    public String powers(int n){
    	String numbers = "*** Output ***\npowers(" + (n) + ")";
    	int number = 2; 
        int i = 1;
        int result;
        while(i <= n) {
        	result = (int)Math.pow(number, i);
        	numbers += "\n" + result;
        	i++;  
        }      
        return numbers;
    	
	
    }

}
