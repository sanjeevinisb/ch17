class Paper
{
     String thickness="0.10mm";
     String quality;
	 int size;
	 String color;
	 public Paper(int size)
	 {
		 this.size=size;
	 }
	 public void setQuality(String quality)
	 {
		 this.quality=quality;
	 }
	 public void display()
	 {
		 System.out.println("Thickness:"+this.thickness);
		 System.out.println("Size:"+this.size);
		 System.out.println("Quality:"+this.quality);
		 System.out.println("Color:"+this.color);
	 }
 }