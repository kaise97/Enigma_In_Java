public class Rotorer{//Funktion som krypterar p� tillbakav�gen efter reflektorn
	private String RotorIn,RotorUt;
  private Rotorer(){

  }
    static public Rotorer RotorInitiering(int Rotor){ //Funktion som skapar den beh�vda rotorn eller reflektorn
      Rotorer returner = new Rotorer();
    	if(Rotor==1){
    		returner.RotorIn="RSTUVWXYZABCDEFGHIJKLMNOPQ"; //Input som skall krypteras
    		returner.RotorUt="USPAIBRCJEKMFLGDQVZNTOWYHX"; //Krypterad output
    	}
    	if(Rotor==2){
    		returner.RotorIn="FGHIJKLMNOPQRSTUVWXYZABCDE";
    		returner.RotorUt="IRUXBLHWTMCQGZNPYFVOEAJDKS";
    	}
    	if(Rotor==3){
    		returner.RotorIn="WXYZABCDEFGHIJKLMNOPQRSTUV";
    		returner.RotorUt="USQOBDFHJLCPRTXVZNYEIWGAKM";
    	}
    	if(Rotor==4){
    		returner.RotorIn="KLMNOPQRSTUVWXYZABCDEFGHIJ";
    		returner.RotorUt="UIRHXLNFTGKDCMWBESOVPZJAYQ";
    	}
    	if(Rotor==5){
    		returner.RotorIn="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    		returner.RotorUt="VZBRGITYUPSDNHLXAWMJQOFECK";
    	}
    	if(Rotor==6){
    		returner.RotorIn="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    		returner.RotorUt="JPGVOUMFYQBENHZRDKASXLICTW";
    	}
    	if(Rotor==7){
    		returner.RotorIn="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    		returner.RotorUt="NZJHGRCXMYSWBOUFAIVLPEKQDT";
    	}
    	if(Rotor==8){
    		returner.RotorIn="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    		returner.RotorUt="FKQHTLXOCBJSPDZRAMEWNIUYGV";
    	}
    	if(Rotor==1001){			//Reflektor 1
    		returner.RotorIn="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    		returner.RotorUt="EJMZALYXVBWFCRQUONTSPIKHGD";
    	}
    	if(Rotor==1002){			//Reflektor 2
    		returner.RotorIn="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    		returner.RotorUt="YRUHQSLDPXNGOKMIEBFZCWVJAT";
    	}
			return returner;
    }

    public char Kryptera(char BokstavIn,int RotorPos){
    	for(int z=0;z<26;z++){
    		if(BokstavIn==RotorIn.charAt(z)){
    			if(z+RotorPos>25){
    				return RotorUt.charAt(z+RotorPos-26);
    			}
    			else return RotorUt.charAt(z+RotorPos);
    		}
    	}
			return BokstavIn;
    }
    public char KrypteraTillbaka(char BokstavIn,int RotorPos){
    	for(int z=0;z<26;z++){
    		if(BokstavIn==RotorUt.charAt(z)){
    			if(z-RotorPos<0){
    				return RotorIn.charAt(z-RotorPos+26);
    			}
    			else return RotorIn.charAt(z-RotorPos);
    		}
    	}
			return BokstavIn;
    }
}
