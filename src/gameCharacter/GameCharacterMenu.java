package GameCharacter;

import dao.raceDao;
import entity.race;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import entity.classes;
import dao.characterNameDAO;
import dao.classDao;
import entity.CharacterName;


public class GameCharacterMenu {


public static Scanner scanner = new Scanner(System.in);
private static characterNameDAO characterNameDao = new characterNameDAO();
private static classDao classDao = new classDao();
private static raceDao raceDao = new raceDao();




    public void start() throws SQLException {

        MainMenu();
    }

    public void MainMenu() throws SQLException{
       Boolean run = true;
        while(run) {

           menuInstructions();

           String choice = scanner.nextLine();
           System.out.println("Enter a selection: ");

           if (choice.isBlank()) {

           }
           switch (choice) {
               case "1":
                   createCharacterName();
                   break;
               case "2":
                   createClass();
                   break;
               case "3":
                   printInstructionsRace();
                   raceSelection();
                   break;
               case "4":
                   run = false;
                   break;
               default:
                   System.out.println("Invalid selection, Try again.");
                   break;
           }

       }

    }


    public void menuInstructions(){



        System.out.println("*************************");
        System.out.println("*******MAIN MENU*********");
        System.out.println("*************************");
        System.out.println("Here are the options");
        System.out.println("1) Create Character Name.");
        System.out.println("2) Create Character Class.");
        System.out.println("3) Create Character Race.");
        System.out.println("4) Exit.");




    }
    
    private void createCharacterName() {
        
    }
    
    private void updateCharacterName() throws SQLException{
    	System.out.println("Enter the CharacterNameId: ");
    	showCharacterName();
    	long id = Long.parseLong(scanner.nextLine());
    	
    	System.out.println("Enter the new Character Name");
    	String name = scanner.nextLine();
    	showCharacterName();
    }
    
    private void showCharacterName() throws SQLException {
    	List<CharacterNames> characterNames = characterNameDao();
    	characterName.stream().forEach(System.out:: println);
    	
    }
    
    private void deleteCharacterName() throws SQLException{
    	showCharacterName();
    	System.out.println("Enter class id to delete");
    	long id = Long.parseLong(scanner.nextLine());
    	characterNameDao.deleteCharacterName(id);
    }
    
    private void printInstructionsCharacterName() throws SQLException {
        System.out.println("***********************************");
        System.out.println("*****Character Name Selection******");
        System.out.println("***********************************");
        System.out.println("Here are the options");
        System.out.println("1) Create a Character Name");
        System.out.println("2) Update a Character Name");
        System.out.println("3) List all Character Names");
        System.out.println("4) Delete a Character Name");
        System.out.println("5) Return to Selection");
    }
    
    private void characterNameSelection() throws SQLException{
    	Boolean run = true;
    	while (run) {
    		printInstructionsCharacterName();
    		String choice = scanner.nextLine();
    		System.out.println("Enter a selection: ");
    		
    		if (choice.isBlank()) {
    			
    		}
    		switch (choice) {
    		case "1":
    			createCharacterName();
    			break;
    		case "2":
    			updateCharacterName();
    			break;
    		case "3":
    			showCharacterName();
    			break;
    		case "4":
    			deleteCharacterName();
    			break;
    		case "5":
    			run = false;
    			MainMenu();
    		default:
    			System.out.println("Invalid selection, try again.");
    			break;
    		}
    	}
    }
    
    private void createClass() throws SQLException {
        String name = null;
        System.out.println("Chose from a list of classes");
        System.out.println("1) Archer");
        System.out.println("2) Swordsman");
        System.out.println("3) Mage");
        String choice = scanner.nextLine();

        if (choice.isEmpty()){
        }
        switch (choice){
            case "1":
                name = "Archer";
                break;
            case "2":
              name = "Swordsman";
                break;
            case "3":
               name = "Mage";
                break;
            default:
                System.out.println("Invalid selection, Try again.");
                break;
        }



        classDao.createClass(name);
    }

    private void updateClass() throws SQLException {
        System.out.println("Enter the Class ID: ");
        showClass();
        long id = Long.parseLong(scanner.nextLine());

        System.out.println("Enter the new Class name");
        String name = scanner.nextLine();
        showClass();

    }
    private void showClass() throws SQLException {
        List<classes> classes = classDao.getClasses();
        classes.stream().forEach(System.out::println);



    }

    private void deleteClass() throws SQLException {

        showClass();
        System.out.println("Enter class id to delete");
        long id = Long.parseLong(scanner.nextLine());
        classDao.deleteClass(id);

    }

    private void printInstructionsClass() throws SQLException {

        System.out.println("**************************");
        System.out.println("*****Class Selection******");
        System.out.println("**************************");
        System.out.println("Here are the options");
        System.out.println("1) Create a Class");
        System.out.println("2) Update a Class");
        System.out.println("3) List all Classes");
        System.out.println("4) Delete a Class");
        System.out.println("5) Return to Selection");





    }

    private void classSelection() throws SQLException{
        Boolean run = true;
        while (run) {
            printInstructionsClass();
            String choice = scanner.nextLine();
            System.out.println("Enter a selection: ");

            if (choice.isEmpty()) {

            }
            switch (choice) {
                case "1":
                    createClass();
                    break;
                case "2":
                    updateClass();
                    break;
                case "3":
                    showClass();
                    break;
                case "4":
                    deleteClass();
                    break;
                case "5":
                    run = false;
                    MainMenu();
                default:
                    System.out.println("Invalid selection, Try again.");
                    break;
            }
        }
        }

    private void createRace() throws SQLException {
        String name = null;
        System.out.println("Chose from a list of races");
        System.out.println("1) Human");
        System.out.println("2) Elf");
        System.out.println("3) Dwarf");
        String choice = scanner.nextLine();

        if (choice.isBlank()){
        }
        switch (choice){
            case "1":
                name = "Human";
                break;
            case "2":
                name = "Elf";
                break;
            case "3":
                name = "Dwarf";
                break;
            default:
                System.out.println("Invalid selection, Try again.");
                break;
        }



        raceDao.choseRace(name);
    }

    private void updateRace() throws SQLException{
        System.out.println("Enter the Race ID: ");
        showRace();
        long id = Long.parseLong(scanner.nextLine());

        System.out.println("Enter the new Race name");
        String name = scanner.nextLine();
        showRace();

    }
    private void showRace() throws SQLException {
        List<race>races = raceDao.getRaces();
        races.stream().forEach(System.out::println);



    }

    private void deleteRace() throws SQLException {

        showRace();
        System.out.println("Enter race id to delete");
        long id = Long.parseLong(scanner.nextLine());
        raceDao.deleteRace(id);

    }

    private void printInstructionsRace() throws SQLException {

        System.out.println("*************************");
        System.out.println("*****Race Selection******");
        System.out.println("*************************");
        System.out.println("Here are the options");
        System.out.println("1) Create a Race");
        System.out.println("2) Update a Race");
        System.out.println("3) List all Races");
        System.out.println("4) Delete a Race");
        System.out.println("5) Return to Selection");





    }

    private void raceSelection() throws SQLException{
        Boolean run = true;
        while (run) {
            printInstructionsRace();
            String choice = scanner.nextLine();
            System.out.println("Enter a selection: ");

            if (choice.isBlank()) {

            }
            switch (choice) {
                case "1":
                    createRace();
                    break;
                case "2":
                    updateRace();
                    break;
                case "3":
                    showRace();
                    break;
                case "4":
                    deleteRace();
                    break;
                case "5":
                    run = false;
                    MainMenu();
                default:
                    System.out.println("Invalid selection, Try again.");
                    break;
            }
        }
        }

    }










