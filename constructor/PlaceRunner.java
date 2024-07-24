class PlaceRunner
{
public static void main(String[] args)
{
	System.out.println("start main in PlaceRunner");
	Place place = new Place();
	String name=place.name;
	double pinCode=place.pinCode;
	String significanceOfPlace=place.significanceOfPlace;
	System.out.println("place name:"+name);
	System.out.println("place pinCode:"+pinCode);
	System.out.println("place significanceOfPlace:"+significanceOfPlace);
	place.name="Chickmagalur";
	place.pinCode=577101;
	place.significanceOfPlace="Land of coffee";
	System.out.println("place update name:"+place.name);
	System.out.println("place update pinCode:"+place.pinCode);
	System.out.println("place update significanceOfPlace:"+place.significanceOfPlace);
	System.out.println("end main in PlaceRunner");
}
}