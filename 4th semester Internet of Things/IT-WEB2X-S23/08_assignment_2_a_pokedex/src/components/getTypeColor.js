import "../styles/getColorType.css";

// TypeColors.js
const getTypeColor = (type) => {
  switch (type) {
    case "fire":
      return "var(--fire)";
    case "water":
      return "var(--water)";
    case "grass":
      return "var(--grass)";
    case "bug":
      return "var(--bug)";
    case "dark":
      return "var(--dark)";
    case "dragon":
      return "var(--dragon)";
    case "electric":
      return "var(--electric)";
    case "fairy":
      return "var(--fairy)";
    case "fighting":
      return "var(--fighting)";
    case "flying":
      return "var(--flying)";
    case "ghost":
      return "var(--ghost)";
    case "ground":
      return "var(--ground)";
    case "ice":
      return "var(--ice)";
    case "normal":
      return "var(--normal)";
    case "poison":
      return "var(--poison)";
    case "psychic":
      return "var(--psychic)";
    case "rock":
      return "var(--rock)";
    case "steel":
      return "var(--steel)";
    default:
      return "gray";
  }
};

export default getTypeColor;
