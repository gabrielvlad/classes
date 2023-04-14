import React from "react";
import "../styles/About.css";

function About() {
  return (
    <div className="about">
      <h2>About this App</h2>
      <p>
        This is a simple Pokédex web application built with React and PokéAPI.
      </p>
      <p>
        It displays a list of Pokémon, their details, and allows for pagination.
      </p>
    </div>
  );
}

export default About;
