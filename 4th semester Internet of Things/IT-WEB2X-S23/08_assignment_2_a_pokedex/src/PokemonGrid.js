import React from "react";
import PokemonCard from "./PokemonCard";

function PokemonGrid(props) {
  const { pokemons } = props;

  return (
    <div className="pokemon-grid">
      {pokemons.map((pokemon, index) => (
        <PokemonCard
          key={index}
          id={index + 1}
          name={pokemon.name}
          type={pokemon.type}
          image={pokemon.image}
        />
      ))}
    </div>
  );
}

export default PokemonGrid;
