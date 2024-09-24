package quan_ly_phuong_tien_giao_thong.src;


import quan_ly_phuong_tien_giao_thong.src.controller.VehicleController;
import quan_ly_phuong_tien_giao_thong.src.repository.VehicleRepository;
import quan_ly_phuong_tien_giao_thong.src.service.VehicleService;
import quan_ly_phuong_tien_giao_thong.src.view.VehicleView;

public class App {
    public static void main(String[] args) {
        VehicleRepository repository = new VehicleRepository();
        VehicleService service = new VehicleService(repository);
        VehicleController controller = new VehicleController(service);
        VehicleView vehicleView = new VehicleView(controller);

        vehicleView.displayMenu();

    }

}

