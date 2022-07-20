
public class PackageFactory {
	public static Package createPackage(PackageCode packagecode) {
		switch(packagecode) {
		case SMALL:
			return new SmallPackage();
		case MEDIUM:
			return new MediumPackage();
		case JAMBO:
			return new JamboPackage();
			default:
				return null;
		}
	}

}
