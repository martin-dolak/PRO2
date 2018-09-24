package cz.uhk.fim.opakovani;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
//        printStars();
        App app = new App();
        app.printStars();
        app.printStars(3);

        Word[] wordList = new Word[3];
        wordList[0] = new Word("ssss", 5);
        wordList[1] = new Word("dddd", 5);
        wordList[2] = new Word("ffff", 5);

        System.out.println("");
        app.printList(wordList);

        System.out.println("");
        System.out.println(wordList[2].toString());

        String[] stringList = new String[]{"slovo1", "slovo2", "slovo3"};

        Word word1 = new Word();
        word1.setContent(stringList[0]);
        word1.setNumber(stringList[0].length());

        Word word2 = new Word(stringList[1], stringList[1].length());

        System.out.println("");
        System.out.println("1. " + word1.getContent() + "\n" +
                "2. " + word2.getContent());
    }

    private void printStars() {
        System.out.println("*");
    }

    private void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }

    private void printList(Word[] words) {
        for (int i = 0; i < words.length; i++) {
            System.out.println((i+1) + ". " + words[i].getContent());
        }
    }
}