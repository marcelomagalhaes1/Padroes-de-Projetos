public class VehicleStorageAdapter implements IVehicleStorage {

    private OldVehicleStorage oldStorage;

    public VehicleStorageAdapter(OldVehicleStorage oldStorage) {
        this.oldStorage = oldStorage;
    }

    @Override
    public void saveVehicleData(Vehicle vehicle) {
        String data = String.format("ID: %s, Model: %s, Year: %d",
                vehicle.getId(), vehicle.getModel(), vehicle.getYear());
        oldStorage.storeVehicleData(data);
    }
}
