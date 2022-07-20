
public class Application {
	public static void main(String[] args) {
		Package aPackage =PackageFactory.createPackage(PackageCode.SMALL);
		System.out.println(aPackage);
		Package bPackage =PackageFactory.createPackage(PackageCode.MEDIUM);
		System.out.println(bPackage);
		Package cPackage =PackageFactory.createPackage(PackageCode.JAMBO);
		System.out.println(cPackage);
		
	}

}
