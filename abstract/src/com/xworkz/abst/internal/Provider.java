package com.xworkz.abst.internal;

public abstract class Provider {
	private String name;
	private String ceoName;
	
	public Provider(String name, String ceoName) {
		super();
		this.name = name;
		this.ceoName = ceoName;
		System.out.println("running two String const of Provider");
	}
	

	 
	@Override
	public String toString() {
		return "Provider [name=" + name + ", ceoName=" + ceoName + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running a equals in Provider");

		if (obj != null) {

			if (obj instanceof Provider) {
				Provider casted = (Provider) obj;
				if (this.name.equals(casted.name) && this.ceoName.equals(casted.ceoName)) 
				{
					System.out.println("Both are Equal");
					return true;
				}
			} else {
				System.out.println("Obj is Not a Provider");
			}

		} else {
			System.out.println("Obj is Null");
		}
		return super.equals(obj);
	}

	public abstract void service();


}
