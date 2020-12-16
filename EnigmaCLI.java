public class EnigmaCLI{
	public static void main(String[] args) {
		String StringIn,StringOmv,StringUt="";
		char KaraktarIn;
		//BokstavsOmvandlare Bokstav;
		//FragaForInfo Fraga;
		//Fraga.FragaRotor(1),Fraga.FragaRotorPos(1),Fraga.FragaRotor(2),Fraga.FragaRotorPos(2),Fraga.FragaRotor(3),Fraga.FragaRotorPos(3),Fraga.FragaRotor(4),
		Enigma Maskinen = new Enigma(2,2,2,2,2,2,1001,"ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		System.out.println("skriv in det du vill kryptera\n");
		StringIn = System.console().readLine();
		StringOmv= StringIn.toUpperCase();
		for(int q=0;StringOmv.length()>q;q++){
			KaraktarIn=Maskinen.Kryptera(StringOmv.charAt(q));
			StringUt+=KaraktarIn;
		}
		//KaraktarIn=Maskinen.Kryptera(StringOmv.at(0));
		System.out.println("Det krypterade meddelendandet är: " + StringUt + "\n");
		//system("pause");
	}
}
