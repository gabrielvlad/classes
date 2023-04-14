import React from "react";
import "../styles/Pagination.css"; // Import the CSS file with the above styles

function Pagination({ goToNextPage, goToPrevPage }) {
  return (
    <div className="parent-container">
      <div className="pagination">
        {goToPrevPage && <button onClick={goToPrevPage}>Previous</button>}
        {goToNextPage && <button onClick={goToNextPage}>Next</button>}
      </div>
    </div>
  );
}

export default Pagination;
