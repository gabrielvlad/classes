import React from "react";
import GitHubIcon from "@material-ui/icons/GitHub";
import "../styles/Footer.css";

const Footer = () => {
  return (
    <footer className="footer-test">
      <a
        href="https://github.com/gabrielvlad"
        target="_blank"
        rel="noopener noreferrer"
      >
        <GitHubIcon style={{ color: "#fff" }} />
      </a>
      <p>Developed by Gabriel Vlad</p>
    </footer>
  );
};

export default Footer;
