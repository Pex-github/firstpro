package TemplateMethon;

public class TemplateMain {

    public static void main(String[] args) {
        AbstractDisplay h = new CharDisplay('H');
        AbstractDisplay helloWorld = new StringDisplay("Hello World");
        h.display();
        helloWorld.display();

    }
}
