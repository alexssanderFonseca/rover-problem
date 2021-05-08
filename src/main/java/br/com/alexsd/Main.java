package br.com.alexsd;

public class Main {

    public static void main(String[] args) {
        var command = new Command("5 5\n" +
                "3 3 E\n" +
                "M M R M M R M R R M");

        command.execute();
        System.out.println(command.getRover());
    }





}
