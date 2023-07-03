
public class StarsDatabase {

	public static void main(String[] args) {
		String [] starName = {"Sirius", "Alpha Centauri", "Rigel", "Almaaz", "Luhmann 16"};
		String [] starId = {"TYC 5949 -2777 -1", "TYC 9007 -5849 -1" , "TYC 5331 -1752 -1", "TYC 2907-1275-1", "WISE J1049-5319A"};
		double [] starDistance = { 8.6, 4.37, 860, 2000, 6.589};
		double [] apparentMagnitude = {-1.46, -0.27, 0.13, 2.92, 14.94};
		String [] starType = {"Main sequence", "Main sequence", "Blue supergiant", "Yellow supergiant", "Brown dwarf"};
		
		String key = "TYC 5331-1752-1";
		System.out.println(key);
		
		for (int i = 0; i < starId.length; i++) {
			if (starId[i].equals(key)) {
				System.out.println("Name: " + starName[i] + " ID: " + starId[i] + " Distance: " + starDistance[i] 
						+ " Apparent Magnitude: " + apparentMagnitude[i] + " Type:" + starType[i]);
				break;
			}
		}
		for (int i = 0; i < starId.length; i++)
			if (starDistance[i] < 10) {
				System.out.println(starName[i]);
			}
	}
}
