class KeyBunchRunner
{
public static void main(String[] args)
{
    Key key=new Key("Audi",25);

	KeyBunch keyBunch=new KeyBunch("metal",key);
	keyBunch.display();
	
	Key key1=new Key("Incognito",15);
	 
	KeyBunch keyBunch1=new KeyBunch("Steel",key1);
	keyBunch1.display();
	 
	Key key2=new Key("Manchester",10);
	 
	KeyBunch keyBunch2=new KeyBunch("Leather",key2);
	keyBunch2.display();
}
}