package MoteurDeRecherche;


import java.util.List;
import java.util.ArrayList;

public class Analyseur1 implements Analyseur{

	public List<MotOcc> analyser( List<String> listeMots){
		List<MotOcc> listeDesMotOcc=new ArrayList<MotOcc>();
		for(String mot: listeMots){
			boolean motExist=false;
			for(MotOcc testMotOcc:listeDesMotOcc) {
				if(testMotOcc.getMot().equals(mot)) {
					motExist=true;
					testMotOcc.incrementer();
					break;
				}
			}
			if(motExist==false)
				listeDesMotOcc.add(new MotOcc(mot,1));
			
		}
		return listeDesMotOcc;
	}
}