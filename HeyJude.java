public class HeyJude {	

	public static void main (String [] args) { 
	
		String a1 = ("Hey Jude");
		String b2 = (", don't");
		String c3 = ("make it bad");
		String d4 = ("be afraid");
		String e5 = ("let me down");
		String f6 = ("Take a sad song and make it better");
		String g7 = ("You were made to go out and get her");
		String h8 = ("You have found her, now go and get her");
		String i9 = ("Ṛemember to");
		String j10 = ("let her into you heart");
		String k11 = ("let her under your skin");
		String l12 = ("Then you");
		String m13 = ("can start");
		String n14 = ("begin");
		String o15 = ("to make it better");
		String p16 = ("better better better better better, oh"); //Cambie "waaa" por "oh" (como viene en la letra)
	    String r18 = ("na");
	    	 
		int p = 0;
		while (p<=7){
			if (p == 1 || p==6) {
				System.out.println(a1 + b2 +" "+ c3);
			}
			if (p==1 || p==6){
			 	System.out.println(f6);
			}

			if (p==4){
				System.out.println(a1 + " "+  b2 +" "+e5);
			}		

			if (p==4){
				System.out.println(h8);
			}	

			if (p==1 || p==4){
				System.out.println(i9 +" "+j10);
			}	
			if (p==1 || p==4){
				System.out.println(l12 +" "+m13 +" "+o15);
				System.out.println();
			}


				//Segundo Parrafo
			if (p==2){
				System.out.println(a1 +" "+b2 +" "+d4);
			}	
			if (p==2){
				System.out.println(g7);	
			}
			if (p==2 || p==6){
				System.out.println(i9 +" "+ k11);
			}		
			if (p==2){
				System.out.println(l12+" "+ n14 +" "+o15);
				System.out.println();
			}


			if (p==6){
				System.out.println(l12+" "+ n14 +" "+o15);
			}	


				//Tercer Parrafo
			if (p==3 || p==5 || p==7){
				int w=0; 
			    while (w<10){
					System.out.print(r18 +" ");
					w++;    	
			    }	
				if 	(p==3 || p==5){
					System.out.println();
					System.out.println();

				}   else{
					System.out.print(a1);
					System.out.println();	
				} 
				
			}			

				
			if (p==6){
				System.out.println(p16);
				System.out.println();
			}	

		

				 	


				
				
			


			




			p++;
		}	 	
			
    }
}