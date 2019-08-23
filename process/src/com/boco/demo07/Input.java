package com.boco.demo07;

public class Input implements Runnable {
	private Resource r ;
	
	public Input(Resource r){
		this.r = r;
	}
	
	public void run() {
		int i = 0 ;
		while(true){
		  synchronized(r){
			 
			    if(r.flag){
			    	try{r.wait();}catch(Exception ex){}
			    }	  
				if(i%2==0){
					r.name = "as";
					r.sex = "s";
				}else{
					r.name = "lisi";
					r.sex = "nv";
				}
				r.flag = true;
				r.notify();
		  }
			i++;
		}
	}

}
