public class NPC implements CloneableGameEntity {
    private String name;

    public NPC(String name) {
        this.name = name;
    }

    @Override
    public NPC cloneEntity() {
        return new NPC(this.name);
    }

    @Override
    public String toString() {
        return "NPC: " + name;
    }
}
