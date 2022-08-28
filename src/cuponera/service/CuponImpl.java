package cuponera.service;

import java.util.logging.Level;
import java.util.logging.Logger;
import cuponera.model.*;


public class CuponImpl implements CuponService {

	@Override
	public int canjearCupon(String cod, String dui) {

		CuponModel cupon = new CuponModel();
		try {
			
			return cupon.canjearCupon(cod, dui); 
		
		}catch(Exception ex) {
			Logger.getLogger(CuponImpl.class.getName()).log(Level.SEVERE, null, ex);
			return 0;
		}
		
		
		
	}
	
	

}
