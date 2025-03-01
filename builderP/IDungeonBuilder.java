public interface IDungeonBuilder {
    void Name(String name);
    void addRoom(Room room);
    void addNPC(NPC npc);
    Dungeon build();
}
