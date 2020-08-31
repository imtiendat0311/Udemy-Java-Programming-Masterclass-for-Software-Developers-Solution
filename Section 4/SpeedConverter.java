public class SpeedConverter {
    public static long toMilesPerHour (double kilometersPerHour) {
		if(kilometersPerHour<0) {
			return -1;
		}
		return Math.round(kilometersPerHour*0.62) ;
	}
	public static void printConversion(double kilometersPerHour) {
		if(kilometersPerHour<0) {
			System.out.println("Invalid Value");
		}
		double milePerHours=kilometersPerHour*0.62;
		System.out.println(kilometersPerHour+" km/h = "+milePerHours+" mi/h");
	}

}