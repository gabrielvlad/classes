import React, { useState, useEffect } from "react";
import PokemonCard from "./PokemonCard";
import Pagination from "./Pagination";
import Loading from "./Loading";
import "../styles/PokemonList.css";

function PokemonList() {
  const [pokemonData, setPokemonData] = useState([]);
  const [loading, setLoading] = useState(true);
  const [currentPageUrl, setCurrentPageUrl] = useState(
    "https://pokeapi.co/api/v2/pokemon/?limit=15&offset=0"
  );
  const [nextPageUrl, setNextPageUrl] = useState("");
  const [prevPageUrl, setPrevPageUrl] = useState("");

  useEffect(() => {
    setLoading(true);
    async function fetchData() {
      const response = await fetch(currentPageUrl);
      const data = await response.json();
      setNextPageUrl(data.next);
      setPrevPageUrl(data.previous);
      setPokemonData(data.results);
      setLoading(false);
    }
    fetchData();
  }, [currentPageUrl]);

  function goToNextPage() {
    setCurrentPageUrl(nextPageUrl);
  }

  function goToPrevPage() {
    setCurrentPageUrl(prevPageUrl);
  }

  if (loading) return <Loading />;

  return (
    <div className="pokemon-list-container">
      <div className="pokemon-list">
        {pokemonData.map((pokemon, index) => (
          <PokemonCard key={index} pokemon={pokemon} />
        ))}
      </div>
      <div className="pagination-container">
        <Pagination
          goToNextPage={nextPageUrl ? goToNextPage : null}
          goToPrevPage={prevPageUrl ? goToPrevPage : null}
        />
      </div>
    </div>
  );
}

export default PokemonList;
