import React from "react";
import { Link } from "react-router-dom";
import "../styles/Header.css";
import Pokedex from "../assets/images/pokedex.png";

const Header = () => {
  return (
    <header>
      <div className="app__header">
        <Link to="/">
          <img src={Pokedex} alt="Pokedex" />
        </Link>
      </div>
    </header>
  );
};

export default Header;
