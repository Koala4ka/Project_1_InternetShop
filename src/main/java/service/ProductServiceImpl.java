package service;

import dao.ProductDao;
import dao.ProductDaoImpl;
import model.Product;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    private static final ProductServiceImpl singleton = new ProductServiceImpl();

    private final ProductDao productDao = ProductDaoImpl.getInstance();

    public ProductServiceImpl() {
    }

    public static ProductServiceImpl getInstance() {
        return singleton;
    }

    @Override
    public void save(Product product) {
        productDao.save(product);
    }

    @Override
    public void update(Product product) {
        productDao.update(product);
    }

    @Override
    public void delete(Product product) {
        productDao.delete(product);
    }

    @Override
    public List<Product> findByName(String name) {
        return productDao.findByName(name);
    }

    @Override
    public Product findById(long id) {
        return productDao.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }
}