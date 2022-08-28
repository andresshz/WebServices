package cuponera.service;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import cuponera.model.CuponModel;


public class CuponesImpl implements CuponService{

	@Override
	public int canjearCupon(String cod, String dui) {
		CuponModel cuponModel = new CuponModel();
		try {
           return cuponModel.canjearCupon(cod, dui);
		} catch (SQLException ex) {
			Logger.getLogger(CuponesImpl.class.getName()).log(Level.SEVERE, null, ex);
			return 0;
		}
	}

}
