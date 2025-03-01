public class MudBuilder {
    public static void main(String[] args) {
        DungeonBuilder builder = new DungeonBuilder();

        builder.Name("Ancient Ruins");
        builder.addRoom(new Room("Hall", "pillars."));
        builder.addRoom(new Room("Dark", "runes."));
        builder.addNPC(new NPC("Goblin", "Guard"));
        builder.addNPC(new NPC("Skeleton", "Warrior"));

        Dungeon dungeon = builder.build();

        System.out.println("Dungeon: " + dungeon.name);
        System.out.println("Rooms:");
        for (Room room : dungeon.rooms) {
            System.out.println(" - " + room.name + ": " + room.description);
        }
        System.out.println("NPCs:");
        for (NPC npc : dungeon.npcs) {
            System.out.println(" - " + npc.name + " (" + npc.role + ")");
        }
    }
}
