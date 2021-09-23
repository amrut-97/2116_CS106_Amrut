
public class ClientApp {

	public static void main(String[] args) {
	
		SmartPhone sp1 = new SmartPhone();
		SmartPhone sp2 = new SmartPhone();
		
		SmartEnabledPhone sep1 = new SmartEnabledPhone();
		SmartEnabledPhone sep2 = new SmartEnabledPhone();
		
		BW_FeaturePhone bwfp1 = new BW_FeaturePhone();
		BW_FeaturePhone bwfp2 = new BW_FeaturePhone();
		
		
		System.out.println("======START OF MOBILE PHONES======\n");
		
		MobilePhone[] mobilephones = {sp1, sp2, sep1, sep2, bwfp1, bwfp2};
		
		for( int i = 0; i < mobilephones.length; i++) {
			mobilephones[i].startPhone();
		}
		
		System.out.println("\n======END OF MOBILE PHONES======\n");
		
		System.out.println("\n======START OF FEATURE PHONES======\n");
		
		FeaturePhone[] featurephones = {sep1, sep2, bwfp1, bwfp2};
		
		for( int i = 0; i < featurephones.length; i++) {
			featurephones[i].setPolyphonicRingtone();
		}
		
		System.out.println("\n======END OF FEATURE PHONES======\n");
	}
}
