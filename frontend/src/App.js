import React, { useEffect } from "react";

function App() {

  useEffect(() => {
    fetch("http://localhost:8080")
      .then(res => res.text())
      .then(data => console.log("Backend Response:", data))
      .catch(err => console.error(err));
  }, []);

  return (
    <div style={{ textAlign: "center", marginTop: "50px" }}>
      <h1>🎓 E-Learning Platform</h1>
      <p>Frontend connected successfully!</p>
    </div>
  );
}

export default App;