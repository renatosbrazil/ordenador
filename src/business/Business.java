package business;

public class Business {

	//ordena pelo numero maior 
	public static String ordenador(String n){
		char num[] = (""+n).toCharArray();
		char aux;
		
		for (int i = 1; i < num.length; i++) {
			for (int j = 0; j < i; j++) {
				if (num[i] >= num[j]) {
					aux = num[i];
					num[i] = num[j];
					num[j] = aux;
				}
			}
		}
		
		Integer numeroFinal = Integer.parseInt(new String(num));
		if(numeroFinal > 100000000){
		return "-1";
		}
		String valorFinal = numeroFinal.toString();
		return valorFinal;
	}
	
	//valida se tem letra ou -
	public static boolean validador(String n){
	  	for (int i = 0; i < n.length(); i++) {
	 		if (Character.isDigit(n.charAt(i))==false){
	 			return true;
	 			}
	 	}
	 	return false;
	}
	 
}
	

