package BoutiqueManagmentsys.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import BoutiqueManagmentsys.DAO.ProductDAO;
import BoutiqueManagmentsys.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDAO productdao;

	@Override
	@Transactional
	public void saveProduct(Product prdt) {
		productdao.saveProduct(prdt);

	}

}
