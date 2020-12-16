public class PB{
  private String Pluggar;  //H�ller reda p� vilka bokst�ver som byter plats
  private PB(){

  }
  static public PB PluggInitiering(String PluggarInstallning){ //PluggarInstallning �r konfigurationen av pluggarna
    PB returner = new PB();
    returner.Pluggar=PluggarInstallning;					//Om a och c sitter ihop samt d och h ser Stringen ut
    return returner;
  }												//PluggarInstallning=acdh   osv.
  public char Kryptera(char BokstavIn){ //Funktion som kollar om pluggbr�dan �ndrar bokst�ver
  	for(int b=0;b<Pluggar.length()-1;b+=2){		//b blir tv� st�rre varje g�ng, eftersom annars hade f�rsta bokstaven i ett par �ndrats f�rst till den andra och sen tillbaka
  		if(BokstavIn==Pluggar.charAt(b)){
        return Pluggar.charAt(b+1); //Ifall den matchar �ndras bokstaven till den andra i paret
      }
  		if(BokstavIn==Pluggar.charAt(b+1)) {
        return Pluggar.charAt(b);
      } //Else if f�r att bokst�ver inte skall �ndras tillbaka
  	}
  	return BokstavIn;
  }
}
