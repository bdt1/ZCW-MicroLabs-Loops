package io.zipcoder.microlabs.mastering_loops;


public class Shapes {

    public String triangle(){
    	String response = "*** Output ***\ntriangle()";   	
    	for(int x = 0; x <= 4; x++) {
			response += "\n";
    		for(int y = 0; y <= x; y++){
    	response += "*";
    }}
		return response;}

    
    
    public String tableSquare(){
        	String response = "*** Output ***\nsquare()";   	
        	for(int x = 1; x <= 4; x++) {
    			response += "\n|";
        		for(int y = 1; y <=4; y++){
        	response += x * y + "|";
        }}
    		return response;}
    	
    	
    	

    public String tableSquares(int n){
    	String response = "*** Output ***\nsquares()";   	
    	for(int x = 1; x <= n; x++) {
			response += "\n|";
    		for(int y = 1; y <=n; y++){
    	response += x * y + "|";
    }}
    	
		return response;}
}
