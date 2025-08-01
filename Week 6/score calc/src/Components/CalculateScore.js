import React from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore() {
  const name = "Steeve";
  const school = "DNV Public School";
  const totalMarks = 284;
  const goalMarks = 300;

  const score = ((totalMarks / goalMarks) * 100).toFixed(2);

  return (
    <div>
      <h1 className="heading">Student Details:</h1>
      <p><span className="label">Name:</span> <span className="value name">{name}</span></p>
      <p><span className="label school">School:</span> {school}</p>
      <p><span className="label total">Total:</span> {totalMarks}Marks</p>
      <p><span className="label score">Score:</span> {score}%</p>
    </div>
  );
}

export default CalculateScore;

