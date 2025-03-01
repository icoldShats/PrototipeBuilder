public class MUDPrototype {
    public static void main(String[] args) {
        Room prototypeRoom = new Room("Dark Chamber");
        NPC prototypeNPC = new NPC("Skeleton Warrior");

        Room clonedRoom1 = prototypeRoom.cloneEntity();
        Room clonedRoom2 = prototypeRoom.cloneEntity();
        NPC clonedNPC = prototypeNPC.cloneEntity();

        System.out.println("Original Room: " + prototypeRoom);
        System.out.println("Cloned Room 1: " + clonedRoom1);
        System.out.println("Cloned Room 2: " + clonedRoom2);
        System.out.println("Original NPC: " + prototypeNPC);
        System.out.println("Cloned NPC: " + clonedNPC);
    }
}
