import React from 'react';

const ListofPlayers = ({ players }) => {
  return (
    <ul>
      {players.map((player, index) => (
        <li key={index}>Mr. {player.name} {player.score}</li>
      ))}
    </ul>
  );
};

export const Scorebelow70 = ({ players }) => {
  const below70 = players.filter(p => p.score < 70);
  return (
    <ul>
      {below70.map((player, index) => (
        <li key={index}>Mr. {player.name} {player.score}</li>
      ))}
    </ul>
  );
};

export default ListofPlayers;
