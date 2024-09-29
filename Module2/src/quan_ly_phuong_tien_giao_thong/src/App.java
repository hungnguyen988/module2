package quan_ly_phuong_tien_giao_thong.src;


import quan_ly_phuong_tien_giao_thong.src.controller.IVehicleController;
import quan_ly_phuong_tien_giao_thong.src.controller.VehicleController;
import quan_ly_phuong_tien_giao_thong.src.repository.IVehicleRepository;
import quan_ly_phuong_tien_giao_thong.src.repository.VehicleRepository;
import quan_ly_phuong_tien_giao_thong.src.service.IVehicleService;
import quan_ly_phuong_tien_giao_thong.src.service.VehicleService;
import quan_ly_phuong_tien_giao_thong.src.view.IVehicleView;
import quan_ly_phuong_tien_giao_thong.src.view.VehicleView;

public class App {
    public static void main(String[] args) {
        IVehicleRepository repository = new VehicleRepository();
        IVehicleService service = new VehicleService(repository);
        IVehicleController controller = new VehicleController(service);
        IVehicleView vehicleView = new VehicleView(controller);
        vehicleView.displayMenu();

    }
}

