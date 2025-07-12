package task03;

public class Room {
    private String roomName;
    private int area;
    public Room(String roomName,int area){
        this.roomName=roomName;
        this.area=area;
    }
    public void displayInfo(){
        System.out.println("Room : "+roomName+" and it is of "+area+" sq. yards");
    }
}
