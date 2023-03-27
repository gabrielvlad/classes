import React, { useState, useEffect } from "react";
import { useParams } from "react-router-dom";
import Loading from "./Loading";

function PokemonDetails() {
  const [pokemon, setPokemon] = useState(null);
  const { id } = useParams();
  const url = `https://pokeapi.co/api/v2/pokemon/${id}`; // added semicolon here

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
        <span>Height: {pokemon.height / 10} m</span>
        <span>Weight: {pokemon.weight / 10} kg</span>
        <span>
          Abilities:{" "}
          {pokemon.abilities.map((ability) => ability.ability.name).join(", ")}
        </span>
      </div>
    </div>
  );
}

export default PokemonDetails;
