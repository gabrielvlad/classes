import React from "react";
import { Link } from "react-router-dom";
import "../styles/PokemonCard.css";

function PokemonCard({ pokemon }) {
  const id = pokemon.url.split("/")[6];
  const imageUrl = `https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/${id}.png`;

  return (
    <div className="pokemon-card">
      <Link to={`/details/${id}`}>
        <img src={imageUrl} alt={pokemon.name} />
        <h3>{pokemon.name}</h3>
      </Link>
    </div>
  );
}

export default PokemonCard;
