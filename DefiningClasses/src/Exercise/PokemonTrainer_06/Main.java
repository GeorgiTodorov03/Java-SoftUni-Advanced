package PokemonTrainer_06;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Trainer> trainers = new LinkedHashMap<>();

        String input;

        while (!"Tournament".equals(input = scanner.nextLine())) {
            String[] data = input.split("\\s+");

            String trainerName = data[0];
            String pokemonName = data[1];
            String element = data[2];
            int health = Integer.parseInt(data[3]);

            Pokemon pokemon = new Pokemon(pokemonName, element, health);

            trainers.putIfAbsent(trainerName, new Trainer());
            trainers.get(trainerName).addPokemon(pokemon);

        }

        String command;

        while (!"End".equals(command = scanner.nextLine())) {

            for (Map.Entry<String, Trainer> kvp : trainers.entrySet()) {
                if (kvp.getValue().pokeCollectionSize() > 0) {
                    boolean havePokemon = false;
                    for (Pokemon pokemon : kvp.getValue().getPokemons()) {
                        if (pokemon.getElement().equals(command)) {
                            havePokemon = true;
                            kvp.getValue().setNumOfBadges();
                            break;
                        }
                    }
                    if (!havePokemon) {
                        kvp.getValue().missingPokemonPenalty();
                    }
                }
            }
        }
        trainers.entrySet().stream()
                .sorted((b1, b2) -> Integer.compare(b2.getValue().getNumOfBadges(), b1.getValue().getNumOfBadges()))
                .forEach(t -> System.out.printf("%s %s %s%n", t.getKey(),
                        t.getValue().getNumOfBadges(),
                        t.getValue().pokeCollectionSize()));
    }
}