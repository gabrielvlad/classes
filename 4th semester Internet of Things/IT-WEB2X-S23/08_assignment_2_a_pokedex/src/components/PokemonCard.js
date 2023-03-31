import React, { useState, useEffect } from "react";
import { Link } from "react-router-dom";
import "../styles/PokemonCard.css";
import getTypeColor from "./getTypeColor.js";
import "../styles/getColorType.css";

function PokemonCard({ pokemon }) {
  const id = pokemon.url.split("/")[6];
  const imageUrl = `https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/${id}.png`;
  const [type, setType] = useState([]);

  useEffect(() => {
    async function fetchData() {
      const response = await fetch(pokemon.url);
      const data = await response.json();
      setType(data.types);
    }
    fetchData();
  }, [pokemon.url]);

  const typeColor = type.length
    ? getTypeColor(type[0].type.name)
    : console.log("Nothing found");

  return (
    <div
      className="pokemon-card"
      style={{
        backgroundColor: typeColor,
      }}
    >
      <Link to={`/details/${id}`}>
        <img src={imageUrl} alt={pokemon.name} />
        <h3>{pokemon.name}</h3>
      </Link>
    </div>
  );
}

export default PokemonCard;
