package com.chrisz;

// Polymorphism allows method actions to vary based on classes
// In Main if the random number generated is 5 an instance of
// Forgettable is created which does not have a plot() method
// Java looks for it in the extended class (Movie) and executes it
// from there

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eats lot of people.";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet Earth.";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze.";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe.";
    }
}

class ForgettableMovie extends Movie {
    public ForgettableMovie() {
        super("Forgettable");
    }

    // No plot override
}



public class Main {

    public static void main(String[] args) {

        for(int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i +
            " : " + movie.getName() + "\n" +
            "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random()* 5 ) + 1;
        // Math.random will return number between 0 and 1 as a double

        System.out.println("Random number generated was " + randomNumber);
        switch(randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new ForgettableMovie();
        }
        return null;
    }
}
