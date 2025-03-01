public class Dungeon {
    String name;
    Room[] rooms;
    NPC[] npcs;

    public Dungeon(String name, Room[] rooms, NPC[] npcs) {
        this.name = name;
        this.rooms = rooms;
        this.npcs = npcs;
    }
}
