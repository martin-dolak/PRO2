package cz.uhk.fim.opakovani;

public class Word {

    private String content;
    private int number;

    public Word() {
    }

    public Word(String content, int number) {
        this.content = content;
        this.number = number;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Word {" +
                "content=" + this.content +
                ", number=" + this.number +
                '}';
    }
}