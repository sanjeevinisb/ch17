package com.xworkz.datatyperunner;
import com.xworkz.datatype.Dboss;
import com.xworkz.datatype.Godse;
import com.xworkz.datatype.Gun;
import com.xworkz.datatype.Police;
import com.xworkz.datatype.Solider;
 
    public class GunRunner {
			
    	public static void main(String[] args) {

				Solider solider = new Solider();
				solider.protect();
				Police police = new Police();
				Gun gun = new Gun("Mauser","Rifle","German");
				police.security(gun);
				Dboss dboss = new Dboss(gun);
				dboss.shoot();
				Godse godse = new Godse();
				godse.kill();

			}

		}

	
