import React from 'react';

export const OddPlayers = (players) => {
  const { IndianTeam } = players;
  return (
    <ul>
      {IndianTeam.filter((_, index) => index % 2 !== 0).map((player, index) => (
        <li key={index}>Position {index + 1} : {player}</li>
      ))}
    </ul>
  );
};

export const EvenPlayers = (players) => {
  const { IndianTeam } = players;
  return (
    <ul>
      {IndianTeam.filter((_, index) => index % 2 === 0).map((player, index) => (
        <li key={index}>Position {index + 1} : {player}</li>
      ))}
    </ul>
  );
};

export const ListofIndianPlayers = ({ IndianPlayers }) => {
  return (
    <ul>
      {IndianPlayers.map((player, index) => (
        <li key={index}>Mr. {player}</li>
      ))}
    </ul>
  );
};
