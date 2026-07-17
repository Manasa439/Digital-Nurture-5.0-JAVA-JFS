import React from "react";

import { ListofPlayers, ScoreBelow70 } from "./ListofPlayers";

import {
  OddPlayers,
  EvenPlayers,
  ListofIndianPlayers,
  IndianTeam,
} from "./IndianPlayers";

function App() {
  return (
    <div>

      <h1>List of Players</h1>
      <ListofPlayers />

      <hr />

      <h1>List of Players having Scores Less than 70</h1>
      <ScoreBelow70 />

      <hr />

      <h1>Odd Players</h1>
      {OddPlayers(IndianTeam)}

      <hr />

      <h1>Even Players</h1>
      {EvenPlayers(IndianTeam)}

      <hr />

      <h1>List of Indian Players Merged</h1>
      <ListofIndianPlayers />

    </div>
  );
}

export default App;