import org.apache.commons.cli.*;

import java.io.File;
import java.util.Scanner;

public class CLI {
    private Scanner scanner;
    private boolean inGame;
    private Options mainMenuOptions;

    public CLI() throws ParseException {
        scanner = new Scanner(System.in);  // Create a Scanner object
        inGame = false;

        mainMenuOptions = new Options();
        mainMenuOptions.addOption("help", false, "show all commands");
        mainMenuOptions.addOption("play", true, "play new game");
        mainMenuOptions.addOption("load", true, "load a saved point");
        mainMenuOptions.addOption("exit", false, "exit game");
        run();

    }

    public void processCommand(String command) throws ParseException {
        if (command != null){
            String[] components = command.split(" ");
            CommandLineParser parser = new DefaultParser();
            CommandLine cmd = parser.parse(mainMenuOptions, components);

            if(cmd.hasOption("help")) {
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp( "Options", mainMenuOptions );
            }
            if(cmd.hasOption("play")) {
                String[] arguments = cmd.getArgs();
                String mapName = arguments[0];
                String cwd = System.getProperty("user.dir");
                File mapFile = new File(cwd + "\\src\\main\\resources\\" + mapName + ".json");
                Game game = new Game(mapFile);
            }
            if(cmd.hasOption("load")) {
                // print the date and time
            }
            if(cmd.hasOption("exit")) {
                // print the date and time
            }
        }






    }

    public void run() throws ParseException {
        while (true){
            System.out.println(">");
            String input = "-" + scanner.nextLine();  // Read user input
            processCommand(input);
        }



    }
}
