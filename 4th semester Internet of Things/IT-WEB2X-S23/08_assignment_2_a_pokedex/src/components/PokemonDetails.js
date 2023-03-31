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
      <div className="details-container">
        <div className="details-row">
          <span className="details-label">Types:</span>
          <span className="details-value">
            {pokemon.types.map((type) => type.type.name).join(", ")}
          </span>
        </div>
        <div className="details-row">
          <span className="details-label">Stats:</span>
          <span className="details-value">
            {pokemon.stats.map((stat) => stat.stat.name).join(", ")}
          </span>
        </div>
        <div className="details-row">
          <span className="details-label">Abilities:</span>
          <span className="details-value">
            {pokemon.abilities
              .map((ability) => ability.ability.name)
              .join(", ")}
          </span>
        </div>
        <div className="details-row">
          <span className="details-label">Height:</span>
          <span className="details-value">{pokemon.height / 10} m</span>
        </div>
        <div className="details-row">
          <span className="details-label">Weight:</span>
          <span className="details-value">{pokemon.weight / 10} kg</span>
        </div>
      </div>
    </div>
  );
}

export default PokemonDetails;
