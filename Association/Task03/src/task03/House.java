package task03;

public class House {
     private String address;
    private Room[] rooms;

    public House(String address) {
        this.address = address;
        rooms = new Room[3];
        rooms[0] = new Room("Living Room", 250);
        rooms[1] = new Room("Bedroom", 200);
        rooms[2] = new Room("Kitchen", 150);
    }
    public void displayInfo() {
        System.out.println("House Address: " + address);
        System.out.println("Rooms in the house:");
        for (Room r : rooms) {
            r.displayInfo();
        }
    }
}
