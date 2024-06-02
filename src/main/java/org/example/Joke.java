package org.example;

public class Joke {
    private String type;
    private String setup;
    private String punchline;

    //contructor, getters, setters, string
    public Joke(String type, String setup, String punchline) {
        this.type = type;
        this.setup = setup;
        this.punchline = punchline;
    }

    public String getType() {
        return type;
    }

    public String getSetup() {
        return setup;
    }

    public String getPunchline() {
        return punchline;
    }

    @Override
    public String toString() {
        return "Type: " + type + "\nSetup: " + setup + "\nPunchline: " + punchline;
    }
}
