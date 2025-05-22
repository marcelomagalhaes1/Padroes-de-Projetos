public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("123ABC", "Volvo FH", 2020);
        OldVehicleStorage legacyStorage = new OldVehicleStorage();
        IVehicleStorage adapter = new VehicleStorageAdapter(legacyStorage);
        adapter.saveVehicleData(vehicle);
    }
}
