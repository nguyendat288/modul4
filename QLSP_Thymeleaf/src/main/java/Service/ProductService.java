package Service;

import Model.Loaisp;
import Model.Product;

import java.util.ArrayList;

public class ProductService {
    public ArrayList<Product> listsp = new ArrayList<>();
    public ArrayList<Loaisp> listloaisp = new ArrayList<>();

    public ProductService() {
        listloaisp.add(new Loaisp("bánh kẹo"));
        listloaisp.add(new Loaisp("đồ chơi"));
        listloaisp.add(new Loaisp("nội thất"));
        listsp.add(new Product(1, "bánh rán", listloaisp.get(0).getLoaisp(), 2000));
        listsp.add(new Product(2, "ghế", listloaisp.get(2).getLoaisp(), 100000));
        listsp.add(new Product(3, "ô tô", listloaisp.get(1).getLoaisp(), 50000));
        listsp.add(new Product(4, "xe máy", listloaisp.get(1).getLoaisp(), 20000000));
    }

    public void addsp(Product product) {
        listsp.add(product);
    }

    public void deletesp(int index) {
        listsp.remove(index);
    }

    public void editsp(Product product, int index) {
        listsp.set(index, product);
    }

    public void add(Loaisp loaisp) {
        listloaisp.add(loaisp);
    }

    public void delete(int index) {
        listloaisp.remove(index);
    }

    public void edit(Loaisp loaisp, int index) {
        listloaisp.set(index, loaisp);
    }

}
