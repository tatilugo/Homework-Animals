package DataGeneral;

public enum CommandsData {
    ADD ("Добавить"),

    LIST ("Упорядочить"),

    EXIT ("Выйти");

    private String name;

    CommandsData(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}



