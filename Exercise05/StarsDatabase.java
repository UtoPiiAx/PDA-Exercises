public class StarsDatabase {
	
	public static void main(String[] args) {
		String[] names = new String[] { "Sirius", "Alpha Centauri", "Rigel",
										"Almaaz", "Luhman 16" };
		String[] ids = new String[] { "TYC 5949-2777-1", "TYC 9007-5849-1",
										"TYC 5331-1752-1", "TYC 2907-1275-1",
										"WISE J1049-5319A" };
		double[] distances = new double[] { 8.6, 4.37, 860, 2000, 6.589 };
		double[] apparentMagnitudes = new double[] { -1.46, -0.27, 0.13,
													2.92, 14.94 };
		String[] types = new String[] { "Main sequence", "Main sequence",
										"Blue supergiant", "Yellow supergiant",
										"Brown dwarf" };
		
		System.out.println(size(ids));
		System.out.println(getIndex("TYC 9007-5849-1", ids));
		System.out.println(getNameAndType(1, names, types));
		System.out.println(getIndicesOfClosestStars(10, distances));
		//System.out.println(replaceType("TYC 2907-1275-1", "Main sequence", ids, types));
	}
	
	public static int size(String[] ids) {
		return ids.length;
	}
	
	public static int getIndex(String id, String[] ids) {
		for(int i = 0; i < ids.length; i++) {
			if(id.equals(ids[i])) {
				return i;
			}
		}
		return -1;
	}
	
	public static String getNameAndType(int index, String[] names, String[] types) {
		return names[index] + " (" + types[index] + ")";
	}
	
	public static int[] getIndicesOfClosestStars(double maxDistance, double[] distances) {
		int size = 0;
		for (int i = 0; i < distances.length; i++) {
			if (distances[i] < maxDistance) {
				size++;
			}
		}
		int[] result = new int[size];
		for (int i = 0; i < distances.length; i++) {
			if (distances[i] < maxDistance) {
				result[i] = i;
				i++;
			}
		}
		return result;
	}
	
	public static void replaceType (String id, String newType, String[] ids, String[] types){
		int index = getIndex(id, ids);
		if(index != -1) {
			types[index] = newType;
		}
	}
}
