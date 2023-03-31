import React, { useState, useEffect } from "react";
import { useParams } from "react-router-dom";
import Loading from "./Loading";
import "../styles/PokemonDetails.css";

function PokemonDetails() {
  const [pokemon, setPokemon] = useState(null);
  const { id } = useParams();
  const url = `https://pokeapi.co/api/v2/pokemon/${id}`;

  useEffect(() => {
    async function fetchData() {
      const response = await fetch(url);
      const data = await response.json();
      setPokemon(data);
    }
    fetchData();
  }, [url]);

  if (!pokemon) return <Loading />;

  const imageUrl = `https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/${pokemon.id}.png`;

  return (
    <div className="pokemon-details">
      <img src={imageUrl} alt={pokemon.name} />
      <h2>{pokemon.name}</h2>
      <div>
        <div>
          <span>
            Types: {pokemon.types.map((type) => type.type.name).join(", ")}
          </span>
        </div>
        <div>
          <span>
            Stats: {pokemon.stats.map((stat) => stat.stat.name).join(", ")}
          </span>
        </div>
        <div>
          <span>
            Abilities:{" "}
            {pokemon.abilities
              .map((ability) => ability.ability.name)
              .join(", ")}
          </span>
        </div>
        <div>
          <span>Height: {pokemon.height / 10} m </span>
        </div>
        <div>
          <span>Weight: {pokemon.weight / 10} kg </span>
        </div>
      </div>
    </div>
  );
}

export default PokemonDetails;
