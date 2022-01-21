package movies;


import util.Input;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MoviesApplication {
    public static Movie newMovie(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input Movie Title: ");
            String movieTitle = scanner.nextLine();
            System.out.print("Input Movie Category: ");
            String movieCategory = scanner.nextLine();
            return new Movie(movieTitle, movieCategory);
        }
    }

    public static Movie[] addMovie(Movie[] movies, Movie movie) {
        Movie[] newArray = Arrays.copyOf(movies, movies.length + 1);
        newArray [newArray.length -1]= movie;
        return newArray;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option;
        do {
            Input userInput = new Input();
            MoviesArray movie = new MoviesArray();
            Movie[] movies = movie.findAll();

            System.out.println("What would you like to do?");
            System.out.println("0 - exit\n1 - view all movies\n2 - view movies in the animated category\n3 - view movies in the drama category\n4 - view movies in the horror category\n5 - view movies in the scifi category\n\nEnter your choice: 1");

            option = userInput.getInt();

            switch (option) {
                case 0:
                    System.out.println("(EXIT)...Exiting Directory...");
//                    confirm = false;

                    break;
                case 1:
                    for (Movie list : movies)
                        System.out.println("\nAll Movies\nTitle: " + list.getName() + "\nCategory: " + list.getCategory());


            break;
            case 2:
                for (Movie list : movies) {
                    if (list.getCategory().equals("animated")) {
                        System.out.println("\nAnimated Movies\nTitle: " + list.getName() + "\nCategory: " + list.getCategory());
                    }
                }

                break;
            case 3:
                for (Movie list : movies) {
                    if (list.getCategory().equals("drama")) {
                        System.out.println("\nDrama Movies\nTitle: " + list.getName() + "\nCategory: " + list.getCategory());
                    }
                }

                break;


            case 4:
                for (Movie list : movies) {
                    if (list.getCategory().equals("horror")) {
                        System.out.println("\nHorror Movies\nTitle: " + list.getName() + "\nCategory: " + list.getCategory());
                    }
                }

                break;

            case 5:
                for (Movie list : movies) {
                    if (list.getCategory().equals("scifi")) {
                        System.out.println("\nScifi Movies\nTitle: " + list.getName() + "\nCategory: " + list.getCategory());
                    }
                }


                break;

            case 6:
                movies = addMovie(movies, newMovie());
                for (Movie list : movies) {
                    System.out.println("\nAll Movies\nTitle: " + list.getName() + "\nCategory: " + list.getCategory());

                }


                break;

            default:
                System.out.println("**" + userInput + " is not an option** \n**Enter an Option (0,1, 2, 3, 4 or 5): ");
        }

        } while (option !=0);
        }
    }
