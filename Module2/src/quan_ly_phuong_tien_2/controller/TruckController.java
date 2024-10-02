package quan_ly_phuong_tien_2.controller;

import quan_ly_phuong_tien_2.model.Truck;
import quan_ly_phuong_tien_2.model.Vehicle;
import quan_ly_phuong_tien_2.service.ITruckService;

public class TruckController implements ITruckController  {
    ITruckService truckService;

    public TruckController(ITruckService truckService) {
        this.truckService = truckService;
    }

    public TruckController() {

    }

    @Override
    public void addTruck(Truck truck) {
        truckService.addTruck(truck);
    }

    @Override
    public void displayTruck() {
        truckService.displayTruck();
    }

    @Override
    public Vehicle getByLicensePlate(String licensePlate) {
        return truckService.getByLicensePlate(licensePlate);

    }

    @Override
    public void delete(String licensePlate) {
        truckService.delete(licensePlate);
    }
}
