package day_2;

public class ques2_login {
	public static void main (String[] args) {
		String correctusername = "dev";
		String corectpass = "112233";
		
		String user= "dev";
	    String pass="112233";
	    if(user.equals(correctusername)) {
	    	if(pass.equals(corectpass)) {
	    		System.out.println("login Successfully");
	    	}
	    	else {
	    		System.out.println("wrong password");
	    		
	    	}
	    }
	    else {
	    	System.out.println("wrong username");
	    }
	}

}
