package cuponera.model;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CuponModel extends Conexion {

	public int updateCupon(String cod, String dui) throws SQLException {

		String sqlUpdate = "UPDATE cupones SET id_estado_cupon = 2 WHERE codigo_cupon = ? AND dui = ?";
		cs = conexion.prepareCall(sqlUpdate);
		cs.setString(1, cod);
		cs.setString(2, dui);
		int rowcount = cs.executeUpdate();
		return rowcount;

	}

	public int canjearCupon(String codigo, String dui) throws SQLException {

		try {
			String sql = "SELECT * FROM cupones WHERE codigo_cupon = ? AND dui = ?";
			System.out.println(sql);

			this.conectar();
			cs = conexion.prepareCall(sql);
			cs.setString(1, codigo);
			cs.setString(2, dui);
			rs = cs.executeQuery();

			int total = 0;
			System.out.println(total);
			while (rs.next()) {
				int filas = rs.getRow();
				System.out.println(filas);
				if (filas > 0) {
					total = updateCupon(codigo, dui);
				}

			}

			System.out.println(total);

			// System.out.println(sqlUpdate);
			this.desconectar();
			return total;

		} catch (Exception ex) {
			Logger.getLogger(CuponModel.class.getName()).log(Level.SEVERE, null, ex);
			return 0;
		}

	}

}
