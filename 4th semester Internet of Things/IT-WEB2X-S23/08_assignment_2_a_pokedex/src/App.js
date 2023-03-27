import React from "react";
import "./App.css";
import PokemonList from "./PokemonList";
import PokemonDetails from "./PokemonDetails";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Header from "./Header";
import About from "./About";

function App() {
  return (
    <div className="App">
      <Router>
        <Header />
        <Routes>
          <Route path="/" element={<PokemonList />} />
          <Route path="/details/:id" element={<PokemonDetails />} />
          <Route path="/about" component={About} />
        </Routes>
      </Router>
    </div>
  );
}

export default App;
