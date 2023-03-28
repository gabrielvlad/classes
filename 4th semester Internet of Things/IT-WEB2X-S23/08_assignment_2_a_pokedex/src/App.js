import React from "react";
import "./App.css";
import PokemonList from "./components/PokemonList";
import PokemonDetails from "./components/PokemonDetails";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Header from "./components/Header";
import About from "./components/About";
import Footer from "./components/Footer";

function App() {
  return (
    <div className="App">
      <Router>
        <Header />
        <Routes>
          <Route path="/" element={<PokemonList />} />
          <Route path="/details/:id" element={<PokemonDetails />} />
          <Route path="/about" component={About} />
          <Route path="/footer" component={Footer} />
        </Routes>
        <Footer />
      </Router>
    </div>
  );
}

export default App;
