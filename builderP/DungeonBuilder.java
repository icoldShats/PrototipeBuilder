public class DungeonBuilder implements IDungeonBuilder {
    private String name;
    private Room[] rooms = new Room[10];
    private NPC[] npcs = new NPC[10];
    private int roomCount = 0;
    private int npcCount = 0;

    public void Name(String name) {
        this.name = name;
    }

    public void addRoom(Room room) {
        if (roomCount < rooms.length) {
            rooms[roomCount++] = room;
        }
    }

    public void addNPC(NPC npc) {
        if (npcCount < npcs.length) {
            npcs[npcCount++] = npc;
        }
    }

    public Dungeon build() {
        Room[] finalRooms = new Room[roomCount];
        NPC[] finalNPCs = new NPC[npcCount];

        for (int i = 0; i < roomCount; i++) {
            finalRooms[i] = rooms[i];
        }

        for (int i = 0; i < npcCount; i++) {
            finalNPCs[i] = npcs[i];
        }

        return new Dungeon(name, finalRooms, finalNPCs);
    }
}
