package com.xworkz.store;
import com.xworkz.data.Sandal;

public class SandalStore {
	
		private Sandal[] datas=new Sandal[5];
		private int index=0;
		
		
		public void save(Sandal data)
		{
			System.out.println("Created a SandalData");
			this.datas[this.index]=data;
			index++;
			
		}
		
		public void details()
		{
			System.out.println("Sandal details");
			for(Sandal data:this.datas)
			{
				if (data != null) {
					data.display();
					} else {
					System.out.println("Data is null");
					}
			}
		}
}
		