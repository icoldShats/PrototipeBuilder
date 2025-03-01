public class Room implements CloneableGameEntity {
    private String name;

    public Room(String name) {
        this.name = name;
    }

    @Override
    public Room cloneEntity() {
        return new Room(this.name);
    }

    @Override
    public String toString() {
        return "Room: " + name;
    }
}
