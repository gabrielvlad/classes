import React from "react";

function Pagination({ goToNextPage, goToPrevPage }) {
  return (
    <div className="pagination">
      {goToPrevPage && <button onClick={goToPrevPage}>Previous</button>}
      {goToNextPage && <button onClick={goToNextPage}>Next</button>}
    </div>
  );
}

export default Pagination;
