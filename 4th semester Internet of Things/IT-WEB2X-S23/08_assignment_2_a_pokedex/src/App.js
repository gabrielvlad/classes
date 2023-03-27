/*
import logo from './logo.svg';
import './App.css';


function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
*/

import React, { useEffect, useState } from "react";

function App() {
  const [pokemonList, setPokemonList] = useState([]);
  const [currentPage, setCurrentPage] = useState(1);
  const [totalPages, setTotalPages] = useState(0);
  const [selectedPokemon, setSelectedPokemon] = useState(null);
  const limit = 20;

  useEffect(() => {
    fetch(
      `https://pokeapi.co/api/v2/pokemon?limit=${limit}&offset=${
        (currentPage - 1) * limit
      }`
    )
      .then((response) => response.json())
      .then((data) => {
        setPokemonList(data.results);
        setTotalPages(Math.ceil(data.count / limit));
      });
  }, [currentPage]);

  const handlePokemonClick = (url) => {
    fetch(url)
      .then((response) => response.json())
      .then((data) => {
        setSelectedPokemon(data);
      });
  };

  return (
    <div>
      <h1>Pokéd ex</h1>
      <ul>
        {pokemonList.map((pokemon) => (
          <li key={pokemon.name}>
            <a href="#" onClick={() => handlePokemonClick(pokemon.url)}>
              {pokemon.name}
            </a>
          </li>
        ))}
      </ul>
      <button
        disabled={currentPage === 1}
        onClick={() => setCurrentPage(currentPage - 1)}
      >
        Previous
      </button>
      <button
        disabled={currentPage === totalPages}
        onClick={() => setCurrentPage(currentPage + 1)}
      >
        Next
      </button>
      {selectedPokemon && (
        <div>
          <h2>{selectedPokemon.name}</h2>
          <p>Height: {selectedPokemon.height}</p>
          <p>Weight: {selectedPokemon.weight}</p>
          <ul>
            {selectedPokemon.types.map((type) => (
              <li key={type.slot}>{type.type.name}</li>
            ))}
          </ul>
          <ul>
            {selectedPokemon.stats.map((stat) => (
              <li key={stat.stat.name}>
                {stat.stat.name}: {stat.base_stat}
              </li>
            ))}
          </ul>
        </div>
      )}
    </div>
  );
}

export default App;
