public class Enigma{
	private int Rotor1Pos,Rotor2Pos,Rotor3Pos;
    private Rotorer Rotor1,Rotor2,Rotor3,Reflektor;
    private PB Pluggar;

	public Enigma(int nRotor1,int nRotor1Position,int nRotor2,int nRotor2Position,int nRotor3,int nRotor3Position,int nReflektor,String sPluggInstallningar){
		Rotor1= Rotorer.RotorInitiering(nRotor1); //Skapar objekt för rotorerna, reflektorn och Pluggbrädet
		Rotor2= Rotorer.RotorInitiering(nRotor2);
		Rotor3 = Rotorer.RotorInitiering(nRotor3);
		Reflektor = Rotorer.RotorInitiering(nReflektor);
		Pluggar = PB.PluggInitiering(sPluggInstallningar);
		Rotor1Pos=nRotor1Position;  //Sätter rotorernas position till rätt ställe.
		Rotor2Pos=nRotor2Position;
		Rotor3Pos=nRotor3Position;
	}
	public char Kryptera(char BokstavIn){ //Funktionen som krypterar eller dekrypterar text
		RotorSnurrare();		//I orginalet snurrar rotorerna innan bokstaven krypteras vilket efterliknas
		return Pluggar.Kryptera(
			Rotor1.KrypteraTillbaka(
			Rotor2.KrypteraTillbaka(
			Rotor3.KrypteraTillbaka(
			Reflektor.Kryptera(
			Rotor3.Kryptera(
			Rotor2.Kryptera(
			Rotor1.Kryptera(
			Pluggar.Kryptera(BokstavIn),
			Rotor1Pos),
			Rotor2Pos),
			Rotor3Pos),
			0),
			Rotor3Pos),
			Rotor2Pos),
			Rotor1Pos));
	}
	private void RotorSnurrare(){ //Funktion som ändrar rotorernas positioner
		Rotor1Pos++;			//Flyttar rotor 1 ett steg framåt
		if(Rotor1Pos>=26){		//Om rotor 1 gått hela sitt varv nollställs dess position
			Rotor1Pos=0;
			Rotor2Pos++;		//Samt rotor 2 flyttas fram ett hack
		}
		if(Rotor2Pos>=26){ //Dubbelstegning. Beror på mekaniska gränser i orginalet
			Rotor2Pos=0;		//vilka innebärde att om rotor 2 skulle sitta kvar på plats
			Rotor3Pos++;		//25 skulle rotor 3 snurra varje gång. Skall vara >=25.
		}
		if(Rotor3Pos>=26)Rotor3Pos=0; //Rotor 3 nollställs
	}						   //Reflektorerna skall ej vara med här, då de alltid är i position 0
}
