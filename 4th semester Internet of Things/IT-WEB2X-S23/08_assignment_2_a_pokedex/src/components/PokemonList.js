import React, { useState, useEffect } from "react";
//import { Link } from "react-router-dom";
import PokemonCard from "./PokemonCard";
import Pagination from "./Pagination";
import Loading from "./Loading";

function PokemonList() {
  const [pokemonData, setPokemonData] = useState([]);
  const [loading, setLoading] = useState(true);
  const [currentPageUrl, setCurrentPageUrl] = useState(
    "https://pokeapi.co/api/v2/pokemon/?limit=4&offset=0"
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
    <div>
      <div className="pokemon-list">
        {pokemonData.map((pokemon, index) => (
          <PokemonCard key={index} pokemon={pokemon} />
        ))}
      </div>
      <Pagination
        goToNextPage={nextPageUrl ? goToNextPage : null}
        goToPrevPage={prevPageUrl ? goToPrevPage : null}
      />
    </div>
  );
}

export default PokemonList;
